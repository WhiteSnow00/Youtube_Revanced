import java.nio.channels.WritableByteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ardd implements dpu
{
    private static final arfn a;
    private ByteBuffer b;
    private ByteBuffer c;
    protected final String h;
    public byte[] i;
    public dpz j;
    boolean k;
    boolean l;
    long m;
    long n;
    long o;
    ardi p;
    
    static {
        a = arfn.d(ardd.class);
    }
    
    protected ardd(final String h) {
        this.o = -1L;
        this.c = null;
        this.h = h;
        this.l = true;
        this.k = true;
    }
    
    protected ardd(final byte[] i) {
        this.o = -1L;
        this.c = null;
        this.h = "uuid";
        this.i = i;
        this.l = true;
        this.k = true;
    }
    
    private final void k(final ByteBuffer byteBuffer) {
        if (this.m()) {
            clm.m(byteBuffer, this.b());
            byteBuffer.put(dps.b(this.h));
        }
        else {
            clm.m(byteBuffer, 1L);
            byteBuffer.put(dps.b(this.h));
            byteBuffer.putLong(this.b());
        }
        if ("uuid".equals(this.h)) {
            byteBuffer.put(this.i);
        }
    }
    
    private final void l() {
        synchronized (this) {
            if (!this.l) {
                try {
                    final arfn a = ardd.a;
                    final String h = this.h;
                    String concat;
                    if (h.length() != 0) {
                        concat = "mem mapping ".concat(h);
                    }
                    else {
                        concat = new String("mem mapping ");
                    }
                    a.a(concat);
                    this.b = this.p.e(this.m, this.o);
                    this.l = true;
                }
                catch (final IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
    
    private final boolean m() {
        int n;
        if (!"uuid".equals(this.h)) {
            n = 8;
        }
        else {
            n = 24;
        }
        if (!this.l) {
            return this.o + n < 4294967296L;
        }
        if (this.k) {
            final long h = this.h();
            final ByteBuffer c = this.c;
            int limit;
            if (c != null) {
                limit = c.limit();
            }
            else {
                limit = 0;
            }
            return h + limit + n < 4294967296L;
        }
        this.b.limit();
        return true;
    }
    
    @Override
    public final long a() {
        return this.n;
    }
    
    @Override
    public final long b() {
        final boolean l = this.l;
        final int n = 0;
        long n2;
        if (l) {
            if (this.k) {
                n2 = this.h();
            }
            else {
                final ByteBuffer b = this.b;
                int limit;
                if (b != null) {
                    limit = b.limit();
                }
                else {
                    limit = 0;
                }
                n2 = limit;
            }
        }
        else {
            n2 = this.o;
        }
        int n3;
        if (n2 >= 4294967288L) {
            n3 = 8;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (!"uuid".equals(this.h)) {
            n4 = 0;
        }
        else {
            n4 = 16;
        }
        final long n5 = n3 + 8 + n4;
        final ByteBuffer c = this.c;
        int limit2;
        if (c == null) {
            limit2 = n;
        }
        else {
            limit2 = c.limit();
        }
        return n2 + n5 + limit2;
    }
    
    @Override
    public final dpz c() {
        return this.j;
    }
    
    @Override
    public final String d() {
        return this.h;
    }
    
    @Override
    public final void e(final WritableByteChannel writableByteChannel) {
        final boolean l = this.l;
        int n = 8;
        int n2 = 0;
        final int n3 = 16;
        if (!l) {
            if (!this.m()) {
                n = 16;
            }
            if ("uuid".equals(this.h)) {
                n2 = 16;
            }
            final ByteBuffer allocate = ByteBuffer.allocate(n + n2);
            this.k(allocate);
            writableByteChannel.write((ByteBuffer)allocate.rewind());
            this.p.d(this.m, this.o, writableByteChannel);
            return;
        }
        if (this.k) {
            final ByteBuffer allocate2 = ByteBuffer.allocate(aqqm.q(this.b()));
            this.k(allocate2);
            this.j(allocate2);
            final ByteBuffer c = this.c;
            if (c != null) {
                c.rewind();
                while (this.c.remaining() > 0) {
                    allocate2.put(this.c);
                }
            }
            writableByteChannel.write((ByteBuffer)allocate2.rewind());
            return;
        }
        if (!this.m()) {
            n = 16;
        }
        int n4 = n3;
        if (!"uuid".equals(this.h)) {
            n4 = 0;
        }
        final ByteBuffer allocate3 = ByteBuffer.allocate(n + n4);
        this.k(allocate3);
        writableByteChannel.write((ByteBuffer)allocate3.rewind());
        writableByteChannel.write((ByteBuffer)this.b.position(0));
    }
    
    @Override
    public final void f(final ardi p4, final ByteBuffer byteBuffer, final long o, final dpq dpq) {
        final long b = p4.b();
        this.m = b;
        this.n = b - byteBuffer.remaining();
        this.o = o;
        (this.p = p4).f(p4.b() + o);
        this.l = false;
        this.k = false;
        this.q();
    }
    
    @Override
    public final void g(final dpz j) {
        this.j = j;
    }
    
    protected abstract long h();
    
    protected abstract void i(final ByteBuffer p0);
    
    protected abstract void j(final ByteBuffer p0);
    
    public final void q() {
        synchronized (this) {
            this.l();
            final arfn a = ardd.a;
            final String h = this.h;
            String concat;
            if (h.length() != 0) {
                concat = "parsing details of ".concat(h);
            }
            else {
                concat = new String("parsing details of ");
            }
            a.a(concat);
            final ByteBuffer b = this.b;
            if (b != null) {
                this.k = true;
                b.rewind();
                this.i(b);
                if (b.remaining() > 0) {
                    this.c = b.slice();
                }
                this.b = null;
            }
        }
    }
}
