// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmr implements vdt
{
    public static final vdu a;
    private final ajms b;
    
    static {
        a = new ajmq();
    }
    
    public ajmr(final ajms b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajmr && ((agzi)this.b).equals(((ajmr)o).b);
    }
    
    public Float getEndcapAdditionalSeconds() {
        return this.b.d;
    }
    
    public vdu getType() {
        return ajmr.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
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
