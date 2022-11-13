import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzx implements vfu
{
    public static final vfv a;
    private final vfp b;
    private final alzy c;
    
    static {
        a = new alzw();
    }
    
    public alzx(final alzy c, final vfp b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return (vfk)new alzv(((ahbh)this.c).toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        final alzy c = this.c;
        if ((c.c & 0x4) != 0x0) {
            affr.h((Object)c.e);
        }
        final alzy c2 = this.c;
        if ((c2.c & 0x8) != 0x0) {
            affr.h((Object)c2.g);
        }
        final afkf d = ((afeq)this.getFormatsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajft ajft = (ajft)((Iterator)d).next();
            affr.j((Iterable)ajft.a());
        }
        this.getLocalizedStringsModel();
        affr.j((Iterable)apzi.a());
        return affr.g();
    }
    
    public final apzm c() {
        final vfn b = this.b.b(this.c.g);
        boolean b2 = true;
        if (b != null) {
            b2 = (b instanceof apzm && b2);
        }
        adkp.R(b2, "entityFromStore is not instance of YtMainVideoEntityModel, key=video");
        return (apzm)b;
    }
    
    public final byte[] d() {
        return ((agzk)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof alzx && ((ahbh)this.c).equals((Object)((alzx)o).c);
    }
    
    public List getFormats() {
        return (List)this.c.f;
    }
    
    public List getFormatsModels() {
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.c.f).iterator();
        while (iterator.hasNext()) {
            afel.h((Object)ajft.b((ajfu)iterator.next()).t());
        }
        return (List)afel.g();
    }
    
    public apzj getLocalizedStrings() {
        apzj apzj;
        if ((apzj = this.c.h) == null) {
            apzj = apzj.a;
        }
        return apzj;
    }
    
    public apzi getLocalizedStringsModel() {
        apzj apzj;
        if ((apzj = this.c.h) == null) {
            apzj = apzj.a;
        }
        return apzi.b(apzj).D();
    }
    
    public ahab getScoringTrackingParams() {
        return this.c.i;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return alzx.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("MainRecommendedDownloadVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
