// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.a;

public final class b extends eod implements c
{
    public tui a;
    public abvo b;
    public a c;
    private final Handler d;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
    }
    
    public b(final tui a, final abvo b, final Handler d) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
    }
    
    public final void a(final boolean b) {
        this.d.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a(this, b, 3));
    }
    
    public final void b(final f f) {
        this.d.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.a(this, f, 9));
    }
    
    public final void c() {
        final a c = this.c;
        if (c != null) {
            c.a = null;
            this.c = null;
        }
        this.b = null;
        this.a = (tui)lld.l;
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                return false;
            }
            final boolean k = eoe.k(parcel);
            this.enforceNoDataAvail(parcel);
            this.a(k);
        }
        else {
            final IBinder strongBinder = parcel.readStrongBinder();
            f f;
            if (strongBinder == null) {
                f = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiServiceListener");
                if (queryLocalInterface instanceof f) {
                    f = (f)queryLocalInterface;
                }
                else {
                    f = new d(strongBinder);
                }
            }
            this.enforceNoDataAvail(parcel);
            this.b(f);
        }
        parcel2.writeNoException();
        return true;
    }
}
