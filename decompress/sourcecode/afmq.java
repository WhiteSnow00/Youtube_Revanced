import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afmq extends afmd implements Serializable
{
    public static final afmi a;
    private static final long serialVersionUID = 0L;
    public final int b;
    private final boolean c;
    
    static {
        a = (afmi)new afmq(afml.a);
    }
    
    public afmq(final int b) {
        this.b = b;
        this.c = true;
    }
    
    public static int b(final int n) {
        return Integer.rotateLeft(n * -862048943, 15) * 461845907;
    }
    
    public final afmj a() {
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof afmq) {
            final afmq afmq = (afmq)o;
            if (this.b == afmq.b) {
                final boolean c = afmq.c;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.getClass().hashCode() ^ this.b;
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("Hashing.murmur3_32(");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
