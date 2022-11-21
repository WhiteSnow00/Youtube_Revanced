// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbb implements vhc
{
    public static final vhd a;
    public final aqbc b;
    private final vgx c;
    
    static {
        a = new aqba();
    }
    
    public aqbb(final aqbc b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return new aqaz(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aqbc b = this.b;
        if ((b.c & 0x4) != 0x0) {
            afhi.h(b.e);
        }
        if (this.b.f.size() > 0) {
            afhi.j((Iterable)this.b.f);
        }
        return afhi.g();
    }
    
    public final aqbl c() {
        final vgv c = this.c.c(this.b.e);
        boolean b = true;
        if (c != null) {
            b = (c instanceof aqbl && b);
        }
        adme.U(b, "entityFromStore is not instance of YtMainPlaylistEntityModel, key=playlist");
        return (aqbl)c;
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqbb && this.b.equals(((aqbb)o).b);
    }
    
    public Long getAddedTimestampMillis() {
        return this.b.g;
    }
    
    public Long getLastSyncedTimestampMillis() {
        return this.b.h;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aqbb.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("YtMainDownloadedPlaylistEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
