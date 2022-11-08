import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kf
{
    public static final PorterDuff$Mode a;
    private static kf b;
    private or c;
    
    static {
        a = PorterDuff$Mode.SRC_IN;
    }
    
    public static PorterDuffColorFilter b(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (kf.class) {
            return or.b(n, porterDuff$Mode);
        }
    }
    
    public static kf d() {
        synchronized (kf.class) {
            if (kf.b == null) {
                f();
            }
            return kf.b;
        }
    }
    
    public static void f() {
        synchronized (kf.class) {
            if (kf.b == null) {
                (kf.b = new kf()).c = or.e();
                kf.b.c.g((oq)new ke());
            }
        }
    }
    
    final ColorStateList a(final Context context, final int n) {
        synchronized (this) {
            return this.c.a(context, n);
        }
    }
    
    public final Drawable c(final Context context, final int n) {
        synchronized (this) {
            return this.c.c(context, n);
        }
    }
    
    public final void e(final Context context) {
        synchronized (this) {
            this.c.f(context);
        }
    }
    
    public final Drawable g(final Context context, final int n) {
        synchronized (this) {
            return this.c.d(context, n, true);
        }
    }
}
