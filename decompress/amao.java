// 
// Decompiled by Procyon v0.6.0
// 

public final class amao implements vhc
{
    public static final vhd a;
    private final amap b;
    
    static {
        a = new aman();
    }
    
    public amao(final amap b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new amam(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final amap b = this.b;
        if ((b.c & 0x4) != 0x0) {
            afhi.h(b.e);
        }
        final amap b2 = this.b;
        if ((b2.c & 0x8) != 0x0) {
            afhi.h(b2.f);
        }
        final amap b3 = this.b;
        if ((b3.c & 0x10) != 0x0) {
            afhi.h(b3.g);
        }
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amao && this.b.equals(((amao)o).b);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amao.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainDownloadsLibraryEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
