import android.graphics.Shader;
import android.graphics.Canvas;
import android.graphics.Shader$TileMode;
import android.util.DisplayMetrics;
import android.widget.ImageView$ScaleType;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.BitmapShader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gst extends ohj
{
    private final BitmapShader h;
    private final int i;
    private final Path j;
    
    public gst(final Bitmap bitmap, final ImageView$ScaleType imageView$ScaleType, final otd otd, final DisplayMetrics displayMetrics) {
        super(bitmap, imageView$ScaleType, otd);
        this.h = new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
        this.i = tmy.aZ(displayMetrics, 4);
        this.j = new Path();
    }
    
    private final float b(final float n) {
        if (this.i + n > this.c.bottom) {
            return this.c.bottom - n;
        }
        return (float)this.i;
    }
    
    private final void c(final Path path, float n) {
        final float b = this.b(n);
        if (b > 0.0f) {
            final float n2 = n + b;
            path.lineTo(this.c.left + b, n2);
            final float b2 = this.b(n2);
            if (b2 > 0.0f) {
                n = n2 + b2;
                path.lineTo(this.c.left + this.i - b2, n);
                this.c(path, n);
                path.lineTo(this.c.right - this.i + b2, n);
            }
            path.lineTo(this.c.right - b, n2);
        }
    }
    
    public final void draw(final Canvas canvas) {
        this.h.setLocalMatrix(this.a);
        this.b.setShader((Shader)this.h);
        this.j.reset();
        this.j.moveTo(this.c.left, this.c.top);
        this.c(this.j, this.c.top);
        this.j.lineTo(this.c.right, this.c.top);
        canvas.drawPath(this.j, this.b);
    }
}
