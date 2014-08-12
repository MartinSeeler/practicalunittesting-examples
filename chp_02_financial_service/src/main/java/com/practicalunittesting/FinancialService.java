package com.practicalunittesting;

import java.math.BigDecimal;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FinancialService {

    private ClientDAO clientDAO;
    private Calculator calculator;

    public BigDecimal calculateBonus(final long clientId, final BigDecimal payment) {
        final Short clientType = clientDAO.getClientType(clientId);
        final BigDecimal bonus = calculator.calculateBonus(clientType, payment);
        clientDAO.saveBonusHistory(clientId, bonus);
        return bonus;
    }
}
