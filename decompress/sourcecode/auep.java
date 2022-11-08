import org.chromium.net.UploadDataProvider;
import java.io.IOException;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class auep extends OutputStream
{
    private boolean a;
    public IOException d;
    public boolean e;
    
    public auep() {
    }
    
    public abstract UploadDataProvider a();
    
    public abstract void b();
    
    public abstract void c();
    
    @Override
    public void close() {
        this.a = true;
    }
    
    protected final void d() {
        final IOException d = this.d;
        if (d == null) {
            return;
        }
        throw d;
    }
    
    protected final void e() {
        if (this.e) {
            this.d();
            throw new IOException("Writing after request completed.");
        }
        if (!this.a) {
            return;
        }
        throw new IOException("Stream has been closed.");
    }
}
