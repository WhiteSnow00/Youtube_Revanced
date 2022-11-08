import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqb extends arde implements dpu
{
    private int a;
    private int b;
    
    public dqb() {
        super("dref");
    }
    
    @Override
    public final long b() {
        final long u = this.u();
        final boolean o = this.o;
        int n = 16;
        if (!o) {
            if (u + 16L >= 4294967296L) {
                n = n;
            }
            else {
                n = 8;
            }
        }
        return 8L + u + n;
    }
    
    @Override
    public final void e(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write(this.s());
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        clm.n(allocate, this.a);
        clm.l(allocate, this.b);
        clm.m(allocate, (long)this.i().size());
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        this.k(writableByteChannel);
    }
    
    @Override
    public final void f(final ardi ardi, ByteBuffer allocate, final long n, final dpq dpq) {
        allocate = ByteBuffer.allocate(8);
        ardi.a(allocate);
        allocate.rewind();
        this.a = clm.v(allocate);
        this.b = clm.u(allocate);
        this.t(ardi, n - 8L, dpq);
    }
}
