import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ouz extends dss
{
    @dyh(a = 13)
    @dyi(a = dyj.a)
    public Boolean a;
    @dyh(a = 13)
    @dyi(a = dyj.a)
    ouo b;
    @dyh(a = 13)
    @dyi(a = dyj.a)
    orz c;
    
    private ouz() {
        super("LazilyConvertedElement");
        this.c = ova.a;
    }
    
    private final ouy aD() {
        return (ouy)super.s;
    }
    
    public static oux b(final dsw dsw) {
        final oux oux = new oux();
        oux.d(oux, dsw, new ouz());
        return oux;
    }
    
    protected final void T(final dsw dsw) {
        final elw elw = new elw();
        final elw elw2 = new elw();
        ova.c(elw, elw2);
        this.aD().b = (AtomicReference)elw.a;
        this.aD().a = (AtomicReference)elw2.a;
    }
    
    protected final void ad(final dwq dwq, final dwq dwq2) {
        final ouy ouy = (ouy)dwq;
        final ouy ouy2 = (ouy)dwq2;
        ouy2.a = ouy.a;
        ouy2.b = ouy.b;
    }
    
    protected final boolean ag() {
        return true;
    }
    
    protected final boolean ai() {
        return true;
    }
    
    public final void as() {
        ova.b(this.a, this.aD().b);
    }
    
    protected final dss c(final dsw dsw) {
        return ova.a(dsw, this.b, this.c, this.aD().b, this.aD().a);
    }
}
