import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aauy implements aasc
{
    final aauz a;
    final afhd b;
    
    public aauy(final aauz a, final afhd b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    private final long d(final float n) {
        final aauz a = this.a;
        final long g = a.g;
        final long h = a.h;
        return (long)Math.ceil(n * ((g - h) / 1000.0f + 1.0f) * 1000.0f + h);
    }
    
    public final void a(final float n) {
        final aauz a = this.a;
        ((aapi)a.b).k(-a.i, 0.0f, 0.0f);
        final aauz a2 = this.a;
        final float i = a2.a.h * n;
        a2.i = i;
        ((aapi)a2.b).k(i, 0.0f, 0.0f);
        long d = this.d(n);
        if (ControlsOverlayStyle.b(this.a.k)) {
            d -= this.a.g;
        }
        aatt.h(this.a.f, tvb.j(d / 1000L));
        this.a.b.g();
    }
    
    public final void b() {
    }
    
    public final void c(final float n) {
        this.b.u(this.d(n));
    }
}
