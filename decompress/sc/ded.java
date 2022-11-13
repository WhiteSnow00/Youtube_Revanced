import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ded
{
    private static final ddz a;
    private final Map b;
    
    static {
        a = (ddz)new deb();
    }
    
    public ded() {
        this.b = new HashMap();
    }
    
    public final dea a(final Object o) {
        monitorenter(this);
        try {
            clm.h(o);
            ddz ddz2;
            final ddz ddz = ddz2 = this.b.get(o.getClass());
            if (ddz == null) {
                final Iterator iterator = this.b.values().iterator();
                do {
                    ddz2 = ddz;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    ddz2 = (ddz)iterator.next();
                } while (!ddz2.b().isAssignableFrom(o.getClass()));
            }
            ddz a;
            if ((a = ddz2) == null) {
                a = ded.a;
            }
            final dea a2 = a.a(o);
            monitorexit(this);
            return a2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final ddz ddz) {
        synchronized (this) {
            this.b.put(ddz.b(), ddz);
        }
    }
}
