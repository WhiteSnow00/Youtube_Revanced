// 
// Decompiled by Procyon v0.6.0
// 

public final class kae implements abkd, abka
{
    public boolean a;
    
    public final void b(final boolean b) {
        this.a = (b ^ true);
    }
    
    public final void pO(final agza agza) {
        if (this.a) {
            agza.copyOnWrite();
            final anak anak = (anak)agza.instance;
            final anak a = anak.a;
            anak.c |= 0x400;
            anak.t = true;
        }
    }
    
    public final void sA(final abkg abkg) {
        if (this.a) {
            abkg.Y = true;
            abkg.w((abkf)new abgt(this, 1));
        }
    }
}
