// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbt implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final aqbu c;
    
    static {
        a = new aqbs();
    }
    
    public aqbt(final aqbu c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aqbr(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aqbu c = this.c;
        if ((c.c & 0x4) != 0x0) {
            afhi.h(c.e);
        }
        final aqbu c2 = this.c;
        if ((c2.c & 0x8) != 0x0) {
            afhi.h(c2.f);
        }
        return afhi.g();
    }
    
    public final aqca c() {
        final vgv c = this.b.c(this.c.e);
        boolean b = true;
        if (c != null) {
            b = (c instanceof aqca && b);
        }
        adme.U(b, "entityFromStore is not instance of YtMainVideoEntityModel, key=videoEntity");
        return (aqca)c;
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqbt && this.c.equals(((aqbt)o).c);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aqbt.a;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("YtMainPlaylistVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
