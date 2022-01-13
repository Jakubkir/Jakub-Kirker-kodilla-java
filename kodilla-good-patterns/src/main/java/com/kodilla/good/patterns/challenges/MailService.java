package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

public class MailService implements InformationService {
    public void inform(User user, BigDecimal price) {
        System.out.println(user.getName() + " your order succedd!" + "Total Price: " + price);

    }
}
