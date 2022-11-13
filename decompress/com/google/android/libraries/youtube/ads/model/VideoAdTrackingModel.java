// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.model;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.Arrays;
import java.util.Collection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class VideoAdTrackingModel implements Parcelable, zjm
{
    public static final Parcelable$Creator CREATOR;
    public static final VideoAdTrackingModel a;
    public final List A;
    public final List B;
    public final List C;
    public final List D;
    public final List E;
    public final List F;
    public final List G;
    public final List H;
    public final List I;
    public final List J;
    public final List K;
    public final List L;
    public final List M;
    public final List N;
    public final List O;
    public final int P;
    public final ahna b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;
    public final List w;
    public final List x;
    public final List y;
    public final List z;
    
    static {
        a = new VideoAdTrackingModel(ahna.a);
        CREATOR = (Parcelable$Creator)new rhy(12);
    }
    
    public VideoAdTrackingModel(final ahna ahna) {
        ahna a = ahna;
        if (ahna == null) {
            a = ahna.a;
        }
        this.c = (List)a((List)a.r);
        this.d = (List)a((List)a.p);
        this.e = (List)a((List)a.o);
        this.f = (List)a((List)a.n);
        ahmq ahmq;
        if ((ahmq = a.m) == null) {
            ahmq = ahmq.a;
        }
        this.g = (List)a((List)ahmq.b);
        ahmq ahmq2;
        if ((ahmq2 = a.m) == null) {
            ahmq2 = ahmq.a;
        }
        this.h = (List)a((List)ahmq2.c);
        ahmq ahmq3;
        if ((ahmq3 = a.m) == null) {
            ahmq3 = ahmq.a;
        }
        int aa;
        if ((aa = adyf.aa(ahmq3.d)) == 0) {
            aa = 1;
        }
        this.P = aa;
        this.i = (List)a((List)a.k);
        this.j = (List)a((List)a.i);
        this.k = (List)a((List)a.w);
        this.l = (List)a((List)a.q);
        this.m = (List)a((List)a.c);
        this.n = (List)a((List)a.t);
        this.o = (List)a((List)a.l);
        this.p = (List)a((List)a.b);
        this.q = (List)a((List)a.x);
        a((List)a.d);
        this.r = (List)a((List)a.f);
        this.s = (List)a((List)a.j);
        this.t = (List)a((List)a.g);
        this.u = (List)a((List)a.u);
        this.v = (List)a((List)a.h);
        this.w = (List)a((List)a.s);
        this.x = (List)a((List)a.v);
        a((List)a.k);
        this.y = (List)a((List)a.y);
        this.z = (List)a((List)a.z);
        this.A = (List)a((List)a.K);
        this.B = (List)a((List)a.H);
        this.C = (List)a((List)a.F);
        this.D = (List)a((List)a.P);
        this.E = (List)a((List)a.J);
        this.F = (List)a((List)a.B);
        this.G = (List)a((List)a.M);
        this.H = (List)a((List)a.I);
        this.I = (List)a((List)a.A);
        a((List)a.C);
        this.J = (List)a((List)a.D);
        a((List)a.G);
        this.K = (List)a((List)a.E);
        this.L = (List)a((List)a.N);
        this.M = (List)a((List)a.L);
        this.N = (List)a((List)a.O);
        this.O = (List)a((List)a.Q);
        this.b = a;
    }
    
    private static afeq a(List iterator) {
        if (iterator != null && !((List)iterator).isEmpty()) {
            final ArrayList list = new ArrayList(((List)iterator).size());
            iterator = ((List<ahmw>)iterator).iterator();
            while (iterator.hasNext()) {
                final ahmw ahmw = iterator.next();
                if (!ahmw.c.isEmpty()) {
                    try {
                        tpe.cK(ahmw.c);
                        list.add((Object)ahmw);
                    }
                    catch (final MalformedURLException ex) {
                        ttr.l("Badly formed uri - ignoring");
                    }
                }
            }
            return afeq.o((Collection)list);
        }
        return afeq.q();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof VideoAdTrackingModel && adkp.ae(this.b, ((VideoAdTrackingModel)o).b);
    }
    
    public final /* bridge */ zjl h() {
        return (zjl)new sig(this);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        if (parcel != null) {
            vdh.bp((MessageLite)this.b, parcel);
        }
    }
}
