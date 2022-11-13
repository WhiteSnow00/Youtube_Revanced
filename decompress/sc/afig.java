// 
// Decompiled by Procyon v0.6.0
// 

public final class afig extends afee
{
    static final afig b;
    final transient Object[] c;
    public final transient int d;
    public final transient afig e;
    private final transient Object f;
    private final transient int g;
    
    static {
        b = new afig();
    }
    
    private afig() {
        this.f = null;
        this.c = new Object[0];
        this.g = 0;
        this.d = 0;
        this.e = this;
    }
    
    private afig(final Object f, final Object[] c, final int d, final afig e) {
        this.f = f;
        this.c = c;
        this.g = 1;
        this.d = d;
        this.e = e;
    }
    
    public afig(final Object[] c, final int d) {
        this.c = c;
        this.d = d;
        this.g = 0;
        int d2;
        if (d >= 2) {
            d2 = afft.d(d);
        }
        else {
            d2 = 0;
        }
        this.f = afim.u(c, d, d2, 0);
        this.e = new afig(afim.u(c, d, d2, 1), c, d, this);
    }
    
    public final afee c() {
        return this.e;
    }
    
    public final afft g() {
        return new afik((afev)this, new afil(this.c, this.g, this.d));
    }
    
    public final Object get(Object v) {
        if ((v = afim.v(this.f, this.c, this.d, this.g, v)) == null) {
            v = null;
        }
        return v;
    }
    
    public final int size() {
        return this.d;
    }
    
    public final afft to() {
        return new afij((afev)this, this.c, this.g, this.d);
    }
    
    public final void tq() {
    }
}
