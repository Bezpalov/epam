package main.com.learning.bank.exchange;

import main.com.learning.bank.Account;

public interface Exchangeable {
    String getUSD(Account acc, double usd);

    String getEUR(Account acc, double eur);
}