import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ardf extends ardd implements dpu
{
    public int q;
    public int r;
    
    protected ardf(final String s) {
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
        clm.n(byteBuffer, this.q);
        clm.l(byteBuffer, this.r);
    }
    
    protected final void u(final ByteBuffer byteBuffer) {
        this.q = clm.v(byteBuffer);
        this.r = clm.u(byteBuffer);
    }
}
