import java.util.Iterator;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjg implements vhv, thj
{
    public final atnb a;
    public final Map b;
    
    public adjg(final atnb a) {
        this.a = a;
        this.b = new HashMap();
    }
    
    public final void b(final String s, final Bundle bundle) {
        if (!this.b.isEmpty()) {
            for (final Map.Entry<String, V> entry : this.b.entrySet()) {
                bundle.putString((String)entry.getKey(), (String)entry.getValue());
            }
        }
    }
    
    public final void c(final Bundle bundle) {
    }
    
    public final Class[] mr(final Class clazz, final Object o, int n) {
        final int n2 = 0;
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zon zon = (zon)o;
                this.b.clear();
                array2 = array;
            }
            else {
                final almt[] a = ((vla)o).a();
                array2 = array;
                if (a != null) {
                    n = n2;
                    while (true) {
                        array2 = array;
                        if (n >= a.length) {
                            break;
                        }
                        final almt almt = a[n];
                        final Map b = this.b;
                        final String e = almt.e;
                        String s;
                        if (almt.c == 2) {
                            s = (String)almt.d;
                        }
                        else {
                            s = "";
                        }
                        b.put(e, s);
                        ++n;
                    }
                }
            }
        }
        else {
            array2 = new Class[] { vla.class, zon.class };
        }
        return array2;
    }
}
