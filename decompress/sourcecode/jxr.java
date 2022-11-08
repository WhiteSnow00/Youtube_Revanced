// 
// Decompiled by Procyon v0.6.0
// 

final class jxr extends acls
{
    final /* synthetic */ jxj a;
    final /* synthetic */ acor b;
    final /* synthetic */ frb c;
    final /* synthetic */ String d;
    final /* synthetic */ fyx e;
    final /* synthetic */ wwv f;
    
    public jxr(final jxj a, final acor b, final frb c, final String d, final fyx e, final wwv f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void c(final veu veu, final boolean b) {
        if (!b) {
            this.a.j();
            return;
        }
        final fzk b2 = jyg.b(this.a, this.b, this.c);
        b2.a = this.d;
        final fzl a = b2.a();
        if (jyg.g(this.d)) {
            if (!jyg.e(veu)) {
                this.a.h();
                this.e.j();
            }
            if (!this.a.n()) {
                jyg.d(this.a.l(veu, (acpd)this.b, this.f), this.e, a);
            }
        }
        else {
            final jxj a2 = this.a;
            if (a2.m()) {
                jyg.d(a2.r(veu), this.e, a);
            }
        }
    }
}
