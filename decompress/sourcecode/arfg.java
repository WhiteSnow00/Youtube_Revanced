import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfg extends arey
{
    private ByteBuffer a;
    private final String b;
    
    public arfg(final String b) {
        this.b = b;
    }
    
    public final String a() {
        return this.b;
    }
    
    public final ByteBuffer b() {
        return this.a.duplicate();
    }
    
    public final void c(final ByteBuffer byteBuffer) {
        this.a = (ByteBuffer)byteBuffer.duplicate().rewind();
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arfg arfg = (arfg)o;
            final ByteBuffer a = this.a;
            if (a != null) {
                if (a.equals(arfg.a)) {
                    return true;
                }
            }
            else if (arfg.a == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public final int hashCode() {
        final ByteBuffer a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
    
    public final String toString() {
        final ByteBuffer duplicate = this.a.duplicate();
        duplicate.rewind();
        final byte[] array = new byte[duplicate.limit()];
        duplicate.get(array);
        final String a = dpr.a(array);
        final StringBuilder sb = new StringBuilder(a.length() + 22);
        sb.append("UnknownEntry{content=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
