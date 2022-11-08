import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Queue;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dow extends InputStream implements InputStreamRetargetInterface
{
    public static final Queue a;
    public InputStream b;
    public IOException c;
    
    static {
        a = dpg.j(0);
    }
    
    public final void a() {
        this.c = null;
        this.b = null;
        final Queue a = dow.a;
        synchronized (a) {
            a.offer(this);
        }
    }
    
    @Override
    public final int available() {
        return this.b.available();
    }
    
    @Override
    public final void close() {
        this.b.close();
    }
    
    @Override
    public final void mark(final int n) {
        this.b.mark(n);
    }
    
    @Override
    public final boolean markSupported() {
        return true;
    }
    
    @Override
    public final int read() {
        try {
            return this.b.read();
        }
        catch (final IOException c) {
            throw this.c = c;
        }
    }
    
    @Override
    public final int read(final byte[] array) {
        try {
            return this.b.read(array);
        }
        catch (final IOException c) {
            throw this.c = c;
        }
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) {
        try {
            read = this.b.read(array, read, n);
            return read;
        }
        catch (final IOException c) {
            throw this.c = c;
        }
    }
    
    @Override
    public final void reset() {
        synchronized (this) {
            this.b.reset();
        }
    }
    
    @Override
    public final long skip(long skip) {
        try {
            skip = this.b.skip(skip);
            return skip;
        }
        catch (final IOException c) {
            throw this.c = c;
        }
    }
}
