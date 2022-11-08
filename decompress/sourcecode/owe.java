import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class owe
{
    private final Object a;
    private volatile long b;
    private volatile boolean c;
    private final List d;
    private final List e;
    
    public owe() {
        this.a = new Object();
        this.b = 0L;
        this.c = false;
        this.d = new ArrayList(15);
        this.e = new ArrayList(5);
    }
    
    final List a(final String s, final owa owa) {
        final ArrayList list = new ArrayList();
        Object o = this.a;
        monitorenter(o);
        try {
            final ArrayList list2 = new ArrayList(this.d);
            final ArrayList list3 = new ArrayList(this.e);
            this.d.clear();
            this.e.clear();
            monitorexit(o);
            o = null;
            for (int i = 0; i < list2.size(); ++i) {
                final int n = i % 3;
                if (n == 0) {
                    o = owd.a();
                    owa.b(((Long)list2.get(i)).intValue());
                }
                else if (n == 1) {
                    ((ovz)o).a = (Long)list2.get(i);
                }
                else {
                    ((ovz)o).b(s);
                    ((ovz)o).b = (Long)list2.get(i);
                    owa.h = (adgk)list3.get(i / 3);
                    ((ovz)o).e = owa.a();
                    list.add(o);
                }
            }
            return list;
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    final void b() {
        if (!this.c) {
            synchronized (this.a) {
                this.d.clear();
                this.e.clear();
                this.c = true;
            }
        }
    }
    
    final void c() {
        if (!this.c) {
            synchronized (this.a) {
                if (!this.c) {
                    final int size = this.d.size();
                    if (size < 15 && size % 3 == 2) {
                        this.d.add(aaja.A());
                    }
                }
            }
        }
    }
    
    final void d() {
        if (!this.c) {
            synchronized (this.a) {
                if (!this.c) {
                    final int size = this.d.size();
                    if (size < 15 && size % 3 == 0) {
                        ++this.b;
                        this.d.add(this.b);
                        this.d.add(aaja.A());
                        this.e.add(ovx.a());
                    }
                }
            }
        }
    }
}
