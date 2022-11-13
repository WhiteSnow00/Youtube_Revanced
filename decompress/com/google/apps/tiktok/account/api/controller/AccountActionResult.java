// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account.api.controller;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Parcel;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class AccountActionResult implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final AccountId a;
    public final aejz b;
    public final ValidationResult c;
    public final Intent d;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(9);
    }
    
    public AccountActionResult(final Parcel parcel) {
        this.a = (AccountId)parcel.readParcelable(AccountId.class.getClassLoader());
        try {
            this.b = (aejz)adyf.at(parcel, (MessageLite)aejz.a, ExtensionRegistryLite.getGeneratedRegistry());
            this.c = (ValidationResult)parcel.readParcelable(ValidationResult.class.getClassLoader());
            this.d = (Intent)parcel.readParcelable(ValidationResult.class.getClassLoader());
        }
        catch (final ahca ahca) {
            throw new IllegalStateException("Failed to convert AccountInfo to Parcelable!", (Throwable)ahca);
        }
    }
    
    public AccountActionResult(final AccountId a, final aejz b, final ValidationResult c, final Intent d) {
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, 0);
        adyf.az(parcel, (MessageLite)this.b);
        parcel.writeParcelable((Parcelable)this.c, 0);
        parcel.writeParcelable((Parcelable)this.d, 0);
    }
}
