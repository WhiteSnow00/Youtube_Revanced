// 
// Decompiled by Procyon v0.6.0
// 

public final class apiu extends vgs
{
    private final ahcr a;
    
    private apiu() {
        final apix a = apix.a;
        throw null;
    }
    
    public apiu(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.f();
    }
    
    public final void b(final String d) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final apix apix = (apix)a.instance;
        final apix a2 = apix.a;
        d.getClass();
        apix.b |= 0x2;
        apix.d = d;
    }
    
    public final void c(final String g) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final apix apix = (apix)a.instance;
        final apix a2 = apix.a;
        g.getClass();
        apix.b |= 0x10;
        apix.g = g;
    }
    
    public final void d(final Boolean b) {
        final ahcr a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final apix apix = (apix)a.instance;
        final apix a2 = apix.a;
        apix.b |= 0x8;
        apix.f = booleanValue;
    }
    
    public final void e(final String e) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final apix apix = (apix)a.instance;
        final apix a2 = apix.a;
        e.getClass();
        apix.b |= 0x4;
        apix.e = e;
    }
    
    public final apiw f() {
        return new apiw((apix)this.a.build());
    }
}
