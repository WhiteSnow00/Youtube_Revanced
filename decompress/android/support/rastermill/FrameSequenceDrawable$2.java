// 
// Decompiled by Procyon v0.6.0
// 

package android.support.rastermill;

import android.graphics.Bitmap;
import android.util.Log;

class FrameSequenceDrawable$2 implements Runnable
{
    final FrameSequenceDrawable this$0;
    
    public FrameSequenceDrawable$2(final FrameSequenceDrawable this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        final Object -$$Nest$fgetmLock = FrameSequenceDrawable.-$$Nest$fgetmLock(this.this$0);
        synchronized (-$$Nest$fgetmLock) {
            if (FrameSequenceDrawable.-$$Nest$fgetmDestroyed(this.this$0)) {
                return;
            }
            final int -$$Nest$fgetmNextFrameToDecode = FrameSequenceDrawable.-$$Nest$fgetmNextFrameToDecode(this.this$0);
            if (-$$Nest$fgetmNextFrameToDecode < 0) {
                return;
            }
            final Bitmap -$$Nest$fgetmBackBitmap = FrameSequenceDrawable.-$$Nest$fgetmBackBitmap(this.this$0);
            FrameSequenceDrawable.-$$Nest$fputmState(this.this$0, 2);
            monitorexit(-$$Nest$fgetmLock);
            final int n = 1;
            long frame;
            boolean b;
            try {
                frame = FrameSequenceDrawable.-$$Nest$fgetmFrameSequenceState(this.this$0).getFrame(-$$Nest$fgetmNextFrameToDecode, -$$Nest$fgetmBackBitmap, -$$Nest$fgetmNextFrameToDecode - 2);
                b = false;
            }
            catch (final Exception -$$Nest$fgetmLock) {
                Log.e("FrameSequence", "exception during decode: ".concat(-$$Nest$fgetmLock.toString()));
                frame = 0L;
                b = true;
            }
            long n2 = frame;
            if (frame < 20L) {
                n2 = 100L;
            }
            synchronized (FrameSequenceDrawable.-$$Nest$fgetmLock(this.this$0)) {
                final boolean -$$Nest$fgetmDestroyed = FrameSequenceDrawable.-$$Nest$fgetmDestroyed(this.this$0);
                final Bitmap bitmap = null;
                final Bitmap bitmap2 = null;
                Bitmap -$$Nest$fgetmBackBitmap2 = null;
                int n4 = 0;
                Label_0261: {
                    if (-$$Nest$fgetmDestroyed) {
                        -$$Nest$fgetmBackBitmap2 = FrameSequenceDrawable.-$$Nest$fgetmBackBitmap(this.this$0);
                        FrameSequenceDrawable.-$$Nest$fputmBackBitmap(this.this$0, (Bitmap)null);
                    }
                    else {
                        -$$Nest$fgetmBackBitmap2 = bitmap2;
                        if (FrameSequenceDrawable.-$$Nest$fgetmNextFrameToDecode(this.this$0) >= 0) {
                            -$$Nest$fgetmBackBitmap2 = bitmap2;
                            if (FrameSequenceDrawable.-$$Nest$fgetmState(this.this$0) == 2) {
                                final FrameSequenceDrawable this$0 = this.this$0;
                                long n3;
                                if (b) {
                                    n3 = Long.MAX_VALUE;
                                }
                                else {
                                    n3 = n2 + FrameSequenceDrawable.-$$Nest$fgetmLastSwap(this$0);
                                }
                                FrameSequenceDrawable.-$$Nest$fputmNextSwap(this$0, n3);
                                FrameSequenceDrawable.-$$Nest$fputmState(this.this$0, 3);
                                n4 = n;
                                -$$Nest$fgetmBackBitmap2 = bitmap;
                                break Label_0261;
                            }
                        }
                    }
                    n4 = 0;
                }
                monitorexit(FrameSequenceDrawable.-$$Nest$fgetmLock(this.this$0));
                if (n4 != 0) {
                    FrameSequenceDrawable.-$$Nest$sfgetsMainHandler().post(FrameSequenceDrawable.-$$Nest$fgetmUiScheduleRunnable(this.this$0));
                }
                if (-$$Nest$fgetmBackBitmap2 != null) {
                    FrameSequenceDrawable.-$$Nest$fgetmBitmapProvider(this.this$0).releaseBitmap(-$$Nest$fgetmBackBitmap2);
                }
            }
        }
    }
}
