// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxa extends vfk
{
    public final ahbb a;
    
    private aoxa() {
        final aoxd a = aoxd.a;
        throw null;
    }
    
    public aoxa(final ahbb a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.b(vfp);
    }
    
    public final aoxc b(final vfp vfp) {
        return new aoxc((aoxd)((ahaz)this.a).build(), vfp);
    }
    
    public final void c(final String... array) {
        for (int i = 0; i <= 0; ++i) {
            this.a.s(array[i]);
        }
    }
    
    public final void d(final String i) {
        final ahbb a = this.a;
        ((ahaz)a).copyOnWrite();
        final aoxd aoxd = (aoxd)a.instance;
        final aoxd a2 = aoxd.a;
        i.getClass();
        aoxd.c |= 0x8;
        aoxd.i = i;
    }
    
    public final void e(final aowz aowz) {
        final ahbb a = this.a;
        ((ahaz)a).copyOnWrite();
        final aoxd aoxd = (aoxd)a.instance;
        final aoxd a2 = aoxd.a;
        aoxd.g = aowz.n;
        aoxd.c |= 0x4;
    }
    
    public final void f(final amwz amwz) {
        final ahbb a = this.a;
        ((ahaz)a).copyOnWrite();
        final aoxd aoxd = (aoxd)a.instance;
        final aoxd a2 = aoxd.a;
        aoxd.k = amwz.k;
        aoxd.c |= 0x20;
    }
    
    public final void g(final aowy aowy) {
        final ahbb a = this.a;
        ((ahaz)a).copyOnWrite();
        final aoxd aoxd = (aoxd)a.instance;
        final aoxd a2 = aoxd.a;
        aoxd.e = aowy.i;
        aoxd.c |= 0x2;
    }
}
