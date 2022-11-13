import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwt extends adxg
{
    private int c;
    private float d;
    private float e;
    private float f;
    
    public adwt(final adwz adwz) {
        super((adws)adwz);
        this.c = 1;
    }
    
    private final int g() {
        final adwz adwz = (adwz)this.a;
        final int g = adwz.g;
        final int h = adwz.h;
        return g + (h + h);
    }
    
    private final void h(final Canvas canvas, final Paint paint, float n, final float n2, float f) {
        canvas.save();
        canvas.rotate(f);
        f = this.f;
        n /= 2.0f;
        canvas.drawRoundRect(new RectF(f - n, n2, f + n, -n2), n2, n2, paint);
        canvas.restore();
    }
    
    public final int a() {
        return this.g();
    }
    
    public final int b() {
        return this.g();
    }
    
    public final void c(final Canvas canvas, final Rect rect, final float n) {
        final float n2 = (float)rect.width();
        final float n3 = (float)this.g();
        final float n4 = (float)rect.height();
        final float n5 = (float)this.g();
        final adwz adwz = (adwz)this.a;
        final float n6 = (float)adwz.g;
        final float n7 = (float)adwz.h;
        final float n8 = (float)rect.left;
        final float n9 = (float)rect.top;
        final float n10 = n6 / 2.0f + n7;
        final float n11 = n2 / n3;
        final float n12 = n4 / n5;
        canvas.translate(n10 * n11 + n8, n10 * n12 + n9);
        canvas.scale(n11, n12);
        canvas.rotate(-90.0f);
        final float n13 = -n10;
        canvas.clipRect(n13, n13, n10, n10);
        final adwz adwz2 = (adwz)this.a;
        int c;
        if (adwz2.i == 0) {
            c = 1;
        }
        else {
            c = -1;
        }
        this.c = c;
        final int a = adwz2.a;
        this.d = a * n;
        this.e = adwz2.b * n;
        this.f = (adwz2.g - a) / 2.0f;
        if ((!this.b.g() || ((adwz)this.a).e != 2) && (!this.b.f() || ((adwz)this.a).f != 1)) {
            if ((this.b.g() && ((adwz)this.a).e == 1) || (this.b.f() && ((adwz)this.a).f == 2)) {
                this.f -= (1.0f - n) * ((adwz)this.a).a / 2.0f;
            }
            return;
        }
        this.f += (1.0f - n) * ((adwz)this.a).a / 2.0f;
    }
    
    public final void d(final Canvas canvas, final Paint paint, float n, float n2, final int color) {
        if (n == n2) {
            return;
        }
        paint.setStyle(Paint$Style.STROKE);
        paint.setStrokeCap(Paint$Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStrokeWidth(this.d);
        final float n3 = (float)this.c;
        if (n2 >= n) {
            n2 -= n;
        }
        else {
            n2 = 1.0f + n2 - n;
        }
        n2 = n2 * 360.0f * n3;
        final float n4 = n * 360.0f * n3;
        final float f = this.f;
        n = -f;
        canvas.drawArc(new RectF(n, n, f, f), n4, n2, false, paint);
        if (this.e > 0.0f && Math.abs(n2) < 360.0f) {
            paint.setStyle(Paint$Style.FILL);
            this.h(canvas, paint, this.d, this.e, n4);
            this.h(canvas, paint, this.d, this.e, n4 + n2);
        }
    }
    
    public final void e(final Canvas canvas, final Paint paint) {
        final int t = adds.T(((adwz)this.a).d, this.b.i);
        paint.setStyle(Paint$Style.STROKE);
        paint.setStrokeCap(Paint$Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(t);
        paint.setStrokeWidth(this.d);
        final float f = this.f;
        final float n = -f;
        canvas.drawArc(new RectF(n, n, f, f), 0.0f, 360.0f, false, paint);
    }
}
