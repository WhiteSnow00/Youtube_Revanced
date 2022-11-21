// 
// Decompiled by Procyon v0.6.0
// 

public final class ajip implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final ajiq c;
    
    static {
        a = new ajio();
    }
    
    public ajip(final ajiq c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajin(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getOfflineFutureUnplayableInfoModel().a());
        this.getOnTapCommandOverrideDataModel();
        afhi.j(amwe.a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajip && this.c.equals(((ajip)o).c);
    }
    
    public Float getDownloadProgress() {
        return this.c.f;
    }
    
    public apoq getDownloadState() {
        apoq apoq;
        if ((apoq = apoq.b(this.c.e)) == null) {
            apoq = apoq.a;
        }
        return apoq;
    }
    
    public String getDownloadStatusMessage() {
        return this.c.h;
    }
    
    public Boolean getIsFutureUnplayable() {
        return this.c.k;
    }
    
    public Boolean getIsPartiallyPlayable() {
        return this.c.i;
    }
    
    public Long getLastUpdatedTimestampSeconds() {
        return this.c.m;
    }
    
    public amwh getOfflineFutureUnplayableInfo() {
        amwh amwh;
        if ((amwh = this.c.l) == null) {
            amwh = amwh.a;
        }
        return amwh;
    }
    
    public amwf getOfflineFutureUnplayableInfoModel() {
        amwh amwh;
        if ((amwh = this.c.l) == null) {
            amwh = amwh.a;
        }
        return amwf.b(amwh).t(this.b);
    }
    
    public amwg getOnTapCommandOverrideData() {
        amwg amwg;
        if ((amwg = this.c.n) == null) {
            amwg = amwg.a;
        }
        return amwg;
    }
    
    public amwe getOnTapCommandOverrideDataModel() {
        amwg amwg;
        if ((amwg = this.c.n) == null) {
            amwg = amwg.a;
        }
        return amwe.b(amwg).u();
    }
    
    public Float getPreviousDownloadProgress() {
        return this.c.g;
    }
    
    public Boolean getShowDownloadBadge() {
        return this.c.j;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajip.a;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("DownloadStatusEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
