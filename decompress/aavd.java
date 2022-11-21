import android.text.Layout;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.graphics.PorterDuff$Mode;
import android.graphics.Canvas;
import android.opengl.GLU;
import android.opengl.GLES20;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.content.res.Resources;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavd
{
    public static final Boolean a;
    
    static {
        a = false;
    }
    
    public static float a(final float n) {
        return n * 0.1f;
    }
    
    public static int b(final float n) {
        return (int)(n / 0.1f);
    }
    
    public static Bitmap c() {
        return Bitmap.createBitmap(80, 30, Bitmap$Config.ARGB_8888);
    }
    
    public static Bitmap d(final Resources resources, final int n) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inScaled = false;
        return BitmapFactory.decodeResource(resources, n, bitmapFactory$Options);
    }
    
    public static FloatBuffer e(final float[] array) {
        final FloatBuffer floatBuffer = ByteBuffer.allocateDirect(array.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBuffer.put(array).position(0);
        return floatBuffer;
    }
    
    public static void f() {
        int n = 0;
        while (true) {
            final int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            tut.b("GL error ".concat(String.valueOf(GLU.gluErrorString(glGetError))));
            if (n != 0) {
                continue;
            }
            n = glGetError;
        }
        if (n == 0) {
            return;
        }
        throw new aavb("GL error ".concat(String.valueOf(GLU.gluErrorString(n))));
    }
    
    public static void g(int glGetError) {
        if (aavd.a) {
            return;
        }
        if (glGetError == 0) {
            while (true) {
                glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    break;
                }
                tut.b("GL error ".concat(String.valueOf(GLU.gluErrorString(glGetError))));
            }
            throw new aavb("Invalid GL object");
        }
    }
    
    @Deprecated
    public static void h(final Bitmap bitmap, final String s) {
        final Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff$Mode.CLEAR);
        final TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        textPaint.setTextSize(20.0f);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        ((Layout)new StaticLayout((CharSequence)s, textPaint, bitmap.getWidth(), Layout$Alignment.ALIGN_CENTER, 1.0f, 0.0f, true)).draw(canvas);
    }
    
    public static boolean i(final float n, final float n2) {
        return j(n, n2, 1.0E-5f);
    }
    
    public static boolean j(final float n, final float n2, final float n3) {
        return Math.abs(n - n2) < n3;
    }
    
    public static boolean k(final float n) {
        return i(n, 0.0f);
    }
    
    public static float l(final float n) {
        if (n < 200.0f) {
            return 200.0f;
        }
        if (n > 10000.0f) {
            return 10000.0f;
        }
        return n;
    }
    
    public static void m(final float[] array, final float[] array2) {
        if (array.length >= 3) {
            final float n = (float)Math.asin(array2[6]);
            final float n2 = array2[6];
            float n3;
            float n4;
            if (Math.sqrt(1.0f - n2 * n2) >= 0.009999999776482582) {
                n3 = (float)Math.atan2(-array2[2], array2[10]);
                n4 = (float)Math.atan2(-array2[4], array2[5]);
            }
            else {
                n4 = (float)Math.atan2(array2[1], array2[0]);
                n3 = 0.0f;
            }
            array[0] = -n;
            array[1] = -n3;
            array[2] = -n4;
            return;
        }
        throw new IllegalArgumentException("Not enough space to write the result");
    }
}
