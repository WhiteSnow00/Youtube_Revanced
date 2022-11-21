import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqq extends ViewGroup$MarginLayoutParams
{
    public int a;
    float b;
    public boolean c;
    int d;
    
    public aqq() {
        super(-1, -1);
        this.a = 0;
    }
    
    public aqq(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aqs.a);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
    
    public aqq(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = 0;
    }
    
    public aqq(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        super(viewGroup$MarginLayoutParams);
        this.a = 0;
    }
    
    public aqq(final aqq aqq) {
        super((ViewGroup$MarginLayoutParams)aqq);
        this.a = 0;
        this.a = aqq.a;
    }
}
