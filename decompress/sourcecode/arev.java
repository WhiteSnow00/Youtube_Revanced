import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

@areo(b = { 6 })
public final class arev extends arek
{
    int a;
    
    public final void a(final ByteBuffer byteBuffer) {
        this.a = clm.v(byteBuffer);
    }
    
    public final void b() {
        this.a = 2;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a == ((arev)o).a);
    }
    
    public final int hashCode() {
        return this.a;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SLConfigDescriptor{predefined=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
