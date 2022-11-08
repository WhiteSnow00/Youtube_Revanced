// 
// Decompiled by Procyon v0.6.0
// 

final class jzq extends acjb
{
    private int a;
    
    public jzq(final int n) {
        this.d(n);
    }
    
    final void d(final int a) {
        if (this.a == a) {
            return;
        }
        if ((this.a = a) <= 0) {
            if (!((tdv)this).isEmpty()) {
                ((tdv)this).clear();
            }
            return;
        }
        if (((tdv)this).isEmpty()) {
            this.add((Object)ftm.a(a));
            return;
        }
        this.n(0, (Object)ftm.a(a));
    }
}
