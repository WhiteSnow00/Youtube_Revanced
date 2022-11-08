import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public class arde extends ardh implements dpu
{
    private long a;
    public dpz m;
    public String n;
    protected boolean o;
    
    public arde() {
        this("dinf");
    }
    
    public arde(final String n) {
        this.n = n;
    }
    
    public arde(final byte[] array) {
        this("edts");
    }
    
    public final long a() {
        return this.a;
    }
    
    public long b() {
        final long u = this.u();
        final boolean o = this.o;
        int n = 16;
        if (!o) {
            if (8L + u >= 4294967296L) {
                n = n;
            }
            else {
                n = 8;
            }
        }
        return u + n;
    }
    
    public final dpz c() {
        return this.m;
    }
    
    public final String d() {
        return this.n;
    }
    
    public void e(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write(this.s());
        this.k(writableByteChannel);
    }
    
    public void f(final ardi ardi, final ByteBuffer byteBuffer, final long n, final dpq dpq) {
        this.a = ardi.b() - byteBuffer.remaining();
        this.o = (byteBuffer.remaining() == 16);
        this.t(ardi, n, dpq);
    }
    
    public final void g(final dpz m) {
        this.m = m;
    }
    
    protected final ByteBuffer s() {
        ByteBuffer byteBuffer;
        if (!this.o && this.b() < 4294967296L) {
            byteBuffer = ByteBuffer.wrap(new byte[] { 0, 0, 0, 0, this.n.getBytes()[0], this.n.getBytes()[1], this.n.getBytes()[2], this.n.getBytes()[3] });
            clm.m(byteBuffer, this.b());
        }
        else {
            byteBuffer = ByteBuffer.wrap(new byte[] { 0, 0, 0, 1, this.n.getBytes()[0], this.n.getBytes()[1], this.n.getBytes()[2], this.n.getBytes()[3], 0, 0, 0, 0, 0, 0, 0, 0 });
            byteBuffer.position(8);
            byteBuffer.putLong(this.b());
        }
        byteBuffer.rewind();
        return byteBuffer;
    }
    
    public final void t(final ardi r, final long n, final dpq q) {
        this.r = r;
        final long b = r.b();
        this.t = b;
        final boolean o = this.o;
        int n2 = 16;
        if (!o) {
            if (8L + n >= 4294967296L) {
                n2 = n2;
            }
            else {
                n2 = 8;
            }
        }
        this.u = b - n2;
        r.f(r.b() + n);
        this.v = r.b();
        this.q = q;
    }
}
