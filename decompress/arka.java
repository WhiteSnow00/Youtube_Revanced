import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

@arjx(b = { 19 })
public final class arka extends arjt
{
    byte[] a;
    
    @Override
    public final void a(final ByteBuffer byteBuffer) {
        if (this.c() > 0) {
            byteBuffer.get(this.a = new byte[this.c()]);
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExtensionDescriptor{bytes=");
        final byte[] a = this.a;
        String a2;
        if (a == null) {
            a2 = "null";
        }
        else {
            a2 = dpv.a(a);
        }
        sb.append(a2);
        sb.append('}');
        return sb.toString();
    }
}
