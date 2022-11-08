// 
// Decompiled by Procyon v0.6.0
// 

public final class emy extends enu
{
    private static volatile Long h;
    private static final Object i;
    
    static {
        i = new Object();
    }
    
    public emy(final emj emj, final agza agza, final int n) {
        super(emj, "9MUQl4bkTrG/hbkOaiPEQeZR+Q1g5nerIUIYlLLAX+szyWBOaKlwxYudXHeApTjq", "w0yuMX287JAuExKzMpRTJqrOhPVTMBo6RInylnboEYs=", agza, n, 44);
    }
    
    protected final void a() {
        if (emy.h == null) {
            synchronized (emy.i) {
                if (emy.h == null) {
                    emy.h = (Long)this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            final agza g = this.g;
            final long longValue = emy.h;
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.c |= 0x20;
            ehs.F = longValue;
        }
    }
}
