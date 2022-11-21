// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqv implements vhc
{
    public static final vhd a;
    private final ajqw b;
    
    static {
        a = new ajqu();
    }
    
    public ajqv(final ajqw b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajqt(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajqv && ((ahcz)this.b).equals(((ajqv)o).b);
    }
    
    public Float getEndcapAdditionalSeconds() {
        return this.b.d;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajqv.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("EndcapDurationChangeEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
