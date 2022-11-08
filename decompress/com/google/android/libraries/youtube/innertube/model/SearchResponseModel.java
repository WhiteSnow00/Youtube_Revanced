// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class SearchResponseModel implements Parcelable, abxy
{
    public static final Parcelable$Creator CREATOR;
    public akww a;
    private veu b;
    private Object c;
    
    static {
        CREATOR = (Parcelable$Creator)new uik(8);
    }
    
    public SearchResponseModel(final akww a) {
        this.a = a;
    }
    
    public final ansr a() {
        ansr ansr;
        if ((ansr = this.a.g) == null) {
            ansr = ansr.a;
        }
        return ansr;
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
    
    public final veu e() {
        final veu b = this.b;
        if (b != null) {
            return b;
        }
        akwx akwx;
        if ((akwx = this.a.e) == null) {
            akwx = akwx.a;
        }
        if (akwx.b == 49399797) {
            this.b = new veu((anws)akwx.c);
        }
        return this.b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        uji.ag((MessageLite)this.a, parcel);
    }
}
