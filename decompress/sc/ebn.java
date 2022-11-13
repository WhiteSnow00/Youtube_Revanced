import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Path$FillType;
import android.graphics.RectF;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebn extends Drawable
{
    public int a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    private final Paint h;
    private final Path i;
    private final Path j;
    private final Path k;
    private final Path l;
    private final Paint m;
    
    public ebn() {
        this.i = new Path();
        this.j = new Path();
        this.k = new Path();
        this.l = new Path();
        this.e = -1.0f;
        this.f = -1.0f;
        this.g = true;
        final Paint m = new Paint(5);
        (this.m = m).setStyle(Paint$Style.FILL);
        (this.h = new Paint(m)).setAntiAlias(false);
    }
    
    public static int a(final float n, final float n2) {
        return (int)Math.ceil(e(n) + n2);
    }
    
    public static int b(final float n, final float n2) {
        return (int)Math.ceil(e(n) - n2);
    }
    
    public static int c(final float n, final float n2) {
        return (int)Math.ceil(e(n) + n2);
    }
    
    public static int d(final float n, final float n2) {
        return (int)Math.ceil(e(n) - n2);
    }
    
    public static int e(final float n) {
        int n3;
        final int n2 = n3 = (int)(n + 0.5f);
        if (n2 % 2 == 1) {
            n3 = n2 - 1;
        }
        return n3;
    }
    
    private static float f(final float n) {
        return e(n) * 0.5f;
    }
    
    private static void g(final Path path, final int n, final int n2, final float n3) {
        final float n4 = (float)n;
        final float n5 = (float)n2;
        final float n6 = n3 + n3;
        final RectF rectF = new RectF(n4, n5, n4 + n6, n5 + n6);
        final RectF rectF2 = new RectF(0.0f, 0.0f, n6, n6);
        path.reset();
        path.setFillType(Path$FillType.EVEN_ODD);
        final float n7 = n4 + n3;
        path.moveTo(n7, n5);
        path.arcTo(rectF, 270.0f, -90.0f, true);
        path.rLineTo((float)(-n), 0.0f);
        path.lineTo(0.0f, n3);
        path.arcTo(rectF2, 180.0f, 90.0f, true);
        path.lineTo(n7, 0.0f);
        path.rLineTo(0.0f, n5);
        path.close();
    }
    
    public final void draw(final Canvas canvas) {
        final boolean g = this.g;
        final float n = 0.0f;
        if (g) {
            final float n2 = this.d + this.c;
            final Paint m = this.m;
            final int a = this.a;
            m.setShader((Shader)new RadialGradient(n2, n2, n2, new int[] { a, a, this.b }, new float[] { 0.0f, 0.2f, 1.0f }, Shader$TileMode.CLAMP));
            float e;
            if ((e = this.e) == -1.0f) {
                e = 0.0f;
            }
            float n3;
            if ((n3 = this.f) == -1.0f) {
                n3 = f(this.d);
            }
            final int b = b(this.d, e);
            final int c = c(this.d, e);
            final int d = d(this.d, n3);
            final int a2 = a(this.d, n3);
            g(this.i, b, d, this.c);
            g(this.k, c, d, this.c);
            g(this.j, b, a2, this.c);
            g(this.l, c, a2, this.c);
            final Paint h = this.h;
            final int a3 = this.a;
            h.setShader((Shader)new LinearGradient(0.0f, n2, 0.0f, 0.0f, new int[] { a3, a3, this.b }, new float[] { 0.0f, 0.2f, 1.0f }, Shader$TileMode.CLAMP));
            this.h.setAntiAlias(false);
            this.g = false;
        }
        final Rect bounds = this.getBounds();
        final int save = canvas.save();
        canvas.translate((float)bounds.left, (float)bounds.top);
        canvas.drawPath(this.i, this.m);
        canvas.restoreToCount(save);
        final int save2 = canvas.save();
        canvas.translate((float)bounds.right, (float)bounds.top);
        canvas.scale(-1.0f, 1.0f);
        canvas.drawPath(this.k, this.m);
        canvas.restoreToCount(save2);
        final int save3 = canvas.save();
        canvas.translate((float)bounds.right, (float)bounds.bottom);
        canvas.scale(-1.0f, -1.0f);
        canvas.drawPath(this.l, this.m);
        canvas.restoreToCount(save3);
        final int save4 = canvas.save();
        canvas.translate((float)bounds.left, (float)bounds.bottom);
        canvas.scale(1.0f, -1.0f);
        canvas.drawPath(this.j, this.m);
        canvas.restoreToCount(save4);
        float e2 = this.e;
        if (e2 == -1.0f) {
            e2 = n;
        }
        float n4;
        if ((n4 = this.f) == -1.0f) {
            n4 = f(this.d);
        }
        final int b2 = b(this.d, e2);
        final int d2 = d(this.d, n4);
        final int c2 = c(this.d, e2);
        final int a4 = a(this.d, n4);
        final int save5 = canvas.save();
        canvas.translate((float)bounds.left, (float)bounds.top);
        final float n5 = (float)b2;
        final float c3 = this.c;
        final float n6 = (float)bounds.width();
        final float c4 = this.c;
        final float n7 = (float)c2;
        final float n8 = (float)d2;
        canvas.drawRect(n5 + c3, 0.0f, n6 - c4 - n7, n8, this.h);
        canvas.restoreToCount(save5);
        final int save6 = canvas.save();
        canvas.translate((float)bounds.right, (float)bounds.bottom);
        canvas.rotate(180.0f);
        final float c5 = this.c;
        final float n9 = (float)bounds.width();
        final float c6 = this.c;
        final float n10 = (float)a4;
        canvas.drawRect(n7 + c5, 0.0f, n9 - c6 - n5, n10, this.h);
        canvas.restoreToCount(save6);
        final int save7 = canvas.save();
        canvas.translate((float)bounds.left, (float)bounds.bottom);
        canvas.rotate(270.0f);
        canvas.drawRect(n10 + this.c, 0.0f, bounds.height() - (this.c + n8), n5, this.h);
        canvas.restoreToCount(save7);
        final int save8 = canvas.save();
        canvas.translate((float)bounds.right, (float)bounds.top);
        canvas.rotate(90.0f);
        canvas.drawRect(n8 + this.c, 0.0f, bounds.height() - (this.c + n10), n7, this.h);
        canvas.restoreToCount(save8);
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void setAlpha(final int n) {
        this.m.setAlpha(n);
        this.h.setAlpha(n);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        this.h.setColorFilter(colorFilter);
    }
}
