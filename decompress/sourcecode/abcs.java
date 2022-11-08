// 
// Decompiled by Procyon v0.6.0
// 

public final class abcs implements abkd
{
    public aexq a;
    public final abpj b;
    private final arhr c;
    
    public abcs(final abpj b, final arhr c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = aewp.a;
        this.c = c;
    }
    
    public final void sA(final abkg abkg) {
        if (this.a.h()) {
            abkg.W = (yxo)this.a.c();
            return;
        }
        anon anon;
        if ((anon = abpj.Y((arud)this.b.b).l) == null) {
            anon = anon.a;
        }
        if (anon.k) {
            final yxo b = ((yxr)this.c.a()).b();
            if (b != null) {
                abkg.W = b;
            }
        }
    }
}
