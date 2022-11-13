import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgg implements tpn
{
    final acgo a;
    final acgv b;
    final aotp c;
    final achb d;
    public final acgh e;
    
    public acgg(final acgh e, final acgo a, final acgv b, final aotp c, final achb d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final ImageView imageView) {
        final acgq g = this.a.g;
        if (g != null) {
            g.b(imageView);
        }
        this.b.e(imageView, this.a, this.c);
    }
    
    public final void b(final ImageView imageView) {
        final acgo a = this.a;
        final acgq g = a.g;
        final int d = a.d;
        if (d > 0) {
            this.d.g(d);
        }
        if (g != null) {
            g.a(imageView);
        }
        this.b.d(imageView, this.a, this.c);
    }
    
    public final void d(final ImageView imageView) {
        final acgq g = this.a.g;
        if (g != null) {
            g.c(imageView);
        }
        this.b.f(imageView, this.a, this.c);
    }
    
    public final void f(final ImageView imageView) {
        final acgq g = this.a.g;
        if (g != null) {
            g.b(imageView);
        }
        this.b.g(imageView, this.a, this.c);
    }
    
    public final void g() {
    }
}
