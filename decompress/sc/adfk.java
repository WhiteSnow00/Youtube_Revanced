import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.text.TextPaint;
import android.graphics.Canvas;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfk extends nup
{
    private final Rect b;
    private final ohf c;
    
    public adfk() {
        this.b = new Rect();
        this.c = new ohf((byte[])null);
    }
    
    protected final void g(final Canvas canvas, final num num, Rect b, final Rect rect, int n, final TextPaint textPaint) {
        final float g = num.g;
        final float n2 = (float)Math.round(num.e);
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
        final nug a = ((nun)this).a;
        int c;
        if (a.b > 0) {
            c = a.c;
        }
        else {
            c = 0;
        }
        final int left = b.left;
        this.b.set(b.left, rect.top, b.right, rect.bottom);
        final CharSequence b2 = ((nui)num).b;
        if (b2 != null) {
            final float n3 = (float)(left + c);
            final ohf c2 = this.c;
            b = this.b;
            final boolean f = ((nun)this).a.f;
            c2.d(b2, canvas, n3, n2, b, textPaint, paint$Align, n, g, true);
        }
    }
    
    protected final void h(final Canvas canvas, final num num, final Rect rect, final Rect rect2, int n, final Paint paint) {
        final float n2 = (float)Math.round(num.e);
        n = ((nun)this).a.b;
        if (n > 0) {
            canvas.drawLine((float)(rect.left + n), n2, (float)rect.left, n2, paint);
        }
        final int right = rect.right;
        n = ((nun)this).a.b;
        canvas.drawLine((float)(right - n), n2, (float)rect2.right, n2, paint);
    }
}
