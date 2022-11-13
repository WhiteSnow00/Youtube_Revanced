import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enb extends env
{
    public enb(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", ahaz, n, 24);
    }
    
    private final void c() {
        final mbl b = this.a.b();
        if (b == null) {
            return;
        }
        try {
            final mbk d = b.d();
            final String d2 = emn.d(d.a);
            if (d2 != null) {
                synchronized (this.g) {
                    final ahaz g = this.g;
                    g.copyOnWrite();
                    final eht eht = (eht)g.instance;
                    final eht a = eht.a;
                    eht.d |= 0x100000;
                    eht.ag = d2;
                    final ahaz g2 = this.g;
                    final boolean b2 = d.b;
                    g2.copyOnWrite();
                    final eht eht2 = (eht)g2.instance;
                    eht2.d |= 0x400000;
                    eht2.ai = b2;
                    final ahaz g3 = this.g;
                    g3.copyOnWrite();
                    final eht eht3 = (eht)g3.instance;
                    eht3.ah = 5;
                    eht3.d |= 0x200000;
                }
            }
        }
        catch (final IOException ex) {}
    }
    
    protected final void a() {
        if (!this.a.l) {
            synchronized (this.g) {
                final ahaz g = this.g;
                final String ag = (String)this.d.invoke(null, this.a.a);
                g.copyOnWrite();
                final eht eht = (eht)g.instance;
                final eht a = eht.a;
                ag.getClass();
                eht.d |= 0x100000;
                eht.ag = ag;
                return;
            }
        }
        this.c();
    }
    
    public final /* bridge */ Object call() {
        this.lB();
        return null;
    }
    
    public final void lB() {
        final emk a = this.a;
        if (a.n) {
            super.lB();
            return;
        }
        if (a.l) {
            this.c();
        }
    }
}
