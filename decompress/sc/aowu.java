import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowu implements vfu
{
    public static final vfv a;
    private final vfp b;
    private final aoww c;
    
    static {
        a = new aowt();
    }
    
    public aowu(final aoww c, final vfp b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new aows(this.c.toBuilder());
    }
    
    public final afft b() {
        final affr affr = new affr();
        final afkf d = ((afeq)this.getSegmentsDataModels()).D();
        while (((Iterator)d).hasNext()) {
            final aowr aowr = (aowr)((Iterator)d).next();
            final affr affr2 = new affr();
            aiqj aiqj;
            if ((aiqj = aowr.b.e) == null) {
                aiqj = aiqj.a;
            }
            affr2.j((Iterable)aiqi.b(aiqj).d(aowr.a).a());
            affr.j((Iterable)affr2.g());
        }
        return affr.g();
    }
    
    public final byte[] d() {
        return ((agzk)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aowu && this.c.equals((Object)((aowu)o).c);
    }
    
    public List getSegmentsData() {
        return (List)this.c.d;
    }
    
    public List getSegmentsDataModels() {
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.c.d).iterator();
        while (iterator.hasNext()) {
            afel.h((Object)new aowr((aowv)iterator.next().toBuilder().build(), this.b));
        }
        return (List)afel.g();
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return aowu.a;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("TranscriptSegmentsDataEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
