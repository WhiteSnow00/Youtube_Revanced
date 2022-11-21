// 
// Decompiled by Procyon v0.6.0
// 

public final class amyg implements vhc
{
    public static final vhd a;
    public final amyh b;
    private final vgx c;
    
    static {
        a = new amyf();
    }
    
    public amyg(final amyh b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return this.c();
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getOfflineFutureUnplayableInfoModel().a());
        this.getOnTapCommandOverrideDataModel();
        afhi.j(amwe.a());
        return afhi.g();
    }
    
    public final amye c() {
        return new amye(((ahcz)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amyg && ((ahcz)this.b).equals(((amyg)o).b);
    }
    
    public amyd getAction() {
        amyd amyd;
        if ((amyd = amyd.b(this.b.e)) == null) {
            amyd = amyd.a;
        }
        return amyd;
    }
    
    public Long getExpirationTimestamp() {
        return this.b.f;
    }
    
    public Long getLastUpdatedTimestampSeconds() {
        return this.b.i;
    }
    
    public amwh getOfflineFutureUnplayableInfo() {
        amwh amwh;
        if ((amwh = this.b.h) == null) {
            amwh = amwh.a;
        }
        return amwh;
    }
    
    public amwf getOfflineFutureUnplayableInfoModel() {
        amwh amwh;
        if ((amwh = this.b.h) == null) {
            amwh = amwh.a;
        }
        return amwf.b(amwh).t(this.c);
    }
    
    public amwx getOfflinePlaybackDisabledReason() {
        amwx amwx;
        if ((amwx = amwx.b(this.b.m)) == null) {
            amwx = amwx.a;
        }
        return amwx;
    }
    
    public ahbt getOfflineStateBytes() {
        return this.b.g;
    }
    
    public String getOfflineToken() {
        return this.b.l;
    }
    
    public amwg getOnTapCommandOverrideData() {
        amwg amwg;
        if ((amwg = this.b.j) == null) {
            amwg = amwg.a;
        }
        return amwg;
    }
    
    public amwe getOnTapCommandOverrideDataModel() {
        amwg amwg;
        if ((amwg = this.b.j) == null) {
            amwg = amwg.a;
        }
        return amwe.b(amwg).u();
    }
    
    public String getShortMessageForDisabledAction() {
        return this.b.k;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amyg.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("OfflineVideoPolicyEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
