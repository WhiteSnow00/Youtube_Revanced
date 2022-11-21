import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyq extends adyj
{
    public final int g;
    public final int h;
    public final int i;
    
    public adyq(final Context context, final AttributeSet set) {
        super(context, set, 2130968989, 2132085194);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168212);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131168207);
        final TypedArray a = adxy.a(context, set, adzj.b, 2130968989, 2132085194, new int[0]);
        final int e = adzw.e(context, a, 2, dimensionPixelSize);
        final int a2 = this.a;
        this.g = Math.max(e, a2 + a2);
        this.h = adzw.e(context, a, 1, dimensionPixelSize2);
        this.i = a.getInt(0, 0);
        a.recycle();
    }
    
    @Override
    public final void a() {
    }
}
