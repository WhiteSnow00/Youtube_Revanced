// 
// Decompiled by Procyon v0.6.0
// 

public final class apje extends vgs
{
    public final ahcr a;
    
    private apje() {
        final apjh a = apjh.a;
        throw null;
    }
    
    public apje(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)new apjg((apjh)this.a.build());
    }
    
    public final void b(final apji apji) {
        final ahcr a = this.a;
        a.copyOnWrite();
        final apjh apjh = (apjh)a.instance;
        final apjh a2 = apjh.a;
        apjh.d = apji.f;
        apjh.b |= 0x2;
    }
}
