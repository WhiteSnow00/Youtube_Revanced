// 
// Decompiled by Procyon v0.6.0
// 

public final class amwb implements vfu
{
    public static final vfv a;
    public final amwc b;
    private final vfp c;
    
    static {
        a = new amwa();
    }
    
    public amwb(final amwc b, final vfp c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vfk a() {
        return this.c();
    }
    
    public final afft b() {
        final affr affr = new affr();
        affr.j((Iterable)this.getOfflineFutureUnplayableInfoModel().a());
        this.getOnTapCommandOverrideDataModel();
        affr.j((Iterable)amtz.a());
        return affr.g();
    }
    
    public final amvz c() {
        return new amvz(((ahbh)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amwb && ((ahbh)this.b).equals((Object)((amwb)o).b);
    }
    
    public amvy getAction() {
        amvy amvy;
        if ((amvy = amvy.b(this.b.e)) == null) {
            amvy = amvy.a;
        }
        return amvy;
    }
    
    public Long getExpirationTimestamp() {
        return this.b.f;
    }
    
    public Long getLastUpdatedTimestampSeconds() {
        return this.b.i;
    }
    
    public amuc getOfflineFutureUnplayableInfo() {
        amuc amuc;
        if ((amuc = this.b.h) == null) {
            amuc = amuc.a;
        }
        return amuc;
    }
    
    public amua getOfflineFutureUnplayableInfoModel() {
        amuc amuc;
        if ((amuc = this.b.h) == null) {
            amuc = amuc.a;
        }
        return amua.b(amuc).I(this.c);
    }
    
    public amus getOfflinePlaybackDisabledReason() {
        amus amus;
        if ((amus = amus.b(this.b.m)) == null) {
            amus = amus.a;
        }
        return amus;
    }
    
    public ahab getOfflineStateBytes() {
        return this.b.g;
    }
    
    public String getOfflineToken() {
        return this.b.l;
    }
    
    public amub getOnTapCommandOverrideData() {
        amub amub;
        if ((amub = this.b.j) == null) {
            amub = amub.a;
        }
        return amub;
    }
    
    public amtz getOnTapCommandOverrideDataModel() {
        amub amub;
        if ((amub = this.b.j) == null) {
            amub = amub.a;
        }
        return amtz.b(amub).J();
    }
    
    public String getShortMessageForDisabledAction() {
        return this.b.k;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amwb.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
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
