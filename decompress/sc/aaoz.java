import java.util.function.Consumer;
import java.util.ArrayList;
import com.google.android.libraries.blocks.StatusException;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaoz implements aews
{
    public final abvz a;
    public final Set b;
    
    public aaoz(final abvz a) {
        this.b = new HashSet();
        a.getClass();
        this.a = a;
    }
    
    public final void a(final Optional optional) {
        for (final RuntimeStreamWriter runtimeStreamWriter : this.b) {
            if (optional.isPresent()) {
                runtimeStreamWriter.b((Throwable)optional.get());
            }
            else {
                runtimeStreamWriter.close();
            }
        }
        this.b.clear();
    }
    
    public final void b(final aqba aqba, final RuntimeStreamWriter runtimeStreamWriter) {
        final afft p2 = afft.p((Collection)new ahbr((List)aqba.d, aqba.a));
        if (p2.contains((Object)aqax.a)) {
            runtimeStreamWriter.b((Throwable)new StatusException(agup.d, "Invalid cue range event filter (CUE_RANGE_EVENT_TYPE_UNKNOWN)"));
            return;
        }
        final ArrayList list = new ArrayList();
        int i = 0;
        try {
            final Iterator<Object> iterator = ((List<Object>)aqba.c).iterator();
            while (iterator.hasNext()) {
                final aaoy aaoy = new aaoy(iterator.next(), (Set)p2, runtimeStreamWriter);
                list.add(aaoy);
                if (((abwc)aaoy).s(this.a.a())) {
                    aaoy.b(this.a.p(), false, false);
                }
            }
            this.a.f((List)list);
            this.b.add(runtimeStreamWriter);
            runtimeStreamWriter.a((Consumer)new ihs(this, list, runtimeStreamWriter, 10));
        }
        catch (final IllegalArgumentException ex) {
            runtimeStreamWriter.b((Throwable)new StatusException(agup.d, "Invalid cue range (start time > end time, or empty cue range)", ex.getStackTrace()));
            while (i < list.size()) {
                this.a.k((abvy)list.get(i));
                ++i;
            }
        }
    }
}
