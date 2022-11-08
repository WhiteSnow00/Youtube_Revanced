// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgk implements vdt
{
    public static final vdu a;
    public final ajgl b;
    
    static {
        a = new ajgj();
    }
    
    public ajgk(final ajgl b) {
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
        return o instanceof ajgk && this.b.equals(((ajgk)o).b);
    }
    
    public agyc getTokenBytes() {
        return this.b.e;
    }
    
    public vdu getType() {
        return ajgk.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DownloadsPageRefreshTokenEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
