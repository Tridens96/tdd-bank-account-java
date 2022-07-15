package org.xpdojo.bank;


import org.assertj.core.internal.bytebuddy.matcher.ElementMatcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;


public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account myAccount = new Account();
        myAccount.deposit(100);
        assertThat(myAccount.getBalance()).isEqualTo(100);
    }


}
