import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auho extends augs
{
    private static final long serialVersionUID = -1079258847191166848L;
    
    private auho(final aufl aufl, final auft auft) {
        super(aufl, (Object)auft);
    }
    
    public static auho O(aufl a, final auft auft) {
        if (a == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        a = a.a();
        if (a != null) {
            return new auho(a, auft);
        }
        throw new IllegalArgumentException("UTC chronology must not be null");
    }
    
    static boolean P(final aufv aufv) {
        return aufv != null && aufv.e() < 43200000L;
    }
    
    private final aufn Q(final aufn aufn, final HashMap hashMap) {
        if (aufn == null || !aufn.u()) {
            return aufn;
        }
        if (hashMap.containsKey(aufn)) {
            return hashMap.get(aufn);
        }
        final auhm auhm = new auhm(aufn, (auft)super.b, this.R(aufn.q(), hashMap), this.R(aufn.s(), hashMap), this.R(aufn.r(), hashMap));
        hashMap.put(aufn, auhm);
        return (aufn)auhm;
    }
    
    private final aufv R(final aufv aufv, final HashMap hashMap) {
        if (aufv == null || !aufv.h()) {
            return aufv;
        }
        if (hashMap.containsKey(aufv)) {
            return hashMap.get(aufv);
        }
        final auhn auhn = new auhn(aufv, (auft)super.b);
        hashMap.put(aufv, auhn);
        return (aufv)auhn;
    }
    
    protected final void N(final augr augr) {
        final HashMap hashMap = new HashMap();
        augr.l = this.R(augr.l, hashMap);
        augr.k = this.R(augr.k, hashMap);
        augr.j = this.R(augr.j, hashMap);
        augr.i = this.R(augr.i, hashMap);
        augr.h = this.R(augr.h, hashMap);
        augr.g = this.R(augr.g, hashMap);
        augr.f = this.R(augr.f, hashMap);
        augr.e = this.R(augr.e, hashMap);
        augr.d = this.R(augr.d, hashMap);
        augr.c = this.R(augr.c, hashMap);
        augr.b = this.R(augr.b, hashMap);
        augr.a = this.R(augr.a, hashMap);
        augr.E = this.Q(augr.E, hashMap);
        augr.F = this.Q(augr.F, hashMap);
        augr.G = this.Q(augr.G, hashMap);
        augr.H = this.Q(augr.H, hashMap);
        augr.I = this.Q(augr.I, hashMap);
        augr.x = this.Q(augr.x, hashMap);
        augr.y = this.Q(augr.y, hashMap);
        augr.z = this.Q(augr.z, hashMap);
        augr.D = this.Q(augr.D, hashMap);
        augr.A = this.Q(augr.A, hashMap);
        augr.B = this.Q(augr.B, hashMap);
        augr.C = this.Q(augr.C, hashMap);
        augr.m = this.Q(augr.m, hashMap);
        augr.n = this.Q(augr.n, hashMap);
        augr.o = this.Q(augr.o, hashMap);
        augr.p = this.Q(augr.p, hashMap);
        augr.q = this.Q(augr.q, hashMap);
        augr.r = this.Q(augr.r, hashMap);
        augr.s = this.Q(augr.s, hashMap);
        augr.u = this.Q(augr.u, hashMap);
        augr.t = this.Q(augr.t, hashMap);
        augr.v = this.Q(augr.v, hashMap);
        augr.w = this.Q(augr.w, hashMap);
    }
    
    public final aufl a() {
        return super.a;
    }
    
    public final aufl b(final auft auft) {
        if (auft == super.b) {
            return (aufl)this;
        }
        if (auft == auft.a) {
            return super.a;
        }
        return (aufl)new auho(super.a, auft);
    }
    
    public final boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (!(b instanceof auho)) {
            return false;
        }
        final auho auho = (auho)b;
        if (super.a.equals(auho.a)) {
            b = super.b;
            if (((auft)b).equals(auho.b)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return ((auft)super.b).hashCode() * 11 + 326565 + super.a.hashCode() * 7;
    }
    
    public final String toString() {
        final String value = String.valueOf(super.a);
        final String c = ((auft)super.b).c;
        final StringBuilder sb = new StringBuilder("ZonedChronology[");
        sb.append(value);
        sb.append(", ");
        sb.append(c);
        sb.append("]");
        return sb.toString();
    }
    
    public final auft z() {
        return (auft)super.b;
    }
}
