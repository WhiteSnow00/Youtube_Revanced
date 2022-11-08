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
    public final aild d;
    public final apni e;
    public final int f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final Map j;
    public final Set k;
    private final Set l;
    private int m;
    private int n;
    private aldv o;
    
    static {
        CREATOR = (Parcelable$Creator)new vho(12);
    }
    
    public InteractionLoggingScreen(final Parcel parcel) {
        this.m = 1;
        final int n = 0;
        this.n = 0;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = (apni)uji.af(parcel, (agzi)apni.a);
        this.o = (aldv)uji.af(parcel, (agzi)aldv.a);
        this.f = parcel.readInt();
        this.d = (aild)uji.af(parcel, (agzi)aild.a);
        final int int1 = parcel.readInt();
        final HashMap g = new HashMap();
        for (int i = 0; i < int1; ++i) {
            g.put(uji.af(parcel, (agzi)apni.a), parcel.readParcelable(GelVisibilityUpdate.class.getClassLoader()));
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
            k.put(uji.af(parcel, (agzi)apni.a), uji.af(parcel, (agzi)apni.a));
        }
        this.i = k;
        final int int4 = parcel.readInt();
        final HashMap m = new HashMap();
        for (int n2 = 0; n2 < int4; ++n2) {
            m.put(parcel.readParcelable(DefaultInteractionLogger$VisualElementKey.class.getClassLoader()), uji.af(parcel, (agzi)apni.a));
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
    
    public InteractionLoggingScreen(final avt avt, final int f, final apni e, final String b, final String c, final aild d, final boolean b2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.m = 1;
        this.n = 0;
        e.getClass();
        this.a = avt.X(16);
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
        this.o = aldv.a;
    }
    
    public static boolean g(final aioe aioe) {
        return aioe != null && ((agzd)aioe).rs((agyr)amoa.b);
    }
    
    private static final boolean k(final apni apni) {
        return (apni != null && apni.c.d() > 0) || (apni != null && apni.d > 0);
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
    
    public final wyb c() {
        return wya.b(this.f);
    }
    
    public final void d(final apni apni, final apni apni2) {
        if (k(apni)) {
            this.i.put(apni, apni2);
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void e(final GelVisibilityUpdate gelVisibilityUpdate) {
        if (k(gelVisibilityUpdate.d)) {
            if (gelVisibilityUpdate.e.isPresent()) {
                final Map h = this.h;
                final wxo c = InteractionLoggingScreen$VisualElementVisibilityKey.c();
                c.d(gelVisibilityUpdate.d);
                c.c((aqqg)gelVisibilityUpdate.e.get());
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
    
    public final boolean h(final apni apni) {
        return k(apni) && this.i.containsKey(apni);
    }
    
    public final boolean i(final GelVisibilityUpdate gelVisibilityUpdate) {
        if (k(gelVisibilityUpdate.d)) {
            if (gelVisibilityUpdate.e.isPresent()) {
                final Map h = this.h;
                final wxo c = InteractionLoggingScreen$VisualElementVisibilityKey.c();
                c.d(gelVisibilityUpdate.d);
                c.c((aqqg)gelVisibilityUpdate.e.get());
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
    
    public final boolean j(final apni apni, final apni apni2) {
        return k(apni) && Map$_EL.putIfAbsent(this.i, (Object)apni, (Object)apni2) != null;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        uji.ag((MessageLite)this.e, parcel);
        uji.ag((MessageLite)this.o, parcel);
        parcel.writeInt(this.f);
        final aild d = this.d;
        if (d != null) {
            uji.ag((MessageLite)d, parcel);
        }
        else {
            uji.ag((MessageLite)aild.a, parcel);
        }
        final Map g = this.g;
        parcel.writeInt(g.size());
        for (final Map.Entry<MessageLite, V> entry : g.entrySet()) {
            uji.ag((MessageLite)entry.getKey(), parcel);
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
            uji.ag((MessageLite)entry3.getKey(), parcel);
            uji.ag((MessageLite)entry3.getValue(), parcel);
        }
        final Map j = this.j;
        parcel.writeInt(j.size());
        for (final Map.Entry<Parcelable, V> entry4 : j.entrySet()) {
            parcel.writeParcelable((Parcelable)entry4.getKey(), n);
            uji.ag((MessageLite)entry4.getValue(), parcel);
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
