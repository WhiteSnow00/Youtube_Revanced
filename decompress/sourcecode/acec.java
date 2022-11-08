import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acec implements tnh
{
    final /* synthetic */ acek a;
    final /* synthetic */ acer b;
    final /* synthetic */ aorm c;
    final /* synthetic */ acex d;
    public final /* synthetic */ aced e;
    
    public acec(final aced e, final acek a, final acer b, final aorm c, final acex d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final ImageView imageView) {
        final acem g = this.a.g;
        if (g != null) {
            g.b(imageView);
        }
        this.b.e(imageView, this.a, this.c);
    }
    
    public final void b(final ImageView imageView) {
        final acek a = this.a;
        final acem g = a.g;
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
        final acem g = this.a.g;
        if (g != null) {
            g.c(imageView);
        }
        this.b.f(imageView, this.a, this.c);
    }
    
    public final void f(final ImageView imageView) {
        final acem g = this.a.g;
        if (g != null) {
            g.b(imageView);
        }
        this.b.g(imageView, this.a, this.c);
    }
    
    public final void g() {
    }
}
