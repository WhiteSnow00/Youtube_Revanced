import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

final class advl implements adxv
{
    final advm a;
    private final int b;
    
    public advl(final advm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Typeface typeface) {
        if (this.b != 0) {
            final advm a = this.a;
            if (a.w(typeface)) {
                a.g();
            }
            return;
        }
        final advm a2 = this.a;
        if (a2.x(typeface)) {
            a2.g();
        }
    }
}
