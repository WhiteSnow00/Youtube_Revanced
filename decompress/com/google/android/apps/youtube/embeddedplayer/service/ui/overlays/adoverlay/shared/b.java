// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.ProtoWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.x;
import android.os.IInterface;
import android.os.IBinder;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.a;
import android.os.Handler;

public final class b extends eod implements c
{
    public g a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c b;
    private final Handler c;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
    }
    
    public b(final g a, final Handler c) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public final void a(final int n, final int n2, final int n3) {
        this.c.post((Runnable)new a(this, n, n2, n3, 0));
    }
    
    public final void b(final int n) {
        this.c.post((Runnable)new e(this, n, 2));
    }
    
    public final void c() {
        final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c b = this.b;
        if (b != null) {
            b.a = null;
            this.b = null;
        }
        this.a = null;
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int int1) {
        switch (n) {
            default: {
                return false;
            }
            case 12: {
                final FancyDismissibleDialogRendererWrapper fancyDismissibleDialogRendererWrapper = (FancyDismissibleDialogRendererWrapper)eoe.a(parcel, FancyDismissibleDialogRendererWrapper.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.o(fancyDismissibleDialogRendererWrapper);
                break;
            }
            case 11: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.b(n);
                break;
            }
            case 10: {
                final boolean k = eoe.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.l(k);
                break;
            }
            case 9: {
                final boolean i = eoe.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.m(i);
                break;
            }
            case 8: {
                final CharSequence b = eoe.b(parcel);
                this.enforceNoDataAvail(parcel);
                this.p(b);
                break;
            }
            case 7: {
                final boolean j = eoe.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.j(j);
                break;
            }
            case 6: {
                final Bitmap bitmap = (Bitmap)eoe.a(parcel, Bitmap.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.i(bitmap);
                break;
            }
            case 5: {
                int1 = parcel.readInt();
                n = parcel.readInt();
                final int int2 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.a(int1, n, int2);
                break;
            }
            case 4: {
                final CharSequence b2 = eoe.b(parcel);
                this.enforceNoDataAvail(parcel);
                this.h(b2);
                break;
            }
            case 3: {
                final boolean l = eoe.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.k(l);
                break;
            }
            case 2: {
                final boolean m = eoe.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.n(m);
                break;
            }
            case 1: {
                final IBinder strongBinder = parcel.readStrongBinder();
                f f;
                if (strongBinder == null) {
                    f = null;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
                    if (queryLocalInterface instanceof f) {
                        f = (f)queryLocalInterface;
                    }
                    else {
                        f = new d(strongBinder);
                    }
                }
                this.enforceNoDataAvail(parcel);
                this.g(f);
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g(final f f) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, f, 3));
    }
    
    public final void h(final CharSequence charSequence) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, charSequence, 0));
    }
    
    public final void i(final Bitmap bitmap) {
        this.c.post((Runnable)new lqa(this, bitmap, 20));
    }
    
    public final void j(final boolean b) {
        this.c.post((Runnable)new x(this, b, 7));
    }
    
    public final void k(final boolean b) {
        this.c.post((Runnable)new x(this, b, 5));
    }
    
    public final void l(final boolean b) {
        this.c.post((Runnable)new x(this, b, 3));
    }
    
    public final void m(final boolean b) {
        this.c.post((Runnable)new x(this, b, 4));
    }
    
    public final void n(final boolean b) {
        this.c.post((Runnable)new x(this, b, 6));
    }
    
    public final void o(final FancyDismissibleDialogRendererWrapper fancyDismissibleDialogRendererWrapper) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, (ajtu)((ProtoWrapper)fancyDismissibleDialogRendererWrapper).a, 2));
    }
    
    public final void p(final CharSequence charSequence) {
        this.c.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, charSequence, 1));
    }
}
