import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

@arjx(b = { 20 })
public final class arkd extends arjt
{
    int a;
    
    @Override
    public final void a(final ByteBuffer byteBuffer) {
        this.a = coh.i(byteBuffer);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a == ((arkd)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=");
        sb.append(Integer.toHexString(this.a));
        sb.append('}');
        return sb.toString();
    }
}
