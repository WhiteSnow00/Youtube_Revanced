// 
// Decompiled by Procyon v0.6.0
// 

final class adrc implements adnp
{
    public final String a;
    public final adnq b;
    final adre c;
    
    public adrc(final adre c, final String a, final adnq b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void tk(final adnq adnq) {
        if (adnq.g().b) {
            adnq.d(this);
            this.c.b(this.a, true);
            this.c.c.execute(new adps(this, 4));
        }
    }
}
