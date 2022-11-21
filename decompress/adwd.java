import android.graphics.Color;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwd
{
    private static final int c;
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;
    
    static {
        c = (int)Math.round(5.1000000000000005);
    }
    
    public adwd(final Context context) {
        final boolean y = adfe.y(context, 2130969312, false);
        final int m = adfe.M(context, 2130969311, 0);
        final int i = adfe.M(context, 2130969310, 0);
        final int j = adfe.M(context, 2130969107, 0);
        final float density = context.getResources().getDisplayMetrics().density;
        this.a = y;
        this.d = m;
        this.e = i;
        this.b = j;
        this.f = density;
    }
    
    public final int a(int n, float min) {
        int f = n;
        if (this.a) {
            f = n;
            if (aia.f(n, 255) == this.b) {
                final float f2 = this.f;
                if (f2 > 0.0f && min > 0.0f) {
                    min = Math.min(((float)Math.log1p(min / f2) * 4.5f + 2.0f) / 100.0f, 1.0f);
                }
                else {
                    min = 0.0f;
                }
                final int alpha = Color.alpha(n);
                final int n2 = n = adfe.N(aia.f(n, 255), this.d, min);
                if (min > 0.0f) {
                    final int e = this.e;
                    n = n2;
                    if (e != 0) {
                        n = aia.e(aia.f(e, adwd.c), n2);
                    }
                }
                f = aia.f(n, alpha);
            }
        }
        return f;
    }
}
