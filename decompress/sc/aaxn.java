import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaxn implements aaxo
{
    final aaxq a;
    private final aiqj b;
    
    public aaxn(final aaxq a, final aiqj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final aaxp a(final aiqj aiqj) {
        return new aaxp(this.a, aiqj, true);
    }
    
    @Override
    public final aaxu b() {
        return aaxu.b;
    }
    
    @Override
    public final aiqj c() {
        return this.b;
    }
    
    @Override
    public final Optional d(final aani aani) {
        return Optional.of((Object)new aaxm(this.a, aani.b(), aani.d(), 1));
    }
    
    @Override
    public final void e() {
        if (this.a.a.w(this.b)) {
            this.a.a.b(this.b);
        }
    }
}
