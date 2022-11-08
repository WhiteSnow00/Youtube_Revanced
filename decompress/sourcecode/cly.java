import java.lang.ref.WeakReference;
import android.webkit.WebViewRenderProcess;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cly extends cji
{
    private static final WeakHashMap a;
    
    static {
        a = new WeakHashMap();
    }
    
    public cly(final WebViewRenderProcess webViewRenderProcess) {
        new WeakReference(webViewRenderProcess);
    }
    
    public static void h(final WebViewRenderProcess webViewRenderProcess) {
        final WeakHashMap a = cly.a;
        if (a.get(webViewRenderProcess) != null) {
            return;
        }
        a.put(webViewRenderProcess, new cly(webViewRenderProcess));
    }
}
