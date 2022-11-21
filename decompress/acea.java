import android.content.Context;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class acea extends RecyclerView
{
    public acea(final Context context) {
        super(context);
    }
    
    protected final int getBottomPaddingOffset() {
        return this.getPaddingBottom();
    }
    
    protected final int getTopPaddingOffset() {
        return -this.getPaddingTop();
    }
    
    protected final boolean isPaddingOffsetRequired() {
        return true;
    }
}
