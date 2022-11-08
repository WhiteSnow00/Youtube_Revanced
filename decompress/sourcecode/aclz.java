import android.graphics.Paint$FontMetricsInt;
import android.text.TextUtils$TruncateAt;
import android.text.TextPaint;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.UUID;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aclz extends ReplacementSpan
{
    public final String a;
    public final String b;
    private final float c;
    private final float d;
    private final float e;
    private final RectF f;
    private final Paint g;
    
    public aclz(final String s, final float n, final float n2, final float n3, final int n4) {
        this(s, n, n2, n3, n4, null);
    }
    
    public aclz(final String a, final float c, final float d, final float e, final int color, final byte[] array) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = UUID.randomUUID().toString();
        this.f = new RectF();
        (this.g = new Paint()).setColor(color);
    }
    
    private final float a(final Paint paint, final CharSequence charSequence, final int n, final int n2) {
        return Math.min(paint.measureText(TextUtils.substring(charSequence, n, n2)), this.e);
    }
    
    public final void draw(final Canvas canvas, CharSequence ellipsize, final int n, final int n2, final float n3, final int n4, final int n5, final int n6, final Paint paint) {
        if (ellipsize != null) {
            if (ellipsize.length() != 0) {
                final float a = this.a(paint, ellipsize, n, n2);
                final float d = this.d;
                this.f.set(n3, n4 + 0.0f, (float)Math.ceil(d + d + a) + n3, (float)n6);
                final RectF f = this.f;
                final float c = this.c;
                canvas.drawRoundRect(f, c, c, this.g);
                final TextPaint textPaint = new TextPaint(paint);
                ellipsize = TextUtils.ellipsize((CharSequence)TextUtils.substring(ellipsize, n, n2), textPaint, a, TextUtils$TruncateAt.END);
                canvas.drawText(ellipsize, 0, ellipsize.length(), n3 + this.d, (float)n5, (Paint)textPaint);
            }
        }
    }
    
    public final int getSize(final Paint paint, final CharSequence charSequence, final int n, final int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        if (charSequence != null && charSequence.length() != 0) {
            final float a = this.a(paint, charSequence, n, n2);
            final float d = this.d;
            return (int)Math.ceil(a + (d + d));
        }
        return 0;
    }
}
