import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

final class dir implements ddx
{
    private final Object a;
    private final /* synthetic */ int b;
    
    public dir(final File a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public dir(final Object a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Class a() {
        if (this.b != 0) {
            return ByteBuffer.class;
        }
        return this.a.getClass();
    }
    
    public final void d() {
    }
    
    public final void f(final dbz dbz, final ddw ddw) {
        if (this.b != 0) {
            try {
                ddw.b((Object)dot.b((File)this.a));
                return;
            }
            catch (final IOException ex) {
                ddw.e((Exception)ex);
                return;
            }
        }
        ddw.b(this.a);
    }
    
    public final int g() {
        return 1;
    }
    
    public final void lq() {
    }
}
