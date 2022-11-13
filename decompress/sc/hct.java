// 
// Decompiled by Procyon v0.6.0
// 

final class hct extends tlv
{
    final long a;
    final eg b;
    
    public hct(final eg b, final String s, final dbe dbe, final long a, final byte[] array) {
        this.b = b;
        this.a = a;
        super(1, s, dbe);
    }
    
    public final aln c(final dbb dbb) {
        return aln.n((Object)dbb.b, (daw)null);
    }
    
    public final /* bridge */ void rL(Object b) {
        final byte[] array = (byte[])b;
        b = this.b.b;
        ((hcq)b).q(this.a, aezp.k((Object)array));
        final gxp gxp = (gxp)this.b.c;
        final xan g = gxp.g;
        if (g == null) {
            return;
        }
        g.c("aft");
        gxp.g = null;
    }
}
