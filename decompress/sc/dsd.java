import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsd extends drw
{
    private long b;
    private int c;
    private int d;
    private int[] e;
    private dsb f;
    private dsc g;
    
    public dsd() {
        super("tx3g");
        this.e = new int[4];
        this.f = new dsb();
        this.g = new dsc();
    }
    
    public dsd(final String s) {
        super(s);
        this.e = new int[4];
        this.f = new dsb();
        this.g = new dsc();
    }
    
    public final long b() {
        final long n = ((arfw)this).u() + 38L;
        final boolean o = this.o;
        int n2 = 16;
        if (!o) {
            if (n >= 4294967296L) {
                n2 = n2;
            }
            else {
                n2 = 8;
            }
        }
        return n + n2;
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write(((arft)this).s());
        final ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        cln.k(allocate, this.a);
        cln.m(allocate, this.b);
        cln.n(allocate, this.c);
        cln.n(allocate, this.d);
        cln.n(allocate, this.e[0]);
        cln.n(allocate, this.e[1]);
        cln.n(allocate, this.e[2]);
        cln.n(allocate, this.e[3]);
        final dsb f = this.f;
        cln.k(allocate, f.a);
        cln.k(allocate, f.b);
        cln.k(allocate, f.c);
        cln.k(allocate, f.d);
        final dsc g = this.g;
        cln.k(allocate, g.a);
        cln.k(allocate, g.b);
        cln.k(allocate, g.c);
        cln.n(allocate, g.d);
        cln.n(allocate, g.e);
        cln.n(allocate, g.f[0]);
        cln.n(allocate, g.f[1]);
        cln.n(allocate, g.f[2]);
        cln.n(allocate, g.f[3]);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        ((arfw)this).k(writableByteChannel);
    }
    
    public final void f(final arfx arfx, ByteBuffer allocate, final long n, final dpr dpr) {
        allocate = ByteBuffer.allocate(38);
        arfx.a(allocate);
        allocate.position(6);
        this.a = cln.t(allocate);
        this.b = cln.w(allocate);
        this.c = cln.v(allocate);
        this.d = cln.v(allocate);
        (this.e = new int[4])[0] = cln.v(allocate);
        this.e[1] = cln.v(allocate);
        this.e[2] = cln.v(allocate);
        this.e[3] = cln.v(allocate);
        final dsb f = new dsb();
        this.f = f;
        f.a = cln.t(allocate);
        f.b = cln.t(allocate);
        f.c = cln.t(allocate);
        f.d = cln.t(allocate);
        final dsc g = new dsc();
        this.g = g;
        g.a = cln.t(allocate);
        g.b = cln.t(allocate);
        g.c = cln.t(allocate);
        g.d = cln.v(allocate);
        g.e = cln.v(allocate);
        (g.f = new int[4])[0] = cln.v(allocate);
        g.f[1] = cln.v(allocate);
        g.f[2] = cln.v(allocate);
        g.f[3] = cln.v(allocate);
        ((arfw)this).t(arfx, n - 38L, dpr);
    }
    
    public final String toString() {
        return "TextSampleEntry";
    }
}
