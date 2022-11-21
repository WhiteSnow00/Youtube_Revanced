import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class bab extends OutputStream
{
    private final FileOutputStream a;
    private boolean b;
    
    public bab(final File file) {
        this.b = false;
        this.a = new FileOutputStream(file);
    }
    
    @Override
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.flush();
        try {
            this.a.getFD().sync();
        }
        catch (final IOException ex) {
            baq.d("AtomicFile", "Failed to sync file descriptor:", ex);
        }
        this.a.close();
    }
    
    @Override
    public final void flush() {
        this.a.flush();
    }
    
    @Override
    public final void write(final int n) {
        this.a.write(n);
    }
    
    @Override
    public final void write(final byte[] array) {
        this.a.write(array);
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        this.a.write(array, n, n2);
    }
}
