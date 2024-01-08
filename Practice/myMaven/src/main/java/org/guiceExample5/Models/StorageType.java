package org.guiceExample5.Models;

import com.google.inject.ImplementedBy;

@ImplementedBy(OnlineStorageType.class)
public interface StorageType {
    String name = "";
    String getName();
}
