import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.content.Context;
import android.graphics.Paint$FontMetricsInt;
import android.text.style.ImageSpan;

// 
// Decompiled by Procyon v0.6.0
// 

final class acot extends ImageSpan
{
    int a;
    private final Paint$FontMetricsInt b;
    
    public acot(final Context context, final Bitmap bitmap) {
        super(context, bitmap, 0);
        this.b = new Paint$FontMetricsInt();
    }
    
    public acot(final Drawable drawable) {
        super(drawable, 0);
        this.b = new Paint$FontMetricsInt();
    }
    
    public final void draw(final Canvas canvas, final CharSequence charSequence, int bottom, int n, final float n2, int bottom2, final int n3, int top, final Paint paint) {
        final Drawable drawable = this.getDrawable();
        canvas.save();
        paint.getFontMetricsInt(this.b);
        final Rect bounds = drawable.getBounds();
        bottom2 = this.b.bottom;
        top = this.b.top;
        bottom = this.b.bottom;
        n = bounds.height() / 2;
        canvas.translate(n2 + this.a, (float)(n3 + bottom - (bottom2 - top) / 2 - n));
        drawable.draw(canvas);
        canvas.restore();
    }
    
    public final int getSize(final Paint paint, final CharSequence charSequence, int n, int right, final Paint$FontMetricsInt paint$FontMetricsInt) {
        final Rect bounds = this.getDrawable().getBounds();
        paint.getFontMetricsInt(this.b);
        final int ascent = this.b.ascent;
        final int top = this.b.top;
        final int bottom = this.b.bottom;
        n = this.b.descent;
        final int n2 = this.b.bottom - (this.b.bottom - this.b.top) / 2;
        right = bounds.height() / 2;
        if (paint$FontMetricsInt != null) {
            paint$FontMetricsInt.ascent = n2 - right;
            paint$FontMetricsInt.descent = n2 + right;
            paint$FontMetricsInt.top = paint$FontMetricsInt.ascent - (ascent - top);
            paint$FontMetricsInt.bottom = paint$FontMetricsInt.descent + (bottom - n);
        }
        right = bounds.right;
        n = this.a;
        return right + (n + n);
    }
}
