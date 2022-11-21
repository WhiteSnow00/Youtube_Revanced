// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import android.net.Uri;

public final class c implements tdg
{
    private final int a;
    
    public c(final int a) {
        this.a = a;
    }
    
    public final void c(final Object o, final Exception ex) {
        if (this.a != 0) {
            final Uri uri = (Uri)o;
            return;
        }
        final BitmapKey bitmapKey = (BitmapKey)o;
    }
    
    public final void d(final Object o, final Object o2) {
        if (this.a != 0) {
            final Uri uri = (Uri)o;
            final Bitmap bitmap = (Bitmap)o2;
            return;
        }
        final BitmapKey bitmapKey = (BitmapKey)o;
        final Bitmap bitmap2 = (Bitmap)o2;
    }
}
