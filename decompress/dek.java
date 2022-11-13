import java.io.FileNotFoundException;
import java.io.IOException;
import android.content.ContentResolver;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dek implements ddy
{
    private final Uri a;
    private final ContentResolver b;
    private Object c;
    
    public dek(final ContentResolver b, final Uri a) {
        this.b = b;
        this.a = a;
    }
    
    protected abstract Object b(final Uri p0, final ContentResolver p1);
    
    protected abstract void c(final Object p0);
    
    public final void d() {
        final Object c = this.c;
        if (c == null) {
            return;
        }
        try {
            this.c(c);
        }
        catch (final IOException ex) {}
    }
    
    public final void f(final dca dca, final ddx ddx) {
        try {
            ddx.b(this.c = this.b(this.a, this.b));
        }
        catch (final FileNotFoundException ex) {
            ddx.e((Exception)ex);
        }
    }
    
    public final int g() {
        return 1;
    }
    
    public final void lq() {
    }
}
