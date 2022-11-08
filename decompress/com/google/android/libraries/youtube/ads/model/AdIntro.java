// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.model;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.os.Parcelable$Creator;

public class AdIntro extends MediaAd
{
    public static final Parcelable$Creator CREATOR;
    public static final String a;
    public static final sev b;
    public final PlayerResponseModel c;
    
    static {
        a = String.valueOf(Integer.toString(2)).concat("_2_15");
        CREATOR = (Parcelable$Creator)new qzp(3);
        b = (sev)new saw();
    }
    
    public AdIntro(final String s, final byte[] array, final String s2, final String s3, final boolean b, final String s4, final long n, final PlayerResponseModel c) {
        super(s, array, s2, s3, b, c.m(), s4, n, new VideoAdTrackingModel(ahlc.a));
        c.getClass();
        this.c = c;
    }
    
    public final int c() {
        return this.c.h();
    }
    
    public final Uri d() {
        if (((PlayerAd)this).e() == null) {
            return null;
        }
        final List o = ((PlayerAd)this).e().o;
        if (o == null) {
            return null;
        }
        if (o.isEmpty()) {
            zjp.b(zjo.a, zjn.a, "Received non-null videoStreamingData object with empty list of format streams");
            return null;
        }
        return ((FormatStreamModel)o.get(0)).d;
    }
    
    public final VideoStreamingData e() {
        return this.c.n();
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof AdIntro)) {
            return false;
        }
        final AdIntro adIntro = (AdIntro)o;
        return super.equals((Object)adIntro) && aeda.v((Object)this.c, (Object)adIntro.c);
    }
    
    public final PlaybackTrackingModel f() {
        return this.c.o();
    }
    
    public final PlayerResponseModel g() {
        return this.c;
    }
    
    public final ahlt i() {
        return this.c.u();
    }
    
    public final akck j() {
        akcr akcr;
        if ((akcr = this.c.z().r) == null) {
            akcr = akcr.a;
        }
        if (akcr.b == 61737181) {
            akcr akcr2;
            if ((akcr2 = this.c.z().r) == null) {
                akcr2 = akcr.a;
            }
            akck a;
            if (akcr2.b == 61737181) {
                a = (akck)akcr2.c;
            }
            else {
                a = akck.a;
            }
            return a;
        }
        return null;
    }
    
    public final aldr k() {
        return null;
    }
    
    public final String l() {
        return AdIntro.a;
    }
    
    public final String m() {
        return this.c.d();
    }
    
    public final String n() {
        return this.c.K();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeParcelable((Parcelable)this.c, 0);
    }
}
