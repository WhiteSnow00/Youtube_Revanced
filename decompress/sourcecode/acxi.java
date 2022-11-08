// 
// Decompiled by Procyon v0.6.0
// 

final class acxi extends arsm
{
    final /* synthetic */ acxj a;
    
    public acxi(final acxj a, final arrn arrn) {
        this.a = a;
        super(arrn);
    }
    
    public final void l(final aqzg aqzg, final arug arug) {
        final arug b = this.a.b;
        if (b != null) {
            arug.e(b);
        }
        if (!aexs.f(this.a.c)) {
            arug.f(acxj.a, "Bearer ".concat(String.valueOf(this.a.c)));
        }
        super.l(aqzg, arug);
    }
}
