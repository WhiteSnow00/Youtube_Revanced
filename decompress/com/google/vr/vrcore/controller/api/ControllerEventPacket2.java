// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import java.util.concurrent.TimeUnit;
import java.util.ArrayDeque;
import android.os.Parcelable$Creator;

public final class ControllerEventPacket2 extends ControllerEventPacket
{
    public static final Parcelable$Creator CREATOR;
    public static ArrayDeque a;
    public static Object b;
    public int c;
    public ControllerPositionEvent[] d;
    public boolean e;
    public ControllerBatteryEvent f;
    public long g;
    public int h;
    public final ControllerTrackingStatusEvent[] i;
    
    static {
        ControllerEventPacket2.a = new ArrayDeque();
        ControllerEventPacket2.b = new Object();
        CREATOR = (Parcelable$Creator)new arao(6);
    }
    
    public ControllerEventPacket2() {
        this.d = new ControllerPositionEvent[16];
        this.f = new ControllerBatteryEvent();
        this.i = new ControllerTrackingStatusEvent[16];
        for (int i = 0; i < 16; ++i) {
            this.d[i] = new ControllerPositionEvent();
            this.i[i] = new ControllerTrackingStatusEvent();
        }
        this.b();
    }
    
    public static long a() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }
    
    public final void b() {
        super.b();
        this.c = 0;
        this.h = 0;
        this.e = false;
        this.g = 0L;
    }
    
    public final void c(final Parcel parcel) {
        final int dataPosition = parcel.dataPosition() + parcel.readInt();
        super.c(parcel);
        final int dataPosition2 = parcel.dataPosition();
        final int n = 0;
        if (dataPosition2 < dataPosition) {
            h(this.c = parcel.readInt());
            for (int i = 0; i < this.c; ++i) {
                this.d[i].b(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            final boolean e = parcel.readInt() != 0;
            this.e = e;
            if (e) {
                this.f.b(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            this.g = parcel.readLong();
        }
        if (parcel.dataPosition() < dataPosition) {
            h(this.h = parcel.readInt());
            for (int j = n; j < this.h; ++j) {
                this.i[j].b(parcel);
            }
        }
        parcel.setDataPosition(dataPosition);
    }
    
    public final void d() {
        this.b();
        synchronized (ControllerEventPacket2.b) {
            if (!ControllerEventPacket2.a.contains(this)) {
                ControllerEventPacket2.a.add(this);
            }
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void e(final int e) {
        super.e(e);
        g(e, this.c, (ControllerEvent[])this.d);
        g(this.f.e = e, this.h, (ControllerEvent[])this.i);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        int n2 = 24;
        final int n3 = 0;
        for (int i = 0; i < super.l; ++i) {
            super.m[i].a();
            n2 += 24;
        }
        for (int j = 0; j < super.n; ++j) {
            super.o[j].a();
            n2 += 20;
        }
        for (int k = 0; k < super.p; ++k) {
            super.q[k].a();
            n2 += 24;
        }
        for (int l = 0; l < super.r; ++l) {
            super.s[l].a();
            n2 += 28;
        }
        for (int n4 = 0; n4 < super.t; ++n4) {
            super.u[n4].a();
            n2 += 28;
        }
        int n5 = n2 + 8;
        for (int n6 = 0; n6 < this.c; ++n6) {
            this.d[n6].a();
            n5 += 24;
        }
        n5 += 4;
        int n7 = n5;
        if (this.e) {
            this.f.a();
            n7 = n5 + 20;
        }
        n7 += 12;
        for (int n8 = 0; n8 < this.h; ++n8) {
            this.i[n8].a();
            n7 += 20;
        }
        parcel.writeInt(n7);
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.c);
        for (int n9 = 0; n9 < this.c; ++n9) {
            this.d[n9].writeToParcel(parcel, n);
        }
        parcel.writeInt((int)(this.e ? 1 : 0));
        if (this.e) {
            this.f.writeToParcel(parcel, n);
        }
        parcel.writeLong(this.g);
        parcel.writeInt(this.h);
        for (int n10 = n3; n10 < this.h; ++n10) {
            this.i[n10].writeToParcel(parcel, n);
        }
        if (parcel.dataPosition() - dataPosition == n7) {
            return;
        }
        throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
    }
}
