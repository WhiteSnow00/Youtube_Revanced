import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

@arhd(b = { 20 })
public final class arhj extends argz
{
    int a;
    
    public final void a(final ByteBuffer byteBuffer) {
        this.a = cln.v(byteBuffer);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a == ((arhj)o).a);
    }
    
    public final int hashCode() {
        return this.a;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=");
        sb.append(Integer.toHexString(this.a));
        sb.append('}');
        return sb.toString();
    }
}
