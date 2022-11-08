import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaem
{
    private final Map a;
    private final Map b;
    private int c;
    private int d;
    
    public aaem() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = 0;
        this.d = 0;
    }
    
    final aads a(final String s) {
        synchronized (this) {
            return this.a.get(s);
        }
    }
    
    public final aads b(final String s) {
        synchronized (this) {
            final aads aads = this.a.remove(s);
            if (aads != null) {
                final Integer n = this.b.remove(s);
                if (n == null) {
                    return aads;
                }
                if (n != 1 && n != 3 && n != 4 && n != 7 && n != 6) {
                    if (n == 2) {
                        --this.d;
                        return aads;
                    }
                }
                else {
                    --this.c;
                }
            }
            return aads;
        }
    }
    
    final boolean c(int n) {
        monitorenter(this);
        Label_0082: {
            if (n == 1 || n == 3 || n == 4 || n == 7 || n == 6) {
                break Label_0082;
            }
            Label_0052: {
                if (n != 2) {
                    break Label_0052;
                }
                try {
                    n = this.d;
                    monitorexit(this);
                    return n <= 0;
                    final StringBuilder sb = new StringBuilder("Invalid transfer type: ");
                    sb.append(n);
                    throw new IllegalArgumentException(sb.toString());
                    n = this.c;
                    monitorexit(this);
                    return n <= 0;
                }
                finally {
                    monitorexit(this);
                }
            }
        }
    }
    
    final boolean d(final String s) {
        synchronized (this) {
            return this.a.containsKey(s);
        }
    }
    
    final boolean e(final String s, final aads aads, final int n) {
        synchronized (this) {
            if (!this.c(n)) {
                return false;
            }
            this.a.put(s, aads);
            this.b.put(s, n);
            if (n != 1 && n != 3 && n != 4 && n != 7 && n != 6) {
                if (n == 2) {
                    ++this.d;
                }
            }
            else {
                ++this.c;
            }
            return true;
        }
    }
}
