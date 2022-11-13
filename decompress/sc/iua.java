import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iua implements iul
{
    public static final Duration a;
    public static final iuj b;
    private final ashi c;
    
    static {
        a = Duration.ofSeconds(5L);
        b = new iuk(andi.e);
    }
    
    public iua(final abpu abpu, ashi n, ashi n2, final ashi ashi) {
        n2 = ashi.N((auke)n2, (auke)ashi);
        n = ashi.N((auke)n.ab((auke)n2), (auke)n2.Y((asjr)new ijl(n, 16)));
        Object o;
        if (((vai)abpu.ci().g).bw()) {
            o = abpu.cc().a;
        }
        else {
            o = abpu.cc().c();
        }
        this.c = ((ashi)o).L((asjr)iqm.h).Y((asjr)new ijl(n, 17));
    }
    
    @Override
    public final ashi a() {
        return this.c.L((asjr)iqm.g);
    }
}
