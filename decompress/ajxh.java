import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxh implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final ajxi c;
    
    static {
        a = new ajxg();
    }
    
    public ajxh(final ajxi c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajxf(((ahcz)this.c).toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aflv d = ((afgh)this.getFormfillFieldResultsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajxc ajxc = (ajxc)((Iterator)d).next();
            final afhi afhi2 = new afhi();
            final ajxd b = ajxc.b;
            ajxe a;
            if (b.c == 4) {
                a = (ajxe)b.d;
            }
            else {
                a = ajxe.a;
            }
            final ahcr builder = ((ahcz)a).toBuilder();
            final vgx a2 = ajxc.a;
            final ajxe ajxe = (ajxe)builder.build();
            afhi2.j(new afhi().g());
            afhi.j(afhi2.g());
        }
        return afhi.g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajxh && ((ahcz)this.c).equals(((ajxh)o).c);
    }
    
    public List getFormfillFieldResults() {
        return (List)this.c.d;
    }
    
    public List getFormfillFieldResultsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.c.d).iterator();
        while (iterator.hasNext()) {
            afgc.h(new ajxc((ajxd)((ahcz)iterator.next()).toBuilder().build(), this.b));
        }
        return afgc.g();
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajxh.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("FormfillFieldsEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
