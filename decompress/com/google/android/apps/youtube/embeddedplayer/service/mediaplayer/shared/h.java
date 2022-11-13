// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Parcel;
import android.view.Surface;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.a;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.b;

public final class h extends eoa implements i
{
    public final b a;
    private final Handler b;
    
    public h() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
    }
    
    public h(final Handler b, final b a) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
        this.b = b;
        this.a = a;
    }
    
    public final void a(final int n, final int n2, final int n3) {
        this.b.post((Runnable)new a(this, n, n2, n3, 1));
    }
    
    public final void b(final Surface surface) {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a(this, surface, 16));
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, int int2) {
        if (int1 != 1) {
            if (int1 != 2) {
                if (int1 != 3) {
                    return false;
                }
                this.g();
            }
            else {
                int2 = parcel.readInt();
                final int int3 = parcel.readInt();
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.a(int2, int3, int1);
            }
        }
        else {
            final Surface surface = (Surface)eob.a(parcel, Surface.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.b(surface);
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g() {
        final Handler b = this.b;
        final b a = this.a;
        a.getClass();
        b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.jar.client.a(a, 19));
    }
}
