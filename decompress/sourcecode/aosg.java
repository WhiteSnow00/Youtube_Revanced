import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosg implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final aosh c;
    
    static {
        a = new aosf();
    }
    
    public aosg(final aosh c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final aory timedListDataModel = this.getTimedListDataModel();
        final afds afds2 = new afds();
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)timedListDataModel.b.b).iterator();
        while (iterator.hasNext()) {
            afcm.h(new aosk((aosl)iterator.next().toBuilder().build(), timedListDataModel.a));
        }
        final afif d = afcm.g().D();
        while (((Iterator)d).hasNext()) {
            final aosk aosk = (aosk)((Iterator)d).next();
            final afds afds3 = new afds();
            final afcm afcm2 = new afcm();
            final Iterator<Object> iterator2 = ((List<Object>)aosk.b.b).iterator();
            while (iterator2.hasNext()) {
                final agza builder = iterator2.next().toBuilder();
                final vdo a = aosk.a;
                afcm2.h(new aosm((aosn)builder.build()));
            }
            final afif d2 = afcm2.g().D();
            while (((Iterator)d2).hasNext()) {
                final aosm aosm = (aosm)((Iterator)d2).next();
                afds3.j((Iterable)new afds().g());
            }
            afds2.j((Iterable)afds3.g());
        }
        afds.j((Iterable)afds2.g());
        return afds.g();
    }
    
    public final boolean c() {
        return (this.c.b & 0x4) != 0x0;
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aosg && this.c.equals(((aosg)o).c);
    }
    
    public aorz getTimedListData() {
        aorz aorz;
        if ((aorz = this.c.d) == null) {
            aorz = aorz.a;
        }
        return aorz;
    }
    
    public aory getTimedListDataModel() {
        aorz aorz;
        if ((aorz = this.c.d) == null) {
            aorz = aorz.a;
        }
        return new aory((aorz)aorz.toBuilder().build(), this.b);
    }
    
    public vdu getType() {
        return aosg.a;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("TimedMarkersListSyncEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
