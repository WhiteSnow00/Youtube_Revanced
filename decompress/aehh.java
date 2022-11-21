import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import java.lang.ref.SoftReference;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aehh extends Drawable
{
    private static SoftReference a;
    private static Path[] b;
    private static int[] c;
    private final int d;
    private final Paint e;
    
    public aehh(final int n) {
        this.e = new Paint(1);
        this.d = Color.argb(204, Color.red(n), Color.green(n), Color.blue(n));
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        final Rect bounds = this.getBounds();
        final int width = bounds.width();
        final int height = bounds.height();
        final SoftReference a = aehh.a;
        final Bitmap bitmap = null;
        Bitmap bitmap2;
        if (a != null) {
            bitmap2 = a.get();
        }
        else {
            bitmap2 = null;
        }
        if (bitmap2 != null) {
            final int width2 = bitmap2.getWidth();
            final int height2 = bitmap2.getHeight();
            if (width > width2 && width2 < 2049.0f) {
                bitmap2 = bitmap;
            }
            else if (height > height2 && height2 < 1152.0f) {
                bitmap2 = bitmap;
            }
        }
        Bitmap bitmap3;
        if ((bitmap3 = bitmap2) == null) {
            this.e.reset();
            final float min = Math.min(1.5f, Math.max(width / 1366.0f, height / 768.0f));
            bitmap3 = Bitmap.createBitmap((int)(min * 1366.0f), (int)(min * 768.0f), Bitmap$Config.ALPHA_8);
            final Canvas canvas2 = new Canvas(bitmap3);
            canvas2.save();
            canvas2.scale(min, min);
            this.e.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
            final Path[] b = aehh.b;
            int i;
            final int n = i = 0;
            if (b == null) {
                final Path[] array = aehh.b = new Path[7];
                aehh.c = new int[] { 10, 40, 51, 66, 91, 112, 130 };
                final Path path = new Path();
                (array[0] = path).moveTo(1029.4f, 357.5f);
                path.lineTo(1366.0f, 759.1f);
                path.lineTo(1366.0f, 0.0f);
                path.lineTo(1137.7f, 0.0f);
                path.close();
                final Path[] b2 = aehh.b;
                final Path path2 = new Path();
                (b2[1] = path2).moveTo(1138.1f, 0.0f);
                path2.rLineTo(-144.8f, 768.0f);
                path2.rLineTo(372.7f, 0.0f);
                path2.rLineTo(0.0f, -524.0f);
                path2.cubicTo(1290.7f, 121.6f, 1219.2f, 41.1f, 1178.7f, 0.0f);
                path2.close();
                final Path[] b3 = aehh.b;
                final Path path3 = new Path();
                (b3[2] = path3).moveTo(949.8f, 768.0f);
                path3.rCubicTo(92.6f, -170.6f, 213.0f, -440.3f, 269.4f, -768.0f);
                path3.lineTo(585.0f, 0.0f);
                path3.rLineTo(2.1f, 766.0f);
                path3.close();
                final Path[] b4 = aehh.b;
                final Path path4 = new Path();
                (b4[3] = path4).moveTo(471.1f, 768.0f);
                path4.rMoveTo(704.5f, 0.0f);
                path4.cubicTo(1123.6f, 563.3f, 1027.4f, 275.2f, 856.2f, 0.0f);
                path4.lineTo(476.4f, 0.0f);
                path4.rLineTo(-5.3f, 768.0f);
                path4.close();
                final Path[] b5 = aehh.b;
                final Path path5 = new Path();
                (b5[4] = path5).moveTo(323.1f, 768.0f);
                path5.moveTo(777.5f, 768.0f);
                path5.cubicTo(661.9f, 348.8f, 427.2f, 21.4f, 401.2f, 25.4f);
                path5.lineTo(323.1f, 768.0f);
                path5.close();
                final Path[] b6 = aehh.b;
                final Path path6 = new Path();
                (b6[5] = path6).moveTo(178.44286f, 766.8571f);
                path6.lineTo(308.7f, 768.0f);
                path6.cubicTo(381.7f, 604.6f, 481.6f, 344.3f, 562.2f, 0.0f);
                path6.lineTo(0.0f, 0.0f);
                path6.close();
                final Path[] b7 = aehh.b;
                final Path path7 = new Path();
                (b7[6] = path7).moveTo(146.0f, 0.0f);
                path7.lineTo(0.0f, 0.0f);
                path7.lineTo(0.0f, 768.0f);
                path7.lineTo(394.2f, 768.0f);
                path7.cubicTo(327.7f, 475.3f, 228.5f, 201.0f, 146.0f, 0.0f);
                path7.close();
                i = n;
            }
            while (i < 7) {
                this.e.setColor(aehh.c[i] << 24);
                canvas2.drawPath(aehh.b[i], this.e);
                ++i;
            }
            canvas2.restore();
            this.e.reset();
            aehh.a = new SoftReference(bitmap3);
            this.e.reset();
        }
        canvas.save();
        canvas.clipRect(bounds);
        final int width3 = bitmap3.getWidth();
        final int height3 = bitmap3.getHeight();
        final float n2 = (float)bounds.width();
        final float n3 = (float)width3;
        final float n4 = (float)bounds.height();
        final float n5 = (float)height3;
        final float n6 = n2 / n3;
        final float n7 = n4 / n5;
        canvas.scale(n6, n7);
        if (n7 > n6) {
            canvas.scale(n7 / n6, 1.0f, n3 * 0.146f, 0.0f);
        }
        else if (n6 > n7) {
            canvas.scale(1.0f, n6 / n7, 0.0f, n5 * 0.228f);
        }
        canvas.drawColor(-16777216);
        this.e.setColor(-1);
        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, this.e);
        canvas.drawColor(this.d);
        canvas.restore();
    }
    
    public final int getOpacity() {
        return 0;
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
