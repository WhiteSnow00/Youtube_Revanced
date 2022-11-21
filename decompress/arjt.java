import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

@arjx(b = { 0 })
public abstract class arjt
{
    int T;
    int U;
    int V;
    
    public abstract void a(final ByteBuffer p0);
    
    public final int c() {
        return this.U + 1 + this.V;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseDescriptor{tag=");
        sb.append(this.T);
        sb.append(", sizeOfInstance=");
        sb.append(this.U);
        sb.append('}');
        return sb.toString();
    }
}
