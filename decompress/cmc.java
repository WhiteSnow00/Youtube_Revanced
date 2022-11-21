import java.lang.ref.WeakReference;
import android.webkit.WebViewRenderProcess;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmc extends cjo
{
    private static final WeakHashMap a;
    
    static {
        a = new WeakHashMap();
    }
    
    public cmc(final WebViewRenderProcess webViewRenderProcess) {
        new WeakReference(webViewRenderProcess);
    }
    
    public static void g(final WebViewRenderProcess webViewRenderProcess) {
        final WeakHashMap a = cmc.a;
        if (a.get(webViewRenderProcess) != null) {
            return;
        }
        a.put(webViewRenderProcess, new cmc(webViewRenderProcess));
    }
}
