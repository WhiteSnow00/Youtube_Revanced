// 
// Decompiled by Procyon v0.6.0
// 

public final class eni extends enu
{
    private static volatile String h;
    private static final Object i;
    
    static {
        i = new Object();
    }
    
    public eni(final emj emj, final agza agza, final int n) {
        super(emj, "azGRTaieBebLUCBtXxWiGC8ntdSjezuXnKrD7NOMrfVnrrLI+ziOvss+bqlk4xLN", "0tQXY1xo2ukrM9W+s0u6j2Mh+vSCsclEF17Hl/ROszM=", agza, n, 1);
    }
    
    protected final void a() {
        final agza g = this.g;
        g.copyOnWrite();
        final ehs ehs = (ehs)g.instance;
        final ehs a = ehs.a;
        ehs.b |= 0x1;
        ehs.e = "E";
        if (eni.h == null) {
            synchronized (eni.i) {
                if (eni.h == null) {
                    eni.h = (String)this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            final agza g2 = this.g;
            final String h = eni.h;
            g2.copyOnWrite();
            final ehs ehs2 = (ehs)g2.instance;
            h.getClass();
            ehs2.b |= 0x1;
            ehs2.e = h;
        }
    }
}
