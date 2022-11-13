import java.io.FileNotFoundException;
import android.text.TextUtils;
import java.io.IOException;
import android.net.Uri;
import java.io.RandomAccessFile;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbz extends bbd
{
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;
    
    public bbz() {
        super(false);
    }
    
    public final int a(final byte[] array, int read, final int n) {
        if (n == 0) {
            return 0;
        }
        if (this.c == 0L) {
            return -1;
        }
        try {
            final RandomAccessFile a = this.a;
            final int a2 = bax.a;
            read = a.read(array, read, (int)Math.min(this.c, n));
            if (read > 0) {
                this.c -= read;
                this.g(read);
            }
            return read;
        }
        catch (final IOException ex) {
            throw new bby((Throwable)ex, 2000);
        }
    }
    
    public final long b(final bbp bbp) {
        final Uri a = bbp.a;
        this.b = a;
        this.i(bbp);
        int n = 2006;
        try {
            final String path = a.getPath();
            dk.d((Object)path);
            final RandomAccessFile a2 = new RandomAccessFile(path, "r");
            this.a = a2;
            try {
                a2.seek(bbp.g);
                long h;
                if ((h = bbp.h) == -1L) {
                    h = this.a.length() - bbp.g;
                }
                this.c = h;
                if (h >= 0L) {
                    this.d = true;
                    this.j(bbp);
                    return this.c;
                }
                throw new bby((String)null, (Throwable)null, 2008);
            }
            catch (final IOException ex) {
                throw new bby((Throwable)ex, 2000);
            }
        }
        catch (final RuntimeException ex2) {
            throw new bby((Throwable)ex2, 2000);
        }
        catch (final SecurityException ex3) {
            throw new bby((Throwable)ex3, 2006);
        }
        catch (final FileNotFoundException ex4) {
            if (TextUtils.isEmpty((CharSequence)a.getQuery()) && TextUtils.isEmpty((CharSequence)a.getFragment())) {
                final int a3 = bax.a;
                if (!bbx.a(ex4.getCause())) {
                    n = 2005;
                }
                throw new bby((Throwable)ex4, n);
            }
            throw new bby(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", a.getPath(), a.getQuery(), a.getFragment()), (Throwable)ex4, 1004);
        }
    }
    
    public final Uri c() {
        return this.b;
    }
    
    public final void f() {
        this.b = null;
        try {
            try {
                final RandomAccessFile a = this.a;
                if (a != null) {
                    a.close();
                }
                this.a = null;
                if (this.d) {
                    this.d = false;
                    this.h();
                }
            }
            finally {
                this.a = null;
                if (this.d) {
                    this.d = false;
                    this.h();
                }
            }
        }
        catch (final IOException ex) {}
    }
}
