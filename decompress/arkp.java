import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkp extends arkh
{
    private ByteBuffer a;
    private final String b;
    
    public arkp(final String b) {
        this.b = b;
    }
    
    @Override
    public final String a() {
        return this.b;
    }
    
    @Override
    public final ByteBuffer b() {
        return this.a.duplicate();
    }
    
    @Override
    public final void c(final ByteBuffer byteBuffer) {
        this.a = (ByteBuffer)byteBuffer.duplicate().rewind();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arkp arkp = (arkp)o;
            final ByteBuffer a = this.a;
            if (a != null) {
                if (a.equals(arkp.a)) {
                    return true;
                }
            }
            else if (arkp.a == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final ByteBuffer a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
    
    @Override
    public final String toString() {
        final ByteBuffer duplicate = this.a.duplicate();
        duplicate.rewind();
        final byte[] array = new byte[duplicate.limit()];
        duplicate.get(array);
        final String a = dpv.a(array);
        final StringBuilder sb = new StringBuilder(a.length() + 22);
        sb.append("UnknownEntry{content=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
