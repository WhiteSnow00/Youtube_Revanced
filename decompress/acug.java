import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acug implements acxb
{
    public final xab a;
    private final xaa b;
    private final Optional c;
    private final wzy d;
    private final wzy e;
    
    public acug(final xab a, final xaa b, final Optional c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new wzy(xbf.c(147225));
        this.e = new wzy(xbf.c(148565));
    }
    
    @Override
    public final void a(final Object o, final int n) {
        if (n != 0) {
            if (n == 2 || n == 3 || n == 4) {
                this.a.J(2, (xbe)this.d, (alji)null);
            }
        }
        else {
            this.a.J(65, (xbe)this.d, (alji)null);
        }
        this.a.s();
    }
    
    @Override
    public final void mu(final Object o) {
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        final xab pe = this.b.pE();
        if (pe != null) {
            pe.D((xbe)this.e);
            pe.t((xbe)this.e, (alji)null);
            final ahcx b = amsk.b;
            final ahcr builder = ((ahcz)amsl.a).createBuilder();
            final String i = pe.i();
            builder.copyOnWrite();
            final amsl amsl = (amsl)builder.instance;
            i.getClass();
            amsl.b |= 0x1;
            amsl.c = i;
            builder.copyOnWrite();
            final amsl amsl2 = (amsl)builder.instance;
            amsl2.b |= 0x2;
            amsl2.d = 148565;
            ahct.e((ahci)b, (Object)builder.build());
        }
        this.a.G(xbf.b(147036), xaw.b, (aisc)((ahcr)ahct).build());
        this.a.D((xbe)this.d);
        this.a.t((xbe)this.d, (alji)null);
        if (this.c.isPresent()) {
            this.a.D((xbe)new wzy((ahbt)this.c.get()));
            this.a.t((xbe)new wzy((ahbt)this.c.get()), (alji)null);
        }
    }
}
