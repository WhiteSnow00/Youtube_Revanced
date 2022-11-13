import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.InputStream;
import java.io.FileInputStream;
import android.net.Uri;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adno implements adnh
{
    private final File a;
    private final File b;
    private final Uri c;
    
    public adno(final Uri c) {
        adkp.H(a(c));
        this.c = c;
        final String queryParameter = c.getQueryParameter("temp");
        final boolean b = false;
        adkp.H(queryParameter != null && !queryParameter.isEmpty());
        final File a = new File(queryParameter);
        this.a = a;
        final String path = c.getPath();
        boolean b2 = b;
        if (path != null) {
            b2 = b;
            if (!path.isEmpty()) {
                b2 = true;
            }
        }
        adkp.H(b2);
        final File b3 = new File(path);
        this.b = b3;
        adkp.H(a.equals(b3) ^ true);
    }
    
    public static boolean a(final Uri uri) {
        return uri != null && "streaming".equals(uri.getScheme());
    }
    
    private final adnf b() {
        return new adnf((InputStream)new FileInputStream(this.b), this.b.length());
    }
    
    public final Bitmap c(final Point point) {
        return adnp.b(this.c, point);
    }
    
    public final adnf g(final File file) {
        final long currentTimeMillis = System.currentTimeMillis();
        while (!this.a.canRead()) {
            if (!this.b.canRead()) {
                if (System.currentTimeMillis() - currentTimeMillis < 3000L) {
                    try {
                        Thread.sleep(30L);
                        continue;
                    }
                    catch (final InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        String message;
                        if (ex.getMessage() != null) {
                            message = ex.getMessage();
                        }
                        else {
                            message = "";
                        }
                        throw new InterruptedIOException(message);
                    }
                }
                throw new FileNotFoundException(String.format("File %s not found.", this.a));
            }
            return this.b();
        }
        try {
            return new adnn(this.a, this.b);
        }
        catch (final FileNotFoundException ex2) {
            if (this.b.canRead()) {
                return this.b();
            }
            throw ex2;
        }
    }
    
    public final apig h(final String s, final String s2) {
        return adnp.d(s, s2);
    }
    
    public final void k() {
    }
    
    public final boolean l() {
        return false;
    }
    
    public final boolean m() {
        return false;
    }
}
