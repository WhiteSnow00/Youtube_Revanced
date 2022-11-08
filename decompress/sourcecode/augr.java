import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augr extends augh
{
    public static final augr H;
    private static final ConcurrentHashMap I;
    private static final long serialVersionUID = -861407383323710522L;
    
    static {
        I = new ConcurrentHashMap();
        H = ak(aufc.a);
    }
    
    private augr(final aueu aueu, final int n) {
        super(aueu, n);
    }
    
    public static augr ak(final aufc aufc) {
        return al(aufc, 4);
    }
    
    public static augr al(aufc o, final int n) {
        Object k = o;
        if (o == null) {
            k = aufc.k();
        }
        final ConcurrentHashMap i = augr.I;
        if ((o = i.get(k)) == null) {
            o = new augr[7];
            final augr[] array = (augr[])i.putIfAbsent(k, o);
            if (array != null) {
                o = array;
            }
        }
        final int n2 = n - 1;
        final augr augr;
        if ((augr = o[n2]) == null) {
            monitorenter(o);
            Label_0140: {
                if (o[n2] != null) {
                    break Label_0140;
                }
                try {
                    final aufc a = aufc.a;
                    augr augr2;
                    if (k == a) {
                        augr2 = new augr(null, n);
                    }
                    else {
                        augr2 = new augr((aueu)augx.O((aueu)al(a, n), (aufc)k), n);
                    }
                    o[n2] = augr2;
                }
                finally {
                    monitorexit(o);
                }
            }
        }
        return augr;
    }
    
    private Object readResolve() {
        final aueu a = ((augb)this).a;
        int g;
        if ((g = super.G) == 0) {
            g = 4;
        }
        augr augr;
        if (a == null) {
            augr = al(aufc.a, g);
        }
        else {
            augr = al(a.z(), g);
        }
        return augr;
    }
    
    protected final void N(final auga auga) {
        if (((augb)this).a == null) {
            auga.a = auge.o;
            auga.b = auge.p;
            auga.c = auge.q;
            auga.d = auge.r;
            auga.e = auge.s;
            auga.f = auge.t;
            auga.g = auge.u;
            auga.m = auge.v;
            auga.n = auge.w;
            auga.o = auge.x;
            auga.p = auge.y;
            auga.q = auge.z;
            auga.r = auge.A;
            auga.s = auge.B;
            auga.u = auge.C;
            auga.t = auge.D;
            auga.v = auge.E;
            auga.w = auge.F;
            auga.E = (auew)new augl((auge)this);
            auga.F = (auew)new augq(auga.E, (auge)this);
            final auew f = auga.F;
            auey p;
            if (f == null) {
                p = null;
            }
            else {
                p = f.p();
            }
            auga.H = (auew)new auhd((auew)new auhh(f, p, 99), auey.d);
            auga.k = auga.H.q();
            final auhd auhd = (auhd)auga.H;
            auga.G = (auew)new auhh((auew)new auhl(auhd, ((augz)auhd).g), auey.e);
            auga.I = (auew)new augn((auge)this);
            auga.x = (auew)new augm((auge)this, auga.f);
            auga.y = (auew)new augf((auge)this, auga.f);
            auga.z = (auew)new augg((auge)this, auga.f);
            auga.D = (auew)new augp(this);
            auga.B = (auew)new augk((auge)this);
            auga.A = (auew)new augj((auge)this, auga.g);
            auga.C = (auew)new auhh((auew)new auhl(auga.B, auga.k, auey.j), auey.j);
            auga.j = auga.E.q();
            auga.i = auga.D.q();
            auga.h = auga.B.q();
        }
    }
    
    public final aueu a() {
        return (aueu)augr.H;
    }
    
    public final long aa(final int n) {
        final int n2 = n / 100;
        int n3;
        if (n < 0) {
            n3 = (n + 3 >> 2) - n2 + (n2 + 3 >> 2);
        }
        else {
            final int n4;
            n3 = (n4 = (n >> 2) - n2 + (n2 >> 2));
            if (!this.aj(n)) {
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
    
    public final aueu b(final aufc aufc) {
        if (aufc == ((augb)this).z()) {
            return (aueu)this;
        }
        return (aueu)ak(aufc);
    }
}
