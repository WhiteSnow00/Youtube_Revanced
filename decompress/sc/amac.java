import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amac implements vfu
{
    public static final vfv a;
    public final vfp b;
    public final amae c;
    
    static {
        a = new amab();
    }
    
    public amac(final amae c, final vfp b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return this.c();
    }
    
    public final afft b() {
        final affr affr = new affr();
        final amae c = this.c;
        if ((c.c & 0x4) != 0x0) {
            affr.h(c.f);
        }
        final afkf d = ((afeq)this.getItemsModels()).D();
        while (((Iterator)d).hasNext()) {
            final alzz alzz = (alzz)((Iterator)d).next();
            final affr affr2 = new affr();
            final amad a = alzz.a;
            if (a.b == 1) {
                affr2.h(a.c);
            }
            final amad a2 = alzz.a;
            if (a2.b == 2) {
                affr2.h(a2.c);
            }
            affr.j((Iterable)affr2.g());
        }
        return affr.g();
    }
    
    public final amaa c() {
        return new amaa(((ahbh)this.c).toBuilder());
    }
    
    public final byte[] d() {
        return ((agzk)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amac && ((ahbh)this.c).equals((Object)((amac)o).c);
    }
    
    public List getItems() {
        return (List)this.c.e;
    }
    
    public List getItemsModels() {
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.c.e).iterator();
        while (iterator.hasNext()) {
            afel.h(new alzz((amad)((ahbh)iterator.next()).toBuilder().build(), this.b));
        }
        return (List)afel.g();
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amac.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("MainRecommendedDownloadsListEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
