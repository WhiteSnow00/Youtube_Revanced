import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aduk extends FrameLayout$LayoutParams
{
    int a;
    float b;
    
    public aduk() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }
    
    public aduk(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = 0.5f;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aduq.d);
        this.a = obtainStyledAttributes.getInt(0, 0);
        this.b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }
    
    public aduk(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = 0;
        this.b = 0.5f;
    }
}
