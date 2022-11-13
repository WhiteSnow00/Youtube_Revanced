// 
// Decompiled by Procyon v0.6.0
// 

public final class aigg implements vfu
{
    public static final vfv a;
    public final aigh b;
    private final vfp c;
    
    static {
        a = new aigf();
    }
    
    public aigg(final aigh b, final vfp c) {
        this.b = b;
        this.c = c;
    }
    
    public static aige c(final aigh aigh) {
        return new aige(aigh.toBuilder());
    }
    
    public final /* bridge */ vfk a() {
        return new aige(this.b.toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        affr.j((Iterable)this.getHandleUnavailableErrorMessageModel().a());
        return affr.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aigg && this.b.equals((Object)((aigg)o).b);
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
    
    public ajut getHandleUnavailableErrorMessage() {
        ajut ajut;
        if ((ajut = this.b.p) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public ajuq getHandleUnavailableErrorMessageModel() {
        ajut ajut;
        if ((ajut = this.b.p) == null) {
            ajut = ajut.a;
        }
        return ajuq.b(ajut).j(this.c);
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
    
    public anbf getPhotoUploadStatus() {
        anbf anbf;
        if ((anbf = anbf.b(this.b.g)) == null) {
            anbf = anbf.a;
        }
        return anbf;
    }
    
    public String getPrevRecommendedHandle() {
        return this.b.r;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aigg.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
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
