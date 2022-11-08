// 
// Decompiled by Procyon v0.6.0
// 

public final class ktb extends fnh implements aape
{
    public ansi a;
    private final asib b;
    private final abns c;
    private final kta d;
    private boolean e;
    
    public ktb(final qv qv, final abns c, final vut vut, final tdz tdz, final tny tny, final wwv wwv, final aatv h, final byte[] array, final byte[] array2) {
        super(qv, (byte[])null, (byte[])null);
        this.c = c;
        this.b = new asib();
        final kta d = new kta((vke)vut, tdz, tny, wwv);
        this.d = d;
        d.H = (acmn)h;
        this.e = false;
    }
    
    public final void e() {
        if (!this.e) {
            return;
        }
        final ansi a = this.a;
        if (a != null) {
            this.d.mD(aaiy.y((Object)a));
        }
    }
    
    public final void lV() {
        this.b.b();
    }
    
    public final void qB() {
        final asib b = this.b;
        asic asic;
        if (((uyi)this.c.cd().h).bx()) {
            asic = this.c.R().am((asix)new kca(this, 19), (asix)jky.t);
        }
        else {
            asic = this.c.Q().j(aajj.r(1)).am((asix)new kca(this, 19), (asix)jky.t);
        }
        b.c(asic);
    }
    
    public final void rN(final aart aart, final aarp aarp) {
        this.e = true;
        this.e();
    }
    
    public final void rO() {
        this.e = false;
    }
}
