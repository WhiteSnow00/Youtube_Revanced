// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.a;
import android.os.Handler;

public final class b extends enz implements c
{
    public final abcp a;
    private final Handler b;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
    }
    
    public b(final abcp a, final Handler b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void a(final boolean b) {
        this.b.post((Runnable)new a(this, b, 18));
    }
    
    public final void b(final boolean b) {
        this.b.post((Runnable)new a(this, b, 19));
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return false;
            }
            case 6: {
                final boolean k = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.b(k);
                break;
            }
            case 5: {
                final boolean i = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.h(i);
                break;
            }
            case 4: {
                final long long1 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.g(long1);
                break;
            }
            case 3: {
                final CharSequence b = eoa.b(parcel);
                this.enforceNoDataAvail(parcel);
                this.i(b);
                break;
            }
            case 2: {
                final boolean j = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.a(j);
                break;
            }
            case 1: {
                this.j();
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g(final long n) {
        this.b.post((Runnable)new gtg(this, n, 8));
    }
    
    public final void h(final boolean b) {
        this.b.post((Runnable)new a(this, b, 20));
    }
    
    public final void i(final CharSequence charSequence) {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a(this, charSequence, 0));
    }
    
    public final void j() {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 14));
    }
}
