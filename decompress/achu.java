import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achu implements tqo
{
    final acic a;
    final acij b;
    final aowb c;
    final acip d;
    public final achv e;
    
    public achu(final achv e, final acic a, final acij b, final aowb c, final acip d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final ImageView imageView) {
        final acie g = this.a.g;
        if (g != null) {
            g.b(imageView);
        }
        this.b.e(imageView, this.a, this.c);
    }
    
    public final void b(final ImageView imageView) {
        final acic a = this.a;
        final acie g = a.g;
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
        final acie g = this.a.g;
        if (g != null) {
            g.c(imageView);
        }
        this.b.f(imageView, this.a, this.c);
    }
    
    public final void f(final ImageView imageView) {
        final acie g = this.a.g;
        if (g != null) {
            g.b(imageView);
        }
        this.b.g(imageView, this.a, this.c);
    }
    
    public final void g() {
    }
}
