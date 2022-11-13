import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxr extends adws
{
    public final int g;
    public final int h;
    public boolean i;
    
    public adxr(final Context context, final AttributeSet set) {
        super(context, set, 2130969740, 2132085199);
        final int[] c = adxs.c;
        boolean i = false;
        final TypedArray a = adwh.a(context, set, c, 2130969740, 2132085199, new int[0]);
        this.g = a.getInt(0, 1);
        final int int1 = a.getInt(1, 0);
        this.h = int1;
        a.recycle();
        this.a();
        if (int1 == 1) {
            i = true;
        }
        this.i = i;
    }
    
    public final void a() {
        if (this.g == 0) {
            if (this.b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
