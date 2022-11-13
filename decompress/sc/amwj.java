import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwj extends vfk
{
    public final ahaz a;
    
    private amwj() {
        final amwm a = amwm.a;
        throw null;
    }
    
    public amwj(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.b(vfp);
    }
    
    public final amwl b(final vfp vfp) {
        return new amwl((amwm)this.a.build());
    }
    
    public final void c(final List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    this.a.bu((aoln)iterator.next());
                }
            }
        }
    }
    
    public final void d() {
        final ahaz a = this.a;
        a.copyOnWrite();
        final amwm amwm = (amwm)a.instance;
        final amwm a2 = amwm.a;
        amwm.e = amwm.emptyProtobufList();
    }
}
