import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

final class adyr extends adyv
{
    private final adyt a;
    private final float b;
    private final float e;
    
    public adyr(final adyt a, final float b, final float e) {
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public final void a(final Matrix matrix, final adya adya, final int n, final Canvas canvas) {
        final adyt a = this.a;
        final RectF rectF = new RectF(0.0f, 0.0f, (float)Math.hypot(a.b - this.e, a.a - this.b), 0.0f);
        this.d.set(matrix);
        this.d.preTranslate(this.b, this.e);
        this.d.preRotate(this.b());
        final Matrix d = this.d;
        rectF.bottom += n;
        rectF.offset(0.0f, (float)(-n));
        final int[] a2 = adya.a;
        a2[0] = adya.j;
        a2[1] = adya.i;
        a2[2] = adya.h;
        adya.g.setShader((Shader)new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, adya.a, adya.b, Shader$TileMode.CLAMP));
        canvas.save();
        canvas.concat(d);
        canvas.drawRect(rectF, adya.g);
        canvas.restore();
    }
    
    final float b() {
        final adyt a = this.a;
        return (float)Math.toDegrees(Math.atan((a.b - this.e) / (a.a - this.b)));
    }
}
