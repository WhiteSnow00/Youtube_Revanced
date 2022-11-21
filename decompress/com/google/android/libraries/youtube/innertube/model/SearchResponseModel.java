// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class SearchResponseModel implements Parcelable, acbl
{
    public static final Parcelable$Creator CREATOR;
    public final alaz a;
    private vic b;
    private Object c;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(8);
    }
    
    public SearchResponseModel(final alaz a) {
        this.a = a;
    }
    
    public final anxa a() {
        anxa anxa;
        if ((anxa = this.a.g) == null) {
            anxa = anxa.a;
        }
        return anxa;
    }
    
    public final Object b() {
        return this.c;
    }
    
    public final void c(final Object c) {
        this.c = c;
    }
    
    public final byte[] d() {
        return this.a.h.I();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final vic e() {
        final vic b = this.b;
        if (b != null) {
            return b;
        }
        alba alba;
        if ((alba = this.a.e) == null) {
            alba = alba.a;
        }
        if (alba.b == 49399797) {
            this.b = new vic((aobc)alba.c);
        }
        return this.b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ume.ad((MessageLite)this.a, parcel);
    }
}
