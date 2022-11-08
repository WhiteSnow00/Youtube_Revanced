import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class dmt implements dlx
{
    final /* synthetic */ dmw a;
    
    public dmt(final dmw a) {
        this.a = a;
    }
    
    public final void a(final boolean b) {
        dpg.k();
        final dmw a = this.a;
        monitorenter(a);
        try {
            final ArrayList list = new ArrayList((Collection)this.a.b);
            monitorexit(a);
            for (int size = list.size(), i = 0; i < size; ++i) {
                ((dlx)list.get(i)).a(b);
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
