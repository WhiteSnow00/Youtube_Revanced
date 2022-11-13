// 
// Decompiled by Procyon v0.6.0
// 

public final class atej extends atit
{
    final atit a;
    final asid b;
    final int c;
    
    public atej(final atit a, final asid b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a() {
        return ((atea)this.a).b;
    }
    
    final void b(final int n, final aukf[] array, final aukf[] array2, final asic asic) {
        final aukf aukf = array[n];
        final atgg atgg = new atgg(this.c);
        if (aukf instanceof askl) {
            array2[n] = (aukf)new ateh((askl)aukf, this.c, atgg, asic);
            return;
        }
        array2[n] = (aukf)new atei(aukf, this.c, atgg, asic);
    }
}
