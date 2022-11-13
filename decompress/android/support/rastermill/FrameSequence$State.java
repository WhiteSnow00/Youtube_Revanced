// 
// Decompiled by Procyon v0.6.0
// 

package android.support.rastermill;

import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

class FrameSequence$State
{
    private long mNativeState;
    
    public FrameSequence$State(final long mNativeState) {
        this.mNativeState = mNativeState;
    }
    
    public void destroy() {
        final long mNativeState = this.mNativeState;
        if (mNativeState != 0L) {
            FrameSequence.-$$Nest$smnativeDestroyState(mNativeState);
            this.mNativeState = 0L;
        }
    }
    
    public long getFrame(final int n, final Bitmap bitmap, final int n2) {
        if (bitmap == null || bitmap.getConfig() != Bitmap$Config.ARGB_8888) {
            throw new IllegalArgumentException("Bitmap passed must be non-null and ARGB_8888");
        }
        final long mNativeState = this.mNativeState;
        if (mNativeState != 0L) {
            return FrameSequence.-$$Nest$smnativeGetFrame(mNativeState, n, bitmap, n2);
        }
        throw new IllegalStateException("attempted to draw destroyed FrameSequenceState");
    }
}
