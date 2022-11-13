import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gst extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    gtk a;
    
    public gst() {
        super("ClipPlaybackMarker");
    }
    
    private final gss aD() {
        return (gss)super.t;
    }
    
    protected static final gss b() {
        return new gss();
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new gtl(context);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final gtl r = (gtl)o;
        final gtk a = this.a;
        final int intValue = this.aD().b;
        final int intValue2 = this.aD().c;
        final int intValue3 = this.aD().a;
        final Object e = this.aD().e;
        final int intValue4 = (int)this.aD().d;
        r.b = intValue;
        r.c = intValue2;
        r.d = intValue3;
        r.a = (Paint)e;
        r.f = intValue4;
        a.r = r;
    }
    
    protected final void ab(final dsx dsx) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        final elx elx4 = new elx();
        final elx elx5 = new elx();
        elx.a = tpe.aZ(dsx.b.getResources().getDisplayMetrics(), 4);
        elx2.a = tpe.aZ(dsx.b.getResources().getDisplayMetrics(), 4);
        elx3.a = tpe.aZ(dsx.b.getResources().getDisplayMetrics(), 2);
        final Context b = dsx.b;
        final Paint a = new Paint();
        a.setColor(tpe.cr(b, 2130970850));
        a.setStyle(Paint$Style.FILL);
        a.setAntiAlias(true);
        elx4.a = a;
        elx5.a = gth.a(dsx.b);
        this.aD().b = (Integer)elx.a;
        this.aD().c = (Integer)elx2.a;
        this.aD().a = (Integer)elx3.a;
        this.aD().e = elx4.a;
        this.aD().d = elx5.a;
    }
    
    public final int an() {
        return 3;
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final gst gst = (gst)dst;
            final gtk a = this.a;
            if (a != null) {
                if (a.equals(gst.a)) {
                    return true;
                }
            }
            else if (gst.a == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final gst gst = (gst)super.j();
        gst.t = (duz)b();
        return gst;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        final gss gss = (gss)duz;
        final gss gss2 = (gss)duz2;
        gss.d = gss2.d;
        gss.a = gss2.a;
        gss.b = gss2.b;
        gss.e = gss2.e;
        gss.c = gss2.c;
    }
}
