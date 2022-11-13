import java.io.FileNotFoundException;
import java.io.IOException;
import android.content.Context;
import java.io.InputStream;
import android.net.Uri;
import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbc extends bbd
{
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;
    
    public bbc(final Context context) {
        super(false);
        this.a = context.getAssets();
    }
    
    public final int a(final byte[] array, int read, int a) {
        if (a == 0) {
            return 0;
        }
        final long d = this.d;
        if (d != 0L) {
            int n = a;
            Label_0045: {
                if (d == -1L) {
                    break Label_0045;
                }
                final long n2 = a;
                try {
                    n = (int)Math.min(d, n2);
                    final InputStream c = this.c;
                    a = bax.a;
                    read = c.read(array, read, n);
                    if (read == -1) {
                        return -1;
                    }
                    final long d2 = this.d;
                    if (d2 != -1L) {
                        this.d = d2 - read;
                    }
                    this.g(read);
                    return read;
                }
                catch (final IOException ex) {
                    throw new bbb((Throwable)ex, 2000);
                }
            }
        }
        return -1;
    }
    
    public final long b(final bbp bbp) {
        try {
            final Uri a = bbp.a;
            this.b = a;
            final String path = a.getPath();
            dk.d((Object)path);
            String s;
            if (path.startsWith("/android_asset/")) {
                s = path.substring(15);
            }
            else {
                s = path;
                if (path.startsWith("/")) {
                    s = path.substring(1);
                }
            }
            this.i(bbp);
            final InputStream open = this.a.open(s, 1);
            this.c = open;
            if (open.skip(bbp.g) >= bbp.g) {
                final long h = bbp.h;
                if (h != -1L) {
                    this.d = h;
                }
                else {
                    final long d = this.c.available();
                    this.d = d;
                    if (d == 2147483647L) {
                        this.d = -1L;
                    }
                }
                this.e = true;
                this.j(bbp);
                return this.d;
            }
            throw new bbb((Throwable)null, 2008);
        }
        catch (final IOException ex) {
            int n;
            if (!(ex instanceof FileNotFoundException)) {
                n = 2000;
            }
            else {
                n = 2005;
            }
            throw new bbb((Throwable)ex, n);
        }
        catch (final bbb bbb) {
            throw bbb;
        }
    }
    
    public final Uri c() {
        return this.b;
    }
    
    public final void f() {
        this.b = null;
        try {
            try {
                final InputStream c = this.c;
                if (c != null) {
                    c.close();
                }
                this.c = null;
                if (this.e) {
                    this.e = false;
                    this.h();
                }
            }
            finally {
                this.c = null;
                if (this.e) {
                    this.e = false;
                    this.h();
                }
            }
        }
        catch (final IOException ex) {}
    }
}
