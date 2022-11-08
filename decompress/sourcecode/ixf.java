// 
// Decompiled by Procyon v0.6.0
// 

public final class ixf
{
    public final boolean a;
    public final int b;
    public final int c;
    public int d;
    private final tku e;
    
    public ixf(final tku e, final uyi uyi, final uyi uyi2, final uyi uyi3) {
        this.e = e;
        final boolean f = uyi.f(45357559L);
        boolean a;
        final boolean b = a = true;
        if (!f) {
            a = b;
            if (!uyi2.cD()) {
                a = (uyi3.aV() && b);
            }
        }
        this.a = a;
        final int a2 = aesy.A(uyi.h(45357558L));
        this.b = a2;
        final int a3 = aesy.A(uyi.h(45357557L));
        this.c = a3;
        if (!a && (a2 != 0 || a3 != 0)) {
            e.d().R().L((asjc)iqc.o).p().al((asix)new iws(this, 10));
        }
    }
    
    public final void a() {
        tcp.m(this.e.b((aexg)imx.u), (tcn)idu.u);
    }
}
