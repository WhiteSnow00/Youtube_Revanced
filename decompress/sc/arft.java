import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public class arft extends arfw implements dpv
{
    private long a;
    public dqa m;
    public String n;
    protected boolean o;
    
    public arft() {
        this("dinf");
    }
    
    public arft(final String n) {
        this.n = n;
    }
    
    public arft(final byte[] array) {
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
    
    public final dqa c() {
        return this.m;
    }
    
    public final String d() {
        return this.n;
    }
    
    public void e(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write(this.s());
        this.k(writableByteChannel);
    }
    
    public void f(final arfx arfx, final ByteBuffer byteBuffer, final long n, final dpr dpr) {
        this.a = arfx.b() - byteBuffer.remaining();
        this.o = (byteBuffer.remaining() == 16);
        this.t(arfx, n, dpr);
    }
    
    public final void g(final dqa m) {
        this.m = m;
    }
    
    protected final ByteBuffer s() {
        ByteBuffer byteBuffer;
        if (!this.o && this.b() < 4294967296L) {
            byteBuffer = ByteBuffer.wrap(new byte[] { 0, 0, 0, 0, this.n.getBytes()[0], this.n.getBytes()[1], this.n.getBytes()[2], this.n.getBytes()[3] });
            cln.m(byteBuffer, this.b());
        }
        else {
            byteBuffer = ByteBuffer.wrap(new byte[] { 0, 0, 0, 1, this.n.getBytes()[0], this.n.getBytes()[1], this.n.getBytes()[2], this.n.getBytes()[3], 0, 0, 0, 0, 0, 0, 0, 0 });
            byteBuffer.position(8);
            byteBuffer.putLong(this.b());
        }
        byteBuffer.rewind();
        return byteBuffer;
    }
    
    public final void t(final arfx r, final long n, final dpr q) {
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
