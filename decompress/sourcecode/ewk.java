import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ewk implements acen
{
    volatile int a;
    private final uyf b;
    
    public ewk(final uyf b) {
        this.a = 0;
        this.b = b;
    }
    
    static final aorl h(final aorm aorm) {
        if (aorm.c.size() > 0) {
            return (aorl)aorm.c.get(0);
        }
        return null;
    }
    
    public abstract void a();
    
    public abstract boolean b();
    
    final void c(final ImageView imageView) {
        if (this.a == System.identityHashCode(imageView)) {
            this.a();
        }
    }
    
    public final void d(final ImageView imageView, final acek acek, final aorm aorm) {
        this.c(imageView);
    }
    
    public final void e(final ImageView imageView, final acek acek, final aorm aorm) {
        this.c(imageView);
    }
    
    public final void f(final ImageView imageView, final acek acek, final aorm aorm) {
        if (this.a == 0 && h(aorm) != null) {
            final aorl h = h(aorm);
            if (h != null) {
                final int j = gkt.j(this.b);
                if ((h.d >= j || imageView.getWidth() >= j) && this.b()) {
                    this.a = System.identityHashCode(imageView);
                }
            }
        }
    }
    
    public final void g(final ImageView imageView, final acek acek, final aorm aorm) {
        this.c(imageView);
    }
}
