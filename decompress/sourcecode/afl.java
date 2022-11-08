import android.app.Notification$BigPictureStyle;
import android.graphics.Shader;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.os.Build$VERSION;
import androidx.core.graphics.drawable.IconCompat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afl extends aft
{
    public boolean a;
    private IconCompat f;
    private IconCompat g;
    private boolean h;
    
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
    
    public final void b(final afg afg) {
        final agf agf = (agf)afg;
        Notification$BigPictureStyle notification$BigPictureStyle2;
        final Notification$BigPictureStyle notification$BigPictureStyle = notification$BigPictureStyle2 = afi.c(afi.b(agf.b), this.c);
        if (this.f != null) {
            if (Build$VERSION.SDK_INT >= 31) {
                afk.a(notification$BigPictureStyle, air.b(this.f, agf.a));
                notification$BigPictureStyle2 = notification$BigPictureStyle;
            }
            else {
                notification$BigPictureStyle2 = notification$BigPictureStyle;
                if (this.f.b() == 1) {
                    final IconCompat f = this.f;
                    final int b = f.b;
                    Bitmap bitmap;
                    if (b == -1) {
                        final Object c = f.c;
                        if (c instanceof Bitmap) {
                            bitmap = (Bitmap)c;
                        }
                        else {
                            bitmap = null;
                        }
                    }
                    else if (b == 1) {
                        bitmap = (Bitmap)f.c;
                    }
                    else {
                        if (b != 5) {
                            new StringBuilder("called getBitmap() on ").append(f);
                            throw new IllegalStateException("called getBitmap() on ".concat(f.toString()));
                        }
                        final Bitmap bitmap2 = (Bitmap)f.c;
                        final int n = (int)(Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        bitmap = Bitmap.createBitmap(n, n, Bitmap$Config.ARGB_8888);
                        final Canvas canvas = new Canvas(bitmap);
                        final Paint paint = new Paint(3);
                        final float n2 = (float)n;
                        final float n3 = 0.5f * n2;
                        final float n4 = 0.9166667f * n3;
                        final float n5 = 0.010416667f * n2;
                        paint.setColor(0);
                        paint.setShadowLayer(n5, 0.0f, n2 * 0.020833334f, 1023410176);
                        canvas.drawCircle(n3, n3, n4, paint);
                        paint.setShadowLayer(n5, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(n3, n3, n4, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        final BitmapShader shader = new BitmapShader(bitmap2, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
                        final Matrix localMatrix = new Matrix();
                        localMatrix.setTranslate(-(bitmap2.getWidth() - n) / 2.0f, -(bitmap2.getHeight() - n) / 2.0f);
                        shader.setLocalMatrix(localMatrix);
                        paint.setShader((Shader)shader);
                        canvas.drawCircle(n3, n3, n4, paint);
                        canvas.setBitmap((Bitmap)null);
                    }
                    notification$BigPictureStyle2 = afi.a(notification$BigPictureStyle, bitmap);
                }
            }
        }
        if (this.h) {
            final IconCompat g = this.g;
            if (g == null) {
                afi.d(notification$BigPictureStyle2, (Bitmap)null);
            }
            else {
                afj.a(notification$BigPictureStyle2, air.b(g, agf.a));
            }
        }
        if (this.e) {
            afi.e(notification$BigPictureStyle2, this.d);
        }
        if (Build$VERSION.SDK_INT >= 31) {
            afk.c(notification$BigPictureStyle2, this.a);
            afk.b(notification$BigPictureStyle2, (CharSequence)null);
        }
    }
    
    public final void c(final Bitmap bitmap) {
        IconCompat d;
        if (bitmap == null) {
            d = null;
        }
        else {
            d = IconCompat.d(bitmap);
        }
        this.g = d;
        this.h = true;
    }
    
    public final void d(final Bitmap bitmap) {
        IconCompat d;
        if (bitmap == null) {
            d = null;
        }
        else {
            d = IconCompat.d(bitmap);
        }
        this.f = d;
    }
    
    public final void e(final CharSequence charSequence) {
        this.c = afp.c(charSequence);
    }
    
    public final void f(final CharSequence charSequence) {
        this.d = afp.c(charSequence);
        this.e = true;
    }
}
