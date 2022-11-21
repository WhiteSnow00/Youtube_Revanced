import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aagz implements aahn
{
    private final zxc a;
    private final atnb b;
    private final atnb c;
    
    public aagz(final atnb b, final atnb c, final aaks aaks) {
        this.b = b;
        this.c = c;
        this.a = aaks.c();
    }
    
    @Override
    public final afbh a(final String s) {
        afbh afbh;
        if (this.a.b()) {
            afbh = ((aagy)this.c.a()).a(s);
        }
        else {
            afbh = ((aahf)this.b.a()).a(s);
        }
        return afbh;
    }
    
    @Override
    public final List b(final znz znz) {
        List list;
        if (this.a.b()) {
            list = ((aagy)this.c.a()).b(znz);
        }
        else {
            list = ((aahf)this.b.a()).b(znz);
        }
        return list;
    }
    
    @Override
    public final void c(final aaha aaha) {
        if (this.a.c()) {
            ((aagy)this.c.a()).h(aaha);
        }
        if (this.a.d()) {
            ((aahf)this.b.a()).f(aaha);
        }
    }
    
    @Override
    public final void d(final aaha aaha) {
        if (this.a.d()) {
            ((aahf)this.b.a()).d(aaha);
        }
    }
    
    @Override
    public final void e() {
        if (this.a != zxc.d) {
            ((aahf)this.b.a()).e();
        }
        if (this.a != zxc.a) {
            final aagy aagy = (aagy)this.c.a();
        }
    }
    
    @Override
    public final void f(final aaha aaha) {
        ((aahf)this.b.a()).f(aaha);
    }
    
    @Override
    public final void g(final String s) {
        ((aahf)this.b.a()).g(s);
    }
    
    @Override
    public final void h(final aaha aaha) {
        if (this.a.d()) {
            ((aahf)this.b.a()).h(aaha);
        }
        if (this.a.c()) {
            ((aagy)this.c.a()).h(aaha);
        }
    }
}
