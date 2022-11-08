import java.io.FileNotFoundException;
import java.io.IOException;
import android.net.Uri;
import java.io.RandomAccessFile;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwy extends bbc
{
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;
    private final String e;
    
    public lwy(final String e) {
        super(false);
        this.e = e;
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
            final int a2 = baw.a;
            read = a.read(array, read, (int)Math.min(this.c, n));
            if (read > 0) {
                this.c -= read;
                this.g(read);
            }
            return read;
        }
        catch (final IOException ex) {
            throw new lwx("c.file.read;src.".concat(this.e), ex);
        }
    }
    
    public final long b(final bbo bbo) {
        try {
            final Uri a = bbo.a;
            this.b = a;
            this.i(bbo);
            try {
                final String path = a.getPath();
                dk.d((Object)path);
                (this.a = new RandomAccessFile(path, "r")).seek(bbo.g);
                long h;
                if ((h = bbo.h) == -1L) {
                    h = this.a.length() - bbo.g;
                }
                this.c = h;
                if (h >= 0L) {
                    this.d = true;
                    this.j(bbo);
                    return this.c;
                }
                throw new bbl(2008);
            }
            catch (final FileNotFoundException ex) {
                try {
                    throw new lwx("c.FileNotFound;src.".concat(this.e), ex);
                }
                catch (final Exception ex2) {
                    throw new lwx("c.file.open;src.".concat(this.e), ex2);
                }
                catch (final lwx lwx) {
                    throw lwx;
                }
            }
        }
        catch (final Exception ex3) {}
        catch (final lwx lwx2) {}
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
