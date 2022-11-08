import java.nio.ByteBuffer;
import android.graphics.Typeface;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Paint$FontMetricsInt;
import android.text.style.ReplacementSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arw extends ReplacementSpan
{
    public final art a;
    private final Paint$FontMetricsInt b;
    private short c;
    private float d;
    
    public arw(final art a) {
        this.b = new Paint$FontMetricsInt();
        this.c = -1;
        this.d = 1.0f;
        aff.l((Object)a, (Object)"metadata cannot be null");
        this.a = a;
    }
    
    public final void draw(final Canvas canvas, final CharSequence charSequence, int a, final int n, final float n2, final int n3, final int n4, final int n5, final Paint paint) {
        ars.b();
        final art a2 = this.a;
        final Object b = a2.c.b;
        final Typeface typeface = paint.getTypeface();
        paint.setTypeface((Typeface)b);
        a = a2.a;
        canvas.drawText((char[])a2.c.d, a + a, 2, n2, (float)n4, paint);
        paint.setTypeface(typeface);
    }
    
    public final int getSize(final Paint paint, final CharSequence charSequence, int n, int a, final Paint$FontMetricsInt paint$FontMetricsInt) {
        paint.getFontMetricsInt(this.b);
        this.d = Math.abs(this.b.descent - this.b.ascent) / (float)this.a.d();
        this.a.d();
        final chr e = this.a.e();
        a = e.a(12);
        if (a != 0) {
            final Object b = e.b;
            n = e.a;
            n = ((ByteBuffer)b).getShort(a + n);
        }
        else {
            n = 0;
        }
        this.c = (short)(n * this.d);
        if (paint$FontMetricsInt != null) {
            paint$FontMetricsInt.ascent = this.b.ascent;
            paint$FontMetricsInt.descent = this.b.descent;
            paint$FontMetricsInt.top = this.b.top;
            paint$FontMetricsInt.bottom = this.b.bottom;
        }
        return this.c;
    }
}
