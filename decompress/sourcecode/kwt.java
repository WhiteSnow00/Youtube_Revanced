import android.graphics.Rect;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwt implements uvz
{
    public final Context a;
    public final atie b;
    public final atie c;
    public int d;
    public Rect e;
    private final asgt f;
    private final asgt g;
    private final lbn h;
    
    public kwt(final Context a, final lbn h, final hob hob, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.h = h;
        final atie ak = ((atie)atid.aD()).aK();
        this.b = ak;
        final atie ak2 = ((atie)atid.aD()).aK();
        this.c = ak2;
        this.f = ((asgt)ak2).j((asgx)kwc.c).j(tmy.ck(mrm.u()));
        this.e = new Rect();
        this.g = asgt.e((aujo)ak, (aujo)asgt.K((Object)false).l((aujo)hob.e), (asit)kwo.e).j((asgx)kwc.c).j(tmy.ck(mrm.u()));
    }
    
    public static int g(final Rect rect) {
        return rect.bottom - Math.max(0, rect.top);
    }
    
    public final int a() {
        return this.d;
    }
    
    public final Rect b() {
        return this.e;
    }
    
    public final asgt c() {
        return this.f;
    }
    
    public final asgt d() {
        return this.f.L((asjc)new kpm(this, 10));
    }
    
    public final asgt e() {
        return this.g;
    }
    
    public final void f() {
        final kyz c = this.h.c();
        this.b.tr((Object)g(c.u()));
        this.c.tr((Object)c.s());
        this.h.i((kyy)new lbm(this, 1));
        this.g.al((asix)new kwb(this, 13));
        this.f.al((asix)new kwb(this, 14));
    }
}
