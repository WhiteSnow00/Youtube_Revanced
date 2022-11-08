import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.text.TextPaint;
import android.graphics.Canvas;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addi extends ntj
{
    private final Rect b;
    private final ofz c;
    
    public addi() {
        this.b = new Rect();
        this.c = new ofz((byte[])null);
    }
    
    protected final void g(final Canvas canvas, final ntg ntg, final Rect rect, Rect b, int n, final TextPaint textPaint) {
        final float g = ntg.g;
        final float n2 = (float)Math.round(ntg.e);
        Paint$Align paint$Align;
        if (g != 90.0f && g != -90.0f) {
            paint$Align = Paint$Align.LEFT;
        }
        else {
            paint$Align = Paint$Align.CENTER;
        }
        if (g == 90.0f) {
            n = 3;
        }
        else if (g == -90.0f) {
            n = 1;
        }
        else {
            n = 2;
        }
        final nta a = ((nth)this).a;
        int c;
        if (a.b > 0) {
            c = a.c;
        }
        else {
            c = 0;
        }
        final float n3 = (float)(rect.left + c);
        this.b.set(rect.left, b.top, rect.right, b.bottom);
        final CharSequence b2 = ((ntc)ntg).b;
        if (b2 != null) {
            final ofz c2 = this.c;
            b = this.b;
            final boolean f = ((nth)this).a.f;
            c2.d(b2, canvas, n3, n2, b, textPaint, paint$Align, n, g, true);
        }
    }
    
    protected final void h(final Canvas canvas, final ntg ntg, final Rect rect, final Rect rect2, int b, final Paint paint) {
        final float n = (float)Math.round(ntg.e);
        b = ((nth)this).a.b;
        if (b > 0) {
            canvas.drawLine((float)(rect.left + b), n, (float)rect.left, n, paint);
        }
        canvas.drawLine((float)(rect.right - ((nth)this).a.b), n, (float)rect2.right, n, paint);
    }
}
