// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import java.util.Arrays;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class InstreamAdBreak implements Parcelable, zjm
{
    public static final Parcelable$Creator CREATOR;
    public static final afev a;
    public static final sfu b;
    public final AdBreakRendererModel c;
    public final int d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final byte[] i;
    
    static {
        a = afim.b;
        CREATOR = (Parcelable$Creator)new rhy(5);
        b = new sfu();
    }
    
    public InstreamAdBreak(final AdBreakRendererModel c, final int d, final boolean e, final String f, final String g, String h, final byte[] array) {
        c.getClass();
        this.c = c;
        this.d = d;
        this.e = e;
        tvb.n(f);
        this.f = f;
        tvb.n(g);
        this.g = g;
        if (this.b() == sgp.a) {
            if (e) {
                h = "";
            }
        }
        else {
            h = null;
        }
        this.h = h;
        byte[] b;
        if ((b = array) == null) {
            b = vap.b;
        }
        this.i = b;
    }
    
    public static sgp c(final AdBreakRendererModel adBreakRendererModel) {
        int af;
        if ((af = adyf.af(adBreakRendererModel.b.e)) == 0) {
            af = 1;
        }
        if (--af != 1) {
            if (af != 2) {
                if (af == 3) {
                    return sgp.c;
                }
                if (af != 6) {
                    return null;
                }
            }
            return sgp.b;
        }
        return sgp.a;
    }
    
    public final long a() {
        final ahkt b = this.c.b;
        final int af = adyf.af(b.e);
        if (af != 0) {
            if (af == 4) {
                return -1L;
            }
        }
        return Math.max(b.c, 0);
    }
    
    public final sgp b() {
        return c(this.c);
    }
    
    public final String d() {
        String a;
        if (this.c.a() == null) {
            a = "";
        }
        else {
            a = this.c.a();
        }
        return a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final List e() {
        return this.c.b();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof InstreamAdBreak)) {
            return false;
        }
        final InstreamAdBreak instreamAdBreak = (InstreamAdBreak)o;
        return adkp.ae(this.c, instreamAdBreak.c) && this.d == instreamAdBreak.d && adkp.ae(this.f, instreamAdBreak.f) && adkp.ae(this.h, instreamAdBreak.h) && Arrays.equals(this.i, instreamAdBreak.i);
    }
    
    public final List f() {
        return this.c.c();
    }
    
    public final List g() {
        return this.c.d();
    }
    
    public final /* bridge */ zjl h() {
        return (zjl)new sfu(this);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.d, this.f, Arrays.hashCode(this.i) });
    }
    
    public final boolean i() {
        return this.b() == sgp.b;
    }
    
    public final boolean j() {
        return this.b() == sgp.c;
    }
    
    public final boolean k() {
        return this.b() == sgp.a;
    }
    
    @Override
    public final String toString() {
        return String.format("InstreamAdBreak: [breakType:%s, adBreakIndex:%s, offset:%s, originalVideoId:%s]", this.b(), this.d, this.a(), this.f);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.c, 0);
        parcel.writeInt(this.d);
        parcel.writeInt((int)(this.e ? 1 : 0));
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i.length);
        parcel.writeByteArray(this.i);
    }
}
