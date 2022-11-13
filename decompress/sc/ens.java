// 
// Decompiled by Procyon v0.6.0
// 

public final class ens extends env
{
    public ens(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "n8eevinWOirOSPZe75LOlEw/rjd2yNw2EibrKlsvfLNOq/qV6IorYV+yJwJVSrU8", "z60w6+pWlGB4RCxkD/LDTBZ25WofjghjXXagNVA9cCM=", ahaz, n, 48);
    }
    
    protected final void a() {
        final ahaz g = this.g;
        g.copyOnWrite();
        final eht eht = (eht)g.instance;
        final eht a = eht.a;
        eht.J = 2;
        eht.c |= 0x400;
        final boolean booleanValue = (boolean)this.d.invoke(null, this.a.a);
        final ahaz g2 = this.g;
        monitorenter(g2);
        Label_0115: {
            if (!booleanValue) {
                break Label_0115;
            }
            try {
                final ahaz g3 = this.g;
                g3.copyOnWrite();
                final eht eht2 = (eht)g3.instance;
                eht2.J = 1;
                eht2.c |= 0x400;
                return;
                final ahaz g4 = this.g;
                g4.copyOnWrite();
                final eht eht3 = (eht)g4.instance;
                eht3.J = 0;
                eht3.c |= 0x400;
            }
            finally {
                monitorexit(g2);
            }
        }
    }
}
