import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjp extends fjo
{
    private final tgd f;
    private final atke g;
    
    public fjp(final atke g, final oby oby, final tgd f) {
        super(g, oby);
        this.g = g;
        f.getClass();
        this.f = f;
    }
    
    public final /* bridge */ void g(final Object o) {
        final akup akup = (akup)o;
        this.f.d((Object)new fia());
    }
    
    protected final /* bridge */ void i(final vmq vmq, final vkk vkk, final zpf zpf) {
        final adfs adfs = (adfs)vmq;
        final vuy vuy = (vuy)vkk;
        this.f.d((Object)new fib());
        ((vmo)adfs.f).i((vls)vuy, zpf);
        ((vkk)vuy).u = (tjh)new vuz(adfs, (byte[])null, (byte[])null);
    }
    
    public final vuy n(final Uri uri, final String s) {
        final adfs adfs = (adfs)this.g.a();
        return new vuy(adfs.c, ((zmf)adfs.e).c(), uri, s, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void o(final Uri uri, final String s, final zpf zpf) {
        this.h((vkk)this.n(uri, s), zpf);
    }
}
