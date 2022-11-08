import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public class aduk extends ImageButton
{
    public int d;
    
    public aduk(final Context context) {
        this(context, null);
    }
    
    public aduk(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public aduk(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = this.getVisibility();
    }
    
    public final void g(final int n, final boolean b) {
        super.setVisibility(n);
        if (b) {
            this.d = n;
        }
    }
    
    public final void setVisibility(final int n) {
        this.g(n, true);
    }
}
