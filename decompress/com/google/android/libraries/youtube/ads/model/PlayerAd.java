// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import java.util.Arrays;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import android.os.Parcelable;

public abstract class PlayerAd implements Parcelable, vhe, zjm
{
    protected static final long f;
    public static final byte[] g;
    public static final int q = 0;
    public final String h;
    public final byte[] i;
    public final String j;
    public final String k;
    public final boolean l;
    public final PlayerConfigModel m;
    public final String n;
    public final long o;
    public final VideoAdTrackingModel p;
    
    static {
        f = TimeUnit.DAYS.toMillis(3L);
        g = new byte[0];
    }
    
    protected PlayerAd(final String h, final byte[] array, final String j, final String k, final boolean l, final PlayerConfigModel m, final String n, final long o, final VideoAdTrackingModel p9) {
        h.getClass();
        this.h = h;
        array.getClass();
        this.i = array;
        this.j = j;
        k.getClass();
        this.k = k;
        this.l = l;
        m.getClass();
        this.m = m;
        this.n = n;
        this.o = o;
        p9.getClass();
        this.p = p9;
    }
    
    public static boolean av(final int n) {
        return n > 0;
    }
    
    public List A() {
        return Collections.emptyList();
    }
    
    public List B() {
        return Collections.emptyList();
    }
    
    public boolean D() {
        return this.r() > 0;
    }
    
    public alwh[] G() {
        return null;
    }
    
    public vhc H() {
        return null;
    }
    
    public aiqj I() {
        return null;
    }
    
    public aohs J() {
        return null;
    }
    
    public final List K() {
        return this.p.c;
    }
    
    public final List L() {
        return this.p.g;
    }
    
    public final List M() {
        return this.p.h;
    }
    
    public final List N() {
        return this.p.d;
    }
    
    public final List O() {
        return this.p.e;
    }
    
    public final List P() {
        return this.p.f;
    }
    
    public final List Q() {
        return this.p.i;
    }
    
    public final List R() {
        return this.p.j;
    }
    
    public final List S() {
        return this.p.k;
    }
    
    public final List T() {
        return this.p.l;
    }
    
    public final List U() {
        return this.p.m;
    }
    
    public final List V() {
        return this.p.n;
    }
    
    public final List W() {
        return this.p.o;
    }
    
    public final List X() {
        return this.p.p;
    }
    
    public final List Y() {
        return this.p.q;
    }
    
    public final List Z() {
        return this.p.u;
    }
    
    public final long a() {
        return this.o;
    }
    
    public final List aa() {
        return this.p.r;
    }
    
    public final List ab() {
        return this.p.s;
    }
    
    public final List ac() {
        return this.p.t;
    }
    
    public final List ad() {
        return this.p.v;
    }
    
    public final List ae() {
        return this.p.w;
    }
    
    public final List af() {
        return this.p.x;
    }
    
    public final List ag() {
        return this.p.A;
    }
    
    public final List ah() {
        return this.p.B;
    }
    
    public final List ai() {
        return this.p.C;
    }
    
    public final List aj() {
        return this.p.D;
    }
    
    public final List ak() {
        return this.p.E;
    }
    
    public final List al() {
        return this.p.F;
    }
    
    public final List am() {
        return this.p.G;
    }
    
    public final List an() {
        return this.p.H;
    }
    
    public final List ao() {
        return this.p.I;
    }
    
    public final List ap() {
        return this.p.L;
    }
    
    public final List aq() {
        return this.p.J;
    }
    
    public final List ar() {
        return this.p.K;
    }
    
    public final List as() {
        return this.p.O;
    }
    
    public final List at() {
        return this.p.M;
    }
    
    public final List au() {
        return this.p.N;
    }
    
    public final int aw() {
        return this.p.P;
    }
    
    @Deprecated
    public final boolean b() {
        return false;
    }
    
    public abstract int c();
    
    public Uri d() {
        return null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public VideoStreamingData e() {
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof PlayerAd)) {
            return false;
        }
        final PlayerAd playerAd = (PlayerAd)o;
        return adkp.ae(this.h, playerAd.h) && Arrays.equals(this.i, playerAd.i) && adkp.ae(this.j, playerAd.j) && adkp.ae(this.k, playerAd.k) && this.l == playerAd.l && adkp.ae(this.m, playerAd.m) && adkp.ae(this.n, playerAd.n) && this.o == playerAd.o && adkp.ae(this.p, playerAd.p);
    }
    
    public PlaybackTrackingModel f() {
        return null;
    }
    
    public PlayerResponseModel g() {
        return null;
    }
    
    @Override
    public final int hashCode() {
        throw new UnsupportedOperationException("Ad should not be a key.");
    }
    
    public ahnr i() {
        return null;
    }
    
    public aken j() {
        return null;
    }
    
    public String l() {
        return "";
    }
    
    public String m() {
        return null;
    }
    
    public String n() {
        return null;
    }
    
    public ahlp o() {
        return null;
    }
    
    public int p() {
        return 0;
    }
    
    public int q() {
        return 1;
    }
    
    public int r() {
        return 0;
    }
    
    public int rP() {
        return 0;
    }
    
    public Uri t() {
        return null;
    }
    
    @Override
    public final String toString() {
        final String simpleName = this.getClass().getSimpleName();
        final String n = this.n;
        final StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("_");
        sb.append(n);
        return sb.toString();
    }
    
    public ahnb v() {
        return null;
    }
    
    public aicf w() {
        return null;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.h);
        parcel.writeByteArray(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeByte((byte)(byte)(this.l ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.m, 0);
        parcel.writeString(this.n);
        parcel.writeLong(this.o);
    }
    
    public aicz x() {
        return null;
    }
    
    public aiqj y() {
        return null;
    }
    
    public String z() {
        return "";
    }
}
