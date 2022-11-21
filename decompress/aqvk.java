// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvk
{
    private final aqvl a;
    
    public aqvk(final aqvl a) {
        this.a = a;
    }
    
    public static agpb b(final aqvl aqvl) {
        return new agpb(aqvl.toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        aqvp aqvp;
        if ((aqvp = this.a.c) == null) {
            aqvp = aqvp.a;
        }
        final aqvo aqvo = new aqvo((aqvp)((ahcz)aqvp).toBuilder().build());
        final afhi afhi2 = new afhi();
        aqvn aqvn;
        if ((aqvn = aqvo.a.c) == null) {
            aqvn = aqvn.a;
        }
        final aqvn aqvn2 = (aqvn)((ahcr)((ahcz)aqvn).toBuilder()).build();
        afhi2.j(new afhi().g());
        afhi.j(afhi2.g());
        aqvh aqvh;
        if ((aqvh = this.a.d) == null) {
            aqvh = aqvh.a;
        }
        final aqvh aqvh2 = (aqvh)((ahcr)((ahcz)aqvh).toBuilder()).build();
        afhi.j(new afhi().g());
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqvk && this.a.equals(((aqvk)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("FocusVisibilityLoggingCriteriaModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
