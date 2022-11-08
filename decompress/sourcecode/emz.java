// 
// Decompiled by Procyon v0.6.0
// 

public final class emz extends enu
{
    private final long h;
    
    public emz(final emj emj, final agza agza, final long h, final int n) {
        super(emj, "THnQW94FsCDUSM+XeJNpgUTCgMolxy7rl1LeD10r6fuFhGDZDxfkCa3f3R02TTfn", "RukHQ2QyoItYcCVOmbl/vMdZ4cajSx2BB5kPudfplwo=", agza, n, 25);
        this.h = h;
    }
    
    protected final void a() {
        final long longValue = (long)this.d.invoke(null, new Object[0]);
        synchronized (this.g) {
            final agza g = this.g;
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.d |= 0x1000000;
            ehs.aj = longValue;
            final long h = this.h;
            if (h != 0L) {
                final agza g2 = this.g;
                g2.copyOnWrite();
                final ehs ehs2 = (ehs)g2.instance;
                ehs2.b |= 0x10000;
                ehs2.o = longValue - h;
                final agza g3 = this.g;
                final long h2 = this.h;
                g3.copyOnWrite();
                final ehs ehs3 = (ehs)g3.instance;
                ehs3.b |= 0x200000;
                ehs3.r = h2;
            }
        }
    }
}
