package cn.jinzhu.cli.common.utils;

public enum  Consultation {

    firstConsult("初诊"),secondConsult("复诊");

    private String tempAddr;

    Consultation(String tempAddr) {
        this.tempAddr = tempAddr;
    }

    public String getTempAddr() {
        return tempAddr;
    }

}
