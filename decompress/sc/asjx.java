import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asjx implements asir, asju
{
    List a;
    volatile boolean b;
    
    public final boolean c(final asir asir) {
        askk.b((Object)asir, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List a;
                    if ((a = this.a) == null) {
                        a = new LinkedList();
                        this.a = a;
                    }
                    a.add(asir);
                    return true;
                }
            }
        }
        asir.dispose();
        return false;
    }
    
    public final boolean d(final asir asir) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            final List a = this.a;
            return a != null && a.remove(asir);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.b) {
            return;
        }
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return;
            }
            this.b = true;
            final List a = this.a;
            List list = null;
            this.a = null;
            monitorexit(this);
            if (a != null) {
                for (final asir asir : a) {
                    try {
                        asir.dispose();
                    }
                    finally {
                        final Throwable t;
                        asgz.c(t);
                        List list2 = list;
                        if (list == null) {
                            list2 = new ArrayList();
                        }
                        list2.add(t);
                        list = list2;
                    }
                }
                if (list != null) {
                    if (list.size() == 1) {
                        throw atih.b((Throwable)list.get(0));
                    }
                    throw new asiz(list);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void h(final asir asir) {
        if (this.d(asir)) {
            asir.dispose();
        }
    }
    
    @Override
    public final boolean tA() {
        return this.b;
    }
}
