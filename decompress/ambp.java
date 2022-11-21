// 
// Decompiled by Procyon v0.6.0
// 

public final class ambp implements vhc
{
    public static final vhd a;
    private final ambq b;
    
    static {
        a = new ambo();
    }
    
    public ambp(final ambq b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ambn(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final ambq b = this.b;
        if ((b.c & 0x4) != 0x0) {
            afhi.h(b.e);
        }
        final ambq b2 = this.b;
        if ((b2.c & 0x8) != 0x0) {
            afhi.h(b2.f);
        }
        return afhi.g();
    }
    
    public final String c() {
        return this.b.e;
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ambp && this.b.equals(((ambp)o).b);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ambp.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainPlaylistVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
