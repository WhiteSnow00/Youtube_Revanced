import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amyo extends vgs
{
    public final ahcr a;
    
    private amyo() {
        final amyr a = amyr.a;
        throw null;
    }
    
    public amyo(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.b(vgx);
    }
    
    public final amyq b(final vgx vgx) {
        return new amyq((amyr)this.a.build());
    }
    
    public final void c(final List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    this.a.bv((aonx)iterator.next());
                }
            }
        }
    }
    
    public final void d() {
        final ahcr a = this.a;
        a.copyOnWrite();
        final amyr amyr = (amyr)a.instance;
        final amyr a2 = amyr.a;
        amyr.e = amyr.emptyProtobufList();
    }
}
