import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqf implements dpu
{
    ByteBuffer a;
    final List b;
    private dpz c;
    private long d;
    
    public dqf() {
        this.b = new LinkedList();
        this.a = ByteBuffer.wrap(new byte[0]);
    }
    
    public final long a() {
        return this.d;
    }
    
    public final long b() {
        final Iterator iterator = this.b.iterator();
        long n = 8L;
        while (iterator.hasNext()) {
            n += ((dpu)iterator.next()).b();
        }
        return n + this.a.limit();
    }
    
    public final dpz c() {
        return this.c;
    }
    
    public final String d() {
        return "free";
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((dpu)iterator.next()).e(writableByteChannel);
        }
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        clm.m(allocate, (long)(this.a.limit() + 8));
        allocate.put("free".getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.a.rewind();
        writableByteChannel.write(this.a);
        this.a.rewind();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final dqf dqf = (dqf)o;
            if (this.h() != null) {
                if (this.h().equals(dqf.h())) {
                    return true;
                }
            }
            else if (dqf.h() == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public final void f(final ardi ardi, ByteBuffer allocate, final long n, final dpq dpq) {
        this.d = ardi.b() - allocate.remaining();
        if (n > 1048576L) {
            this.a = ardi.e(ardi.b(), n);
            ardi.f(ardi.b() + n);
            return;
        }
        allocate = ByteBuffer.allocate(aqqm.q(n));
        ardi.a(this.a = allocate);
    }
    
    public final void g(final dpz c) {
        this.c = c;
    }
    
    public final ByteBuffer h() {
        final ByteBuffer a = this.a;
        if (a != null) {
            return (ByteBuffer)a.duplicate().rewind();
        }
        return null;
    }
    
    @Override
    public final int hashCode() {
        final ByteBuffer a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
}
