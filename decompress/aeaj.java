import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeaj extends aean
{
    private final aeal a;
    private final float b;
    private final float e;
    
    public aeaj(final aeal a, final float b, final float e) {
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public final void a(final Matrix matrix, final adzr adzr, final int n, final Canvas canvas) {
        final aeal a = this.a;
        final RectF rectF = new RectF(0.0f, 0.0f, (float)Math.hypot(a.b - this.e, a.a - this.b), 0.0f);
        this.d.set(matrix);
        this.d.preTranslate(this.b, this.e);
        this.d.preRotate(this.b());
        final Matrix d = this.d;
        rectF.bottom += n;
        rectF.offset(0.0f, (float)(-n));
        final int[] a2 = adzr.a;
        a2[0] = adzr.j;
        a2[1] = adzr.i;
        a2[2] = adzr.h;
        adzr.g.setShader((Shader)new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, adzr.a, adzr.b, Shader$TileMode.CLAMP));
        canvas.save();
        canvas.concat(d);
        canvas.drawRect(rectF, adzr.g);
        canvas.restore();
    }
    
    final float b() {
        final aeal a = this.a;
        return (float)Math.toDegrees(Math.atan((a.b - this.e) / (a.a - this.b)));
    }
}
