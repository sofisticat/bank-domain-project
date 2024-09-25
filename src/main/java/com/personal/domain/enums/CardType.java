package com.personal.domain.enums;

public enum CardType {

    CREDIT_CARD,
    DEBIT_CARD;


    private CardType() {
    }

    public static CardType getCardType(String cardType) {
        if(CREDIT_CARD.name().equals(cardType)) {
            return CREDIT_CARD;
        } else if(DEBIT_CARD.name().equals(cardType)) {
            return DEBIT_CARD;
        } else {
            throw new RuntimeException("Not a valid card type.");
        }

    }

}
