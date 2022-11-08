import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ena extends enu
{
    public ena(final emj emj, final agza agza, final int n) {
        super(emj, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", agza, n, 24);
    }
    
    private final void c() {
        final mah b = this.a.b();
        if (b == null) {
            return;
        }
        try {
            final mag d = b.d();
            final String d2 = emm.d(d.a);
            if (d2 != null) {
                synchronized (this.g) {
                    final agza g = this.g;
                    g.copyOnWrite();
                    final ehs ehs = (ehs)g.instance;
                    final ehs a = ehs.a;
                    ehs.d |= 0x100000;
                    ehs.ag = d2;
                    final agza g2 = this.g;
                    final boolean b2 = d.b;
                    g2.copyOnWrite();
                    final ehs ehs2 = (ehs)g2.instance;
                    ehs2.d |= 0x400000;
                    ehs2.ai = b2;
                    final agza g3 = this.g;
                    g3.copyOnWrite();
                    final ehs ehs3 = (ehs)g3.instance;
                    ehs3.ah = 5;
                    ehs3.d |= 0x200000;
                }
            }
        }
        catch (final IOException ex) {}
    }
    
    protected final void a() {
        if (!this.a.l) {
            synchronized (this.g) {
                final agza g = this.g;
                final String ag = (String)this.d.invoke(null, this.a.a);
                g.copyOnWrite();
                final ehs ehs = (ehs)g.instance;
                final ehs a = ehs.a;
                ag.getClass();
                ehs.d |= 0x100000;
                ehs.ag = ag;
                return;
            }
        }
        this.c();
    }
    
    public final void lB() {
        final emj a = this.a;
        if (a.n) {
            super.lB();
            return;
        }
        if (a.l) {
            this.c();
        }
    }
}
