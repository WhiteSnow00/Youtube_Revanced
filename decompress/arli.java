import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arli extends drz
{
    private String b;
    private String c;
    private String d;
    
    public arli() {
        super("stpp");
        this.b = "";
        this.c = "";
        this.d = "";
    }
    
    public final long b() {
        final long u = ((ariq)this).u();
        final int length = this.b.length();
        int n = 8;
        final long n2 = u + (length + 8 + this.c.length() + this.d.length() + 3);
        if (this.o || 8L + n2 >= 4294967296L) {
            n = 16;
        }
        return n2 + n;
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write(((arin)this).s());
        final ByteBuffer allocate = ByteBuffer.allocate(this.b.length() + 8 + this.c.length() + this.d.length() + 3);
        allocate.position(6);
        cop.i(allocate, this.a);
        cop.m(allocate, this.b);
        cop.m(allocate, this.c);
        cop.m(allocate, this.d);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        ((ariq)this).k(writableByteChannel);
    }
    
    public final void f(final arir arir, final ByteBuffer byteBuffer, final long n, final dpu dpu) {
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        arir.a((ByteBuffer)allocate.rewind());
        allocate.position(6);
        this.a = coh.g(allocate);
        final long b = arir.b();
        final ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        arir.a((ByteBuffer)allocate2.rewind());
        final String m = coh.m((ByteBuffer)allocate2.rewind());
        this.b = m;
        arir.f(m.length() + b + 1L);
        arir.a((ByteBuffer)allocate2.rewind());
        this.c = coh.m((ByteBuffer)allocate2.rewind());
        arir.f(this.b.length() + b + this.c.length() + 2L);
        arir.a((ByteBuffer)allocate2.rewind());
        this.d = coh.m((ByteBuffer)allocate2.rewind());
        arir.f(b + this.b.length() + this.c.length() + this.d.length() + 3L);
        ((ariq)this).t(arir, n - (byteBuffer.remaining() + this.b.length() + this.c.length() + this.d.length() + 3), dpu);
    }
}
