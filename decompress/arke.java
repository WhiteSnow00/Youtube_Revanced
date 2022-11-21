import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

@arjx(b = { 6 })
public final class arke extends arjt
{
    int a;
    
    @Override
    public final void a(final ByteBuffer byteBuffer) {
        this.a = coh.i(byteBuffer);
    }
    
    public final void b() {
        this.a = 2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a == ((arke)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SLConfigDescriptor{predefined=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
