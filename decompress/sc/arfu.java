import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arfu extends arfs implements dpv
{
    public int q;
    public int r;
    
    protected arfu(final String s) {
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
        cln.n(byteBuffer, this.q);
        cln.l(byteBuffer, this.r);
    }
    
    protected final void u(final ByteBuffer byteBuffer) {
        this.q = cln.v(byteBuffer);
        this.r = cln.u(byteBuffer);
    }
}
