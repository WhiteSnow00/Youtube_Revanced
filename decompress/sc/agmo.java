import java.net.MalformedURLException;
import android.util.Log;
import android.text.TextUtils;
import java.util.concurrent.Future;
import java.net.URL;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmo implements Closeable
{
    public final URL a;
    public volatile Future b;
    public nnc c;
    
    private agmo(final URL a) {
        this.a = a;
    }
    
    public static agmo a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        try {
            return new agmo(new URL(s));
        }
        catch (final MalformedURLException ex) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: ".concat(String.valueOf(s)));
            return null;
        }
    }
    
    @Override
    public final void close() {
        this.b.cancel(true);
    }
}
