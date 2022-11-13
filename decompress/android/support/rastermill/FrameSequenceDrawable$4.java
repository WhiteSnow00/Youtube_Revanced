// 
// Decompiled by Procyon v0.6.0
// 

package android.support.rastermill;

class FrameSequenceDrawable$4 implements Runnable
{
    final FrameSequenceDrawable this$0;
    
    public FrameSequenceDrawable$4(final FrameSequenceDrawable this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        synchronized (FrameSequenceDrawable.-$$Nest$fgetmLock(this.this$0)) {
            FrameSequenceDrawable.-$$Nest$fputmNextFrameToDecode(this.this$0, -1);
            FrameSequenceDrawable.-$$Nest$fputmState(this.this$0, 0);
            monitorexit(FrameSequenceDrawable.-$$Nest$fgetmLock(this.this$0));
            if (FrameSequenceDrawable.-$$Nest$fgetmOnFinishedListener(this.this$0) != null) {
                FrameSequenceDrawable.-$$Nest$fgetmOnFinishedListener(this.this$0).onFinished(this.this$0);
            }
        }
    }
}
