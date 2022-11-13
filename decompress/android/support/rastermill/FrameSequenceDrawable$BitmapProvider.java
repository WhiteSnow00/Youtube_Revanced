// 
// Decompiled by Procyon v0.6.0
// 

package android.support.rastermill;

import android.graphics.Bitmap;

public interface FrameSequenceDrawable$BitmapProvider
{
    Bitmap acquireBitmap(final int p0, final int p1);
    
    void releaseBitmap(final Bitmap p0);
}
