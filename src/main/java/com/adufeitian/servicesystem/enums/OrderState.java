package com.adufeitian.servicesystem.enums;

public enum OrderState {
    // indicates that the order is accepted by servicer
    ACCEPTED("accepted"),
    //indicates that the order is handled by servicer
    HANDLED("handled"),

    PROCESSING("processing");
    private String state;
    private OrderState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
