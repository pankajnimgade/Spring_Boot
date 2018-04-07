package test101.stock.viewer.application.domain;

import javax.persistence.*;

/**
 * Created on 4/6/2018
 *
 * @author Pankaj Nimgade
 */
@Entity
@Table(name = "quotes", catalog = "test_Database_stock_viewer")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_Id")
    private Long _Id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "quote")
    private String quote;

    protected Quote() {
    }

    public Quote(String userName, String quote) {
        this.userName = userName;
        this.quote = quote;
    }

    public Long get_Id() {
        return _Id;
    }

    public void set_Id(Long _Id) {
        this._Id = _Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
