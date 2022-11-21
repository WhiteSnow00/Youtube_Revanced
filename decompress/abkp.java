// 
// Decompiled by Procyon v0.6.0
// 

final class abkp extends zff
{
    final abkq a;
    
    public abkp(final abkq a) {
        this.a = a;
    }
    
    public final /* bridge */ Object a() {
        final abkq a = this.a;
        final zfd d = a.d;
        final zfe b = a.b();
        zfe a2 = new zfe(b.c, b.d, this.a.u());
        if (a2.c == -1 || a2.d == -1) {
            if (d != null && d.D()) {
                a2 = new zfe(d.b(), d.a(), this.a.u());
            }
            else {
                a2 = zfe.a;
            }
        }
        return a2;
    }
}
