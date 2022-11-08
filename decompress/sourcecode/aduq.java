import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aduq
{
    public final int a;
    public final int b;
    public int[] c;
    public int d;
    public final int e;
    public final int f;
    
    protected aduq(final Context context, final AttributeSet set, int e, final int n) {
        this.c = new int[0];
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168180);
        final TypedArray a = aduf.a(context, set, advq.a, e, n, new int[0]);
        e = adwd.e(context, a, 8, dimensionPixelSize);
        this.a = e;
        this.b = Math.min(adwd.e(context, a, 7, 0), e / 2);
        this.e = a.getInt(4, 0);
        this.f = a.getInt(1, 0);
        if (!a.hasValue(2)) {
            this.c = new int[] { adwd.B(context, 2130969086, -1) };
        }
        else if (a.peekValue(2).type != 1) {
            this.c = new int[] { a.getColor(2, -1) };
        }
        else {
            final int[] intArray = context.getResources().getIntArray(a.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (a.hasValue(6)) {
            this.d = a.getColor(6, -1);
        }
        else {
            this.d = this.c[0];
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 16842803 });
            final float float1 = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.d = adwd.z(this.d, (int)(float1 * 255.0f));
        }
        a.recycle();
    }
    
    public abstract void a();
    
    public final boolean b() {
        return this.f != 0;
    }
    
    public final boolean c() {
        return this.e != 0;
    }
}
