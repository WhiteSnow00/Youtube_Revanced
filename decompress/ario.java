import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ario extends arim implements dpy
{
    public int q;
    public int r;
    
    protected ario(final String s) {
        super(s);
    }
    
    public final int r() {
        if (!this.k) {
            this.q();
        }
        return this.r;
    }
    
    public final int s() {
        if (!this.k) {
            this.q();
        }
        return this.q;
    }
    
    protected final void t(final ByteBuffer byteBuffer) {
        cop.l(byteBuffer, this.q);
        cop.j(byteBuffer, this.r);
    }
    
    protected final void u(final ByteBuffer byteBuffer) {
        this.q = coh.i(byteBuffer);
        this.r = coh.h(byteBuffer);
    }
}
