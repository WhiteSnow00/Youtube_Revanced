// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a;
import android.view.Surface;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.d;

public final class n extends eoa implements o
{
    public d a;
    private final Handler b;
    
    public n() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureServiceListener");
    }
    
    public n(final Handler b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureServiceListener");
        this.b = b;
    }
    
    public final void a(final int n, final int n2) {
        this.b.post((Runnable)new e(this, 0));
    }
    
    public final void b(final Surface surface) {
        this.b.post((Runnable)new a(this, surface, 17));
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, int int2) {
        if (int1 != 1) {
            if (int1 != 2) {
                if (int1 != 3) {
                    if (int1 != 4) {
                        return false;
                    }
                    this.g();
                }
                else {
                    this.h();
                }
            }
            else {
                int2 = parcel.readInt();
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.a(int2, int1);
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
        this.b.post((Runnable)new e(this, 1));
    }
    
    public final void h() {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.jar.client.a(this, 20));
    }
}
