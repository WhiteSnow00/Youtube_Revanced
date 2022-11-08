// 
// Decompiled by Procyon v0.6.0
// 

final class kux extends acpm
{
    final /* synthetic */ kuy a;
    private final vke f;
    
    public kux(final kuy a, final vke f, final tdz tdz, final acno acno, final tny tny, final wwv wwv) {
        this.a = a;
        super(f, tdz, acno, tny, wwv, acmc.a, acmc.a, (auip)null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
    }
    
    public final acnp a(final Object o, final acpi acpi, final acpd acpd) {
        if (o instanceof aiqw) {
            final kuy a = this.a;
            final smf l = a.k.l((aiqw)o, this.f, this.d, a.m, a.o);
            final kuy a2 = this.a;
            l.a = (sme)a2;
            final usy i = a2.i;
            i.getClass();
            l.b = (smd)new kuw(i, 0);
            l.j(a2.j);
            return (acnp)l;
        }
        if (o instanceof ver) {
            final kuz h = this.a.n.H(this.f, this.d);
            ((acnw)h).j((ver)o);
            return (acnp)h;
        }
        return super.a(o, acpi, acpd);
    }
}
