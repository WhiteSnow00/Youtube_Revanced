import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class dmu implements dly
{
    final dmx a;
    
    public dmu(final dmx a) {
        this.a = a;
    }
    
    public final void a(final boolean b) {
        dph.j();
        final dmx a = this.a;
        monitorenter(a);
        try {
            final ArrayList list = new ArrayList((Collection)this.a.b);
            monitorexit(a);
            for (int size = list.size(), i = 0; i < size; ++i) {
                ((dly)list.get(i)).a(b);
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
