import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class eyx extends acdu
{
    final /* synthetic */ eyz a;
    private final int b;
    
    public eyx(final eyz a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ImageView imageView) {
        this.a.o(this.b);
        eyz.aM(imageView, this.b);
    }
    
    public final void b(final ImageView imageView) {
        this.a.o(this.b);
        imageView.setBackground((Drawable)null);
    }
}
