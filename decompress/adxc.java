import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

final class adxc implements adzm
{
    final adxd a;
    private final int b;
    
    public adxc(final adxd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Typeface typeface) {
        if (this.b != 0) {
            final adxd a = this.a;
            if (a.w(typeface)) {
                a.g();
            }
            return;
        }
        final adxd a2 = this.a;
        if (a2.x(typeface)) {
            a2.g();
        }
    }
}
