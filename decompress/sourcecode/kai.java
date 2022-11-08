import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class kai extends acdu
{
    final /* synthetic */ aqdw a;
    final /* synthetic */ jzv b;
    final /* synthetic */ String c;
    
    public kai(final aqdw a, final jzv b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final ImageView imageView) {
        this.b.a(this.c);
    }
    
    public final void b(final ImageView imageView) {
        final Drawable drawable = imageView.getDrawable();
        if (!(drawable instanceof BitmapDrawable)) {
            this.b.a(this.c);
            return;
        }
        final BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
        final int b = this.a.b;
        int n = 1;
        if ((b & 0x1) != 0x0) {
            final jzv b2 = this.b;
            final String c = this.c;
            final Bitmap bitmap = bitmapDrawable.getBitmap();
            final int i = aqql.I(this.a.d);
            if (i != 0) {
                n = i;
            }
            b2.c(c, bitmap, aaja.y(n));
            return;
        }
        this.b.b(this.c, bitmapDrawable.getBitmap());
    }
}
