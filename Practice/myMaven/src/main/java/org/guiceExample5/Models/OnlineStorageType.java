package org.guiceExample5.Models;

public class OnlineStorageType implements StorageType{
    String name;
    public OnlineStorageType() {
        this.name = "OnlineStorageType";
    }

    public String getName() {
        return name;
    }
}
