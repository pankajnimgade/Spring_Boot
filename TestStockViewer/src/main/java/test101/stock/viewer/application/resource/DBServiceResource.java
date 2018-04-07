package test101.stock.viewer.application.resource;

import org.springframework.web.bind.annotation.*;
import test101.stock.viewer.application.domain.Quote;
import test101.stock.viewer.application.repository.QuoteRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 4/6/2018
 *
 * @author Pankaj Nimgade
 */

@RestController
@RequestMapping("/rest/db")
public class DBServiceResource {


    private QuoteRepository quoteRepository;

    public DBServiceResource(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping("/{username}")
    public List<String> getQuotes(@PathVariable(value = "username") final String username) {
        return quoteRepository.findByUserName(username).stream().map(Quote::getQuote).collect(Collectors.toList());
    }

    @GetMapping("/all")
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @PostMapping("/add")
    public List<String> add(@RequestBody final Quote quote) {
        quoteRepository.save(new Quote(quote.getUserName(), quote.getQuote()));
        return null;
    }
}
