package com.example.Kalendar.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public class UserEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @NonNull
    @ColumnInfo(name = "username")
    public String username;

    @NonNull
    @ColumnInfo(name = "password_hash")
    public String passwordHash;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "description")
    public String description;

    @ColumnInfo(name = "photo_uri")
    public String photoUri;
    @ColumnInfo(name = "photo_blob", typeAffinity = ColumnInfo.BLOB)
    public byte[]  photoBlob;
}
