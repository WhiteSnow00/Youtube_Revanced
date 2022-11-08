import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class drw implements dpu
{
    final /* synthetic */ long a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ drx c;
    
    public drw(final drx c, final long a, final ByteBuffer b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        return 0L;
    }
    
    public final long b() {
        return this.a;
    }
    
    public final dpz c() {
        return (dpz)this.c;
    }
    
    public final String d() {
        return "----";
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        this.b.rewind();
        writableByteChannel.write(this.b);
    }
    
    public final void f(final ardi ardi, final ByteBuffer byteBuffer, final long n, final dpq dpq) {
        throw new RuntimeException("NotImplemented");
    }
    
    public final void g(final dpz dpz) {
    }
}
