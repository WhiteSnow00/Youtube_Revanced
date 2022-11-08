import java.util.Collection;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.nio.channels.WritableByteChannel;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.io.Closeable;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class ardh implements Iterator, Closeable, dpz
{
    public static final dpu p;
    protected dpq q;
    public ardi r;
    public dpu s;
    long t;
    long u;
    long v;
    public List w;
    
    static {
        p = (dpu)new ardg();
        arfn.d(ardh.class);
    }
    
    public ardh() {
        this.s = null;
        this.t = 0L;
        this.u = 0L;
        this.v = 0L;
        this.w = new ArrayList();
    }
    
    @Override
    public void close() {
        this.r.close();
    }
    
    @Override
    public final ByteBuffer h(final long n, long n2) {
        final ardi r = this.r;
        if (r != null) {
            synchronized (r) {
                return this.r.e(this.u + n, n2);
            }
        }
        final ByteBuffer allocate = ByteBuffer.allocate(aqqm.q(n2));
        final long n3 = n + n2;
        final Iterator iterator = this.w.iterator();
        n2 = 0L;
        while (iterator.hasNext()) {
            final dpu dpu = (dpu)iterator.next();
            final long n4 = dpu.b() + n2;
            if (n4 > n && n2 < n3) {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final WritableByteChannel channel = Channels.newChannel(byteArrayOutputStream);
                dpu.e(channel);
                channel.close();
                if (n2 >= n && n4 <= n3) {
                    allocate.put(byteArrayOutputStream.toByteArray());
                }
                else if (n2 < n && n4 > n3) {
                    final long b = dpu.b();
                    n2 = n - n2;
                    allocate.put(byteArrayOutputStream.toByteArray(), aqqm.q(n2), aqqm.q(b - n2 - (n4 - n3)));
                }
                else if (n2 < n && n4 <= n3) {
                    final long b2 = dpu.b();
                    n2 = n - n2;
                    allocate.put(byteArrayOutputStream.toByteArray(), aqqm.q(n2), aqqm.q(b2 - n2));
                }
                else if (n2 >= n && n4 > n3) {
                    allocate.put(byteArrayOutputStream.toByteArray(), 0, aqqm.q(dpu.b() - (n4 - n3)));
                }
            }
            n2 = n4;
        }
        return (ByteBuffer)allocate.rewind();
    }
    
    @Override
    public final boolean hasNext() {
        final dpu s = this.s;
        if (s == ardh.p) {
            return false;
        }
        if (s != null) {
            return true;
        }
        try {
            this.s = this.v();
            return true;
        }
        catch (final NoSuchElementException ex) {
            this.s = ardh.p;
            return false;
        }
    }
    
    @Override
    public final List i() {
        if (this.r != null && this.s != ardh.p) {
            return new arfm(this.w, this);
        }
        return this.w;
    }
    
    @Override
    public final List j(final Class clazz) {
        final List i = this.i();
        List<dpu> list = null;
        dpu dpu = null;
        List<dpu> list2;
        dpu dpu3;
        for (int j = 0; j < i.size(); ++j, list = list2, dpu = dpu3) {
            final dpu dpu2 = i.get(j);
            list2 = list;
            dpu3 = dpu;
            if (clazz.isInstance(dpu2)) {
                if (dpu == null) {
                    dpu3 = dpu2;
                    list2 = list;
                }
                else {
                    if ((list2 = list) == null) {
                        list2 = new ArrayList<dpu>(2);
                        list2.add(dpu);
                    }
                    list2.add(dpu2);
                    dpu3 = dpu;
                }
            }
        }
        if (list != null) {
            return list;
        }
        if (dpu != null) {
            return Collections.singletonList(dpu);
        }
        return Collections.emptyList();
    }
    
    @Override
    public final void k(final WritableByteChannel writableByteChannel) {
        final Iterator iterator = this.i().iterator();
        while (iterator.hasNext()) {
            ((dpu)iterator.next()).e(writableByteChannel);
        }
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
    
    public void t(final ardi r, final long n, final dpq q) {
        this.r = r;
        final long b = r.b();
        this.u = b;
        this.t = b;
        r.f(r.b() + n);
        this.v = r.b();
        this.q = q;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.w.size(); ++i) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((dpu)this.w.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
    
    protected final long u() {
        long n = 0L;
        for (int i = 0; i < this.i().size(); ++i) {
            n += ((dpu)this.w.get(i)).b();
        }
        return n;
    }
    
    public final dpu v() {
        final dpu s = this.s;
        if (s != null && s != ardh.p) {
            this.s = null;
            return s;
        }
        final ardi r = this.r;
        if (r != null && this.t < this.v) {
            try {
                synchronized (r) {
                    this.r.f(this.t);
                    final dpu a = this.q.a(this.r, this);
                    this.t = this.r.b();
                    return a;
                }
            }
            catch (final IOException ex) {
                throw new NoSuchElementException();
            }
            catch (final EOFException ex2) {
                throw new NoSuchElementException();
            }
        }
        this.s = ardh.p;
        throw new NoSuchElementException();
    }
    
    public final void w(final dpu dpu) {
        if (dpu != null) {
            this.w = new ArrayList(this.i());
            dpu.g(this);
            this.w.add(dpu);
        }
    }
    
    public final List x(final Class clazz) {
        final ArrayList list = new ArrayList(2);
        final List i = this.i();
        for (int j = 0; j < i.size(); ++j) {
            final dpu dpu = i.get(j);
            if (clazz.isInstance(dpu)) {
                list.add(dpu);
            }
        }
        return list;
    }
}
