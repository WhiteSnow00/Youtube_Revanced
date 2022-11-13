import android.widget.TextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsq extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    gtk a;
    
    public gsq() {
        super("ClipDurationText");
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
        return new TextView(context);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final TextView p2 = (TextView)o;
        final int intValue = (int)this.aD().a;
        final gtk a = this.a;
        final Context b = dsx.b;
        (a.p = p2).setTextSize(12.0f);
        p2.setTypeface(acan.a.a(b));
        p2.setTextColor(intValue);
        p2.setGravity(17);
    }
    
    protected final void ab(final dsx dsx) {
        final elx elx = new elx();
        elx.a = tpe.cr(dsx.b, 2130970926);
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
            final gsq gsq = (gsq)dst;
            final gtk a = this.a;
            if (a != null) {
                if (a.equals(gsq.a)) {
                    return true;
                }
            }
            else if (gsq.a == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final gsq gsq = (gsq)super.j();
        gsq.t = (duz)b();
        return gsq;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        ((gsz)duz).a = ((gsz)duz2).a;
    }
}
