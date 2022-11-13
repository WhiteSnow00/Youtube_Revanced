// 
// Decompiled by Procyon v0.6.0
// 

final class abgn extends abgp
{
    final String a;
    final String b;
    
    public abgn(final abgs abgs, final String a, final String b, final String s, final zpf zpf) {
        super(abgs, s, ahab.b, zpf);
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public final void a(final vuh vuh) {
        vuh.x(this.a, this.b);
    }
    
    public final boolean b(final abgp abgp) {
        return abgp instanceof abgn && ((abgn)abgp).a.equals(this.a);
    }
    
    public final boolean c() {
        return true;
    }
}
