package com.adufeitian.servicesystem.enums;

/**
 * check the format of a string.
 * if the string only contains simple-character(ascll code from '!' to '~'),
 * then return OK("ok").
 * if the length of string is shorter than Minimum length,
 * then return TOO_SHORT("too short").
 * if the length of string exceed limited length,
 * then return TOO_LONG("too long").
 * if the string contains no-simple-character,
 * then return ILLEG_CHAR("illegal character").
 * @author  feidudeqiu
 */
public enum SimpleStringCheckEnum {
    OK("ok",0),
    TOO_SHORT("too short", 1),
    TOO_LONG("too long",2),
    ILLEG_CHAR("illegal character",3);
    // 成员变量
    private String check; private int id;
    // 构造方法
    private SimpleStringCheckEnum(String check, int id) {
        this.check = check; this.id = id;
    }
    //覆盖方法
    public String getCheck() {
        return check;
    }
    public int getid() {
        return id;
    }
}
