import android.graphics.Path;
import android.graphics.Region$Op;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeai extends aean
{
    private final aeak a;
    
    public aeai(final aeak a) {
        this.a = a;
    }
    
    public final void a(final Matrix matrix, final adzr adzr, final int n, final Canvas canvas) {
        final aeak a = this.a;
        final float e = a.e;
        final float f = a.f;
        final RectF rectF = new RectF(a.a, a.b, a.c, a.d);
        final Path k = adzr.k;
        final boolean b = f < 0.0f;
        if (b) {
            final int[] c = adzr.c;
            c[0] = 0;
            c[1] = adzr.j;
            c[2] = adzr.i;
            c[3] = adzr.h;
        }
        else {
            k.rewind();
            k.moveTo(rectF.centerX(), rectF.centerY());
            k.arcTo(rectF, e, f);
            k.close();
            final float n2 = (float)(-n);
            rectF.inset(n2, n2);
            final int[] c2 = adzr.c;
            c2[0] = 0;
            c2[1] = adzr.h;
            c2[2] = adzr.i;
            c2[3] = adzr.j;
        }
        final float n3 = rectF.width() / 2.0f;
        if (n3 <= 0.0f) {
            return;
        }
        final float n4 = 1.0f - n / n3;
        final float n5 = (1.0f - n4) / 2.0f;
        final float[] d = adzr.d;
        d[2] = (d[1] = n4) + n5;
        adzr.f.setShader((Shader)new RadialGradient(rectF.centerX(), rectF.centerY(), n3, adzr.c, adzr.d, Shader$TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!b) {
            canvas.clipPath(k, Region$Op.DIFFERENCE);
            canvas.drawPath(k, adzr.l);
        }
        canvas.drawArc(rectF, e, f, true, adzr.f);
        canvas.restore();
    }
}
