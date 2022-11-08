import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drt implements dpu
{
    dpz a;
    private ardi b;
    private long c;
    private long d;
    
    static {
        Logger.getLogger(drt.class.getName());
    }
    
    public final long a() {
        return this.c;
    }
    
    public final long b() {
        return this.d;
    }
    
    public final dpz c() {
        return this.a;
    }
    
    public final String d() {
        return "mdat";
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        final ardi b = this.b;
        for (long c = this.c, d = this.d, n = 0L; n < d; n += b.d(c + n, Math.min(67076096L, d - n), writableByteChannel)) {}
    }
    
    public final void f(final ardi b, final ByteBuffer byteBuffer, final long n, final dpq dpq) {
        this.c = b.b() - byteBuffer.remaining();
        this.b = b;
        this.d = byteBuffer.remaining() + n;
        b.f(b.b() + n);
    }
    
    public final void g(final dpz a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final long d = this.d;
        final StringBuilder sb = new StringBuilder(39);
        sb.append("MediaDataBox{size=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
