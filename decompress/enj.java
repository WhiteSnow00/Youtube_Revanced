// 
// Decompiled by Procyon v0.6.0
// 

public final class enj extends env
{
    private static volatile String h;
    private static final Object i;
    
    static {
        i = new Object();
    }
    
    public enj(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "azGRTaieBebLUCBtXxWiGC8ntdSjezuXnKrD7NOMrfVnrrLI+ziOvss+bqlk4xLN", "0tQXY1xo2ukrM9W+s0u6j2Mh+vSCsclEF17Hl/ROszM=", ahaz, n, 1);
    }
    
    protected final void a() {
        final ahaz g = this.g;
        g.copyOnWrite();
        final eht eht = (eht)g.instance;
        final eht a = eht.a;
        eht.b |= 0x1;
        eht.e = "E";
        if (enj.h == null) {
            synchronized (enj.i) {
                if (enj.h == null) {
                    enj.h = (String)this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            final ahaz g2 = this.g;
            final String h = enj.h;
            g2.copyOnWrite();
            final eht eht2 = (eht)g2.instance;
            h.getClass();
            eht2.b |= 0x1;
            eht2.e = h;
        }
    }
}
