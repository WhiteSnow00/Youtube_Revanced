import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.io.OutputStream;
import android.webkit.TracingConfig$Builder;
import android.webkit.TracingController;
import android.os.Looper;
import android.webkit.WebView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clp
{
    public static Looper a(final WebView webView) {
        return webView.getWebViewLooper();
    }
    
    public static TracingController b() {
        return TracingController.getInstance();
    }
    
    public static ClassLoader c() {
        return WebView.getWebViewClassLoader();
    }
    
    public static void d(final String dataDirectorySuffix) {
        WebView.setDataDirectorySuffix(dataDirectorySuffix);
    }
    
    public static void e(final TracingController tracingController, final clb clb) {
        new TracingConfig$Builder();
        throw null;
    }
    
    public static boolean f(final TracingController tracingController) {
        return tracingController.isTracing();
    }
    
    public static boolean g(final TracingController tracingController, final OutputStream outputStream, final Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
    
    public static String h(final int n) {
        if (n == 1) {
            return "NOT_REQUIRED";
        }
        if (n == 2) {
            return "CONNECTED";
        }
        if (n == 3) {
            return "UNMETERED";
        }
        if (n == 4) {
            return "NOT_ROAMING";
        }
        if (n != 5) {
            return "TEMPORARILY_UNMETERED";
        }
        return "METERED";
    }
    
    public static final int i(final int n, final ByteBuffer byteBuffer) {
        if (k(n, 4, byteBuffer)) {
            return byteBuffer.getInt(n);
        }
        return -1;
    }
    
    public static final short j(final int n, final ByteBuffer byteBuffer) {
        if (k(n, 2, byteBuffer)) {
            return byteBuffer.getShort(n);
        }
        return -1;
    }
    
    private static final boolean k(final int n, final int n2, final ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - n >= n2;
    }
}
