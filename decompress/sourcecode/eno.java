// 
// Decompiled by Procyon v0.6.0
// 

public final class eno extends enu
{
    public eno(final emj emj, final agza agza, final int n) {
        super(emj, "/nq0lRxQcGC1ASnfdnp1tRqKCtSvrxgzieToDPBUonPm4tHJx/5+TsZqcFW/70Mo", "myj1nOfIy7SmCD8TPLBSkg5Eqhpr16G4wLW5wXHtMTM=", agza, n, 51);
    }
    
    protected final void a() {
        synchronized (this.g) {
            final emh emh = new emh((String)this.d.invoke(null, new Object[0]));
            final agza g = this.g;
            final long longValue = emh.a;
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.c |= 0x1000;
            ehs.L = longValue;
            final agza g2 = this.g;
            final long longValue2 = emh.b;
            g2.copyOnWrite();
            final ehs ehs2 = (ehs)g2.instance;
            ehs2.c |= 0x2000;
            ehs2.M = longValue2;
        }
    }
}
