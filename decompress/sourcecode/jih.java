import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

// 
// Decompiled by Procyon v0.6.0
// 

final class jih extends ImageSpan
{
    private final int a;
    
    public jih(final Drawable drawable, final int a) {
        super(drawable, 1);
        this.a = a;
    }
    
    public final void draw(final Canvas canvas, final CharSequence charSequence, int n, int n2, final float n3, final int n4, final int n5, final int n6, final Paint paint) {
        final Drawable drawable = this.getDrawable();
        canvas.save();
        n2 = (n = n6 - drawable.getBounds().bottom);
        if (this.mVerticalAlignment == 1) {
            n = n2 - paint.getFontMetricsInt().descent;
        }
        canvas.translate(n3, (float)(n - this.a));
        drawable.draw(canvas);
        canvas.restore();
    }
}
