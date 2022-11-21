import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.LinearLayout$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aduh extends LinearLayout$LayoutParams
{
    public int a;
    public Interpolator b;
    public aheu c;
    
    public aduh() {
        super(-1, -2);
        this.a = 1;
    }
    
    public aduh(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aduq.b);
        this.a = obtainStyledAttributes.getInt(1, 0);
        final int int1 = obtainStyledAttributes.getInt(0, 0);
        aheu c = null;
        if (int1 == 1) {
            c = new aheu((byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        this.c = c;
        if (obtainStyledAttributes.hasValue(2)) {
            this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }
    
    public aduh(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = 1;
    }
    
    public aduh(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        super(viewGroup$MarginLayoutParams);
        this.a = 1;
    }
    
    public aduh(final LinearLayout$LayoutParams linearLayout$LayoutParams) {
        super(linearLayout$LayoutParams);
        this.a = 1;
    }
}
