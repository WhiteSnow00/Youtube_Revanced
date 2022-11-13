// 
// Decompiled by Procyon v0.6.0
// 

public final class aben implements abmf
{
    public aezp a;
    public final abrj b;
    private final arkg c;
    
    public aben(final abrj b, final arkg c, final byte[] array) {
        this.b = b;
        this.a = (aezp)aeyo.a;
        this.c = c;
    }
    
    public final void sG(final abmi abmi) {
        if (this.a.h()) {
            abmi.W = (yzj)this.a.c();
            return;
        }
        anqr anqr;
        if ((anqr = abrj.af((arwh)this.b.a).l) == null) {
            anqr = anqr.a;
        }
        if (anqr.k) {
            final yzj b = ((yzl)this.c.a()).b();
            if (b != null) {
                abmi.W = b;
            }
        }
    }
}
