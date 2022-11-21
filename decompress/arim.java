import java.nio.channels.WritableByteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arim implements dpy
{
    private static final arkw a;
    private ByteBuffer b;
    private ByteBuffer c;
    protected final String h;
    public byte[] i;
    public dqd j;
    boolean k;
    boolean l;
    long m;
    long n;
    long o;
    arir p;
    
    static {
        a = arkw.d(arim.class);
    }
    
    protected arim(final String h) {
        this.o = -1L;
        this.c = null;
        this.h = h;
        this.l = true;
        this.k = true;
    }
    
    protected arim(final byte[] i) {
        this.o = -1L;
        this.c = null;
        this.h = "uuid";
        this.i = i;
        this.l = true;
        this.k = true;
    }
    
    private final void k(final ByteBuffer byteBuffer) {
        if (this.m()) {
            cop.k(byteBuffer, this.b());
            byteBuffer.put(dpw.b(this.h));
        }
        else {
            cop.k(byteBuffer, 1L);
            byteBuffer.put(dpw.b(this.h));
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
                    final arkw a = arim.a;
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
    
    public final long a() {
        return this.n;
    }
    
    public final long b() {
        final boolean l = this.l;
        int limit = 0;
        long n;
        if (l) {
            if (this.k) {
                n = this.h();
            }
            else {
                final ByteBuffer b = this.b;
                int limit2;
                if (b != null) {
                    limit2 = b.limit();
                }
                else {
                    limit2 = 0;
                }
                n = limit2;
            }
        }
        else {
            n = this.o;
        }
        int n2;
        if (n >= 4294967288L) {
            n2 = 8;
        }
        else {
            n2 = 0;
        }
        int n3;
        if (!"uuid".equals(this.h)) {
            n3 = 0;
        }
        else {
            n3 = 16;
        }
        final ByteBuffer c = this.c;
        if (c != null) {
            limit = c.limit();
        }
        return n + (n2 + 8 + n3) + limit;
    }
    
    public final dqd c() {
        return this.j;
    }
    
    public final String d() {
        return this.h;
    }
    
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
            final ByteBuffer allocate2 = ByteBuffer.allocate(aqvs.o(this.b()));
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
    
    public final void f(final arir p4, final ByteBuffer byteBuffer, final long o, final dpu dpu) {
        final long b = p4.b();
        this.m = b;
        this.n = b - byteBuffer.remaining();
        this.o = o;
        (this.p = p4).f(p4.b() + o);
        this.l = false;
        this.k = false;
        this.q();
    }
    
    public final void g(final dqd j) {
        this.j = j;
    }
    
    protected abstract long h();
    
    protected abstract void i(final ByteBuffer p0);
    
    protected abstract void j(final ByteBuffer p0);
    
    public final void q() {
        synchronized (this) {
            this.l();
            final arkw a = arim.a;
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
