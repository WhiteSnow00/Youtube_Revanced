// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import java.util.ArrayDeque;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

@Deprecated
public class ControllerEventPacket implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static ArrayDeque j;
    public static Object k;
    public int l;
    public ControllerAccelEvent[] m;
    public int n;
    public ControllerButtonEvent[] o;
    public int p;
    public ControllerGyroEvent[] q;
    public int r;
    public ControllerOrientationEvent[] s;
    public int t;
    public ControllerTouchEvent[] u;
    
    static {
        ControllerEventPacket.j = new ArrayDeque();
        ControllerEventPacket.k = new Object();
        CREATOR = (Parcelable$Creator)new arao(5);
    }
    
    public ControllerEventPacket() {
        this.m = new ControllerAccelEvent[16];
        this.o = new ControllerButtonEvent[16];
        this.q = new ControllerGyroEvent[16];
        this.s = new ControllerOrientationEvent[16];
        this.u = new ControllerTouchEvent[16];
        for (int i = 0; i < 16; ++i) {
            this.m[i] = new ControllerAccelEvent();
            this.o[i] = new ControllerButtonEvent();
            this.q[i] = new ControllerGyroEvent();
            this.s[i] = new ControllerOrientationEvent();
            this.u[i] = new ControllerTouchEvent();
        }
        this.b();
    }
    
    static void g(final int e, final int n, final ControllerEvent[] array) {
        for (int i = 0; i < n; ++i) {
            array[i].e = e;
        }
    }
    
    protected static final void h(final int n) {
        if (n >= 0 && n < 16) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Invalid event count: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void b() {
        this.l = 0;
        this.n = 0;
        this.p = 0;
        this.r = 0;
        this.t = 0;
    }
    
    public void c(final Parcel parcel) {
        parcel.readInt();
        h(this.l = parcel.readInt());
        final int n = 0;
        for (int i = 0; i < this.l; ++i) {
            ((ControllerEvent)this.m[i]).b(parcel);
        }
        h(this.n = parcel.readInt());
        for (int j = 0; j < this.n; ++j) {
            ((ControllerEvent)this.o[j]).b(parcel);
        }
        h(this.p = parcel.readInt());
        for (int k = 0; k < this.p; ++k) {
            ((ControllerEvent)this.q[k]).b(parcel);
        }
        h(this.r = parcel.readInt());
        for (int l = 0; l < this.r; ++l) {
            ((ControllerEvent)this.s[l]).b(parcel);
        }
        h(this.t = parcel.readInt());
        for (int n2 = n; n2 < this.t; ++n2) {
            ((ControllerEvent)this.u[n2]).b(parcel);
        }
    }
    
    public void d() {
        this.b();
        synchronized (ControllerEventPacket.k) {
            if (!ControllerEventPacket.j.contains(this)) {
                ControllerEventPacket.j.add(this);
            }
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void e(final int n) {
        g(n, this.l, (ControllerEvent[])this.m);
        g(n, this.n, (ControllerEvent[])this.o);
        g(n, this.p, (ControllerEvent[])this.q);
        g(n, this.r, (ControllerEvent[])this.s);
        g(n, this.t, (ControllerEvent[])this.u);
    }
    
    public final ControllerButtonEvent f(final int n) {
        if (n >= 0 && n < this.n) {
            return this.o[n];
        }
        throw new IndexOutOfBoundsException();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(1);
        parcel.writeInt(this.l);
        final int n2 = 0;
        for (int i = 0; i < this.l; ++i) {
            ((ControllerEvent)this.m[i]).writeToParcel(parcel, n);
        }
        parcel.writeInt(this.n);
        for (int j = 0; j < this.n; ++j) {
            ((ControllerEvent)this.o[j]).writeToParcel(parcel, n);
        }
        parcel.writeInt(this.p);
        for (int k = 0; k < this.p; ++k) {
            ((ControllerEvent)this.q[k]).writeToParcel(parcel, n);
        }
        parcel.writeInt(this.r);
        for (int l = 0; l < this.r; ++l) {
            ((ControllerEvent)this.s[l]).writeToParcel(parcel, n);
        }
        parcel.writeInt(this.t);
        for (int n3 = n2; n3 < this.t; ++n3) {
            ((ControllerEvent)this.u[n3]).writeToParcel(parcel, n);
        }
    }
}
