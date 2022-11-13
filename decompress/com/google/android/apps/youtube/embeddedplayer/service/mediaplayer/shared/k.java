// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.h;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.g;
import android.content.Context;

public final class k extends eoa implements l
{
    public final Context a;
    public g b;
    public final h c;
    private final Handler d;
    
    public k() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureClient");
    }
    
    public k(final h c, final Context a, final Handler d) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureClient");
        this.c = c;
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public final void a(final o o) {
        this.d.post((Runnable)new a(this, o, 15));
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final IBinder strongBinder = parcel.readStrongBinder();
            o o;
            if (strongBinder == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureServiceListener");
                if (queryLocalInterface instanceof o) {
                    o = (o)queryLocalInterface;
                }
                else {
                    o = new m(strongBinder);
                }
            }
            this.enforceNoDataAvail(parcel);
            this.a(o);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
