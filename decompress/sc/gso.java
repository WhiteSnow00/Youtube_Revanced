import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gso extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    gtk a;
    @dyi(a = 3)
    @dyj(a = dyk.a)
    boolean b;
    
    public gso() {
        super("ClipBounds");
    }
    
    private final gsn aD() {
        return (gsn)super.t;
    }
    
    protected static final gsn b() {
        return new gsn();
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new gth(context);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final gth q = (gth)o;
        final gtk a = this.a;
        final int intValue = this.aD().c;
        final int intValue2 = this.aD().b;
        final int intValue3 = this.aD().a;
        final int intValue4 = this.aD().f;
        final int intValue5 = this.aD().d;
        final int intValue6 = this.aD().e;
        final Paint i = this.aD().i;
        final Paint h = this.aD().h;
        final Paint g = this.aD().g;
        q.p = (gtg)a;
        q.a = intValue;
        q.b = intValue2;
        q.c = intValue3;
        q.d = intValue4;
        q.e = intValue5;
        q.f = intValue6;
        q.g = i;
        q.h = h;
        q.i = g;
        a.q = q;
    }
    
    protected final void ab(final dsx dsx) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        final elx elx4 = new elx();
        final elx elx5 = new elx();
        final elx elx6 = new elx();
        final elx elx7 = new elx();
        final elx elx8 = new elx();
        final elx elx9 = new elx();
        final boolean b = this.b;
        elx.a = gth.a(dsx.b);
        elx2.a = tpe.aZ(dsx.b.getResources().getDisplayMetrics(), 48);
        elx3.a = tpe.aZ(dsx.b.getResources().getDisplayMetrics(), 4);
        elx4.a = tpe.aZ(dsx.b.getResources().getDisplayMetrics(), 2);
        elx5.a = tpe.aZ(dsx.b.getResources().getDisplayMetrics(), 24);
        elx6.a = tpe.aZ(dsx.b.getResources().getDisplayMetrics(), 1);
        final Context b2 = dsx.b;
        final Paint a = new Paint();
        a.setColor(tpe.cr(b2, 2130970852));
        a.setStyle(Paint$Style.FILL);
        a.setAntiAlias(true);
        elx7.a = a;
        final Context b3 = dsx.b;
        final Paint a2 = new Paint();
        if (b) {
            a2.setColor(tpe.cr(b3, 2130970845));
            a2.setAlpha(153);
        }
        else {
            a2.setColor(tpe.cr(b3, 2130970942));
        }
        a2.setStyle(Paint$Style.FILL);
        elx8.a = a2;
        final Context b4 = dsx.b;
        final Paint a3 = new Paint();
        a3.setColor(tpe.cr(b4, 2130970908));
        a3.setStyle(Paint$Style.FILL);
        a3.setAntiAlias(true);
        elx9.a = a3;
        this.aD().c = (Integer)elx.a;
        this.aD().b = (Integer)elx2.a;
        this.aD().a = (Integer)elx3.a;
        this.aD().f = (Integer)elx4.a;
        this.aD().d = (Integer)elx5.a;
        this.aD().e = (Integer)elx6.a;
        this.aD().i = (Paint)elx7.a;
        this.aD().h = (Paint)elx8.a;
        this.aD().g = (Paint)elx9.a;
    }
    
    public final int an() {
        return 3;
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final gso gso = (gso)dst;
            final gtk a = this.a;
            if (a != null) {
                if (a.equals(gso.a)) {
                    return this.b == gso.b;
                }
            }
            else if (gso.a == null) {
                return this.b == gso.b;
            }
            return false;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final gso gso = (gso)super.j();
        gso.t = (duz)b();
        return gso;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        final gsn gsn = (gsn)duz;
        final gsn gsn2 = (gsn)duz2;
        gsn.a = gsn2.a;
        gsn.b = gsn2.b;
        gsn.c = gsn2.c;
        gsn.d = gsn2.d;
        gsn.e = gsn2.e;
        gsn.f = gsn2.f;
        gsn.g = gsn2.g;
        gsn.h = gsn2.h;
        gsn.i = gsn2.i;
    }
}
