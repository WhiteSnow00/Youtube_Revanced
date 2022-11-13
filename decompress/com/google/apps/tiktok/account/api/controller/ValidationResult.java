// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account.api.controller;

import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class ValidationResult implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static ValidationResult a;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(10);
    }
    
    public static ValidationResult d() {
        synchronized (ValidationResult.class) {
            if (ValidationResult.a == null) {
                ValidationResult.a = (ValidationResult)new AutoValue_ValidationResult(true, false, (Intent)null);
            }
            return ValidationResult.a;
        }
    }
    
    public abstract Intent a();
    
    public abstract boolean b();
    
    public abstract boolean c();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt((int)(this.c() ? 1 : 0));
        parcel.writeInt((int)(this.b() ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.a(), 0);
    }
}
