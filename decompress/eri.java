// 
// Decompiled by Procyon v0.6.0
// 

public final class eri implements uew
{
    private final eqy a;
    private final int b;
    private final Object c;
    
    public eri(final eqy a, final esn c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public eri(final eqy a, final esp c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final uex a(final uhi uhi) {
        if (this.b != 0) {
            return (uex)new erh(this.a, (esp)this.c, uhi);
        }
        return (uex)new erk(this.a, (esn)this.c, uhi);
    }
}
