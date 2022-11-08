// 
// Decompiled by Procyon v0.6.0
// 

public final class aoux extends vdj
{
    public final agzc a;
    
    private aoux() {
        final aova a = aova.a;
        throw null;
    }
    
    public aoux(final agzc a) {
        this.a = a;
    }
    
    public final aouz b(final vdo vdo) {
        return new aouz((aova)((agza)this.a).build(), vdo);
    }
    
    public final void c(final String... array) {
        for (int i = 0; i <= 0; ++i) {
            this.a.s(array[i]);
        }
    }
    
    public final void d(final String i) {
        final agzc a = this.a;
        ((agza)a).copyOnWrite();
        final aova aova = (aova)a.instance;
        final aova a2 = aova.a;
        i.getClass();
        aova.c |= 0x8;
        aova.i = i;
    }
    
    public final void e(final aouw aouw) {
        final agzc a = this.a;
        ((agza)a).copyOnWrite();
        final aova aova = (aova)a.instance;
        final aova a2 = aova.a;
        aova.g = aouw.n;
        aova.c |= 0x4;
    }
    
    public final void f(final amuv amuv) {
        final agzc a = this.a;
        ((agza)a).copyOnWrite();
        final aova aova = (aova)a.instance;
        final aova a2 = aova.a;
        aova.k = amuv.k;
        aova.c |= 0x20;
    }
    
    public final void g(final aouv aouv) {
        final agzc a = this.a;
        ((agza)a).copyOnWrite();
        final aova aova = (aova)a.instance;
        final aova a2 = aova.a;
        aova.e = aouv.i;
        aova.c |= 0x2;
    }
}
