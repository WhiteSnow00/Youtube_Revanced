import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfz extends drv
{
    private String b;
    private String c;
    private String d;
    
    public arfz() {
        super("stpp");
        this.b = "";
        this.c = "";
        this.d = "";
    }
    
    public final long b() {
        final long u = ((ardh)this).u();
        final int length = this.b.length();
        int n = 8;
        final long n2 = u + (length + 8 + this.c.length() + this.d.length() + 3);
        if (this.o || 8L + n2 >= 4294967296L) {
            n = 16;
        }
        return n2 + n;
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write(((arde)this).s());
        final ByteBuffer allocate = ByteBuffer.allocate(this.b.length() + 8 + this.c.length() + this.d.length() + 3);
        allocate.position(6);
        clm.k(allocate, this.a);
        clm.o(allocate, this.b);
        clm.o(allocate, this.c);
        clm.o(allocate, this.d);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        ((ardh)this).k(writableByteChannel);
    }
    
    public final void f(final ardi ardi, final ByteBuffer byteBuffer, final long n, final dpq dpq) {
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        ardi.a((ByteBuffer)allocate.rewind());
        allocate.position(6);
        this.a = clm.t(allocate);
        final long b = ardi.b();
        final ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        ardi.a((ByteBuffer)allocate2.rewind());
        final String z = clm.z((ByteBuffer)allocate2.rewind());
        this.b = z;
        ardi.f(z.length() + b + 1L);
        ardi.a((ByteBuffer)allocate2.rewind());
        this.c = clm.z((ByteBuffer)allocate2.rewind());
        ardi.f(this.b.length() + b + this.c.length() + 2L);
        ardi.a((ByteBuffer)allocate2.rewind());
        this.d = clm.z((ByteBuffer)allocate2.rewind());
        ardi.f(b + this.b.length() + this.c.length() + this.d.length() + 3L);
        ((ardh)this).t(ardi, n - (byteBuffer.remaining() + this.b.length() + this.c.length() + this.d.length() + 3), dpq);
    }
}
