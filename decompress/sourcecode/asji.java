import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asji implements asic, asjf
{
    List a;
    volatile boolean b;
    
    public final boolean c(final asic asic) {
        asjv.b((Object)asic, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List a;
                    if ((a = this.a) == null) {
                        a = new LinkedList();
                        this.a = a;
                    }
                    a.add(asic);
                    return true;
                }
            }
        }
        asic.dispose();
        return false;
    }
    
    public final boolean d(final asic asic) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            final List a = this.a;
            return a != null && a.remove(asic);
        }
    }
    
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
                for (final asic asic : a) {
                    try {
                        asic.dispose();
                    }
                    finally {
                        final Throwable t;
                        asey.d(t);
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
                        throw athp.b((Throwable)list.get(0));
                    }
                    throw new asik((Iterable)list);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void h(final asic asic) {
        if (this.d(asic)) {
            asic.dispose();
        }
    }
    
    public final boolean tx() {
        return this.b;
    }
}
