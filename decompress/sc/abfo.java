import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public class abfo implements abfw
{
    private final SparseArray a;
    private final Set c;
    private final Set d;
    private final Set e;
    private int f;
    private final aglu g;
    
    public abfo() {
        final aglu g = new aglu();
        this.a = new SparseArray(2);
        this.c = new CopyOnWriteArraySet();
        this.d = new CopyOnWriteArraySet();
        this.e = new CopyOnWriteArraySet();
        this.g = g;
        for (int i = 0; i < 2; ++i) {
            this.a.put(abfo.b[i], (Object)new ArrayList());
        }
        this.f = -1;
    }
    
    private final void a() {
        synchronized (this) {
            fqq fqq;
            if (this.f != -1) {
                fqq = ((List)this.a.get(0)).get(this.f);
            }
            else {
                fqq = null;
            }
            adkp.Q(this.g.r(fqq));
        }
    }
    
    private final void d(final int n) {
        monitorenter(this);
        try {
            if (n != this.f) {
                final Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                    ((abfv)iterator.next()).d();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void e(final int n, final int n2) {
        synchronized (this) {
            final int f = this.f;
            if (f != -1 && n <= f) {
                this.f = f + n2;
                this.a();
            }
        }
    }
    
    private final void f(final int n, final int f) {
        synchronized (this) {
            final int f2 = this.f;
            if (f2 != -1 && tpe.aQ(f2, Math.min(n, f), Math.max(n, f))) {
                final int f3 = this.f;
                if (f3 == n) {
                    this.f = f;
                }
                else if (n < f) {
                    this.f = f3 - 1;
                }
                else {
                    this.f = f3 + 1;
                }
                this.a();
            }
        }
    }
    
    private final void g(final int n, final int n2) {
        synchronized (this) {
            final int f = this.f;
            if (f == -1 || n > f) {
                return;
            }
            if (n + n2 <= f) {
                this.f = f - n2;
                this.a();
                return;
            }
            this.f = Math.min(n, ((List)this.a.get(0)).size() - 1);
            this.h();
        }
    }
    
    private final void h() {
        monitorenter(this);
        try {
            final fqq a = abfr.a((abfw)this);
            final aglu g = this.g;
            if (!g.r(a)) {
                g.a = a;
                final Iterator<Object> iterator = ((Set<Object>)g.b).iterator();
                while (iterator.hasNext()) {
                    iterator.next().a((Object)a);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final int A(int index, final fqq fqq) {
        synchronized (this) {
            index = ((List)this.a.get(index)).indexOf(fqq);
            return index;
        }
    }
    
    public final int B(final fqq fqq) {
        monitorenter(this);
        try {
            final List list = (List)this.a.get(0);
            int n;
            if ((n = list.indexOf(fqq)) < 0) {
                final int index = ((List)this.a.get(1)).indexOf(fqq);
                if (index < 0) {
                    n = Math.max(0, this.f + 1);
                    this.c(n, Collections.singleton(fqq));
                }
                else {
                    for (int i = 0; i < index + 1; ++i) {
                        this.r(1, 0, 0, list.size());
                    }
                    n = list.size() - 1;
                }
            }
            this.b(n);
            final int j = this.j();
            monitorexit(this);
            return j;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final fqq C(final int n, final int n2) {
        synchronized (this) {
            return ((List)this.a.get(n)).get(n2);
        }
    }
    
    public final void b(final int f) {
        synchronized (this) {
            final List list = (List)this.a.get(0);
            if (list.isEmpty()) {
                if (f != -1) {
                    throw new IndexOutOfBoundsException();
                }
            }
            else {
                tpe.X(f, list.size() - 1);
            }
            final int f2 = this.f;
            this.f = f;
            this.d(f2);
            this.h();
        }
    }
    
    public final void c(final int n, final Collection collection) {
        if (collection != null) {
            if (!collection.isEmpty()) {
                final int size = collection.size();
                synchronized (this) {
                    ((List)this.a.get(0)).addAll(n, collection);
                    final int f = this.f;
                    this.e(n, size);
                    final Iterator iterator = this.c.iterator();
                    while (iterator.hasNext()) {
                        ((abfs)iterator.next()).a(0, n, size);
                    }
                    this.d(f);
                }
            }
        }
    }
    
    public final int i(int size) {
        synchronized (this) {
            size = ((List)this.a.get(size)).size();
            return size;
        }
    }
    
    public final int j() {
        synchronized (this) {
            return this.f;
        }
    }
    
    public final void k(final abfs abfs) {
        this.c.add(abfs);
    }
    
    public final void l(final abfu abfu) {
        ((Set<abfu>)this.g.b).add(abfu);
    }
    
    public final void m(final abfv abfv) {
        this.d.add(abfv);
    }
    
    public final void q() {
        monitorenter(this);
        int i = 0;
        while (i < 2) {
            try {
                final int n = abfo.b[i];
                this.u(n, 0, ((List)this.a.get(n)).size());
                ++i;
                continue;
            }
            finally {
                monitorexit(this);
            }
            break;
        }
        monitorexit(this);
    }
    
    public final void r(final int n, final int n2, final int n3, final int n4) {
        if (n2 == n4 && n == n3) {
            return;
        }
        monitorenter(this);
        try {
            final List list = (List)this.a.get(n);
            if (n2 >= list.size()) {
                zlm.b(zll.b, zlk.j, "Attempted to move a queue item from a position which doesn't exist.");
                monitorexit(this);
                return;
            }
            ((List)this.a.get(n3)).add(n4, list.remove(n2));
            final int f = this.f;
            boolean b = false;
            final boolean b2 = n == 0;
            if (n3 == 0) {
                b = true;
            }
            if (b2 && b) {
                this.f(n2, n4);
            }
            else if (b2) {
                this.g(n2, 1);
            }
            else if (b) {
                this.e(n4, 1);
                final Iterator iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    ((abft)iterator.next()).a();
                }
            }
            final Iterator iterator2 = this.c.iterator();
            while (iterator2.hasNext()) {
                ((abfs)iterator2.next()).b(n, n2, n3, n4);
            }
            this.d(f);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void u(final int n, final int n2, final int n3) {
        if (n3 == 0) {
            return;
        }
        monitorenter(this);
        try {
            ((List)this.a.get(n)).subList(n2, n2 + n3).clear();
            final int f = this.f;
            int n4 = n;
            if (n == 0) {
                this.g(n2, n3);
                n4 = 0;
            }
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((abfs)iterator.next()).c(n4, n2, n3);
            }
            this.d(f);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void v(final abfs abfs) {
        this.c.remove(abfs);
    }
    
    public final void w(final abfu abfu) {
        ((Set)this.g.b).remove(abfu);
    }
    
    public final void x(final abfv abfv) {
        this.d.remove(abfv);
    }
    
    public final boolean y(final PlaybackStartDescriptor playbackStartDescriptor) {
        synchronized (this) {
            final fqq a = abfr.a((abfw)this);
            return a != null && abjr.g(a.a(), playbackStartDescriptor);
        }
    }
}
