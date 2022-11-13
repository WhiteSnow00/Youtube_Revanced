import android.graphics.RectF;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxj extends adxg
{
    private float c;
    private float d;
    private float e;
    
    public adxj(final adxr adxr) {
        super((adws)adxr);
        this.c = 300.0f;
    }
    
    public final int a() {
        return ((adxr)this.a).a;
    }
    
    public final int b() {
        return -1;
    }
    
    public final void c(final Canvas canvas, final Rect rect, final float n) {
        this.c = (float)rect.width();
        final float n2 = (float)((adxr)this.a).a;
        canvas.translate(rect.left + rect.width() / 2.0f, rect.top + rect.height() / 2.0f + Math.max(0.0f, (rect.height() - ((adxr)this.a).a) / 2.0f));
        if (((adxr)this.a).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.b.g() && ((adxr)this.a).e == 1) || (this.b.f() && ((adxr)this.a).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.b.g() || this.b.f()) {
            canvas.translate(0.0f, ((adxr)this.a).a * (-1.0f + n) / 2.0f);
        }
        final float c = this.c;
        canvas.clipRect(-c / 2.0f, -n2 / 2.0f, c / 2.0f, n2 / 2.0f);
        final adxr adxr = (adxr)this.a;
        this.d = adxr.a * n;
        this.e = adxr.b * n;
    }
    
    public final void d(final Canvas canvas, final Paint paint, float e, final float n, final int color) {
        if (e == n) {
            return;
        }
        final float c = this.c;
        final float n2 = -c;
        final float e2 = this.e;
        final float n3 = e2 + e2;
        final float n4 = c - n3;
        final float n5 = n2 / 2.0f;
        paint.setStyle(Paint$Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(color);
        final float d = this.d;
        final RectF rectF = new RectF(n5 + e * n4, -d / 2.0f, n * n4 + n5 + n3, d / 2.0f);
        e = this.e;
        canvas.drawRoundRect(rectF, e, e, paint);
    }
    
    public final void e(final Canvas canvas, final Paint paint) {
        final int t = adds.T(((adxr)this.a).d, this.b.i);
        paint.setStyle(Paint$Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(t);
        final float c = this.c;
        final float n = -c;
        final float d = this.d;
        final RectF rectF = new RectF(n / 2.0f, -d / 2.0f, c / 2.0f, d / 2.0f);
        final float e = this.e;
        canvas.drawRoundRect(rectF, e, e, paint);
    }
}
