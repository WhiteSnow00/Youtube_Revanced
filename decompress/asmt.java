import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asmt implements asln, asmq
{
    List a;
    volatile boolean b;
    
    @Override
    public final boolean c(final asln asln) {
        asng.b(asln, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List a;
                    if ((a = this.a) == null) {
                        a = new LinkedList();
                        this.a = a;
                    }
                    a.add(asln);
                    return true;
                }
            }
        }
        asln.dispose();
        return false;
    }
    
    @Override
    public final boolean d(final asln asln) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            final List a = this.a;
            return a != null && a.remove(asln);
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
                for (final asln asln : a) {
                    try {
                        asln.dispose();
                    }
                    finally {
                        final Throwable t;
                        asjv.a(t);
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
                        throw atle.b((Throwable)list.get(0));
                    }
                    throw new aslv(list);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void h(final asln asln) {
        if (this.d(asln)) {
            asln.dispose();
        }
    }
    
    @Override
    public final boolean tz() {
        return this.b;
    }
}
