import android.view.OnReceiveContentListener;
import android.view.ContentInfo;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amy
{
    public static alf a(final View view, final alf alf) {
        final ContentInfo c = alf.c();
        final ContentInfo performReceiveContent = view.performReceiveContent(c);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == c) {
            return alf;
        }
        return alf.d(performReceiveContent);
    }
    
    public static void b(final View view, final String[] array, final aly aly) {
        if (aly == null) {
            view.setOnReceiveContentListener(array, (OnReceiveContentListener)null);
            return;
        }
        view.setOnReceiveContentListener(array, (OnReceiveContentListener)new amz(aly));
    }
    
    public static String[] c(final View view) {
        return view.getReceiveContentMimeTypes();
    }
}
