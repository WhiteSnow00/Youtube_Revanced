// 
// Decompiled by Procyon v0.6.0
// 

package android.support.rastermill;

import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

class FrameSequenceDrawable$1 implements FrameSequenceDrawable$BitmapProvider
{
    public FrameSequenceDrawable$1() {
    }
    
    public Bitmap acquireBitmap(final int n, final int n2) {
        return Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
    }
    
    public void releaseBitmap(final Bitmap bitmap) {
    }
}
