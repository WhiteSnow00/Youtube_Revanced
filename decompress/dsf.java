import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsf extends drw implements dqa
{
    public int b;
    public int c;
    public double d;
    public double e;
    public int f;
    public String g;
    public int h;
    private final long[] i;
    
    public dsf() {
        super("avc1");
        this.d = 72.0;
        this.e = 72.0;
        this.f = 1;
        this.g = "";
        this.h = 24;
        this.i = new long[3];
    }
    
    public dsf(final String s) {
        super(s);
        this.d = 72.0;
        this.e = 72.0;
        this.f = 1;
        this.g = "";
        this.h = 24;
        this.i = new long[3];
    }
    
    public final long b() {
        final long u = ((arfw)this).u();
        final boolean o = this.o;
        int n = 16;
        if (!o) {
            if (u + 86L >= 4294967296L) {
                n = n;
            }
            else {
                n = 8;
            }
        }
        return 78L + u + n;
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write(((arft)this).s());
        final ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        cln.k(allocate, this.a);
        cln.k(allocate, 0);
        cln.k(allocate, 0);
        cln.m(allocate, this.i[0]);
        cln.m(allocate, this.i[1]);
        cln.m(allocate, this.i[2]);
        cln.k(allocate, this.b);
        cln.k(allocate, this.c);
        cln.i(allocate, this.d);
        cln.i(allocate, this.e);
        cln.m(allocate, 0L);
        cln.k(allocate, this.f);
        cln.n(allocate, coe.d(this.g));
        allocate.put(coe.f(this.g));
        for (int i = coe.d(this.g); i < 31; ++i) {
            allocate.put((byte)0);
        }
        cln.k(allocate, this.h);
        cln.k(allocate, 65535);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        ((arfw)this).k(writableByteChannel);
    }
    
    public final void f(final arfx arfx, ByteBuffer allocate, final long n, final dpr dpr) {
        final long b = arfx.b();
        allocate = ByteBuffer.allocate(78);
        arfx.a(allocate);
        allocate.position(6);
        this.a = cln.t(allocate);
        cln.t(allocate);
        cln.t(allocate);
        this.i[0] = cln.w(allocate);
        this.i[1] = cln.w(allocate);
        this.i[2] = cln.w(allocate);
        this.b = cln.t(allocate);
        this.c = cln.t(allocate);
        this.d = cln.q(allocate);
        this.e = cln.q(allocate);
        cln.w(allocate);
        this.f = cln.t(allocate);
        int v;
        final int n2 = v = cln.v(allocate);
        if (n2 > 31) {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder(53);
            sb.append("invalid compressor name displayable data: ");
            sb.append(n2);
            out.println(sb.toString());
            v = 31;
        }
        final byte[] array = new byte[v];
        allocate.get(array);
        this.g = coe.e(array);
        if (v < 31) {
            allocate.get(new byte[31 - v]);
        }
        this.h = cln.t(allocate);
        cln.t(allocate);
        ((arfw)this).t((arfx)new dse(b + n, arfx), n - 78L, dpr);
    }
}
