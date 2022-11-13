import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afoq extends afod implements Serializable
{
    public static final afoi a;
    private static final long serialVersionUID = 0L;
    public final int b;
    private final boolean c;
    
    static {
        a = (afoi)new afoq(afol.a);
    }
    
    public afoq(final int b) {
        this.b = b;
        this.c = true;
    }
    
    public static int b(final int n) {
        return Integer.rotateLeft(n * -862048943, 15) * 461845907;
    }
    
    public final afoj a() {
        throw null;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof afoq) {
            final afoq afoq = (afoq)o;
            if (this.b == afoq.b) {
                final boolean c = afoq.c;
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return this.getClass().hashCode() ^ this.b;
    }
    
    public final String toString() {
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("Hashing.murmur3_32(");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
