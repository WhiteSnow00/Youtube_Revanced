// 
// Decompiled by Procyon v0.6.0
// 

public final class afgg extends afcf
{
    static final afgg b;
    final transient Object[] c;
    public final transient int d;
    public final transient afgg e;
    private final transient Object f;
    private final transient int g;
    
    static {
        b = new afgg();
    }
    
    private afgg() {
        this.f = null;
        this.c = new Object[0];
        this.g = 0;
        this.d = 0;
        this.e = this;
    }
    
    private afgg(final Object f, final Object[] c, final int d, final afgg e) {
        this.f = f;
        this.c = c;
        this.g = 1;
        this.d = d;
        this.e = e;
    }
    
    public afgg(final Object[] c, final int d) {
        this.c = c;
        this.d = d;
        this.g = 0;
        int d2;
        if (d >= 2) {
            d2 = afdu.d(d);
        }
        else {
            d2 = 0;
        }
        this.f = afgm.u(c, d, d2, 0);
        this.e = new afgg(afgm.u(c, d, d2, 1), c, d, this);
    }
    
    public final afcf c() {
        return this.e;
    }
    
    public final afdu g() {
        return new afgk((afcw)this, new afgl(this.c, this.g, this.d));
    }
    
    public final Object get(Object v) {
        if ((v = afgm.v(this.f, this.c, this.d, this.g, v)) == null) {
            v = null;
        }
        return v;
    }
    
    public final int size() {
        return this.d;
    }
    
    public final afdu tj() {
        return new afgj((afcw)this, this.c, this.g, this.d);
    }
    
    public final void tl() {
    }
}
