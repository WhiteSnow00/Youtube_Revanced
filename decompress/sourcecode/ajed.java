import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajed implements vdt
{
    public static final vdu a;
    private final ajee b;
    
    static {
        a = new ajec();
    }
    
    public ajed(final ajee b) {
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final afif d = ((afcr)this.getFormatsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajdp ajdp = (ajdp)((Iterator)d).next();
            afds.j((Iterable)ajdp.a());
        }
        this.getSelectedFormatModel();
        afds.j((Iterable)ajdp.a());
        return afds.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajed && this.b.equals(((ajed)o).b);
    }
    
    public ajef getDismissState() {
        ajef ajef;
        if ((ajef = ajef.b(this.b.g)) == null) {
            ajef = ajef.a;
        }
        return ajef;
    }
    
    public List getFormats() {
        return (List)this.b.d;
    }
    
    public List getFormatsModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.b.d).iterator();
        while (iterator.hasNext()) {
            afcm.h(ajdp.b(iterator.next()).x());
        }
        return (List)afcm.g();
    }
    
    public Boolean getRememberSetting() {
        return this.b.f;
    }
    
    public String getRememberSettingString() {
        return this.b.h;
    }
    
    public ajdq getSelectedFormat() {
        ajdq ajdq;
        if ((ajdq = this.b.e) == null) {
            ajdq = ajdq.a;
        }
        return ajdq;
    }
    
    public ajdp getSelectedFormatModel() {
        ajdq ajdq;
        if ((ajdq = this.b.e) == null) {
            ajdq = ajdq.a;
        }
        return ajdp.b(ajdq).x();
    }
    
    public vdu getType() {
        return ajed.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DownloadQualityPickerEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
