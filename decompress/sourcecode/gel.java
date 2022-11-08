import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gel
{
    public final tdz a;
    public final thh b;
    public final AtomicInteger c;
    public volatile boolean d;
    public volatile boolean e;
    private final tku f;
    private final Executor g;
    private volatile int h;
    private final arud i;
    
    public gel(final tdz a, final thh b, final arud i, final tku f, final asgt asgt, final Executor g, final asho asho, final asho asho2, final byte[] array, final byte[] array2) {
        this.h = 1;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        i.getClass();
        this.i = i;
        f.getClass();
        this.f = f;
        this.c = new AtomicInteger(-1);
        this.d = b.r();
        this.e = b.o();
        this.g = g;
        f.d().R().P(asho).al((asix)new gag(this, 7));
        asgt.P(asho2).al((asix)new gag(this, 8));
    }
    
    public static int h(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        int h;
        if ((h = afld.H(alvs.v)) == 0) {
            h = 1;
        }
        if (--h == 2) {
            return 1;
        }
        if (h != 3) {
            return 2;
        }
        return 0;
    }
    
    private final void i() {
        if (this.c.get() == -1) {
            Object o;
            if ((((fqo)this.f.c()).b & 0x4) != 0x0) {
                o = aexq.k(((fqo)this.f.c()).e);
            }
            else {
                o = aewp.a;
            }
            final int h = h(this.i);
            final AtomicInteger c = this.c;
            int intValue;
            if (((aexq)o).h()) {
                intValue = (int)((aexq)o).c();
            }
            else {
                intValue = h;
            }
            c.set(intValue);
            final int value = this.c.get();
            Serializable s;
            if (((aexq)o).h()) {
                s = (Serializable)((aexq)o).c();
            }
            else {
                s = "UNSET";
            }
            final String string = s.toString();
            final StringBuilder sb = new StringBuilder("initialized to ");
            sb.append(value);
            sb.append(" settingStore: ");
            sb.append(string);
            sb.append(" hotConfig: ");
            sb.append(h);
            trn.h("InlineMuted", sb.toString());
        }
    }
    
    public final int a() {
        this.i();
        return this.c.get();
    }
    
    public final void b(final boolean b) {
        this.g.execute(new dmu(this, b, 3));
    }
    
    public final void c(final int n) {
        this.i();
        final int value = this.c.get();
        if (value == n) {
            return;
        }
        tcp.i(this.f.b((aexg)new fqk(n, 3)), (tco)new gei(this, n, value));
    }
    
    public final void d(int n) {
        synchronized (this) {
            final int n2 = ((fqo)this.f.c()).b & 0x4;
            if (n == 0) {
                if (n2 != 0) {
                    n = 3;
                }
                else {
                    n = 11;
                }
                this.h = n;
                return;
            }
            if (n != 1) {
                if (n != 2) {
                    this.h = 1;
                    return;
                }
                if (n2 != 0) {
                    n = 5;
                }
                else {
                    n = 6;
                }
                this.h = n;
            }
            else {
                if (this.d) {
                    if (n2 != 0) {
                        n = 7;
                    }
                    else {
                        n = 8;
                    }
                    this.h = n;
                    return;
                }
                if (n2 != 0) {
                    n = 9;
                }
                else {
                    n = 10;
                }
                this.h = n;
            }
        }
    }
    
    public final boolean e() {
        return this.f(this.a());
    }
    
    public final boolean f(final int n) {
        if (n == 2) {
            return this.b.o();
        }
        return n == 1 && this.b.r();
    }
    
    final int g() {
        if (this.h == 1) {
            this.d(this.a());
        }
        return this.h;
    }
}
