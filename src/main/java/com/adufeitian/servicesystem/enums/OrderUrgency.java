package com.adufeitian.servicesystem.enums;

public enum OrderUrgency {
    NORMAL("一般"), EMERGENCY("紧急");
    private String urgency;
    private OrderUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getUrgency() {
        return urgency;
    }
    public static OrderUrgency getOrderUrgency(String urgency) {
        if("一般".equals(urgency)) {
            return NORMAL;
        } else if("紧急".equals(urgency)) {
            return EMERGENCY;
        } else {
            return null;
        }
    }
}
