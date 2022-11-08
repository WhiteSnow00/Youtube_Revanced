// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared;

import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a;
import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.i;
import android.os.Handler;

public final class b extends enz implements c
{
    public final abbq a;
    private final Handler b;
    
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
    }
    
    public b(final abbq a, final Handler b) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final void a() {
        this.b.post((Runnable)new i(this, 1));
    }
    
    public final void b() {
        this.b.post((Runnable)new i(this, 0));
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        return false;
                    }
                    final Bitmap bitmap = (Bitmap)eoa.a(parcel, Bitmap.CREATOR);
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
        this.b.post((Runnable)new a(this, bitmap, 8));
    }
    
    public final void h() {
        this.b.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.a(this, 20));
    }
}
