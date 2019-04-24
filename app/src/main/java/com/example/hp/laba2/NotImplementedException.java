package com.example.hp.laba2;

class NotImplementedException extends Throwable {
    @Override
    public String getMessage() {
        return "Not implemented";
    }
}
