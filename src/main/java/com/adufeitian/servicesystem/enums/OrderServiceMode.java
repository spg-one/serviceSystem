package com.adufeitian.servicesystem.enums;

public enum OrderServiceMode {
    MINUTE("按分钟"),HOUR("按小时"),DAY("按天数");
    private String serviceMode;
    private OrderServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
    }

    public String getServiceMode() {
        return serviceMode;
    }

    public static OrderServiceMode getOrderServiceMode(String serviceMode) {
        if("按分钟".equals(serviceMode)) {
            return MINUTE;
        } else if("按小时".equals(serviceMode)) {
            return HOUR;
        } else if("按天数".equals(serviceMode)) {
            return DAY;
        } else {
            return null;
        }
    }
}
