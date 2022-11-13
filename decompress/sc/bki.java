import java.util.List;
import java.util.Set;
import android.view.textclassifier.TextClassifier;
import java.util.Collections;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import android.widget.TextView;
import android.content.ContentResolver;
import android.util.SparseArray;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bki
{
    public final Object a;
    public Object b;
    
    public bki() {
        this.a = new HashSet();
    }
    
    public bki(final int n) {
        this.a = new SparseArray(n);
    }
    
    public bki(final ContentResolver a) {
        a.getClass();
        this.a = a;
    }
    
    public bki(final TextView a) {
        this.a = a;
    }
    
    public bki(final aui a, final aul b) {
        this.a = a;
        this.b = b;
        final aui aui = a;
        a.b((aum)b);
    }
    
    public bki(final aum aum, final auh b) {
        this.a = aur.a((Object)aum);
        this.b = b;
    }
    
    public bki(final byte[] array) {
        this.a = new HashMap();
    }
    
    public bki(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new Object();
    }
    
    public final void a(final Exception ex, final boolean b) {
        this.b = null;
        final afeq o = afeq.o((Collection)this.a);
        ((Set)this.a).clear();
        for (int size = ((List)o).size(), i = 0; i < size; ++i) {
            final bke bke = (bke)((List)o).get(i);
            int n = 1;
            if (!b) {
                n = 3;
            }
            bke.h(ex, n);
        }
    }
    
    public final void b(final bke b) {
        ((Set<bke>)this.a).add(b);
        if (this.b != null) {
            return;
        }
        ((bke)(this.b = b)).j();
    }
    
    public final void c(final aun aun, final aug aug) {
        final auh d = aug.d();
        this.b = auo.d((auh)this.b, d);
        ((aul)this.a).a(aun, aug);
        this.b = d;
    }
    
    public final Map d() {
        synchronized (this) {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>((Map<?, ?>)this.a));
            }
            return (Map)this.b;
        }
    }
    
    public final void e() {
        synchronized (this) {
            this.b = null;
            ((Map)this.a).clear();
        }
    }
    
    public final void f(final String s, final String s2) {
        synchronized (this) {
            this.b = null;
            ((Map<String, String>)this.a).put(s, s2);
        }
    }
    
    public final void g(final aru b, final int n, final int n2) {
        bki m;
        if ((m = this.m(b.a(n))) == null) {
            m = new bki(1);
            ((SparseArray)this.a).put(b.a(n), (Object)m);
        }
        if (n2 > n) {
            m.g(b, n + 1, n2);
            return;
        }
        m.b = b;
    }
    
    public final void h() {
        ((aui)this.a).c((aum)this.b);
        this.b = null;
    }
    
    public final TextClassifier i() {
        Object o;
        if ((o = this.b) == null) {
            o = kw.a((TextView)this.a);
        }
        return (TextClassifier)o;
    }
    
    public final hi j() {
        synchronized (this.a) {
            final Object b = this.b;
            if (b == null) {
                return null;
            }
            this.b = ((hi)b).a;
            monitorexit(this.a);
            return (hi)b;
        }
    }
    
    public final void k(final int n) {
        final Object a = this.a;
        monitorenter(a);
        try {
            Object b;
            while (true) {
                b = this.b;
                if (b == null || ((hi)b).b != n) {
                    break;
                }
                this.b = ((hi)b).a;
                ((hi)b).d();
            }
            if (b != null) {
                hi a3;
                for (hi a2 = ((hi)b).a; a2 != null; a2 = a3) {
                    a3 = a2.a;
                    if (a2.b == n) {
                        ((hi)b).a = a3;
                        a2.d();
                    }
                    else {
                        b = a2;
                    }
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void l(final hi hi) {
        final Object a = this.a;
        monitorenter(a);
        try {
            Object b = this.b;
            if (b != null) {
                while (true) {
                    final hi a2 = ((hi)b).a;
                    if (a2 == null) {
                        break;
                    }
                    b = a2;
                }
                ((hi)b).a = hi;
                monitorexit(a);
                return;
            }
            this.b = hi;
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final bki m(final int n) {
        return (bki)((SparseArray)this.a).get(n);
    }
}
