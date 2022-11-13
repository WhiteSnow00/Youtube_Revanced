import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaxp implements aaxo
{
    final aaxq a;
    private final aiqj b;
    private final boolean c;
    
    public aaxp(final aaxq a, final aiqj b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final aaxp a(final aiqj aiqj) {
        return new aaxp(this.a, aiqj, true);
    }
    
    @Override
    public final aaxu b() {
        return aaxu.a;
    }
    
    @Override
    public final aiqj c() {
        return this.b;
    }
    
    @Override
    public final Optional d(final aani aani) {
        return Optional.of((Object)new aaxn(this.a, aani.d()));
    }
    
    @Override
    public final void e() {
        if (this.c) {
            this.a.a.m(this.b);
        }
        final aawy a = this.a.a;
        a.r(a.x(this.b));
    }
}
