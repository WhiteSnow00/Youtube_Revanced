import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aour implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final aout c;
    
    static {
        a = new aouq();
    }
    
    public aour(final aout c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final afif d = ((afcr)this.getSegmentsDataModels()).D();
        while (((Iterator)d).hasNext()) {
            final aouo aouo = (aouo)((Iterator)d).next();
            final afds afds2 = new afds();
            aioe aioe;
            if ((aioe = aouo.b.e) == null) {
                aioe = aioe.a;
            }
            afds2.j((Iterable)aiod.b(aioe).y(aouo.a).a());
            afds.j((Iterable)afds2.g());
        }
        return afds.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aour && this.c.equals(((aour)o).c);
    }
    
    public List getSegmentsData() {
        return (List)this.c.d;
    }
    
    public List getSegmentsDataModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.c.d).iterator();
        while (iterator.hasNext()) {
            afcm.h(new aouo((aous)iterator.next().toBuilder().build(), this.b));
        }
        return (List)afcm.g();
    }
    
    public vdu getType() {
        return aour.a;
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
