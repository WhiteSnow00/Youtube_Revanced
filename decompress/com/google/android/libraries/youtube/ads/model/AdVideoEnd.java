// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.model;

import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import android.os.Parcel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import android.os.Parcelable$Creator;

public class AdVideoEnd extends MediaBreakAd
{
    public static final Parcelable$Creator CREATOR;
    public static final sev a;
    public final ahlt b;
    public final int c;
    public final PlayerAd d;
    
    static {
        CREATOR = (Parcelable$Creator)new qzp(4);
        a = (sev)new sba();
    }
    
    public AdVideoEnd(final PlayerAd d, final String s) {
        super(d.h, d.i, d.j, d.k, d.l, d.m, s, d.p);
        final ahlt i = d.i();
        i.getClass();
        this.b = i;
        this.d = d;
        int rj;
        if (d instanceof LocalVideoAd) {
            rj = ((PlayerAd)d).rJ();
        }
        else {
            rj = 0;
        }
        this.c = rj;
    }
    
    public AdVideoEnd(final String s, final byte[] array, final String s2, final String s3, final boolean b, final PlayerConfigModel playerConfigModel, final String s4, final ahlt b2, final PlayerAd d, final int c) {
        super(s, array, s2, s3, b, playerConfigModel, s4, new VideoAdTrackingModel(ahlc.a));
        b2.getClass();
        this.b = b2;
        d.getClass();
        this.d = d;
        this.c = c;
    }
    
    public final int c() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof AdVideoEnd)) {
            return false;
        }
        final AdVideoEnd adVideoEnd = (AdVideoEnd)o;
        return super.equals((Object)adVideoEnd) && aeda.v((Object)this.b, (Object)adVideoEnd.b) && this.c == adVideoEnd.c;
    }
    
    public final ahlt i() {
        return this.b;
    }
    
    public final ahjr o() {
        final ahlt b = this.b;
        ahjt ahjt;
        if ((b.b & 0x100) != 0x0) {
            if ((ahjt = b.j) == null) {
                ahjt = ahjt.a;
            }
        }
        else {
            ahjt = null;
        }
        if (ahjt != null && (ahjt.b & 0x4) != 0x0) {
            ahjr ahjr;
            if ((ahjr = ahjt.e) == null) {
                ahjr = ahjr.a;
            }
            return ahjr;
        }
        final ahlt b2 = this.b;
        if ((b2.b & 0x80) != 0x0) {
            ahjr ahjr2;
            if ((ahjr2 = b2.i) == null) {
                ahjr2 = ahjr.a;
            }
            return ahjr2;
        }
        return null;
    }
    
    public final int rJ() {
        return this.c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        uji.ag((MessageLite)this.b, parcel);
        parcel.writeParcelable((Parcelable)this.d, 0);
        parcel.writeInt(this.c);
    }
}
