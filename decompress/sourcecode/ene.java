// 
// Decompiled by Procyon v0.6.0
// 

public final class ene extends enu
{
    private static volatile Long h;
    private static final Object i;
    
    static {
        i = new Object();
    }
    
    public ene(final emj emj, final agza agza, final int n) {
        super(emj, "BL1uRQDu2iGGdqxtPT0UZ/lh1a1ebdj6ce5dHzXL9Xdh/V7EjoG/mOlN+ePhmCVj", "VbWvt5u3iV1e6mTKIEv50y8+Z2ekDgVJovyXyxeSHYc=", agza, n, 22);
    }
    
    protected final void a() {
        if (ene.h == null) {
            synchronized (ene.i) {
                if (ene.h == null) {
                    ene.h = (Long)this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            final agza g = this.g;
            final long longValue = ene.h;
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.b |= 0x100000;
            ehs.q = longValue;
        }
    }
}
