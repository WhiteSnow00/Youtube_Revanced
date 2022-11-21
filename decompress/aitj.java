import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitj implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final aitk c;
    
    static {
        a = new aiti();
    }
    
    public aitj(final aitk c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aith(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aflv d = ((afgh)this.getCustomEmojisModels()).D();
        while (((Iterator)d).hasNext()) {
            afhi.j(((ajqf)((Iterator)d).next()).a());
        }
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aitj && this.c.equals(((aitj)o).c);
    }
    
    public List getCustomEmojis() {
        return (List)this.c.d;
    }
    
    public List getCustomEmojisModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.c.d).iterator();
        while (iterator.hasNext()) {
            afgc.h(ajqf.b(iterator.next()).B(this.b));
        }
        return afgc.g();
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aitj.a;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
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
