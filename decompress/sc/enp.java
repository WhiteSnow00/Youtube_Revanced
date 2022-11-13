// 
// Decompiled by Procyon v0.6.0
// 

public final class enp extends env
{
    public enp(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "/nq0lRxQcGC1ASnfdnp1tRqKCtSvrxgzieToDPBUonPm4tHJx/5+TsZqcFW/70Mo", "myj1nOfIy7SmCD8TPLBSkg5Eqhpr16G4wLW5wXHtMTM=", ahaz, n, 51);
    }
    
    protected final void a() {
        synchronized (this.g) {
            final emi emi = new emi((String)this.d.invoke(null, new Object[0]));
            final ahaz g = this.g;
            final long longValue = emi.a;
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.c |= 0x1000;
            eht.L = longValue;
            final ahaz g2 = this.g;
            final long longValue2 = emi.b;
            g2.copyOnWrite();
            final eht eht2 = (eht)g2.instance;
            eht2.c |= 0x2000;
            eht2.M = longValue2;
        }
    }
}
