// 
// Decompiled by Procyon v0.6.0
// 

public final class ajem implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final ajen c;
    
    static {
        a = new ajel();
    }
    
    public ajem(final ajen c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        afds.j((Iterable)this.getOfflineFutureUnplayableInfoModel().a());
        this.getOnTapCommandOverrideDataModel();
        afds.j((Iterable)amrv.a());
        return afds.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajem && this.c.equals(((ajem)o).c);
    }
    
    public Float getDownloadProgress() {
        return this.c.f;
    }
    
    public apka getDownloadState() {
        apka apka;
        if ((apka = apka.b(this.c.e)) == null) {
            apka = apka.a;
        }
        return apka;
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
    
    public amry getOfflineFutureUnplayableInfo() {
        amry amry;
        if ((amry = this.c.l) == null) {
            amry = amry.a;
        }
        return amry;
    }
    
    public amrw getOfflineFutureUnplayableInfoModel() {
        amry amry;
        if ((amry = this.c.l) == null) {
            amry = amry.a;
        }
        return amrw.b(amry).N(this.b);
    }
    
    public amrx getOnTapCommandOverrideData() {
        amrx amrx;
        if ((amrx = this.c.n) == null) {
            amrx = amrx.a;
        }
        return amrx;
    }
    
    public amrv getOnTapCommandOverrideDataModel() {
        amrx amrx;
        if ((amrx = this.c.n) == null) {
            amrx = amrx.a;
        }
        return amrv.b(amrx).O();
    }
    
    public Float getPreviousDownloadProgress() {
        return this.c.g;
    }
    
    public Boolean getShowDownloadBadge() {
        return this.c.j;
    }
    
    public vdu getType() {
        return ajem.a;
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
