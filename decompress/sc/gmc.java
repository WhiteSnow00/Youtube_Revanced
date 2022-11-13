import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmc implements vws
{
    private final Context a;
    private final boolean b;
    
    public gmc(final Context a, final vaf vaf) {
        this.a = a;
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        this.b = alxp.aB;
    }
    
    public final void oM(final vwv vwv) {
        if (this.b && tbi.g()) {
            final ahaz u = ((vkk)vwv).u();
            akld akld;
            if ((akld = ((aklg)u.instance).c) == null) {
                akld = akld.a;
            }
            aklb aklb;
            if ((aklb = aklb.b(akld.K)) == null) {
                aklb = aklb.a;
            }
            if (aklb != aklb.c && aklb != aklb.b && aklb != aklb.a) {
                return;
            }
            akld akld2;
            if ((akld2 = ((aklg)u.instance).c) == null) {
                akld2 = akld.a;
            }
            final ahaz builder = ((ahbh)akld2).toBuilder();
            final aklb d = hox.d(this.a);
            builder.copyOnWrite();
            final akld akld3 = (akld)builder.instance;
            akld3.K = d.f;
            akld3.d |= 0x2;
            u.copyOnWrite();
            final aklg aklg = (aklg)u.instance;
            final akld c = (akld)builder.build();
            c.getClass();
            aklg.c = c;
            aklg.b |= 0x1;
        }
    }
}
