package com.volcengine.tos.model.object;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.tos.comm.common.StorageClassType;
import com.volcengine.tos.internal.util.TypeConverter;
import com.volcengine.tos.model.acl.Owner;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class ListedObjectV2 {
    @JsonProperty("Key")
    private String key;
    @JsonProperty("LastModified")
    private Date lastModified;
    @JsonProperty("ETag")
    private String etag;
    @JsonProperty("Size")
    private long size;
    @JsonProperty("Owner")
    private Owner owner;
    @JsonProperty("StorageClass")
    private String storageClass;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("HashCrc64ecma")
    private String hashCrc64ecma;

    public String getKey() {
        return key;
    }

    public ListedObjectV2 setKey(String key) {
        this.key = key;
        return this;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public ListedObjectV2 setLastModified(Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    public String getEtag() {
        return etag;
    }

    public ListedObjectV2 setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    public long getSize() {
        return size;
    }

    public ListedObjectV2 setSize(long size) {
        this.size = size;
        return this;
    }

    public Owner getOwner() {
        return owner;
    }

    public ListedObjectV2 setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public String getStorageClass() {
        return storageClass;
    }

    public ListedObjectV2 setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    public String getType() {
        return type;
    }

    public ListedObjectV2 setType(String type) {
        this.type = type;
        return this;
    }

    public String getHashCrc64ecma() {
        return hashCrc64ecma;
    }

    public ListedObjectV2 setHashCrc64ecma(String hashCrc64ecma) {
        this.hashCrc64ecma = hashCrc64ecma;
        return this;
    }

    @Override
    public String toString() {
        return "ListedObjectV2{" +
                "key='" + key + '\'' +
                ", lastModified=" + lastModified +
                ", etag='" + etag + '\'' +
                ", size=" + size +
                ", owner=" + owner +
                ", storageClass=" + storageClass +
                ", type='" + type + '\'' +
                ", hashCrc64ecma='" + hashCrc64ecma + '\'' +
                '}';
    }
}
