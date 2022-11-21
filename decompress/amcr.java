import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amcr implements vhc
{
    public static final vhd a;
    public final amcs b;
    private final vgx c;
    
    static {
        a = new amcq();
    }
    
    public amcr(final amcs b, final vgx c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vgs a() {
        return this.f();
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final amcs b = this.b;
        if ((b.c & 0x8) != 0x0) {
            afhi.h(b.f);
        }
        final amcs b2 = this.b;
        if ((b2.c & 0x4000) != 0x0) {
            afhi.h(b2.r);
        }
        afhi.j(this.getThumbnailModel().a());
        afhi.j(this.getFormattedDescriptionModel().a());
        this.getLocalizedStringsModel();
        afhi.j(aqbw.a());
        final amct userStateModel = this.getUserStateModel();
        final afhi afhi2 = new afhi();
        final amcu a = userStateModel.a;
        if ((a.b & 0x1) != 0x0) {
            afhi2.h(a.c);
        }
        afhi.j(afhi2.g());
        final aflv d = ((afgh)this.getDownloadFormatsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajhs ajhs = (ajhs)((Iterator)d).next();
            afhi.j(ajhs.a());
        }
        final amcg additionalMetadataModel = this.getAdditionalMetadataModel();
        final afhi afhi3 = new afhi();
        amch amch;
        if ((amch = additionalMetadataModel.a.c) == null) {
            amch = amch.a;
        }
        final amcf amcf = new amcf((amch)((ahcz)amch).toBuilder().build());
        final afhi afhi4 = new afhi();
        if (amcf.a.b.size() > 0) {
            afhi4.j((Iterable)amcf.a.b);
        }
        afhi3.j(afhi4.g());
        afhi.j(afhi3.g());
        return afhi.g();
    }
    
    public final amcm c() {
        final vgv c = this.c.c(this.b.r);
        boolean b = true;
        if (c != null) {
            b = (c instanceof amcm && b);
        }
        adme.U(b, "entityFromStore is not instance of MainVideoDownloadStateEntityModel, key=downloadState");
        return (amcm)c;
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amcr && ((ahcz)this.b).equals(((amcr)o).b);
    }
    
    public final amcp f() {
        return new amcp((ahct)((ahcz)this.b).toBuilder());
    }
    
    public final aqax g() {
        final vgv c = this.c.c(this.b.f);
        boolean b = true;
        if (c != null) {
            b = (c instanceof aqax && b);
        }
        adme.U(b, "entityFromStore is not instance of YtMainChannelEntityModel, key=owner");
        return (aqax)c;
    }
    
    public amci getAdditionalMetadata() {
        amci amci;
        if ((amci = this.b.t) == null) {
            amci = amci.a;
        }
        return amci;
    }
    
    public amcg getAdditionalMetadataModel() {
        amci amci;
        if ((amci = this.b.t) == null) {
            amci = amci.a;
        }
        return new amcg((amci)((ahcz)amci).toBuilder().build());
    }
    
    public Long getDislikeCount() {
        return this.b.o;
    }
    
    public List getDownloadFormats() {
        return (List)this.b.s;
    }
    
    public List getDownloadFormatsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.s).iterator();
        while (iterator.hasNext()) {
            afgc.h(ajhs.b(iterator.next()).E());
        }
        return afgc.g();
    }
    
    public ajws getFormattedDescription() {
        ajws ajws;
        if ((ajws = this.b.k) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getFormattedDescriptionModel() {
        ajws ajws;
        if ((ajws = this.b.k) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.c);
    }
    
    public Integer getLengthSeconds() {
        return this.b.i;
    }
    
    public Long getLikeCount() {
        return this.b.n;
    }
    
    public aqbx getLocalizedStrings() {
        aqbx aqbx;
        if ((aqbx = this.b.p) == null) {
            aqbx = aqbx.a;
        }
        return aqbx;
    }
    
    public aqbw getLocalizedStringsModel() {
        aqbx aqbx;
        if ((aqbx = this.b.p) == null) {
            aqbx = aqbx.a;
        }
        return aqbw.b(aqbx).o();
    }
    
    public Long getPublishedTimestampMillis() {
        return this.b.h;
    }
    
    public aowb getThumbnail() {
        aowb aowb;
        if ((aowb = this.b.j) == null) {
            aowb = aowb.a;
        }
        return aowb;
    }
    
    public aowd getThumbnailModel() {
        aowb aowb;
        if ((aowb = this.b.j) == null) {
            aowb = aowb.a;
        }
        return aowd.b(aowb).p(this.c);
    }
    
    public String getTitle() {
        return this.b.g;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amcr.a;
    }
    
    public amcu getUserState() {
        amcu amcu;
        if ((amcu = this.b.q) == null) {
            amcu = amcu.a;
        }
        return amcu;
    }
    
    public amct getUserStateModel() {
        amcu amcu;
        if ((amcu = this.b.q) == null) {
            amcu = amcu.a;
        }
        return new amct((amcu)((ahcr)((ahcz)amcu).toBuilder()).build());
    }
    
    public String getVideoId() {
        return this.b.e;
    }
    
    public Long getViewCount() {
        return this.b.m;
    }
    
    public final String h() {
        return this.b.f;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
