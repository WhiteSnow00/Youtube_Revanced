// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.player;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PlaybackTrackingModel implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final Set l;
    private static final Set m;
    public final TrackingUrlModel a;
    public final TrackingUrlModel b;
    public final TrackingUrlModel c;
    public final TrackingUrlModel d;
    public final LoggingUrlModel e;
    public final TrackingUrlModel f;
    public final List g;
    public final List h;
    public final int i;
    public final int[] j;
    public final Vss3ConfigModel k;
    private final akza n;
    
    static {
        (l = new HashSet()).add(vkx.d);
        (m = new HashSet()).add(vkx.a);
        CREATOR = (Parcelable$Creator)new ulj(19);
    }
    
    public PlaybackTrackingModel() {
        this(null);
    }
    
    public PlaybackTrackingModel(final akza akza) {
        akza a = akza;
        if (akza == null) {
            a = akza.a;
        }
        this.n = a;
        final Vss3ConfigModel vss3ConfigModel = null;
        TrackingUrlModel b;
        if (a != null && (a.b & 0x1) != 0x0) {
            alyj alyj;
            if ((alyj = a.c) == null) {
                alyj = alyj.a;
            }
            b = new TrackingUrlModel(alyj);
        }
        else {
            b = null;
        }
        this.b = b;
        TrackingUrlModel c;
        if (a != null && (a.b & 0x2) != 0x0) {
            alyj alyj2;
            if ((alyj2 = a.d) == null) {
                alyj2 = alyj.a;
            }
            c = new TrackingUrlModel(alyj2);
        }
        else {
            c = null;
        }
        this.c = c;
        TrackingUrlModel d;
        if (a != null && (a.b & 0x4) != 0x0) {
            alyj alyj3;
            if ((alyj3 = a.e) == null) {
                alyj3 = alyj.a;
            }
            d = new TrackingUrlModel(alyj3);
        }
        else {
            d = null;
        }
        this.d = d;
        LoggingUrlModel e;
        if (a != null && (a.b & 0x8000) != 0x0) {
            alyh alyh;
            if ((alyh = a.o) == null) {
                alyh = alyh.a;
            }
            e = new LoggingUrlModel(alyh);
        }
        else {
            e = null;
        }
        this.e = e;
        TrackingUrlModel f;
        if (a != null && (a.b & 0x20) != 0x0) {
            alyj alyj4;
            if ((alyj4 = a.i) == null) {
                alyj4 = alyj.a;
            }
            f = new TrackingUrlModel(alyj4);
        }
        else {
            f = null;
        }
        this.f = f;
        TrackingUrlModel a2;
        if (a != null && (a.b & 0x4000) != 0x0) {
            alyj alyj5;
            if ((alyj5 = a.n) == null) {
                alyj5 = alyj.a;
            }
            a2 = new TrackingUrlModel(alyj5);
        }
        else {
            a2 = null;
        }
        this.a = a2;
        final ArrayList g = new ArrayList();
        this.g = g;
        if (a != null && (a.b & 0x10) != 0x0) {
            alyj alyj6;
            if ((alyj6 = a.h) == null) {
                alyj6 = alyj.a;
            }
            g.add(new TrackingUrlModel(alyj6, PlaybackTrackingModel.l));
        }
        if (a != null && (a.b & 0x40) != 0x0) {
            alyj alyj7;
            if ((alyj7 = a.j) == null) {
                alyj7 = alyj.a;
            }
            g.add(new TrackingUrlModel(alyj7, PlaybackTrackingModel.m));
        }
        if (a != null && (a.b & 0x80) != 0x0) {
            alyj alyj8;
            if ((alyj8 = a.k) == null) {
                alyj8 = alyj.a;
            }
            g.add(new TrackingUrlModel(alyj8, PlaybackTrackingModel.m));
        }
        if (a != null && (a.b & 0x100) != 0x0) {
            alyj alyj9;
            if ((alyj9 = a.l) == null) {
                alyj9 = alyj.a;
            }
            g.add(new TrackingUrlModel(alyj9));
        }
        if (a != null && (a.b & 0x200) != 0x0) {
            alyj alyj10;
            if ((alyj10 = a.m) == null) {
                alyj10 = alyj.a;
            }
            g.add(new TrackingUrlModel(alyj10));
        }
        if (a != null && a.f.size() != 0) {
            this.j = afxr.I((Collection)a.f);
        }
        else {
            this.j = null;
        }
        Label_0654: {
            if (a != null) {
                final int g2 = a.g;
                if (g2 > 0) {
                    this.i = g2;
                    break Label_0654;
                }
            }
            this.i = 0;
        }
        this.h = new ArrayList();
        if (a != null && !((List)a.p).isEmpty()) {
            final Iterator<Object> iterator = ((List<Object>)a.p).iterator();
            while (iterator.hasNext()) {
                this.h.add(new PlaybackLoggingPayloadModel(iterator.next()));
            }
        }
        Vss3ConfigModel k = vss3ConfigModel;
        if (a != null) {
            k = vss3ConfigModel;
            if ((a.b & 0x40000) != 0x0) {
                apsp apsp;
                if ((apsp = a.q) == null) {
                    apsp = apsp.a;
                }
                k = new Vss3ConfigModel(apsp);
            }
        }
        this.k = k;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof PlaybackTrackingModel)) {
            return false;
        }
        final PlaybackTrackingModel playbackTrackingModel = (PlaybackTrackingModel)o;
        return aexq.c(this.b, playbackTrackingModel.b) && aexq.c(this.c, playbackTrackingModel.c) && aexq.c(this.d, playbackTrackingModel.d) && aexq.c(this.e, playbackTrackingModel.e) && aexq.c(this.f, playbackTrackingModel.f) && aexq.c(this.g, playbackTrackingModel.g) && aexq.c(this.h, playbackTrackingModel.h) && aexq.c(this.a, playbackTrackingModel.a) && this.i == playbackTrackingModel.i && Arrays.equals(this.j, playbackTrackingModel.j);
    }
    
    @Override
    public final int hashCode() {
        final TrackingUrlModel b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final TrackingUrlModel c = this.c;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final TrackingUrlModel d = this.d;
        int hashCode4;
        if (d != null) {
            hashCode4 = d.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final LoggingUrlModel e = this.e;
        int hashCode5;
        if (e != null) {
            hashCode5 = e.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final TrackingUrlModel f = this.f;
        int hashCode6;
        if (f != null) {
            hashCode6 = f.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final TrackingUrlModel a = this.a;
        if (a != null) {
            hashCode = a.hashCode();
        }
        return ((((((((hashCode2 + 31) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode) * 31 + this.g.hashCode()) * 31 + this.h.hashCode()) * 31;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final byte[] byteArray = this.n.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
