import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bri
{
    public final int a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private arjd[] f;
    
    public bri(final boolean b, final int n) {
        this(b, n, null);
    }
    
    public bri(final boolean b, final int a, final byte[] array) {
        bad.d(a > 0);
        bad.d(true);
        this.b = b;
        this.a = a;
        this.e = 0;
        this.f = new arjd[100];
    }
    
    public final int a() {
        synchronized (this) {
            return this.d * this.a;
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.b) {
                this.c(0);
            }
        }
    }
    
    public final void c(final int c) {
        synchronized (this) {
            final int c2 = this.c;
            this.c = c;
            if (c < c2) {
                this.d();
            }
        }
    }
    
    public final void d() {
        synchronized (this) {
            final int max = Math.max(0, baz.c(this.c, this.a) - this.d);
            final int e = this.e;
            if (max >= e) {
                return;
            }
            Arrays.fill(this.f, max, e, null);
            this.e = max;
        }
    }
    
    public final void e(bov o) {
        monitorenter(this);
        while (true) {
            Label_0073: {
                if (o == null) {
                    break Label_0073;
                }
                try {
                    final arjd[] f = this.f;
                    final int n = this.e++;
                    final arjd d = ((bov)o).d;
                    bad.b(d);
                    f[n] = d;
                    --this.d;
                    final bov c = ((bov)o).c;
                    if (c == null) {
                        continue;
                    }
                    o = c;
                    if (c.d == null) {
                        continue;
                    }
                    continue;
                    continue;
                    this.notifyAll();
                    monitorexit(this);
                }
                finally {
                    monitorexit(this);
                    while (true) {}
                }
            }
        }
    }
    
    public final arjd f() {
        synchronized (this) {
            ++this.d;
            int e = this.e;
            arjd arjd;
            if (e > 0) {
                final arjd[] f = this.f;
                --e;
                this.e = e;
                arjd = f[e];
                bad.b(arjd);
                this.f[this.e] = null;
            }
            else {
                arjd = new arjd(new byte[this.a]);
                final int d = this.d;
                final arjd[] f2 = this.f;
                final int length = f2.length;
                if (d > length) {
                    this.f = Arrays.copyOf(f2, length + length);
                    return arjd;
                }
            }
            return arjd;
        }
    }
    
    public final void g(final arjd arjd) {
        synchronized (this) {
            this.f[this.e++] = arjd;
            --this.d;
            this.notifyAll();
        }
    }
}
