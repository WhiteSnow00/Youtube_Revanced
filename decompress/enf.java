// 
// Decompiled by Procyon v0.6.0
// 

public final class enf extends env
{
    private static volatile Long h;
    private static final Object i;
    
    static {
        i = new Object();
    }
    
    public enf(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "BL1uRQDu2iGGdqxtPT0UZ/lh1a1ebdj6ce5dHzXL9Xdh/V7EjoG/mOlN+ePhmCVj", "VbWvt5u3iV1e6mTKIEv50y8+Z2ekDgVJovyXyxeSHYc=", ahaz, n, 22);
    }
    
    protected final void a() {
        if (enf.h == null) {
            synchronized (enf.i) {
                if (enf.h == null) {
                    enf.h = (Long)this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            final ahaz g = this.g;
            final long longValue = enf.h;
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.b |= 0x100000;
            eht.q = longValue;
        }
    }
}
