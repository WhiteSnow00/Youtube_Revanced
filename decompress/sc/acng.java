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

final class acng extends ImageSpan
{
    int a;
    private final Paint$FontMetricsInt b;
    
    public acng(final Context context, final Bitmap bitmap) {
        super(context, bitmap, 0);
        this.b = new Paint$FontMetricsInt();
    }
    
    public acng(final Drawable drawable) {
        super(drawable, 0);
        this.b = new Paint$FontMetricsInt();
    }
    
    public final void draw(final Canvas canvas, final CharSequence charSequence, int top, int bottom, final float n, int bottom2, final int n2, int n3, final Paint paint) {
        final Drawable drawable = this.getDrawable();
        canvas.save();
        paint.getFontMetricsInt(this.b);
        final Rect bounds = drawable.getBounds();
        bottom2 = this.b.bottom;
        top = this.b.top;
        bottom = this.b.bottom;
        n3 = bounds.height() / 2;
        canvas.translate(n + this.a, (float)(n2 + bottom - (bottom2 - top) / 2 - n3));
        drawable.draw(canvas);
        canvas.restore();
    }
    
    public final int getSize(final Paint paint, final CharSequence charSequence, int n, int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        final Rect bounds = this.getDrawable().getBounds();
        paint.getFontMetricsInt(this.b);
        n = this.b.ascent;
        final int top = this.b.top;
        n2 = this.b.bottom;
        final int descent = this.b.descent;
        final int n3 = this.b.bottom - (this.b.bottom - this.b.top) / 2;
        final int n4 = bounds.height() / 2;
        if (paint$FontMetricsInt != null) {
            paint$FontMetricsInt.ascent = n3 - n4;
            paint$FontMetricsInt.descent = n3 + n4;
            paint$FontMetricsInt.top = paint$FontMetricsInt.ascent - (n - top);
            paint$FontMetricsInt.bottom = paint$FontMetricsInt.descent + (n2 - descent);
        }
        n2 = bounds.right;
        n = this.a;
        return n2 + (n + n);
    }
}
