import android.graphics.Paint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gta extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    gtk a;
    
    public gta() {
        super("ClipTimeIndex");
    }
    
    private final gsz aD() {
        return (gsz)super.t;
    }
    
    protected static final gsz b() {
        return new gsz();
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new gtv(context);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final gtv o2 = (gtv)o;
        final gtk a = this.a;
        final int intValue = (int)this.aD().a;
        final Context b = dsx.b;
        final Paint a2 = new Paint();
        a2.setTextSize(b.getResources().getDisplayMetrics().scaledDensity * 12.0f);
        a2.setTypeface(acan.a.a(b));
        a2.setColor(tpe.cr(b, 2130970924));
        a2.setAntiAlias(true);
        o2.a = a2;
        o2.e = intValue;
        a.o = o2;
    }
    
    protected final void ab(final dsx dsx) {
        final elx elx = new elx();
        elx.a = gth.a(dsx.b);
        this.aD().a = elx.a;
    }
    
    public final int an() {
        return 3;
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final gta gta = (gta)dst;
            final gtk a = this.a;
            if (a != null) {
                if (a.equals(gta.a)) {
                    return true;
                }
            }
            else if (gta.a == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final gta gta = (gta)super.j();
        gta.t = (duz)b();
        return gta;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        ((gsz)duz).a = ((gsz)duz2).a;
    }
}
