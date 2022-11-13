import android.view.OnReceiveContentListener;
import android.view.ContentInfo;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amx
{
    public static ale a(final View view, final ale ale) {
        final ContentInfo c = ale.c();
        final ContentInfo performReceiveContent = view.performReceiveContent(c);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == c) {
            return ale;
        }
        return ale.d(performReceiveContent);
    }
    
    public static void b(final View view, final String[] array, final alx alx) {
        if (alx == null) {
            view.setOnReceiveContentListener(array, (OnReceiveContentListener)null);
            return;
        }
        view.setOnReceiveContentListener(array, (OnReceiveContentListener)new amy(alx));
    }
    
    public static String[] c(final View view) {
        return view.getReceiveContentMimeTypes();
    }
}
