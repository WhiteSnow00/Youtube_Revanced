// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbg implements vhc
{
    public static final vhd a;
    public final aqbh b;
    private final vgx c;
    
    static {
        a = new aqbf();
    }
    
    public aqbg(final aqbh b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return new aqbe(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aqbh b = this.b;
        if ((b.c & 0x4) != 0x0) {
            afhi.h(b.e);
        }
        final aqbh b2 = this.b;
        if ((b2.c & 0x8) != 0x0) {
            afhi.h(b2.f);
        }
        final aqbh b3 = this.b;
        if ((b3.c & 0x10) != 0x0) {
            afhi.h(b3.g);
        }
        return afhi.g();
    }
    
    public final amyg c() {
        final vgv c = this.c.c(this.b.g);
        boolean b = true;
        if (c != null) {
            b = (c instanceof amyg && b);
        }
        adme.U(b, "entityFromStore is not instance of OfflineVideoPolicyEntityModel, key=offlineVideoPolicy");
        return (amyg)c;
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqbg && this.b.equals(((aqbg)o).b);
    }
    
    public final anff f() {
        final vgv c = this.c.c(this.b.f);
        boolean b = true;
        if (c != null) {
            b = (c instanceof anff && b);
        }
        adme.U(b, "entityFromStore is not instance of PlaybackDataEntityModel, key=playbackData");
        return (anff)c;
    }
    
    public final aqca g() {
        final vgv c = this.c.c(this.b.e);
        boolean b = true;
        if (c != null) {
            b = (c instanceof aqca && b);
        }
        adme.U(b, "entityFromStore is not instance of YtMainVideoEntityModel, key=video");
        return (aqca)c;
    }
    
    public Long getAddedTimestampMillis() {
        return this.b.h;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aqbg.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("YtMainDownloadedVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
