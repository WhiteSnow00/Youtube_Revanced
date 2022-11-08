// 
// Decompiled by Procyon v0.6.0
// 

public final class anjj implements vdt
{
    public static final vdu a;
    public final anjk b;
    
    static {
        a = new anji();
    }
    
    public anjj(final anjk b) {
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        this.getPostCreationDataModel();
        afds.j((Iterable)new afds().g());
        return afds.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof anjj && this.b.equals(((anjj)o).b);
    }
    
    public anjm getPostCreationData() {
        anjm anjm;
        if ((anjm = this.b.d) == null) {
            anjm = anjm.a;
        }
        return anjm;
    }
    
    public anjl getPostCreationDataModel() {
        anjm anjm;
        if ((anjm = this.b.d) == null) {
            anjm = anjm.a;
        }
        return new anjl((anjm)anjm.toBuilder().build());
    }
    
    public vdu getType() {
        return anjj.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("PostCreationDataEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
