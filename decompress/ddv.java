import java.io.IOException;
import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ddv implements ddy
{
    private final String a;
    private final AssetManager b;
    private Object c;
    
    public ddv(final AssetManager b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    protected abstract Object b(final AssetManager p0, final String p1);
    
    public final void d() {
        final Object c = this.c;
        if (c == null) {
            return;
        }
        try {
            this.e(c);
        }
        catch (final IOException ex) {}
    }
    
    protected abstract void e(final Object p0);
    
    public final void f(final dca dca, final ddx ddx) {
        try {
            ddx.b(this.c = this.b(this.b, this.a));
        }
        catch (final IOException ex) {
            ddx.e((Exception)ex);
        }
    }
    
    public final int g() {
        return 1;
    }
    
    public final void lq() {
    }
}
