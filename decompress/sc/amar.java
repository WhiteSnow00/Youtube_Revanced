import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amar implements vfu
{
    public static final vfv a;
    public final amas b;
    private final vfp c;
    
    static {
        a = new amaq();
    }
    
    public amar(final amas b, final vfp c) {
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ vfk a() {
        return this.f();
    }
    
    public final afft b() {
        final affr affr = new affr();
        final amas b = this.b;
        if ((b.c & 0x8) != 0x0) {
            affr.h(b.f);
        }
        final amas b2 = this.b;
        if ((b2.c & 0x4000) != 0x0) {
            affr.h(b2.r);
        }
        affr.j((Iterable)this.getThumbnailModel().a());
        affr.j((Iterable)this.getFormattedDescriptionModel().a());
        this.getLocalizedStringsModel();
        affr.j((Iterable)apzi.a());
        final amat userStateModel = this.getUserStateModel();
        final affr affr2 = new affr();
        final amau a = userStateModel.a;
        if ((a.b & 0x1) != 0x0) {
            affr2.h(a.c);
        }
        affr.j((Iterable)affr2.g());
        final afkf d = ((afeq)this.getDownloadFormatsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajft ajft = (ajft)((Iterator)d).next();
            affr.j((Iterable)ajft.a());
        }
        final amag additionalMetadataModel = this.getAdditionalMetadataModel();
        final affr affr3 = new affr();
        amah amah;
        if ((amah = additionalMetadataModel.a.c) == null) {
            amah = amah.a;
        }
        final amaf amaf = new amaf((amah)((ahbh)amah).toBuilder().build());
        final affr affr4 = new affr();
        if (amaf.a.b.size() > 0) {
            affr4.j((Iterable)amaf.a.b);
        }
        affr3.j((Iterable)affr4.g());
        affr.j((Iterable)affr3.g());
        return affr.g();
    }
    
    public final amam c() {
        final vfn b = this.c.b(this.b.r);
        boolean b2 = true;
        if (b != null) {
            b2 = (b instanceof amam && b2);
        }
        adkp.R(b2, (Object)"entityFromStore is not instance of MainVideoDownloadStateEntityModel, key=downloadState");
        return (amam)b;
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amar && ((ahbh)this.b).equals((Object)((amar)o).b);
    }
    
    public final amap f() {
        return new amap((ahbb)((ahbh)this.b).toBuilder());
    }
    
    public final apyj g() {
        final vfn b = this.c.b(this.b.f);
        boolean b2 = true;
        if (b != null) {
            b2 = (b instanceof apyj && b2);
        }
        adkp.R(b2, (Object)"entityFromStore is not instance of YtMainChannelEntityModel, key=owner");
        return (apyj)b;
    }
    
    public amai getAdditionalMetadata() {
        amai amai;
        if ((amai = this.b.t) == null) {
            amai = amai.a;
        }
        return amai;
    }
    
    public amag getAdditionalMetadataModel() {
        amai amai;
        if ((amai = this.b.t) == null) {
            amai = amai.a;
        }
        return new amag((amai)((ahbh)amai).toBuilder().build());
    }
    
    public Long getDislikeCount() {
        return this.b.o;
    }
    
    public List getDownloadFormats() {
        return (List)this.b.s;
    }
    
    public List getDownloadFormatsModels() {
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.b.s).iterator();
        while (iterator.hasNext()) {
            afel.h(ajft.b((ajfu)iterator.next()).t());
        }
        return (List)afel.g();
    }
    
    public ajut getFormattedDescription() {
        ajut ajut;
        if ((ajut = this.b.k) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public ajuq getFormattedDescriptionModel() {
        ajut ajut;
        if ((ajut = this.b.k) == null) {
            ajut = ajut.a;
        }
        return ajuq.b(ajut).j(this.c);
    }
    
    public Integer getLengthSeconds() {
        return this.b.i;
    }
    
    public Long getLikeCount() {
        return this.b.n;
    }
    
    public apzj getLocalizedStrings() {
        apzj apzj;
        if ((apzj = this.b.p) == null) {
            apzj = apzj.a;
        }
        return apzj;
    }
    
    public apzi getLocalizedStringsModel() {
        apzj apzj;
        if ((apzj = this.b.p) == null) {
            apzj = apzj.a;
        }
        return apzi.b(apzj).D();
    }
    
    public Long getPublishedTimestampMillis() {
        return this.b.h;
    }
    
    public aotp getThumbnail() {
        aotp aotp;
        if ((aotp = this.b.j) == null) {
            aotp = aotp.a;
        }
        return aotp;
    }
    
    public aotr getThumbnailModel() {
        aotp aotp;
        if ((aotp = this.b.j) == null) {
            aotp = aotp.a;
        }
        return aotr.b(aotp).E(this.c);
    }
    
    public String getTitle() {
        return this.b.g;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amar.a;
    }
    
    public amau getUserState() {
        amau amau;
        if ((amau = this.b.q) == null) {
            amau = amau.a;
        }
        return amau;
    }
    
    public amat getUserStateModel() {
        amau amau;
        if ((amau = this.b.q) == null) {
            amau = amau.a;
        }
        return new amat((amau)((ahaz)((ahbh)amau).toBuilder()).build());
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
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
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
