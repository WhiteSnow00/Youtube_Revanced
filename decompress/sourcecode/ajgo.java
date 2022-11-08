// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgo implements vdt
{
    public static final vdu a;
    private final ajgp b;
    
    static {
        a = new ajgn();
    }
    
    public ajgo(final ajgp b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajgo && this.b.equals(((ajgo)o).b);
    }
    
    public String getLastUpdatedTimeMessage() {
        return this.b.f;
    }
    
    public String getSpaceUsedMessage() {
        return this.b.e;
    }
    
    public vdu getType() {
        return ajgo.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DownloadsPageSmartDownloadsHeaderEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
