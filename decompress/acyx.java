import android.net.Uri;
import android.content.Context;
import android.webkit.DownloadListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acyx implements DownloadListener
{
    final Context a;
    
    public acyx(final Context a) {
        this.a = a;
    }
    
    public final void onDownloadStart(final String s, final String s2, final String s3, final String s4, final long n) {
        acza.d(Uri.parse(s), this.a);
    }
}
