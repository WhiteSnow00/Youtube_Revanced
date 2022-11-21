// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.graphics.Bitmap;
import android.net.Uri;

final class EmbedFragmentService$ThumbnailCallback implements tdg
{
    final EmbedFragmentService a;
    
    public EmbedFragmentService$ThumbnailCallback(final EmbedFragmentService a) {
        this.a = a;
    }
    
    public final /* bridge */ void c(final Object o, final Exception ex) {
        final Uri uri = (Uri)o;
        this.a.B((Bitmap)null);
    }
    
    public final /* bridge */ void d(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        this.a.B((Bitmap)o2);
    }
}
