// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.a;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.z;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Parcel;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.r;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicReference;
import android.graphics.Rect;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d;
import android.view.SurfaceHolder;
import android.content.Context;

public final class e extends eoa implements f
{
    public final Context a;
    public com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.f b;
    public SurfaceHolder c;
    public final d d;
    private final Handler e;
    
    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
    }
    
    public e(final d d, final Context a, final Handler e) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
    }
    
    public final Rect a() {
        final AtomicReference atomicReference = new AtomicReference();
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.e.post((Runnable)new jvg(this, atomicReference, conditionVariable, 10));
        conditionVariable.block();
        return (Rect)atomicReference.get();
    }
    
    public final void b(final int n, final int n2) {
        this.e.post((Runnable)new r(this, n, n2, 3));
    }
    
    public final void c() {
        final d d = this.d;
        final SurfaceView b = d.b;
        if (b != null) {
            d.removeView((View)b);
        }
        d.b = null;
        final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.f b2 = this.b;
        if (b2 != null) {
            b2.a = null;
            b2.b = null;
            this.b = null;
        }
        this.c = null;
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int int1) {
        switch (n) {
            default: {
                return false;
            }
            case 8: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.k(n);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                this.i();
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
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.b(n, int1);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                final boolean k = eob.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.h(k);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                final Rect a = this.a();
                parcel2.writeNoException();
                eob.i(parcel2, (Parcelable)a);
                break;
            }
            case 2: {
                final boolean l = this.l();
                parcel2.writeNoException();
                eob.f(parcel2, l);
                break;
            }
            case 1: {
                final IBinder strongBinder = parcel.readStrongBinder();
                i i;
                if (strongBinder == null) {
                    i = null;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
                    if (queryLocalInterface instanceof i) {
                        i = (i)queryLocalInterface;
                    }
                    else {
                        i = new g(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.j(i);
                parcel2.writeNoException();
                break;
            }
        }
        return true;
    }
    
    public final void g(final int n) {
        this.e.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e(this, n, 0));
    }
    
    public final void h(final boolean b) {
        this.e.post((Runnable)new z(this, b, 2));
    }
    
    public final void i() {
        this.e.post((Runnable)new a(this, 18));
    }
    
    public final void j(final i i) {
        this.e.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a(this, i, 14));
    }
    
    public final void k(final int n) {
        this.e.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e(this, n, 1));
    }
    
    public final boolean l() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.e.post((Runnable)new jvg(this, atomicBoolean, conditionVariable, 11));
        conditionVariable.block();
        return atomicBoolean.get();
    }
}
