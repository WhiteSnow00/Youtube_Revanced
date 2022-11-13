import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class atgk implements athg
{
    final int a;
    long b;
    final atha[] c;
    
    public atgk(final int a, final ThreadFactory threadFactory) {
        this.a = a;
        this.c = new atha[a];
        for (int i = 0; i < a; ++i) {
            this.c[i] = new atha(threadFactory);
        }
    }
    
    public final void a() {
        final atha[] c = this.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            c[i].dispose();
        }
    }
    
    public final void b(final int n, final ateg ateg) {
        final int a = this.a;
        int i = 0;
        if (a == 0) {
            while (i < n) {
                ateg.a(i, (asic)atgl.g);
                ++i;
            }
            return;
        }
        int n2 = (int)this.b % a;
        for (int j = 0; j < n; ++j) {
            ateg.a(j, (asic)new atgj(this.c[n2]));
            if (++n2 == a) {
                n2 = 0;
            }
        }
        this.b = n2;
    }
    
    public final atha c() {
        final int a = this.a;
        if (a == 0) {
            return atgl.g;
        }
        final atha[] c = this.c;
        final long b = this.b;
        this.b = 1L + b;
        return c[(int)(b % a)];
    }
}
