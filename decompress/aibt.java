// 
// Decompiled by Procyon v0.6.0
// 

public final class aibt
{
    private final aibu a;
    
    public aibt(final aibu a) {
        this.a = a;
    }
    
    public static final afhk a() {
        return new afhi().g();
    }
    
    public static agpd b(final aibu aibu) {
        return new agpd(((ahcz)aibu).toBuilder());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aibt && ((ahcz)this.a).equals(((aibt)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("BadgeInfoModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
