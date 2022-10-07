package org.keldwar.consolebot.dto;

/*
public class Wrapper {
    private String data;
    public void setData(String obj) {
        data = obj;
    }
    public String getData() {
        return data;
    }
}

*/
//code above is equal of
public record Request(String data) {

}