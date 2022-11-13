import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhi extends augy
{
    public static final auhi H;
    private static final ConcurrentHashMap I;
    private static final long serialVersionUID = -861407383323710522L;
    
    static {
        I = new ConcurrentHashMap();
        H = ak(auft.a);
    }
    
    private auhi(final aufl aufl, final int n) {
        super(aufl, n);
    }
    
    public static auhi ak(final auft auft) {
        return al(auft, 4);
    }
    
    public static auhi al(auft o, final int n) {
        Object k = o;
        if (o == null) {
            k = auft.k();
        }
        final ConcurrentHashMap i = auhi.I;
        if ((o = i.get(k)) == null) {
            o = new auhi[7];
            final auhi[] array = (auhi[])i.putIfAbsent(k, o);
            if (array != null) {
                o = array;
            }
        }
        final int n2 = n - 1;
        final auhi auhi;
        if ((auhi = o[n2]) == null) {
            monitorenter(o);
            Label_0136: {
                if (o[n2] != null) {
                    break Label_0136;
                }
                try {
                    final auft a = auft.a;
                    auhi auhi2;
                    if (k == a) {
                        auhi2 = new auhi(null, n);
                    }
                    else {
                        auhi2 = new auhi((aufl)auho.O((aufl)al(a, n), (auft)k), n);
                    }
                    o[n2] = auhi2;
                }
                finally {
                    monitorexit(o);
                }
            }
        }
        return auhi;
    }
    
    private Object readResolve() {
        final aufl a = ((augs)this).a;
        int g;
        if ((g = super.G) == 0) {
            g = 4;
        }
        auhi auhi;
        if (a == null) {
            auhi = al(auft.a, g);
        }
        else {
            auhi = al(a.z(), g);
        }
        return auhi;
    }
    
    protected final void N(final augr augr) {
        if (((augs)this).a == null) {
            augr.a = augv.o;
            augr.b = augv.p;
            augr.c = augv.q;
            augr.d = augv.r;
            augr.e = augv.s;
            augr.f = augv.t;
            augr.g = augv.u;
            augr.m = augv.v;
            augr.n = augv.w;
            augr.o = augv.x;
            augr.p = augv.y;
            augr.q = augv.z;
            augr.r = augv.A;
            augr.s = augv.B;
            augr.u = augv.C;
            augr.t = augv.D;
            augr.v = augv.E;
            augr.w = augv.F;
            augr.E = (aufn)new auhc((augv)this);
            augr.F = (aufn)new auhh(augr.E, (augv)this);
            final aufn f = augr.F;
            aufp p;
            if (f == null) {
                p = null;
            }
            else {
                p = f.p();
            }
            augr.H = (aufn)new auhu((aufn)new auhy(f, p, 99), aufp.d);
            augr.k = augr.H.q();
            final auhu auhu = (auhu)augr.H;
            augr.G = (aufn)new auhy((aufn)new auic(auhu, ((auhq)auhu).g), aufp.e);
            augr.I = (aufn)new auhe((augv)this);
            augr.x = (aufn)new auhd((augv)this, augr.f);
            augr.y = (aufn)new augw((augv)this, augr.f);
            augr.z = (aufn)new augx((augv)this, augr.f);
            augr.D = (aufn)new auhg(this);
            augr.B = (aufn)new auhb((augv)this);
            augr.A = (aufn)new auha((augv)this, augr.g);
            augr.C = (aufn)new auhy((aufn)new auic(augr.B, augr.k, aufp.j), aufp.j);
            augr.j = augr.E.q();
            augr.i = augr.D.q();
            augr.h = augr.B.q();
        }
    }
    
    public final aufl a() {
        return (aufl)auhi.H;
    }
    
    public final long aa(final int n) {
        final int n2 = n / 100;
        int n3;
        if (n < 0) {
            n3 = (n + 3 >> 2) - n2 + (n2 + 3 >> 2);
        }
        else {
            final boolean aj = this.aj(n);
            final int n4;
            n3 = (n4 = (n >> 2) - n2 + (n2 >> 2));
            if (!aj) {
                return (n * 365L + (n4 - 719527)) * 86400000L;
            }
        }
        int n4 = n3 - 1;
        return (n * 365L + (n4 - 719527)) * 86400000L;
    }
    
    public final boolean aj(final int n) {
        boolean b = false;
        if ((n & 0x3) == 0x0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final aufl b(final auft auft) {
        if (auft == ((augs)this).z()) {
            return (aufl)this;
        }
        return (aufl)ak(auft);
    }
}
