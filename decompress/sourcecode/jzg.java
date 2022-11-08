import java.util.Iterator;
import com.google.protos.youtube.api.innertube.HomeAdsPanelRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzg
{
    public final Map a;
    public final Map b;
    public final ArrayDeque c;
    public final abno d;
    private final atjj e;
    private jjg f;
    
    public jzg(final atjj e, final abno d) {
        this.a = new HashMap();
        this.b = new WeakHashMap();
        this.c = new ArrayDeque();
        this.e = e;
        this.d = d;
        this.f = null;
    }
    
    public final void a(final List list, final anws anws) {
        final Map b = this.b;
        final ArrayList list2 = new ArrayList();
        for (final anss anss : list) {
            if (((agzd)anss).rs((agyr)HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer)) {
                list2.add(((agzd)anss).rr((agyr)HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer));
            }
        }
        b.put(anws, list2);
        for (final anss anss2 : list) {
            if (((agzd)anss2).rs((agyr)HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer)) {
                final ajzq ajzq = (ajzq)((agzd)anss2).rr((agyr)HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer);
                this.a.put(ajzq.c, ajzq);
            }
        }
    }
    
    public final void b(final List list) {
        for (final ajzq ajzq : list) {
            this.a.put(ajzq.c, ajzq);
        }
    }
    
    public final jjg c() {
        jjg f;
        if ((f = this.f) == null) {
            f = (jjg)this.e.a();
            this.f = f;
            ((jzf)f.b).ah = this;
        }
        return f;
    }
}
