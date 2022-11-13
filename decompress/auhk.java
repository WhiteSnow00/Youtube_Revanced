import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhk extends augs
{
    public static final auhk o;
    private static final ConcurrentHashMap p;
    private static final long serialVersionUID = -6212696554273812441L;
    
    static {
        (p = new ConcurrentHashMap()).put((Object)auft.a, (Object)(o = new auhk((aufl)auhi.H)));
    }
    
    private auhk(final aufl aufl) {
        super(aufl, (Object)null);
    }
    
    public static auhk O() {
        return P(auft.k());
    }
    
    public static auhk P(final auft auft) {
        auft k = auft;
        if (auft == null) {
            k = auft.k();
        }
        final ConcurrentHashMap p = auhk.p;
        auhk auhk;
        if ((auhk = (auhk)p.get((Object)k)) == null) {
            auhk = new auhk((aufl)auho.O((aufl)auhk.o, k));
            final auhk auhk2 = (auhk)p.putIfAbsent((Object)k, (Object)auhk);
            if (auhk2 != null) {
                return auhk2;
            }
        }
        return auhk;
    }
    
    private Object writeReplace() {
        return new auhj(this.z());
    }
    
    protected final void N(final augr augr) {
        if (super.a.z() == auft.a) {
            augr.H = (aufn)new auhu(auhl.a, aufp.d);
            augr.k = augr.H.q();
            augr.G = (aufn)new auic((auhu)augr.H, aufp.e);
            augr.C = (aufn)new auic((auhu)augr.H, augr.h, aufp.j);
        }
    }
    
    public final aufl a() {
        return (aufl)auhk.o;
    }
    
    public final aufl b(final auft auft) {
        if (auft == this.z()) {
            return (aufl)this;
        }
        return (aufl)P(auft);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof auhk && this.z().equals((Object)((auhk)o).z()));
    }
    
    public final int hashCode() {
        return this.z().hashCode() + 800855;
    }
    
    public final String toString() {
        final auft z = this.z();
        if (z != null) {
            final String c = z.c;
            final StringBuilder sb = new StringBuilder("ISOChronology[");
            sb.append(c);
            sb.append("]");
            return sb.toString();
        }
        return "ISOChronology";
    }
}
