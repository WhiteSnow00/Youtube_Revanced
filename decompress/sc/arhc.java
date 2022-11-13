import java.util.Arrays;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

@arhd(b = { 5 })
public final class arhc extends argz
{
    byte[] a;
    
    public final void a(final ByteBuffer byteBuffer) {
        final int u = this.U;
        if (u > 0) {
            byteBuffer.get(this.a = new byte[u]);
        }
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Arrays.equals(this.a, ((arhc)o).a));
    }
    
    public final int hashCode() {
        final byte[] a = this.a;
        if (a != null) {
            return Arrays.hashCode(a);
        }
        return 0;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DecoderSpecificInfo{bytes=");
        final byte[] a = this.a;
        String a2;
        if (a == null) {
            a2 = "null";
        }
        else {
            a2 = dps.a(a);
        }
        sb.append(a2);
        sb.append('}');
        return sb.toString();
    }
}
