// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a;
import android.os.IInterface;
import android.os.IBinder;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Handler;

public final class b extends enz implements c
{
    public final abal a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.b b;
    private final Handler c;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
    }
    
    public b(final abal a, final Handler c) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public final int a() {
        return this.a.getHeight();
    }
    
    public final int b() {
        return this.a.getWidth();
    }
    
    public final void c() {
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.b b = this.b;
        if (b != null) {
            b.a = null;
            this.b = null;
        }
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int int1) {
        switch (n) {
            default: {
                return false;
            }
            case 7: {
                final Bitmap bitmap = (Bitmap)eoa.a(parcel, Bitmap.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.h(bitmap);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                n = this.a();
                parcel2.writeNoException();
                parcel2.writeInt(n);
                break;
            }
            case 5: {
                n = this.b();
                parcel2.writeNoException();
                parcel2.writeInt(n);
                break;
            }
            case 4: {
                this.g();
                parcel2.writeNoException();
                break;
            }
            case 3: {
                final CharSequence b = eoa.b(parcel);
                final CharSequence b2 = eoa.b(parcel);
                final CharSequence b3 = eoa.b(parcel);
                this.enforceNoDataAvail(parcel);
                this.k(b, b2, b3);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                final CharSequence b4 = eoa.b(parcel);
                final CharSequence b5 = eoa.b(parcel);
                final boolean k = eoa.k(parcel);
                final CharSequence b6 = eoa.b(parcel);
                n = parcel.readInt();
                final CharSequence b7 = eoa.b(parcel);
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.j(b4, b5, k, b6, n, b7, int1);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                final IBinder strongBinder = parcel.readStrongBinder();
                Object o;
                if (strongBinder == null) {
                    o = null;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayServiceListener");
                    if (queryLocalInterface instanceof f) {
                        o = queryLocalInterface;
                    }
                    else {
                        o = new d(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.i((f)o);
                parcel2.writeNoException();
                break;
            }
        }
        return true;
    }
    
    public final void g() {
        final Handler c = this.c;
        final abal a = this.a;
        a.getClass();
        c.post((Runnable)new a(a, 13));
    }
    
    public final void h(final Bitmap bitmap) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c(this, bitmap, 20));
    }
    
    public final void i(final f f) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a(this, f, 1));
    }
    
    public final void j(final CharSequence charSequence, final CharSequence charSequence2, final boolean b, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final int n2) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.a(this, charSequence, charSequence2, b, charSequence3, n, charSequence4, n2));
    }
    
    public final void k(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        this.c.post((Runnable)new joq(this, charSequence, charSequence2, charSequence3, 8));
    }
}
