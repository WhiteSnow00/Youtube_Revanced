// 
// Decompiled by Procyon v0.6.0
// 

public final class ena extends env
{
    private final long h;
    
    public ena(final emk emk, final ahaz ahaz, final long h, final int n) {
        super(emk, "THnQW94FsCDUSM+XeJNpgUTCgMolxy7rl1LeD10r6fuFhGDZDxfkCa3f3R02TTfn", "RukHQ2QyoItYcCVOmbl/vMdZ4cajSx2BB5kPudfplwo=", ahaz, n, 25);
        this.h = h;
    }
    
    protected final void a() {
        final long longValue = (long)this.d.invoke(null, new Object[0]);
        synchronized (this.g) {
            final ahaz g = this.g;
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.d |= 0x1000000;
            eht.aj = longValue;
            final long h = this.h;
            if (h != 0L) {
                final ahaz g2 = this.g;
                g2.copyOnWrite();
                final eht eht2 = (eht)g2.instance;
                eht2.b |= 0x10000;
                eht2.o = longValue - h;
                final ahaz g3 = this.g;
                final long h2 = this.h;
                g3.copyOnWrite();
                final eht eht3 = (eht)g3.instance;
                eht3.b |= 0x200000;
                eht3.r = h2;
            }
        }
    }
}
