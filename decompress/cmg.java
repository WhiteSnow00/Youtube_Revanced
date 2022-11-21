import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmg
{
    public final Executor a;
    public final Executor b;
    public final cnh c;
    public final cnc d;
    public final akp e;
    public final akp f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final clb k;
    
    public cmg(final cme cme) {
        final Executor a = cme.a;
        if (a == null) {
            this.a = a(false);
        }
        else {
            this.a = a;
        }
        final Executor c = cme.c;
        if (c == null) {
            this.b = a(true);
        }
        else {
            this.b = c;
        }
        final cnh b = cme.b;
        if (b == null) {
            this.c = cnh.c();
        }
        else {
            this.c = b;
        }
        this.k = new clb();
        Object d;
        if ((d = cme.d) == null) {
            d = new aeox(1);
        }
        this.d = (cnc)d;
        this.h = cme.f;
        this.i = Integer.MAX_VALUE;
        this.j = 20;
        this.e = null;
        this.f = null;
        this.g = cme.e;
    }
    
    private static final Executor a(final boolean b) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new cmd(b));
    }
}
