import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipg implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final aiph c;
    
    static {
        a = new aipf();
    }
    
    public aipg(final aiph c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final afif d = ((afcr)this.getCustomEmojisModels()).D();
        while (((Iterator)d).hasNext()) {
            afds.j((Iterable)((ajmb)((Iterator)d).next()).a());
        }
        return afds.g();
    }
    
    public final byte[] d() {
        return ((agxl)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aipg && ((agzi)this.c).equals(((aipg)o).c);
    }
    
    public List getCustomEmojis() {
        return (List)this.c.d;
    }
    
    public List getCustomEmojisModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.c.d).iterator();
        while (iterator.hasNext()) {
            afcm.h(ajmb.b(iterator.next()).G(this.b));
        }
        return (List)afcm.g();
    }
    
    public vdu getType() {
        return aipg.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("CommentCustomEmojisEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
