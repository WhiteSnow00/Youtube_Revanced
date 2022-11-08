import android.media.metrics.PlaybackMetrics$Builder;
import java.util.Iterator;
import android.util.Base64;
import java.util.HashMap;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgu implements bgx
{
    private static final Random d;
    public final azk a;
    public final azj b;
    public bgw c;
    private final HashMap e;
    private azl f;
    private String g;
    
    static {
        d = new Random();
    }
    
    public bgu() {
        this.a = new azk();
        this.b = new azj();
        this.e = new HashMap();
        this.f = azl.a;
    }
    
    public static String a() {
        final byte[] array = new byte[12];
        bgu.d.nextBytes(array);
        return Base64.encodeToString(array, 10);
    }
    
    private final void h(final bga bga) {
        if (bga.b.p()) {
            this.g = null;
            return;
        }
        final bgt bgt = this.e.get(this.g);
        this.g = this.i(bga.c, bga.i).a;
        this.d(bga);
        final ayx i = bga.i;
        if (i != null && i.a()) {
            if (bgt != null && bgt.c == i.d) {
                final ayx g = bgt.g;
                if (g != null && g.b == i.b && g.c == i.c) {
                    return;
                }
            }
            this.i(bga.c, new ayx(i.a, i.d));
        }
    }
    
    private final bgt i(final int n, final ayx ayx) {
        final Iterator iterator = this.e.values().iterator();
        bgt bgt = null;
        long n2 = Long.MAX_VALUE;
        while (iterator.hasNext()) {
            final bgt bgt2 = (bgt)iterator.next();
            long c;
            if ((c = bgt2.c) == -1L) {
                if (n == bgt2.b && ayx != null) {
                    c = ayx.d;
                    bgt2.c = c;
                }
                else {
                    c = -1L;
                }
            }
            if (ayx == null) {
                if (n != bgt2.b) {
                    continue;
                }
            }
            else {
                final ayx g = bgt2.g;
                if (g == null) {
                    if (ayx.a()) {
                        continue;
                    }
                    if (ayx.d != c) {
                        continue;
                    }
                }
                else {
                    if (ayx.d != g.d || ayx.b != g.b) {
                        continue;
                    }
                    if (ayx.c != g.c) {
                        continue;
                    }
                }
            }
            if (c != -1L && c >= n2) {
                if (c != n2) {
                    continue;
                }
                final int a = baw.a;
                if (bgt.g == null || bgt2.g == null) {
                    continue;
                }
                bgt = bgt2;
            }
            else {
                bgt = bgt2;
                n2 = c;
            }
        }
        bgt bgt3;
        if ((bgt3 = bgt) == null) {
            final String a2 = a();
            bgt3 = new bgt(this, a2, n, ayx);
            this.e.put(a2, bgt3);
        }
        return bgt3;
    }
    
    @Override
    public final String b() {
        synchronized (this) {
            return this.g;
        }
    }
    
    @Override
    public final void c(final bga bga) {
        monitorenter(this);
        try {
            this.g = null;
            final Iterator iterator = this.e.values().iterator();
            while (iterator.hasNext()) {
                final bgt bgt = (bgt)iterator.next();
                iterator.remove();
                if (bgt.d) {
                    final bgw c = this.c;
                    if (c == null) {
                        continue;
                    }
                    c.ay(bga, bgt.a);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final bga bga) {
        synchronized (this) {
            dk.d((Object)this.c);
            if (bga.b.p()) {
                return;
            }
            final bgt bgt = this.e.get(this.g);
            final ayx i = bga.i;
            Label_0102: {
                if (i != null && bgt != null) {
                    final long c = bgt.c;
                    if (c == -1L) {
                        if (bgt.b == bga.c) {
                            break Label_0102;
                        }
                    }
                    else if (i.d >= c) {
                        break Label_0102;
                    }
                    return;
                }
            }
            final bgt j = this.i(bga.c, i);
            if (this.g == null) {
                this.g = j.a;
            }
            final ayx k = bga.i;
            if (k != null && k.a()) {
                final bgt l = this.i(bga.c, new ayx(k.a, k.d, k.b));
                if (!l.d) {
                    bgt.b(l);
                    bga.b.n(bga.i.a, this.b);
                    this.b.i(bga.i.b);
                    Math.max(0L, baw.A(0L) + this.b.f());
                }
            }
            if (!j.d) {
                bgt.b(j);
            }
            if (j.a.equals(this.g) && !j.e) {
                j.e = true;
                final bgw c2 = this.c;
                final String a = j.a;
                final ayx m = bga.i;
                if (m == null || !m.a()) {
                    ((bgv)c2).aw();
                    ((bgv)c2).b = a;
                    ((bgv)c2).c = new PlaybackMetrics$Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
                    ((bgv)c2).ax(bga.b, bga.i);
                }
            }
        }
    }
    
    @Override
    public final void e(final bga bga, final int n) {
        monitorenter(this);
        try {
            dk.d((Object)this.c);
            final Iterator iterator = this.e.values().iterator();
            while (iterator.hasNext()) {
                final bgt bgt = (bgt)iterator.next();
                if (bgt.a(bga)) {
                    iterator.remove();
                    if (!bgt.d) {
                        continue;
                    }
                    final boolean equals = bgt.a.equals(this.g);
                    Label_0109: {
                        if (n == 0) {
                            if (!equals) {
                                break Label_0109;
                            }
                            final boolean e = bgt.e;
                        }
                        else if (!equals) {
                            break Label_0109;
                        }
                        this.g = null;
                    }
                    this.c.ay(bga, bgt.a);
                }
            }
            this.h(bga);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void f(final bga bga) {
        monitorenter(this);
        try {
            dk.d((Object)this.c);
            final azl f = this.f;
            this.f = bga.b;
            final Iterator iterator = this.e.values().iterator();
            while (iterator.hasNext()) {
                final bgt bgt = (bgt)iterator.next();
                final azl f2 = this.f;
                final int b = bgt.b;
                int c = 0;
                Label_0190: {
                    if (b >= f.c()) {
                        if ((c = b) < f2.c()) {
                            break Label_0190;
                        }
                    }
                    else {
                        f.o(b, bgt.f.a);
                        for (int i = bgt.f.a.o; i <= bgt.f.a.p; ++i) {
                            final int a = f2.a(f.f(i));
                            if (a != -1) {
                                c = f2.m(a, bgt.f.b).c;
                                break Label_0190;
                            }
                        }
                    }
                    c = -1;
                }
                Label_0244: {
                    if ((bgt.b = c) != -1) {
                        final ayx g = bgt.g;
                        if (g != null) {
                            if (f2.a(g.a) == -1) {
                                break Label_0244;
                            }
                        }
                        if (!bgt.a(bga)) {
                            continue;
                        }
                    }
                }
                iterator.remove();
                if (bgt.d) {
                    if (bgt.a.equals(this.g)) {
                        this.g = null;
                    }
                    this.c.ay(bga, bgt.a);
                }
            }
            this.h(bga);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final String g(final azl azl, final ayx ayx) {
        synchronized (this) {
            return this.i(azl.n(ayx.a, this.b).c, ayx).a;
        }
    }
}
