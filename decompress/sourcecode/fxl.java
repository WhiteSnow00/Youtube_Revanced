import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxl extends fnh
{
    public final RentalActivationOverlay a;
    public boolean b;
    private final abns c;
    private final asib d;
    
    public fxl(final qv qv, final RentalActivationOverlay a, final abns c, final byte[] array, final byte[] array2) {
        super(qv, (byte[])null, (byte[])null);
        a.getClass();
        this.a = a;
        this.c = c;
        this.d = new asib();
    }
    
    public final void lV() {
        this.d.b();
    }
    
    public final void qB() {
        final asib d = this.d;
        final abns c = this.c;
        final asic am = c.N().am((asix)new fqq(this, 14), (asix)fts.d);
        asic asic;
        if (((uyi)c.cd().h).bx()) {
            asic = c.R().am((asix)new fqq(this, 15), (asix)fts.d);
        }
        else {
            asic = c.Q().R().P(ashw.a()).am((asix)new fqq(this, 15), (asix)fts.d);
        }
        d.f(new asic[] { am, asic, ((asgt)c.q().l).am((asix)new fqq(this, 16), (asix)fts.d) });
    }
}
