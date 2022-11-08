// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.a;
import android.os.Handler;

public final class b extends enz implements c
{
    public trb a;
    public absd b;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.b c;
    private final Handler d;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
    }
    
    public b(final trb a, final absd b, final Handler d) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
    }
    
    public final void a(final boolean b) {
        this.d.post((Runnable)new a(this, b, 0));
    }
    
    public final void b(final f f) {
        this.d.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a(this, f, 7));
    }
    
    public final void c() {
        final com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.b c = this.c;
        if (c != null) {
            c.a = null;
            this.c = null;
        }
        this.b = null;
        this.a = (trb)ljo.m;
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                return false;
            }
            final boolean k = eoa.k(parcel);
            this.enforceNoDataAvail(parcel);
            this.a(k);
        }
        else {
            final IBinder strongBinder = parcel.readStrongBinder();
            Object o;
            if (strongBinder == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiServiceListener");
                if (queryLocalInterface instanceof f) {
                    o = queryLocalInterface;
                }
                else {
                    o = new d(strongBinder);
                }
            }
            this.enforceNoDataAvail(parcel);
            this.b((f)o);
        }
        parcel2.writeNoException();
        return true;
    }
}
