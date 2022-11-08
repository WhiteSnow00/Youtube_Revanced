// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.player;

import com.google.protobuf.MessageLite;
import java.util.List;
import android.os.Parcel;
import android.net.Uri;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TrackingUrlModel implements Comparable, Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final Set a;
    public final String b;
    public final Set c;
    public final Set d;
    private final int e;
    
    static {
        a = Collections.emptySet();
        CREATOR = (Parcelable$Creator)new vho(0);
    }
    
    public TrackingUrlModel(final aluf aluf) {
        this(aluf, TrackingUrlModel.a);
    }
    
    public TrackingUrlModel(final aluf aluf, final Set c) {
        this.b = aluf.c;
        c.getClass();
        this.c = c;
        int d;
        if ((d = aluf.d) == 0) {
            d = -1;
        }
        this.e = d;
        this.d = new HashSet();
        for (final aluc aluc : aluf.e) {
            final Set d2 = this.d;
            alub alub;
            if ((alub = alub.b(aluc.c)) == null) {
                alub = alub.a;
            }
            d2.add(alub);
        }
    }
    
    public TrackingUrlModel(final lqc lqc) {
        String c;
        if ((lqc.b & 0x1) != 0x0) {
            c = lqc.c;
        }
        else {
            c = "";
        }
        this.b = c;
        this.c = new HashSet();
    Label_0050:
        for (final int intValue : lqc.d) {
            final Set c2 = this.c;
            while (true) {
                for (final vhp b : vhp.values()) {
                    if (b.g == intValue) {
                        c2.add(b);
                        continue Label_0050;
                    }
                }
                vhp b = vhp.b;
                continue;
            }
        }
        int e;
        if ((lqc.b & 0x2) != 0x0) {
            e = lqc.e;
        }
        else {
            e = -1;
        }
        this.e = e;
        this.d = new HashSet();
        if (lqc.f.size() != 0) {
            final Iterator<Object> iterator2 = ((List<Object>)lqc.f).iterator();
            while (iterator2.hasNext()) {
                final alub b2 = alub.b((int)iterator2.next());
                if (b2 != null) {
                    this.d.add(b2);
                }
            }
        }
    }
    
    public final int a(final TrackingUrlModel trackingUrlModel) {
        final int e = this.e;
        final int e2 = trackingUrlModel.e;
        if (e == e2) {
            return this.b.compareTo(trackingUrlModel.b);
        }
        if (e < e2) {
            return -1;
        }
        return 1;
    }
    
    public final int b(final int n) {
        final int e = this.e;
        if (e == -1) {
            return n;
        }
        return e;
    }
    
    public final Uri c() {
        return Uri.parse(this.b);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof TrackingUrlModel;
        boolean b2 = false;
        if (b) {
            final TrackingUrlModel trackingUrlModel = (TrackingUrlModel)o;
            if (this != trackingUrlModel) {
                b2 = b2;
                if (trackingUrlModel.a(this) != 0) {
                    return b2;
                }
                if (this.hashCode() != trackingUrlModel.hashCode()) {
                    return false;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return (((this.b.hashCode() + 31) * 31 + this.c.hashCode()) * 31 + this.e) * 31 + this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("@");
        sb.append(this.e);
        sb.append("baseUrl->");
        sb.append(this.b);
        sb.append("params->");
        sb.append(this.c);
        sb.append("headers->");
        sb.append(this.d);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int e) {
        final agza builder = ((agzi)lqc.a).createBuilder();
        final String b = this.b;
        builder.copyOnWrite();
        final lqc lqc = (lqc)builder.instance;
        b.getClass();
        lqc.b |= 0x1;
        lqc.c = b;
        e = this.e;
        builder.copyOnWrite();
        final lqc lqc2 = (lqc)builder.instance;
        lqc2.b |= 0x2;
        lqc2.e = e;
        final int[] array = new int[this.c.size()];
        final Iterator iterator = this.c.iterator();
        final int n = 0;
        e = 0;
        while (iterator.hasNext()) {
            final vhp vhp = (vhp)iterator.next();
            final vhp a = vhp.a;
            array[e] = vhp.g;
            ++e;
        }
        final List c = aesy.C(array);
        builder.copyOnWrite();
        final lqc lqc3 = (lqc)builder.instance;
        final agzq d = lqc3.d;
        if (!d.c()) {
            lqc3.d = agzi.mutableCopy(d);
        }
        agxl.addAll((Iterable)c, (List)lqc3.d);
        final int[] array2 = new int[this.d.size()];
        final Iterator iterator2 = this.d.iterator();
        e = n;
        while (iterator2.hasNext()) {
            array2[e] = ((alub)iterator2.next()).h;
            ++e;
        }
        final List c2 = aesy.C(array2);
        builder.copyOnWrite();
        final lqc lqc4 = (lqc)builder.instance;
        final agzq f = lqc4.f;
        if (!f.c()) {
            lqc4.f = agzi.mutableCopy(f);
        }
        agxl.addAll((Iterable)c2, (List)lqc4.f);
        uji.ag((MessageLite)builder.build(), parcel);
    }
}
