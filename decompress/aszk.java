// 
// Decompiled by Procyon v0.6.0
// 

public final class aszk extends asie implements askn
{
    final ashw a;
    final Object b;
    private final int c;
    
    public aszk(final ashw a, final asjs b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aszk(final ashw a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final asht a() {
        Object o;
        if (this.c != 0) {
            o = new asxt(this.a);
        }
        else {
            o = new aszh(this.a, this.b, true);
        }
        final asjr l = atqx.l;
        return (asht)o;
    }
    
    public final void af(final asif asif) {
        if (this.c != 0) {
            this.a.aP(new asxu(asif, 0));
            return;
        }
        this.a.aP((ashy)new aszj(asif, this.b));
    }
}
