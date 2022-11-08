import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class eze extends acdu
{
    final /* synthetic */ ezf a;
    
    public eze(final ezf a) {
        this.a = a;
    }
    
    public final void a(final ImageView imageView) {
        this.a.g();
    }
    
    public final void b(final ImageView imageView) {
        this.a.f.setBackground((Drawable)null);
        final fwd f = this.a.f();
        if (f != null && f.b() != null) {
            this.a.h.a(this, f.b());
        }
    }
}
