// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a;
import android.os.Handler;

public final class b extends eod implements c
{
    public final aber a;
    private final Handler b;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
    }
    
    public b(final aber a, final Handler b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void a() {
        this.b.post((Runnable)new a(this, 17));
    }
    
    public final void b() {
        this.b.post((Runnable)new a(this, 18));
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        return false;
                    }
                    final Bitmap bitmap = (Bitmap)eoe.a(parcel, Bitmap.CREATOR);
                    this.enforceNoDataAvail(parcel);
                    this.g(bitmap);
                }
                else {
                    this.b();
                }
            }
            else {
                this.a();
            }
        }
        else {
            this.h();
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g(final Bitmap bitmap) {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded.a(this, bitmap, 10));
    }
    
    public final void h() {
        this.b.post((Runnable)new a(this, 16));
    }
}
