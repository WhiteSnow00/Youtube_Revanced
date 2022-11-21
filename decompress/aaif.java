import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaif
{
    private final Map a;
    private final Map b;
    private int c;
    private int d;
    
    public aaif() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = 0;
        this.d = 0;
    }
    
    final aahl a(final String s) {
        synchronized (this) {
            return this.a.get(s);
        }
    }
    
    public final aahl b(final String s) {
        synchronized (this) {
            final aahl aahl = this.a.remove(s);
            if (aahl != null) {
                final Integer n = this.b.remove(s);
                if (n == null) {
                    return aahl;
                }
                if (n != 1 && n != 3 && n != 4 && n != 7 && n != 6) {
                    if (n == 2) {
                        --this.d;
                        return aahl;
                    }
                }
                else {
                    --this.c;
                }
            }
            return aahl;
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
                    n = this.c;
                    monitorexit(this);
                    return n <= 0;
                    final StringBuilder sb = new StringBuilder("Invalid transfer type: ");
                    sb.append(n);
                    throw new IllegalArgumentException(sb.toString());
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
    
    final boolean e(final String s, final aahl aahl, final int n) {
        synchronized (this) {
            if (!this.c(n)) {
                return false;
            }
            this.a.put(s, aahl);
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
