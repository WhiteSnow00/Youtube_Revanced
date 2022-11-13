import android.graphics.Shader;
import android.graphics.Canvas;
import android.graphics.Shader$TileMode;
import android.widget.ImageView$ScaleType;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihg extends oiq
{
    private final float h;
    private final BitmapShader i;
    
    public ihg(final Bitmap bitmap, final ImageView$ScaleType imageView$ScaleType, final oum oum, final float h) {
        super(bitmap, imageView$ScaleType, oum);
        this.h = h;
        this.i = new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
    }
    
    public final void draw(final Canvas canvas) {
        canvas.drawColor(fbu.E(ceb.b(this.e).b(), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, this.e.getWidth(), this.e.getHeight()).a);
        final float h = this.h;
        canvas.scale(h, h, this.c.centerX(), this.c.centerY());
        this.i.setLocalMatrix(this.a);
        this.b.setShader((Shader)this.i);
        canvas.drawCircle(this.c.centerX(), this.c.centerY(), Math.min(this.c.width() * 0.5f, this.c.height() * 0.5f), this.b);
    }
}
