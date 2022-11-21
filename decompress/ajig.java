import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajig implements vhc
{
    public static final vhd a;
    private final ajih b;
    
    static {
        a = new ajif();
    }
    
    public ajig(final ajih b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajie(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aflv d = ((afgh)this.getFormatsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajhs ajhs = (ajhs)((Iterator)d).next();
            afhi.j(ajhs.a());
        }
        this.getSelectedFormatModel();
        afhi.j(ajhs.a());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajig && this.b.equals(((ajig)o).b);
    }
    
    public ajii getDismissState() {
        ajii ajii;
        if ((ajii = ajii.b(this.b.g)) == null) {
            ajii = ajii.a;
        }
        return ajii;
    }
    
    public List getFormats() {
        return (List)this.b.d;
    }
    
    public List getFormatsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.d).iterator();
        while (iterator.hasNext()) {
            afgc.h(ajhs.b(iterator.next()).E());
        }
        return afgc.g();
    }
    
    public Boolean getRememberSetting() {
        return this.b.f;
    }
    
    public String getRememberSettingString() {
        return this.b.h;
    }
    
    public ajht getSelectedFormat() {
        ajht ajht;
        if ((ajht = this.b.e) == null) {
            ajht = ajht.a;
        }
        return ajht;
    }
    
    public ajhs getSelectedFormatModel() {
        ajht ajht;
        if ((ajht = this.b.e) == null) {
            ajht = ajht.a;
        }
        return ajhs.b(ajht).E();
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajig.a;
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
