import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abud extends ViewGroup$LayoutParams
{
    public final boolean a;
    
    public abud(final int n, final int n2, final boolean a) {
        super(n, n2);
        this.a = a;
    }
    
    public abud(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aaka.a);
        this.a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
    
    public abud(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = true;
    }
}
