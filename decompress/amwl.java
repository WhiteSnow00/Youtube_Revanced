import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwl implements vfu
{
    public static final vfv a;
    private final amwm b;
    
    static {
        a = new amwk();
    }
    
    public amwl(final amwm b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return this.c();
    }
    
    public final afft b() {
        final affr affr = new affr();
        final afkf d = ((afeq)this.getStreamsProgressModels()).D();
        while (((Iterator)d).hasNext()) {
            final aolm aolm = (aolm)((Iterator)d).next();
            affr.j((Iterable)aolm.a());
        }
        return affr.g();
    }
    
    public final amwj c() {
        return new amwj(((ahbh)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amwl && ((ahbh)this.b).equals((Object)((amwl)o).b);
    }
    
    public List getStreamsProgress() {
        return (List)this.b.e;
    }
    
    public List getStreamsProgressModels() {
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.b.e).iterator();
        while (iterator.hasNext()) {
            afel.h((Object)aolm.b((aoln)iterator.next()).F());
        }
        return (List)afel.g();
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amwl.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("OfflineVideoStreamsEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
