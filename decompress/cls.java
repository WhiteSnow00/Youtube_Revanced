import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import android.webkit.WebView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cls implements clz
{
    private static final String[] a;
    
    static {
        a = new String[0];
    }
    
    @Override
    public final WebViewProviderBoundaryInterface a(final WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
    
    @Override
    public final WebkitToCompatConverterBoundaryInterface b() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
    
    @Override
    public final String[] c() {
        return cls.a;
    }
}
