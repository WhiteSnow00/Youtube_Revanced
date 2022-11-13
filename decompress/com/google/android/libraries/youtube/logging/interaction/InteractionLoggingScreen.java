// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.logging.interaction;

import java.util.Iterator;
import com.google.protobuf.MessageLite;
import j$.util.Map$_EL;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.HashMap;
import android.os.Parcel;
import java.util.Set;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class InteractionLoggingScreen implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final ainb d;
    public final appm e;
    public final int f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final Map j;
    public final Set k;
    private final Set l;
    private int m;
    private int n;
    private alfy o;
    
    static {
        CREATOR = (Parcelable$Creator)new vjo(12);
    }
    
    public InteractionLoggingScreen(final Parcel parcel) {
        this.m = 1;
        final int n = 0;
        this.n = 0;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = (appm)vdh.bo(parcel, (ahbh)appm.a);
        this.o = (alfy)vdh.bo(parcel, (ahbh)alfy.a);
        this.f = parcel.readInt();
        this.d = (ainb)vdh.bo(parcel, (ahbh)ainb.a);
        final int int1 = parcel.readInt();
        final HashMap g = new HashMap();
        for (int i = 0; i < int1; ++i) {
            g.put(vdh.bo(parcel, (ahbh)appm.a), parcel.readParcelable(GelVisibilityUpdate.class.getClassLoader()));
        }
        this.g = g;
        final int int2 = parcel.readInt();
        final HashMap h = new HashMap();
        for (int j = 0; j < int2; ++j) {
            h.put(parcel.readParcelable(InteractionLoggingScreen$VisualElementVisibilityKey.class.getClassLoader()), parcel.readParcelable(GelVisibilityUpdate.class.getClassLoader()));
        }
        this.h = h;
        final int int3 = parcel.readInt();
        final HashMap k = new HashMap();
        for (int l = 0; l < int3; ++l) {
            k.put(vdh.bo(parcel, (ahbh)appm.a), vdh.bo(parcel, (ahbh)appm.a));
        }
        this.i = k;
        final int int4 = parcel.readInt();
        final HashMap m = new HashMap();
        for (int n2 = 0; n2 < int4; ++n2) {
            m.put(parcel.readParcelable(DefaultInteractionLogger$VisualElementKey.class.getClassLoader()), vdh.bo(parcel, (ahbh)appm.a));
        }
        this.j = m;
        final int int5 = parcel.readInt();
        final HashSet k2 = new HashSet();
        for (int n3 = 0; n3 < int5; ++n3) {
            k2.add(parcel.readString());
        }
        this.k = k2;
        final int int6 = parcel.readInt();
        this.l = new HashSet();
        for (int n4 = n; n4 < int6; ++n4) {
            this.l.add(parcel.readInt());
        }
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }
    
    public InteractionLoggingScreen(final msr msr, final int f, final appm e, final String b, final String c, final ainb d, final boolean b2, final byte[] array) {
        this.m = 1;
        this.n = 0;
        e.getClass();
        this.a = msr.y(16);
        this.g = new HashMap();
        this.h = new HashMap();
        this.l = new HashSet();
        this.i = new HashMap();
        this.k = new HashSet();
        Object j;
        if (b2) {
            j = new ConcurrentHashMap();
        }
        else {
            j = new HashMap();
        }
        this.j = (Map)j;
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.o = alfy.a;
    }
    
    public static boolean g(final aiqj aiqj) {
        return aiqj != null && ((ahbc)aiqj).ry((ahaq)amqf.b);
    }
    
    private static final boolean k(final appm appm) {
        return (appm != null && appm.c.d() > 0) || (appm != null && appm.d > 0);
    }
    
    public final int a() {
        synchronized (this) {
            return this.n++;
        }
    }
    
    public final int b(int n) {
        final Set l = this.l;
        final Integer value = n;
        if (l.contains(value)) {
            n = this.m++;
            return n;
        }
        this.l.add(value);
        return 0;
    }
    
    public final xab c() {
        return xaa.b(this.f);
    }
    
    public final void d(final appm appm, final appm appm2) {
        if (k(appm)) {
            this.i.put(appm, appm2);
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void e(final GelVisibilityUpdate gelVisibilityUpdate) {
        if (k(gelVisibilityUpdate.d)) {
            if (gelVisibilityUpdate.e.isPresent()) {
                final Map h = this.h;
                final wzo c = InteractionLoggingScreen$VisualElementVisibilityKey.c();
                c.d(gelVisibilityUpdate.d);
                c.c((aqss)gelVisibilityUpdate.e.get());
                c.b();
                h.put(c.a(), gelVisibilityUpdate);
                return;
            }
            this.g.put(gelVisibilityUpdate.d, gelVisibilityUpdate);
        }
    }
    
    public final void f(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        this.k.add(s);
    }
    
    public final boolean h(final appm appm) {
        return k(appm) && this.i.containsKey(appm);
    }
    
    public final boolean i(final GelVisibilityUpdate gelVisibilityUpdate) {
        if (k(gelVisibilityUpdate.d)) {
            if (gelVisibilityUpdate.e.isPresent()) {
                final Map h = this.h;
                final wzo c = InteractionLoggingScreen$VisualElementVisibilityKey.c();
                c.d(gelVisibilityUpdate.d);
                c.c((aqss)gelVisibilityUpdate.e.get());
                c.b();
                final GelVisibilityUpdate gelVisibilityUpdate2 = h.get(c.a());
                if (gelVisibilityUpdate2 != null) {
                    final int n = gelVisibilityUpdate2.g;
                    return (n == 2 || n == 5) == gelVisibilityUpdate instanceof GelVisibilityUpdate$ShownVisibilityUpdate;
                }
            }
            else {
                final GelVisibilityUpdate gelVisibilityUpdate3 = this.g.get(gelVisibilityUpdate.d);
                if (gelVisibilityUpdate3 != null) {
                    final int n = gelVisibilityUpdate3.g;
                    return (n == 2 || n == 5) == gelVisibilityUpdate instanceof GelVisibilityUpdate$ShownVisibilityUpdate;
                }
            }
        }
        final int n = 1;
        return (n == 2 || n == 5) == gelVisibilityUpdate instanceof GelVisibilityUpdate$ShownVisibilityUpdate;
    }
    
    public final boolean j(final appm appm, final appm appm2) {
        return k(appm) && Map$_EL.putIfAbsent(this.i, (Object)appm, (Object)appm2) != null;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        vdh.bp((MessageLite)this.e, parcel);
        vdh.bp((MessageLite)this.o, parcel);
        parcel.writeInt(this.f);
        final ainb d = this.d;
        if (d != null) {
            vdh.bp((MessageLite)d, parcel);
        }
        else {
            vdh.bp((MessageLite)ainb.a, parcel);
        }
        final Map g = this.g;
        parcel.writeInt(g.size());
        for (final Map.Entry<MessageLite, V> entry : g.entrySet()) {
            vdh.bp((MessageLite)entry.getKey(), parcel);
            parcel.writeParcelable((Parcelable)entry.getValue(), n);
        }
        final Map h = this.h;
        parcel.writeInt(h.size());
        for (final Map.Entry<Parcelable, V> entry2 : h.entrySet()) {
            parcel.writeParcelable((Parcelable)entry2.getKey(), n);
            parcel.writeParcelable((Parcelable)entry2.getValue(), n);
        }
        final Map i = this.i;
        parcel.writeInt(i.size());
        for (final Map.Entry<MessageLite, V> entry3 : i.entrySet()) {
            vdh.bp((MessageLite)entry3.getKey(), parcel);
            vdh.bp((MessageLite)entry3.getValue(), parcel);
        }
        final Map j = this.j;
        parcel.writeInt(j.size());
        for (final Map.Entry<Parcelable, V> entry4 : j.entrySet()) {
            parcel.writeParcelable((Parcelable)entry4.getKey(), n);
            vdh.bp((MessageLite)entry4.getValue(), parcel);
        }
        final Set k = this.k;
        parcel.writeInt(k.size());
        final Iterator iterator5 = k.iterator();
        while (iterator5.hasNext()) {
            parcel.writeString((String)iterator5.next());
        }
        parcel.writeInt(this.l.size());
        final Iterator iterator6 = this.l.iterator();
        while (iterator6.hasNext()) {
            parcel.writeInt((int)iterator6.next());
        }
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }
}
