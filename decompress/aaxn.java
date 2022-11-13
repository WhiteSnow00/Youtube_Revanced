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
    
    public final aaxp a(final aiqj aiqj) {
        return new aaxp(this.a, aiqj, true);
    }
    
    public final aaxu b() {
        return aaxu.b;
    }
    
    public final aiqj c() {
        return this.b;
    }
    
    public final Optional d(final aani aani) {
        return Optional.of((Object)new aaxm(this.a, aani.b(), aani.d(), 1));
    }
    
    public final void e() {
        if (this.a.a.w(this.b)) {
            this.a.a.b(this.b);
        }
    }
}
