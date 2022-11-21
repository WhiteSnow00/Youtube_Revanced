// 
// Decompiled by Procyon v0.6.0
// 

public final class bm implements sd
{
    final Object a;
    private final int b;
    
    public bm(final br a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bm(final rj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(final Object o) {
        if (this.b != 0) {
            final Void void1 = (Void)o;
            final br br = (br)this.a;
            final bz a = br.A;
            rj rj;
            if (a instanceof rk) {
                rj = ((rk)a).getActivityResultRegistry();
            }
            else {
                rj = ((qu)br.ob()).getActivityResultRegistry();
            }
            return rj;
        }
        final Void void2 = (Void)o;
        return this.a;
    }
}
