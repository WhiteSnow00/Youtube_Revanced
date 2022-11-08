import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dor implements ddj
{
    private final Object b;
    
    public dor(final Object b) {
        cll.h(b);
        this.b = b;
    }
    
    public final void a(final MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(dor.a));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof dor && this.b.equals(((dor)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("ObjectKey{object=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
