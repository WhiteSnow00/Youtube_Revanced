// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.r;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b;
import android.os.Bundle;
import android.os.Handler;

public final class e extends eoa implements f, sln
{
    public sln a;
    private final Handler b;
    
    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
    }
    
    public e(final Handler b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
        this.b = b;
    }
    
    public final void a(final Bundle bundle) {
        this.b.post((Runnable)new b(this, bundle, 2));
    }
    
    public final void b() {
        final Handler b = this.b;
        final sln a = this.a;
        a.getClass();
        b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(a, 5));
    }
    
    public final void c(final boolean b) {
    }
    
    public final void d() {
        final Handler b = this.b;
        final sln a = this.a;
        a.getClass();
        b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service.e(a, 6));
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, int int2) {
        if (int1 != 1) {
            if (int1 != 2) {
                if (int1 != 3) {
                    if (int1 != 4) {
                        return false;
                    }
                    int1 = parcel.readInt();
                    int2 = parcel.readInt();
                    this.enforceNoDataAvail(parcel);
                    this.e(int1, int2);
                }
                else {
                    this.d();
                }
            }
            else {
                final Bundle bundle = (Bundle)eob.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a(bundle);
            }
        }
        else {
            this.b();
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void e(final int n, final int n2) {
        this.b.post((Runnable)new r(this, n, n2, 4));
    }
}
