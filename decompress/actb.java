// 
// Decompiled by Procyon v0.6.0
// 

public class actb implements acrf
{
    private final vnq a;
    protected final acpr b;
    protected final acpr c;
    protected final xab d;
    protected final aapu e;
    private final thg f;
    private final acrd g;
    private final tre h;
    
    public actb(final vnq a, final thg f, final acrd g, final tre h, final xab d, final acpr b, final acpr c, final aapu e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        this.d = d;
        h.getClass();
        this.h = h;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public acre a(final Object o, final acsx acsx, final acss acss) {
        if (o instanceof vhz) {
            final acrl acrl = new acrl(this.a, this.g, this.f, this.h, this.d, acsx);
            if (acsx == null) {
                acrl.j((vhz)o);
            }
            return acrl;
        }
        if (o instanceof allx) {
            return new acrn(this.a, this.g, this.f, this.h, this.d, (allx)o);
        }
        if (o instanceof vih) {
            final aoft a = ((vih)o).a;
            return (acre)new acta(this.g, this.f, a, aamz.p(a), (acsq)null, (acdr)null, acsx);
        }
        if (o instanceof vhy) {
            final aoft a2 = ((vhy)o).a;
            return (acre)new acqt(this.g, this.f, a2, aamz.o(a2), this.b(a2), acsx);
        }
        if (o instanceof anmt) {
            final acry acry = new acry(this.a, this.g, this.f, this.h, this.d);
            acry.m((anmt)o);
            return acry;
        }
        return null;
    }
    
    protected final acqr b(final aoft aoft) {
        final aapu e = this.e;
        if (e != null) {
            return e.bW(aoft, this.b);
        }
        return acsv.a;
    }
}
