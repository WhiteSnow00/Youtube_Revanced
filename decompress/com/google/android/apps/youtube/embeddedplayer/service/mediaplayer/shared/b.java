// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.r;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.a;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;

public final class b extends eoa implements c
{
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    private final Handler d;
    private final Runnable e;
    private final Runnable f;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
    }
    
    public b(final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c a, final Handler d) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        this.b = new AtomicInteger();
        this.c = new AtomicInteger();
        this.e = (Runnable)new a(a, 15);
        this.f = (Runnable)new a(a, 16, (byte[])null);
        a.b(this);
    }
    
    public final int a() {
        return this.c.get();
    }
    
    public final int b() {
        return this.b.get();
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int int1) {
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.d.post((Runnable)new a(this, 13));
                parcel2.writeNoException();
                break;
            }
            case 8: {
                this.h();
                parcel2.writeNoException();
                break;
            }
            case 7: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.i(n);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.g(n);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.l(n);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                this.j();
                parcel2.writeNoException();
                break;
            }
            case 3: {
                int1 = parcel.readInt();
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.k(int1, n);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                n = this.a();
                parcel2.writeNoException();
                parcel2.writeInt(n);
                break;
            }
            case 1: {
                n = this.b();
                parcel2.writeNoException();
                parcel2.writeInt(n);
                break;
            }
        }
        return true;
    }
    
    public final void g(final int n) {
        this.d.post((Runnable)new ccm(this, n, 20));
    }
    
    public final void h() {
        this.d.post(this.f);
    }
    
    public final void i(final int n) {
        this.d.postDelayed(this.e, (long)n);
    }
    
    public final void j() {
        final Handler d = this.d;
        final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c a = this.a;
        a.getClass();
        d.post((Runnable)new a(a, 14));
    }
    
    public final void k(final int n, final int n2) {
        this.d.post((Runnable)new r(this, n, n2, 2));
    }
    
    public final void l(final int n) {
        this.d.post((Runnable)new ccm(this, n, 19));
    }
}
