import android.graphics.Insets;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aic
{
    public static final aic a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    static {
        a = new aic(0, 0, 0, 0);
    }
    
    private aic(final int b, final int c, final int d, final int e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static aic b(final aic aic, final aic aic2) {
        return d(Math.max(aic.b, aic2.b), Math.max(aic.c, aic2.c), Math.max(aic.d, aic2.d), Math.max(aic.e, aic2.e));
    }
    
    public static aic c(final Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    public static aic d(int n, final int n2, final int n3, final int n4) {
        int n5 = n;
        int n6 = n2;
        int n7 = n3;
        if (n == 0) {
            n = (n5 = 0);
            n6 = n2;
            n7 = n3;
            if (n2 == 0) {
                if (n3 == 0) {
                    if (n4 == 0) {
                        return aic.a;
                    }
                    n6 = 0;
                    n7 = 0;
                    n5 = n;
                }
                else {
                    n6 = 0;
                    n7 = n3;
                    n5 = n;
                }
            }
        }
        return new aic(n5, n6, n7, n4);
    }
    
    public static aic e(final Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }
    
    public final Insets a() {
        return aib.a(this.b, this.c, this.d, this.e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final aic aic = (aic)o;
            return this.e == aic.e && this.b == aic.b && this.d == aic.d && this.c == aic.c;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.b * 31 + this.c) * 31 + this.d) * 31 + this.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.b);
        sb.append(", top=");
        sb.append(this.c);
        sb.append(", right=");
        sb.append(this.d);
        sb.append(", bottom=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
