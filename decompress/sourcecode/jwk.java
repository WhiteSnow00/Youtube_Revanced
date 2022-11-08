import android.graphics.drawable.Drawable;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwk
{
    public final aceo a;
    public final acdx b;
    public final gko c;
    public final Activity d;
    public final ashe e;
    public final int f;
    final jwi g;
    public final uyi h;
    private final gfc i;
    
    public jwk(final arud arud, final uyi h, final Activity d, final vcf vcf, final vbq vbq, final zki zki, final hyj hyj, final tku tku, final gko c, final gfc i, final aceo a, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.g = jwi.a;
        d.getClass();
        this.d = d;
        h.getClass();
        this.h = h;
        a.getClass();
        this.a = a;
        this.b = new acdx((Context)d);
        c.getClass();
        this.c = c;
        i.getClass();
        this.i = i;
        this.f = d.getResources().getDimensionPixelSize(2131170400);
        final ashe z = hyj.a().M((asjc)jxl.b).W((asjc)jch.p).z();
        this.e = ashe.o((ashh)tku.d().L((asjc)jch.r).p().ai(), (ashh)z, (ashh)ashe.m((ashh)arud.h(), (ashh)z, (asit)iun.q).ak((asjc)new flh(vcf, zki, vbq, 8)).A((asiu)lfu.b), (asiy)exg.k).M((asjc)new jwf(this)).ai((Object)aewp.a).p(tmy.ch(mrm.u())).aP().d().z();
    }
    
    private static Drawable b(final asit asit, final Activity activity, final int n) {
        try {
            return (Drawable)((aexq)asit.a(activity, n)).f();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public final asgy a(final akbf akbf, final aioe aioe, final alts alts, final ahgn ahgn) {
        agnj.A((Object)this.i);
        agnj.A((Object)this.d);
        final gfc i = this.i;
        akbe akbe;
        if ((akbe = akbe.b(akbf.c)) == null) {
            akbe = akbe.a;
        }
        final int a = i.a(akbe);
        if (a != 0) {
            Drawable drawable;
            if ((drawable = b((asit)iun.r, this.d, a)) == null) {
                drawable = b((asit)iun.s, this.d, a);
            }
            if (drawable != null) {
                return asgy.B((Object)aexq.k((Object)new jwy(drawable, aioe, alts, ahgn, 0)));
            }
        }
        return asgy.B((Object)aewp.a);
    }
}
