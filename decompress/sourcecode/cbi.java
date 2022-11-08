import android.os.SystemClock;
import java.net.URLConnection;
import java.io.BufferedInputStream;
import java.net.URL;
import java.io.InputStream;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import android.net.Uri;
import android.graphics.Bitmap;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbi extends AsyncTask
{
    public final Bitmap a;
    public final Uri b;
    final /* synthetic */ cbn c;
    private int d;
    private long e;
    
    public cbi(final cbn c) {
        this.c = c;
        final MediaDescriptionCompat d = c.D;
        final Uri uri = null;
        Bitmap c2;
        if (d == null) {
            c2 = null;
        }
        else {
            c2 = d.c;
        }
        Bitmap a = c2;
        if (cbn.v(c2)) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            a = null;
        }
        this.a = a;
        final MediaDescriptionCompat d2 = c.D;
        Uri d3;
        if (d2 == null) {
            d3 = uri;
        }
        else {
            d3 = d2.d;
        }
        this.b = d3;
    }
    
    private final InputStream a(final Uri uri) {
        final String lowerCase = uri.getScheme().toLowerCase();
        InputStream inputStream;
        if (!"android.resource".equals(lowerCase) && !"content".equals(lowerCase) && !"file".equals(lowerCase)) {
            final URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(cbn.b);
            openConnection.setReadTimeout(cbn.b);
            inputStream = openConnection.getInputStream();
        }
        else {
            inputStream = this.c.d.getContentResolver().openInputStream(uri);
        }
        if (inputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStream);
    }
    
    protected final void onPreExecute() {
        this.e = SystemClock.uptimeMillis();
        this.c.l();
    }
}
