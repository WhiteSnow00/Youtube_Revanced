import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

final class dis implements ddy
{
    private final Object a;
    private final int b;
    
    public dis(final File a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public dis(final Object a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Class a() {
        if (this.b != 0) {
            return ByteBuffer.class;
        }
        return this.a.getClass();
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void f(final dca dca, final ddx ddx) {
        if (this.b != 0) {
            try {
                ddx.b(dou.b((File)this.a));
                return;
            }
            catch (final IOException ex) {
                ddx.e(ex);
                return;
            }
        }
        ddx.b(this.a);
    }
    
    @Override
    public final int g() {
        return 1;
    }
    
    @Override
    public final void lq() {
    }
}
