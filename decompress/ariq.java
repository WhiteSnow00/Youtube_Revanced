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

public class ariq implements Iterator, Closeable, dqd
{
    public static final dpy p;
    protected dpu q;
    public arir r;
    public dpy s;
    long t;
    long u;
    long v;
    public List w;
    
    static {
        p = (dpy)new arip();
        arkw.d(ariq.class);
    }
    
    public ariq() {
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
    
    public final ByteBuffer h(final long n, long n2) {
        final arir r = this.r;
        if (r != null) {
            synchronized (r) {
                return this.r.e(this.u + n, n2);
            }
        }
        final ByteBuffer allocate = ByteBuffer.allocate(aqvs.o(n2));
        final long n3 = n + n2;
        final Iterator iterator = this.w.iterator();
        n2 = 0L;
        while (iterator.hasNext()) {
            final dpy dpy = (dpy)iterator.next();
            final long n4 = dpy.b() + n2;
            if (n4 > n && n2 < n3) {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final WritableByteChannel channel = Channels.newChannel(byteArrayOutputStream);
                dpy.e(channel);
                channel.close();
                if (n2 >= n && n4 <= n3) {
                    allocate.put(byteArrayOutputStream.toByteArray());
                }
                else if (n2 < n && n4 > n3) {
                    final long b = dpy.b();
                    n2 = n - n2;
                    allocate.put(byteArrayOutputStream.toByteArray(), aqvs.o(n2), aqvs.o(b - n2 - (n4 - n3)));
                }
                else if (n2 < n && n4 <= n3) {
                    final long b2 = dpy.b();
                    n2 = n - n2;
                    allocate.put(byteArrayOutputStream.toByteArray(), aqvs.o(n2), aqvs.o(b2 - n2));
                }
                else if (n2 >= n && n4 > n3) {
                    allocate.put(byteArrayOutputStream.toByteArray(), 0, aqvs.o(dpy.b() - (n4 - n3)));
                }
            }
            n2 = n4;
        }
        return (ByteBuffer)allocate.rewind();
    }
    
    @Override
    public final boolean hasNext() {
        final dpy s = this.s;
        if (s == ariq.p) {
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
            this.s = ariq.p;
            return false;
        }
    }
    
    public final List i() {
        if (this.r != null && this.s != ariq.p) {
            return new arkv(this.w, this);
        }
        return this.w;
    }
    
    public final List j(final Class clazz) {
        final List i = this.i();
        int j = 0;
        List<dpy> list = null;
        dpy dpy = null;
        while (j < i.size()) {
            final dpy dpy2 = i.get(j);
            List<dpy> list2 = list;
            dpy dpy3 = dpy;
            if (clazz.isInstance(dpy2)) {
                if (dpy == null) {
                    dpy3 = dpy2;
                    list2 = list;
                }
                else {
                    if ((list2 = list) == null) {
                        list2 = new ArrayList<dpy>(2);
                        list2.add(dpy);
                    }
                    list2.add(dpy2);
                    dpy3 = dpy;
                }
            }
            ++j;
            list = list2;
            dpy = dpy3;
        }
        if (list != null) {
            return list;
        }
        if (dpy != null) {
            return Collections.singletonList(dpy);
        }
        return Collections.emptyList();
    }
    
    public final void k(final WritableByteChannel writableByteChannel) {
        final Iterator iterator = this.i().iterator();
        while (iterator.hasNext()) {
            ((dpy)iterator.next()).e(writableByteChannel);
        }
    }
    
    @Override
    public final /* bridge */ Object next() {
        return this.v();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
    
    public void t(final arir r, final long n, final dpu q) {
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
            sb.append(((dpy)this.w.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
    
    protected final long u() {
        int i = 0;
        long n = 0L;
        while (i < this.i().size()) {
            n += this.w.get(i).b();
            ++i;
        }
        return n;
    }
    
    public final dpy v() {
        final dpy s = this.s;
        if (s != null && s != ariq.p) {
            this.s = null;
            return s;
        }
        final arir r = this.r;
        if (r != null && this.t < this.v) {
            try {
                synchronized (r) {
                    this.r.f(this.t);
                    final dpy a = this.q.a(this.r, (dqd)this);
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
        this.s = ariq.p;
        throw new NoSuchElementException();
    }
    
    public final void w(final dpy dpy) {
        if (dpy != null) {
            this.w = new ArrayList(this.i());
            dpy.g((dqd)this);
            this.w.add(dpy);
        }
    }
    
    public final List x(final Class clazz) {
        final ArrayList list = new ArrayList(2);
        final List i = this.i();
        for (int j = 0; j < i.size(); ++j) {
            final dpy dpy = i.get(j);
            if (clazz.isInstance(dpy)) {
                list.add(dpy);
            }
        }
        return list;
    }
}
