// 
// Decompiled by Procyon v0.6.0
// 

package android.support.rastermill;

class FrameSequenceDrawable$3 implements Runnable
{
    final FrameSequenceDrawable this$0;
    
    public FrameSequenceDrawable$3(final FrameSequenceDrawable this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        final FrameSequenceDrawable this$0 = this.this$0;
        FrameSequenceDrawable.access$001(this$0, this$0);
        final FrameSequenceDrawable this$2 = this.this$0;
        this$2.scheduleSelf((Runnable)this$2, FrameSequenceDrawable.-$$Nest$fgetmNextSwap(this$2));
    }
}
