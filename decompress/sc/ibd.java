import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class ibd implements ibe
{
    final ibf a;
    
    public ibd(final ibf a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.d(false, Optional.empty());
    }
    
    public final void b(final Optional optional) {
        this.a.d(true, optional);
    }
}
