// 
// Decompiled by Procyon v0.6.0
// 

public final class amcm implements vhc
{
    public static final vhd a;
    public final amcn b;
    private final vgx c;
    
    static {
        a = new amcl();
    }
    
    public amcm(final amcn b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return this.c();
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final amcn b = this.b;
        if ((b.c & 0x4) != 0x0) {
            afhi.h(b.e);
        }
        if (this.b.g.size() > 0) {
            afhi.j((Iterable)this.b.g);
        }
        return afhi.g();
    }
    
    public final amck c() {
        return new amck((ahct)((ahcz)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amcm && ((ahcz)this.b).equals(((amcm)o).b);
    }
    
    public final anff f() {
        final vgv c = this.c.c(this.b.e);
        boolean b = true;
        if (c != null) {
            b = (c instanceof anff && b);
        }
        adme.U(b, "entityFromStore is not instance of PlaybackDataEntityModel, key=playbackData");
        return (anff)c;
    }
    
    public Long getAddedTimestampMillis() {
        return this.b.f;
    }
    
    public ahbt getClickTrackingParams() {
        return this.b.i;
    }
    
    public Boolean getPendingApproval() {
        return this.b.h;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amcm.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainVideoDownloadStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
