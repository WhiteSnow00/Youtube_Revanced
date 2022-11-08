import java.util.Iterator;
import android.view.ViewParent;
import android.view.View;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Map;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class paj
{
    public final Set a;
    public final Set b;
    public final List c;
    public final List d;
    public final Map e;
    public Collection f;
    public final boolean g;
    public final boolean h;
    private final Map i;
    
    public paj() {
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.i = new HashMap();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = null;
        this.g = true;
        final afgq a = afgq.a;
        this.h = false;
    }
    
    private final pai e(final ozo ozo) {
        final pai pai = new pai(this.c.size(), this.a.size(), true);
        final ozr b = pai.b(ozo, -1);
        final ArrayList list = new ArrayList(1);
        nrw.K(ozo, (List)list);
        afpc afpc;
        if ((afpc = b.d) == null) {
            afpc = afpc.a;
        }
        pai.e(new paq(1, (List)list, afpc.c));
        this.c.add(pai);
        this.i.put(b, pai);
        return pai;
    }
    
    public final pai a(final List list, final int n) {
        final ozr ozr = (ozr)adwd.aK(list);
        pai pai;
        if ((pai = this.i.get(ozr)) == null) {
            pai = new pai(this.c.size(), n);
            this.c.add(pai);
            this.i.put(ozr, pai);
        }
        return pai;
    }
    
    public final pai b(final ozo ozo) {
        final int b = ozo.b;
        if (b != -1) {
            if (b == -2) {
                return null;
            }
            return (pai)this.c.get(b);
        }
        else {
            agot.G(ozo.c(), "%s has no VE id, it may need to be reinstrumented if it has been reset.", (Object)ozo);
            this.d.add(ozo);
            final pac a = ozo.a;
            if (a.o()) {
                return this.e(ozo);
            }
            final Object c = a.c();
            if (c == null) {
                if (!((agzd)ozo.a()).rs((agyr)pbu.a)) {
                    final int f = ozu.f;
                    final pac a2 = ozo.a;
                    View a3;
                    if (a2 instanceof ozu) {
                        a3 = ((ozu)a2).a;
                    }
                    else {
                        a3 = null;
                    }
                    while (a3 != null) {
                        if (ozu.p(a3)) {
                            final String value = String.valueOf(ozo);
                            final StringBuilder sb = new StringBuilder("Unexpected visual element (");
                            sb.append(value);
                            sb.append(") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements.");
                            Log.e("GIL", sb.toString());
                            break;
                        }
                        final ViewParent parent = a3.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        a3 = (View)parent;
                    }
                    ozo.b = -2;
                    return null;
                }
                return this.e(ozo);
            }
            else {
                final ozo ozo2 = (ozo)c;
                if (ozo2.b == -1 && ozo2.d()) {
                    final ArrayList list = new ArrayList();
                    list.add(null);
                    nrw.K(ozo2, (List)list);
                    agot.D(list.size() > 1);
                    final pai a4 = this.a(list, this.a.size());
                    final ozr b2 = a4.b(ozo, -1);
                    list.set(0, b2);
                    afpc afpc;
                    if ((afpc = b2.d) == null) {
                        afpc = afpc.a;
                    }
                    a4.e(new paq(1, (List)list, afpc.c));
                    return a4;
                }
                final pai b3 = this.b(ozo2);
                if (b3 == null) {
                    return null;
                }
                afpc afpc2;
                if ((afpc2 = ((ozr)ozo2.d.instance).d) == null) {
                    afpc2 = afpc.a;
                }
                b3.b(ozo, afpc2.c);
                return b3;
            }
        }
    }
    
    public final List c() {
        final aere o = aesw.o("GIL:LogBatch");
        try {
            final ArrayList list = new ArrayList(this.c.size());
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                list.add(((pai)iterator.next()).c());
            }
            this.c.clear();
            this.i.clear();
            o.close();
            return list;
        }
        finally {
            Label_0102: {
                try {
                    o.close();
                    break Label_0102;
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    nzj.P(t, t2);
                }
            }
            while (true) {}
        }
    }
    
    public final boolean d(final ozo ozo, final int n) {
        if (this.a.contains(ozo)) {
            return false;
        }
        int e;
        if ((e = aety.e(((ozr)ozo.d.instance).e)) == 0) {
            e = 1;
        }
        if (e == n) {
            this.b.remove(ozo);
            return false;
        }
        this.b.add(ozo);
        return true;
    }
}
