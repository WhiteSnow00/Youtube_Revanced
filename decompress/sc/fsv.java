import android.content.res.Resources$Theme;
import android.graphics.Paint$Style;
import android.util.TypedValue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsv extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    oby a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    abpu b;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    String c;
    
    public fsv() {
        super("MultimediaProgressBar");
    }
    
    private final fsu aD() {
        return (fsu)super.t;
    }
    
    protected static final fsu b() {
        return new fsu();
    }
    
    protected final int K() {
        return 30;
    }
    
    protected final Object R(final Context context) {
        return new fsw(context);
    }
    
    protected final void Y(final dsx dsx, final dtb dtb) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        elx.a = dtb.H();
        elx2.a = dtb.a();
        this.aD().b = (Integer)elx.a;
        this.aD().a = (Integer)elx2.a;
    }
    
    public final void Z(final dsx dsx, final dtb dtb, final int n, final int n2, final dwq dwq) {
        dwq.a = bma.f(n, 0);
        dwq.b = bma.f(n2, 20);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, Object c) {
        final fsw fsw = (fsw)c;
        final String c2 = this.c;
        final abpu b = this.b;
        final oby a = this.a;
        this.aD().b.intValue();
        this.aD().a.intValue();
        fsw.setBackgroundColor((int)this.aD().c);
        if (aezr.f(c2)) {
            return;
        }
        fsw.l = c2;
        fsw.h = b;
        fsw.i = a;
        fsw.c = 0L;
        fsw.b = 0L;
        fsw.a = 0.0f;
        fsw.e = TypedValue.applyDimension(1, 1.0f, fsw.getResources().getDisplayMetrics());
        final Resources$Theme theme = fsw.getContext().getTheme();
        final TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(2130970874, typedValue, true);
        fsw.f.setStyle(Paint$Style.FILL);
        fsw.f.setColor(typedValue.data);
        theme.resolveAttribute(2130970904, typedValue, true);
        fsw.g.setStyle(Paint$Style.FILL);
        fsw.g.setColor(typedValue.data);
        fsw.k.c(((ashi)fsw.h.p().e).an((asjm)new fqz(fsw, 3), (asjm)ezq.t));
        fsw.k.c(((ashi)fsw.h.p().l).an((asjm)new fqz(fsw, 4), (asjm)ezq.t));
        final asiq j = fsw.j;
        c = fsw.h.p().c;
        j.c(((ashi)c).an((asjm)new fqz(fsw, 5), (asjm)ezq.t));
    }
    
    protected final void ab(final dsx dsx) {
        final elx elx = new elx();
        elx.a = tpe.cr(dsx.b, 2130970872);
        this.aD().c = elx.a;
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        final fsw fsw = (fsw)o;
    }
    
    protected final boolean af() {
        return true;
    }
    
    public final boolean al() {
        return true;
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final fsv fsv = (fsv)dst;
            final oby a = this.a;
            Label_0062: {
                if (a != null) {
                    if (a.equals(fsv.a)) {
                        break Label_0062;
                    }
                }
                else if (fsv.a == null) {
                    break Label_0062;
                }
                return false;
            }
            final abpu b = this.b;
            Label_0094: {
                if (b != null) {
                    if (b.equals(fsv.b)) {
                        break Label_0094;
                    }
                }
                else if (fsv.b == null) {
                    break Label_0094;
                }
                return false;
            }
            final String c = this.c;
            if (c != null) {
                if (c.equals(fsv.c)) {
                    return true;
                }
            }
            else if (fsv.c == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final fsv fsv = (fsv)super.j();
        fsv.t = (duz)b();
        return fsv;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        final fsu fsu = (fsu)duz;
        final fsu fsu2 = (fsu)duz2;
        fsu.c = fsu2.c;
        fsu.a = fsu2.a;
        fsu.b = fsu2.b;
    }
}
