import android.graphics.Bitmap;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class iyu implements acem
{
    private final iyv a;
    private final boolean b;
    
    public iyu(final iyv a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ImageView imageView) {
    }
    
    public final void b(final ImageView imageView) {
        if (this.b) {
            final iyv a = this.a;
            if (a != null) {
                final Bitmap c = a.c;
                if (c != null && !c.isRecycled()) {
                    imageView.setImageBitmap(this.a.c);
                }
            }
        }
    }
    
    public final void c(final ImageView imageView) {
        final iyv a = this.a;
        if (a != null) {
            final Bitmap c = a.c;
            if (c != null && !c.isRecycled()) {
                imageView.setImageBitmap(this.a.c);
            }
        }
    }
}
