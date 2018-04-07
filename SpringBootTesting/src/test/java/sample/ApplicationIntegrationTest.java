/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import test101.spring.testing.domain.VehicleIdentificationNumber;
import test101.spring.testing.service.VehicleDetails;
import test101.spring.testing.service.VehicleDetailsService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Integration test for {@link test101.spring.testing.SpringBootTestApplication} starting on a random port.
 *
 * @author Phillip Webb
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase
public class ApplicationIntegrationTest {

    private static final VehicleIdentificationNumber VIN = new VehicleIdentificationNumber(
            "01234567890123456");

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private VehicleDetailsService vehicleDetailsService;

    @Before
    public void setup() {
        given(this.vehicleDetailsService.getVehicleDetails(VIN))
                .willReturn(new VehicleDetails("Honda", "Civic"));
    }

    @Test
    public void test() {
        ResponseEntity<String> response = this.restTemplate
                .getForEntity("/{username}/vehicle", String.class, "mickey");
        assertThat(response.getBody()).contains("Honda");
    }

}
