// 
// Decompiled by Procyon v0.6.0
// 

public final class amba implements vhc
{
    public static final vhd a;
    private final ambb b;
    
    static {
        a = new amaz();
    }
    
    public amba(final ambb b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new amay(this.b.toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amba && this.b.equals(((amba)o).b);
    }
    
    public amax getGenerationStatus() {
        amax amax;
        if ((amax = amax.b(this.b.e)) == null) {
            amax = amax.a;
        }
        return amax;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amba.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainOfflineGenerationStatusEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
