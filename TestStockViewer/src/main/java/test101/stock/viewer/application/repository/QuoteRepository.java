package test101.stock.viewer.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test101.stock.viewer.application.domain.Quote;

import java.util.List;

/**
 * Created on 4/6/2018
 *
 * @author Pankaj Nimgade
 */
public interface QuoteRepository extends JpaRepository<Quote, Long> {

    List<Quote> findByUserName(String username);
}
