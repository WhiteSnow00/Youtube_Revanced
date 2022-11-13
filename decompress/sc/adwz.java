import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwz extends adws
{
    public final int g;
    public final int h;
    public final int i;
    
    public adwz(final Context context, final AttributeSet set) {
        super(context, set, 2130968991, 2132085187);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168173);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131168168);
        final TypedArray a = adwh.a(context, set, adxs.b, 2130968991, 2132085187, new int[0]);
        final int y = adds.y(context, a, 2, dimensionPixelSize);
        final int a2 = this.a;
        this.g = Math.max(y, a2 + a2);
        this.h = adds.y(context, a, 1, dimensionPixelSize2);
        this.i = a.getInt(0, 0);
        a.recycle();
    }
    
    public final void a() {
    }
}
