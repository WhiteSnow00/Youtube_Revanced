// 
// Decompiled by Procyon v0.6.0
// 

public final class aihz implements vhc
{
    public static final vhd a;
    public final aiia b;
    private final vgx c;
    
    static {
        a = new aihy();
    }
    
    public aihz(final aiia b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public static aihx c(final aiia aiia) {
        return new aihx(((ahcz)aiia).toBuilder());
    }
    
    public final /* bridge */ vgs a() {
        return new aihx(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        afhi.j(this.getHandleUnavailableErrorMessageModel().a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aihz && ((ahcz)this.b).equals(((aihz)o).b);
    }
    
    public String getBlobEncryptionId() {
        return this.b.i;
    }
    
    public String getClientPhotoFilePath() {
        return this.b.h;
    }
    
    public String getErrorMessage() {
        return this.b.f;
    }
    
    public String getGeneratedHandleFromName() {
        return this.b.u;
    }
    
    public ajws getHandleUnavailableErrorMessage() {
        ajws ajws;
        if ((ajws = this.b.p) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getHandleUnavailableErrorMessageModel() {
        ajws ajws;
        if ((ajws = this.b.p) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.c);
    }
    
    public Boolean getHasHandleChanged() {
        return this.b.s;
    }
    
    public Boolean getIsCreateChannelLoading() {
        return this.b.e;
    }
    
    public Boolean getIsEditHandleOntapDisabled() {
        return this.b.m;
    }
    
    public Boolean getIsEditNameOntapDisabled() {
        return this.b.l;
    }
    
    public Boolean getIsHandleCheckLoading() {
        return this.b.o;
    }
    
    public Boolean getIsHandleInvalid() {
        return this.b.q;
    }
    
    public Boolean getIsHandleTooLongMessageOn() {
        return this.b.n;
    }
    
    public Boolean getIsNameSubpageSpinnerOn() {
        return this.b.t;
    }
    
    public Boolean getIsNameTooLongMessageOn() {
        return this.b.k;
    }
    
    public Boolean getIsWaitMessageOn() {
        return this.b.j;
    }
    
    public andm getPhotoUploadStatus() {
        andm andm;
        if ((andm = andm.b(this.b.g)) == null) {
            andm = andm.a;
        }
        return andm;
    }
    
    public String getPrevRecommendedHandle() {
        return this.b.r;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aihz.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ChannelCreationFormStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
