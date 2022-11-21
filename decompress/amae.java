// 
// Decompiled by Procyon v0.6.0
// 

public final class amae implements vhc
{
    public static final vhd a;
    private final amaf b;
    
    static {
        a = new amad();
    }
    
    public amae(final amaf b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new amac(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final amaf b = this.b;
        if ((b.b & 0x4) != 0x0) {
            afhi.h(b.d);
        }
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amae && this.b.equals(((amae)o).b);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amae.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainAppVideoMetadataEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
