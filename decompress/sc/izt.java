import android.graphics.Bitmap;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class izt implements acgq
{
    private final izu a;
    private final boolean b;
    
    public izt(final izu a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final ImageView imageView) {
    }
    
    @Override
    public final void b(final ImageView imageView) {
        if (this.b) {
            final izu a = this.a;
            if (a != null) {
                final Bitmap c = a.c;
                if (c != null && !c.isRecycled()) {
                    imageView.setImageBitmap(this.a.c);
                }
            }
        }
    }
    
    @Override
    public final void c(final ImageView imageView) {
        final izu a = this.a;
        if (a != null) {
            final Bitmap c = a.c;
            if (c != null && !c.isRecycled()) {
                imageView.setImageBitmap(this.a.c);
            }
        }
    }
}
