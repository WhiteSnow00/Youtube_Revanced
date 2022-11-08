import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bre
{
    public final int a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private ardu[] f;
    
    public bre(final boolean b, final int n) {
        this(b, n, null);
    }
    
    public bre(final boolean b, final int a, final byte[] array) {
        dk.f(a > 0);
        dk.f(true);
        this.b = b;
        this.a = a;
        this.e = 0;
        this.f = new ardu[100];
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
            final int max = Math.max(0, baw.c(this.c, this.a) - this.d);
            final int e = this.e;
            if (max >= e) {
                return;
            }
            Arrays.fill(this.f, max, e, null);
            this.e = max;
        }
    }
    
    public final void e(bor o) {
        monitorenter(this);
        while (true) {
            Label_0077: {
                if (o == null) {
                    break Label_0077;
                }
                try {
                    final ardu[] f = this.f;
                    final int n = this.e++;
                    final ardu d = ((bor)o).d;
                    dk.d((Object)d);
                    f[n] = d;
                    --this.d;
                    final bor c = ((bor)o).c;
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
    
    public final ardu f() {
        synchronized (this) {
            ++this.d;
            int e = this.e;
            ardu ardu;
            if (e > 0) {
                final ardu[] f = this.f;
                --e;
                this.e = e;
                ardu = f[e];
                dk.d((Object)ardu);
                this.f[this.e] = null;
            }
            else {
                ardu = new ardu(new byte[this.a]);
                final int d = this.d;
                final ardu[] f2 = this.f;
                final int length = f2.length;
                if (d > length) {
                    this.f = Arrays.copyOf(f2, length + length);
                    return ardu;
                }
            }
            return ardu;
        }
    }
    
    public final void g(final ardu ardu) {
        synchronized (this) {
            this.f[this.e++] = ardu;
            --this.d;
            this.notifyAll();
        }
    }
}
