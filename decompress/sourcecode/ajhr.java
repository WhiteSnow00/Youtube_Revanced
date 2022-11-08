import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhr implements vdt
{
    public static final vdu a;
    public final ajhu b;
    
    static {
        a = new ajhq();
    }
    
    public ajhr(final ajhu b) {
        this.b = b;
    }
    
    public static ajhp c(final ajhu ajhu) {
        return new ajhp(((agzi)ajhu).toBuilder());
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final ajhu b = this.b;
        if ((b.c & 0x8) != 0x0) {
            afds.h(b.h);
        }
        final afif d = ((afcr)this.getLicensesModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajhs ajhs = (ajhs)((Iterator)d).next();
            afds.j((Iterable)new afds().g());
        }
        this.getErrorModel();
        afds.j((Iterable)new afds().g());
        return afds.g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajhr && ((agzi)this.b).equals(((ajhr)o).b);
    }
    
    public ajht getError() {
        ajht ajht;
        if ((ajht = this.b.i) == null) {
            ajht = ajht.a;
        }
        return ajht;
    }
    
    public ajho getErrorModel() {
        ajht ajht;
        if ((ajht = this.b.i) == null) {
            ajht = ajht.a;
        }
        return new ajho((ajht)((agzi)ajht).toBuilder().build());
    }
    
    public Long getLicenseExpirySeconds() {
        return this.b.g;
    }
    
    public List getLicenses() {
        return (List)this.b.e;
    }
    
    public List getLicensesModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.b.e).iterator();
        while (iterator.hasNext()) {
            afcm.h(new ajhs((ajhv)((agzi)iterator.next()).toBuilder().build()));
        }
        return (List)afcm.g();
    }
    
    public Long getPlaybackStartSeconds() {
        return this.b.f;
    }
    
    public vdu getType() {
        return ajhr.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DrmLicenseEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
