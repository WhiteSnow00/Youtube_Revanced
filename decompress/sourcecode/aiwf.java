// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwf implements vdt
{
    public static final vdu a;
    private final aiwg b;
    
    static {
        a = new aiwe();
    }
    
    public aiwf(final aiwg b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiwf && this.b.equals(((aiwf)o).b);
    }
    
    public String getContinuationToken() {
        return this.b.d;
    }
    
    public vdu getType() {
        return aiwf.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ContinuationTokenEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
