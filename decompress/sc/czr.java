import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.net.UnknownServiceException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import java.net.ProtocolException;
import java.io.InterruptedIOException;
import java.nio.channels.ClosedChannelException;
import java.net.SocketException;
import java.io.Closeable;
import android.graphics.PathMeasure;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.provider.Settings$Global;
import android.content.Context;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czr
{
    public static final ThreadLocal a;
    private static final ThreadLocal b;
    private static final ThreadLocal c;
    private static final ThreadLocal d;
    private static final float e;
    private static float f;
    
    static {
        b = new czn();
        c = new czo();
        d = new czp();
        a = new czq();
        e = (float)(Math.sqrt(2.0) / 2.0);
        czr.f = -1.0f;
    }
    
    public static float a() {
        float f;
        if ((f = czr.f) == -1.0f) {
            f = (czr.f = Resources.getSystem().getDisplayMetrics().density);
        }
        return f;
    }
    
    public static float b(final Context context) {
        return Settings$Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }
    
    public static float c(final Matrix matrix) {
        final float[] array = czr.a.get();
        array[1] = (array[0] = 0.0f);
        array[3] = (array[2] = czr.e);
        matrix.mapPoints(array);
        return (float)Math.hypot(array[2] - array[0], array[3] - array[1]);
    }
    
    public static int d(final float n, final float n2, final float n3, final float n4) {
        int n5;
        if (n != 0.0f) {
            n5 = (int)(n * 527.0f);
        }
        else {
            n5 = 17;
        }
        int n6 = n5;
        if (n2 != 0.0f) {
            n6 = (int)(n5 * 31 * n2);
        }
        int n7 = n6;
        if (n3 != 0.0f) {
            n7 = (int)(n6 * 31 * n3);
        }
        int n8 = n7;
        if (n4 != 0.0f) {
            n8 = (int)(n7 * 31 * n4);
        }
        return n8;
    }
    
    public static Bitmap e(final Bitmap bitmap, final int n, final int n2) {
        if (bitmap.getWidth() == n && bitmap.getHeight() == n2) {
            return bitmap;
        }
        final Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, n, n2, true);
        bitmap.recycle();
        return scaledBitmap;
    }
    
    public static Path f(final PointF pointF, final PointF pointF2, final PointF pointF3, final PointF pointF4) {
        final Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }
    
    public static void g(final Path path, final cvl cvl) {
        if (cvl != null) {
            if (!cvl.a) {
                h(path, ((cvt)cvl.b).k() / 100.0f, ((cvt)cvl.c).k() / 100.0f, ((cvt)cvl.d).k() / 360.0f);
            }
        }
    }
    
    public static void h(final Path path, float n, float n2, float n3) {
        final PathMeasure pathMeasure = czr.b.get();
        final Path path2 = czr.c.get();
        final Path path3 = czr.d.get();
        pathMeasure.setPath(path, false);
        final float length = pathMeasure.getLength();
        if (n == 1.0f && n2 == 0.0f) {
            ctq.a();
            return;
        }
        if (length < 1.0f || Math.abs(n2 - n - 1.0f) < 0.01) {
            ctq.a();
            return;
        }
        n *= length;
        final float n4 = n2 * length;
        n3 *= length;
        n2 = Math.min(n, n4) + n3;
        final float n5 = Math.max(n, n4) + n3;
        n3 = n2;
        n = n5;
        if (n2 >= length) {
            n3 = n2;
            n = n5;
            if (n5 >= length) {
                n3 = (float)czm.d(n2, length);
                n = (float)czm.d(n5, length);
            }
        }
        n2 = n3;
        if (n3 < 0.0f) {
            n2 = (float)czm.d(n3, length);
        }
        n3 = n;
        if (n < 0.0f) {
            n3 = (float)czm.d(n, length);
        }
        if (n2 == n3) {
            path.reset();
            ctq.a();
            return;
        }
        n = n2;
        if (n2 >= n3) {
            n = n2 - length;
        }
        path2.reset();
        pathMeasure.getSegment(n, n3, path2, true);
        if (n3 > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, n3 % length, path3, true);
            path2.addPath(path3);
        }
        else if (n < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(n + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        ctq.a();
    }
    
    public static void i(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0014;
        }
        try {
            closeable.close();
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {}
    }
    
    public static boolean j(final Throwable t) {
        return t instanceof SocketException || t instanceof ClosedChannelException || t instanceof InterruptedIOException || t instanceof ProtocolException || t instanceof SSLException || t instanceof UnknownHostException || t instanceof UnknownServiceException;
    }
    
    public static boolean k(final int n, final int n2, final int n3) {
        return n >= 4 && (n > 4 || (n2 >= 4 && (n2 > 4 || n3 >= 0)));
    }
    
    public static void l(final Canvas canvas, final RectF rectF, final Paint paint) {
        canvas.saveLayer(rectF, paint);
        ctq.a();
    }
}
