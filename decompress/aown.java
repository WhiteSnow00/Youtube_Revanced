// 
// Decompiled by Procyon v0.6.0
// 

public final class aown extends vfk
{
    private final ahaz a;
    
    private aown() {
        final aowq a = aowq.a;
        throw null;
    }
    
    public aown(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.c();
    }
    
    public final void b(final Boolean b) {
        final ahaz a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final aowq aowq = (aowq)a.instance;
        final aowq a2 = aowq.a;
        aowq.b |= 0x2;
        aowq.d = booleanValue;
    }
    
    public final aowp c() {
        return new aowp((aowq)this.a.build());
    }
}
