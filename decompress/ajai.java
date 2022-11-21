// 
// Decompiled by Procyon v0.6.0
// 

public final class ajai implements vhc
{
    public static final vhd a;
    private final ajaj b;
    
    static {
        a = new ajah();
    }
    
    public ajai(final ajaj b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajag(((ahcz)this.b).toBuilder());
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
        return o instanceof ajai && ((ahcz)this.b).equals(((ajai)o).b);
    }
    
    public String getContinuationToken() {
        return this.b.d;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajai.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
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
