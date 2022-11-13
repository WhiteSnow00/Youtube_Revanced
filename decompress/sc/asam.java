import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.nio.InvalidMarkException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asam extends arzf
{
    private static final asak b;
    private static final asak c;
    private static final asak d;
    private static final asak e;
    private static final asal f;
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;
    
    static {
        b = new asai(1);
        c = new asai(0);
        d = new asai(2);
        e = new asai(3);
        f = (asal)new asaj();
    }
    
    public asam() {
        this.g = new ArrayDeque();
    }
    
    public asam(final int n) {
        this.g = new ArrayDeque(n);
    }
    
    private final int m(final asal asal, int min, final Object o, final int n) {
        this.a(min);
        int n2 = min;
        int a = n;
        if (!this.g.isEmpty()) {
            this.p();
            a = n;
            n2 = min;
        }
        while (n2 > 0 && !this.g.isEmpty()) {
            final asei asei = this.g.peek();
            min = Math.min(n2, asei.f());
            a = asal.a(asei, min, o, a);
            n2 -= min;
            this.a -= min;
            this.p();
        }
        if (n2 <= 0) {
            return a;
        }
        throw new AssertionError((Object)"Failed executing read operation");
    }
    
    private final int n(final asak asak, int m, final Object o, final int n) {
        try {
            m = this.m((asal)asak, m, o, n);
            return m;
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    private final void o() {
        if (this.i) {
            this.h.add(this.g.remove());
            final asei asei = this.g.peek();
            if (asei != null) {
                asei.b();
            }
            return;
        }
        this.g.remove().close();
    }
    
    private final void p() {
        if (this.g.peek().f() == 0) {
            this.o();
        }
    }
    
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            this.h.remove().close();
        }
        this.i = true;
        final asei asei = this.g.peek();
        if (asei != null) {
            asei.b();
        }
    }
    
    public final void c() {
        if (this.i) {
            final asei asei = this.g.peek();
            if (asei != null) {
                final int f = asei.f();
                asei.c();
                this.a += asei.f() - f;
            }
            while (true) {
                final asei asei2 = this.h.pollLast();
                if (asei2 == null) {
                    break;
                }
                asei2.c();
                this.g.addFirst(asei2);
                this.a += asei2.f();
            }
            return;
        }
        throw new InvalidMarkException();
    }
    
    public final void close() {
        while (!this.g.isEmpty()) {
            this.g.remove().close();
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                this.h.remove().close();
            }
        }
    }
    
    public final boolean d() {
        final Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            if (!((asei)iterator.next()).d()) {
                return false;
            }
        }
        return true;
    }
    
    public final int e() {
        return this.n(asam.b, 1, null, 0);
    }
    
    public final int f() {
        return this.a;
    }
    
    public final asei g(int n) {
        if (n <= 0) {
            return asem.a;
        }
        this.a(n);
        this.a -= n;
        asei asei = null;
        Object o = null;
        do {
            final asei asei2 = this.g.peek();
            final int f = asei2.f();
            asei asei3;
            if (f > n) {
                asei3 = asei2.g(n);
                n = 0;
            }
            else {
                if (this.i) {
                    asei3 = asei2.g(f);
                    this.o();
                }
                else {
                    asei3 = this.g.poll();
                }
                n -= f;
            }
            if (asei == null) {
                asei = asei3;
            }
            else {
                Object o2 = asei;
                asam asam;
                if ((asam = (asam)o) == null) {
                    int min = 2;
                    if (n != 0) {
                        min = Math.min(this.g.size() + 2, 16);
                    }
                    asam = new asam(min);
                    asam.h(asei);
                    o2 = asam;
                }
                asam.h(asei3);
                o = asam;
                asei = (asei)o2;
            }
        } while (n > 0);
        return asei;
    }
    
    public final void h(asei asei) {
        final boolean b = this.i && this.g.isEmpty();
        if (!(asei instanceof asam)) {
            this.g.add(asei);
            this.a += asei.f();
        }
        else {
            final asam asam = (asam)asei;
            while (!asam.g.isEmpty()) {
                asei = (asei)asam.g.remove();
                this.g.add(asei);
            }
            this.a += asam.a;
            asam.a = 0;
            asam.close();
        }
        if (b) {
            this.g.peek().b();
        }
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.n(asam.e, byteBuffer.remaining(), byteBuffer, 0);
    }
    
    public final void j(final OutputStream outputStream, final int n) {
        this.m(asam.f, n, outputStream, 0);
    }
    
    public final void k(final byte[] array, final int n, final int n2) {
        this.n(asam.d, n2, array, n);
    }
    
    public final void l(final int n) {
        this.n(asam.c, n, null, 0);
    }
}
