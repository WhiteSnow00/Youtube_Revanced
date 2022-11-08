// 
// Decompiled by Procyon v0.6.0
// 

public final class enr extends enu
{
    public enr(final emj emj, final agza agza, final int n) {
        super(emj, "n8eevinWOirOSPZe75LOlEw/rjd2yNw2EibrKlsvfLNOq/qV6IorYV+yJwJVSrU8", "z60w6+pWlGB4RCxkD/LDTBZ25WofjghjXXagNVA9cCM=", agza, n, 48);
    }
    
    protected final void a() {
        final agza g = this.g;
        g.copyOnWrite();
        final ehs ehs = (ehs)g.instance;
        final ehs a = ehs.a;
        ehs.J = 2;
        ehs.c |= 0x400;
        final boolean booleanValue = (boolean)this.d.invoke(null, this.a.a);
        final agza g2 = this.g;
        monitorenter(g2);
        Label_0115: {
            if (!booleanValue) {
                break Label_0115;
            }
            try {
                final agza g3 = this.g;
                g3.copyOnWrite();
                final ehs ehs2 = (ehs)g3.instance;
                ehs2.J = 1;
                ehs2.c |= 0x400;
                return;
                final agza g4 = this.g;
                g4.copyOnWrite();
                final ehs ehs3 = (ehs)g4.instance;
                ehs3.J = 0;
                ehs3.c |= 0x400;
            }
            finally {
                monitorexit(g2);
            }
        }
    }
}
