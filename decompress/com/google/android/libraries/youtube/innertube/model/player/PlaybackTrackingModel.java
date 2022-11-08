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
    private final akuw n;
    
    static {
        (l = new HashSet()).add(vhp.d);
        (m = new HashSet()).add(vhp.a);
        CREATOR = (Parcelable$Creator)new uik(19);
    }
    
    public PlaybackTrackingModel() {
        this(null);
    }
    
    public PlaybackTrackingModel(final akuw akuw) {
        akuw a = akuw;
        if (akuw == null) {
            a = akuw.a;
        }
        this.n = a;
        final Vss3ConfigModel vss3ConfigModel = null;
        TrackingUrlModel b;
        if (a != null && (a.b & 0x1) != 0x0) {
            aluf aluf;
            if ((aluf = a.c) == null) {
                aluf = aluf.a;
            }
            b = new TrackingUrlModel(aluf);
        }
        else {
            b = null;
        }
        this.b = b;
        TrackingUrlModel c;
        if (a != null && (a.b & 0x2) != 0x0) {
            aluf aluf2;
            if ((aluf2 = a.d) == null) {
                aluf2 = aluf.a;
            }
            c = new TrackingUrlModel(aluf2);
        }
        else {
            c = null;
        }
        this.c = c;
        TrackingUrlModel d;
        if (a != null && (a.b & 0x4) != 0x0) {
            aluf aluf3;
            if ((aluf3 = a.e) == null) {
                aluf3 = aluf.a;
            }
            d = new TrackingUrlModel(aluf3);
        }
        else {
            d = null;
        }
        this.d = d;
        LoggingUrlModel e;
        if (a != null && (a.b & 0x8000) != 0x0) {
            alud alud;
            if ((alud = a.o) == null) {
                alud = alud.a;
            }
            e = new LoggingUrlModel(alud);
        }
        else {
            e = null;
        }
        this.e = e;
        TrackingUrlModel f;
        if (a != null && (a.b & 0x20) != 0x0) {
            aluf aluf4;
            if ((aluf4 = a.i) == null) {
                aluf4 = aluf.a;
            }
            f = new TrackingUrlModel(aluf4);
        }
        else {
            f = null;
        }
        this.f = f;
        TrackingUrlModel a2;
        if (a != null && (a.b & 0x4000) != 0x0) {
            aluf aluf5;
            if ((aluf5 = a.n) == null) {
                aluf5 = aluf.a;
            }
            a2 = new TrackingUrlModel(aluf5);
        }
        else {
            a2 = null;
        }
        this.a = a2;
        final ArrayList g = new ArrayList();
        this.g = g;
        if (a != null && (a.b & 0x10) != 0x0) {
            aluf aluf6;
            if ((aluf6 = a.h) == null) {
                aluf6 = aluf.a;
            }
            g.add(new TrackingUrlModel(aluf6, PlaybackTrackingModel.l));
        }
        if (a != null && (a.b & 0x40) != 0x0) {
            aluf aluf7;
            if ((aluf7 = a.j) == null) {
                aluf7 = aluf.a;
            }
            g.add(new TrackingUrlModel(aluf7, PlaybackTrackingModel.m));
        }
        if (a != null && (a.b & 0x80) != 0x0) {
            aluf aluf8;
            if ((aluf8 = a.k) == null) {
                aluf8 = aluf.a;
            }
            g.add(new TrackingUrlModel(aluf8, PlaybackTrackingModel.m));
        }
        if (a != null && (a.b & 0x100) != 0x0) {
            aluf aluf9;
            if ((aluf9 = a.l) == null) {
                aluf9 = aluf.a;
            }
            g.add(new TrackingUrlModel(aluf9));
        }
        if (a != null && (a.b & 0x200) != 0x0) {
            aluf aluf10;
            if ((aluf10 = a.m) == null) {
                aluf10 = aluf.a;
            }
            g.add(new TrackingUrlModel(aluf10));
        }
        if (a != null && a.f.size() != 0) {
            this.j = aesy.D((Collection)a.f);
        }
        else {
            this.j = null;
        }
        Label_0656: {
            if (a != null) {
                final int g2 = a.g;
                if (g2 > 0) {
                    this.i = g2;
                    break Label_0656;
                }
            }
            this.i = 0;
        }
        this.h = new ArrayList();
        if (a != null && !a.p.isEmpty()) {
            final Iterator<Object> iterator = a.p.iterator();
            while (iterator.hasNext()) {
                this.h.add(new PlaybackLoggingPayloadModel(iterator.next()));
            }
        }
        Vss3ConfigModel k = vss3ConfigModel;
        if (a != null) {
            k = vss3ConfigModel;
            if ((a.b & 0x40000) != 0x0) {
                apnz apnz;
                if ((apnz = a.q) == null) {
                    apnz = apnz.a;
                }
                k = new Vss3ConfigModel(apnz);
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
        return aeda.v((Object)this.b, (Object)playbackTrackingModel.b) && aeda.v((Object)this.c, (Object)playbackTrackingModel.c) && aeda.v((Object)this.d, (Object)playbackTrackingModel.d) && aeda.v((Object)this.e, (Object)playbackTrackingModel.e) && aeda.v((Object)this.f, (Object)playbackTrackingModel.f) && aeda.v((Object)this.g, (Object)playbackTrackingModel.g) && aeda.v((Object)this.h, (Object)playbackTrackingModel.h) && aeda.v((Object)this.a, (Object)playbackTrackingModel.a) && this.i == playbackTrackingModel.i && Arrays.equals(this.j, playbackTrackingModel.j);
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
        final byte[] byteArray = ((agxl)this.n).toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }
}
