// 
// Decompiled by Procyon v0.6.0
// 

public final class emz extends env
{
    private static volatile Long h;
    private static final Object i;
    
    static {
        i = new Object();
    }
    
    public emz(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "9MUQl4bkTrG/hbkOaiPEQeZR+Q1g5nerIUIYlLLAX+szyWBOaKlwxYudXHeApTjq", "w0yuMX287JAuExKzMpRTJqrOhPVTMBo6RInylnboEYs=", ahaz, n, 44);
    }
    
    protected final void a() {
        if (emz.h == null) {
            synchronized (emz.i) {
                if (emz.h == null) {
                    emz.h = (Long)this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            final ahaz g = this.g;
            final long longValue = emz.h;
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.c |= 0x20;
            eht.F = longValue;
        }
    }
}
