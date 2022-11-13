import java.util.Iterator;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhr implements vgn, tgg
{
    public final atke a;
    public final Map b;
    
    public adhr(final atke a) {
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
    
    public final Class[] ms(final Class clazz, final Object o, int n) {
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
                final zms zms = (zms)o;
                this.b.clear();
                array2 = array;
            }
            else {
                final alkt[] a = ((vjs)o).a();
                array2 = array;
                if (a != null) {
                    n = n2;
                    while (true) {
                        array2 = array;
                        if (n >= a.length) {
                            break;
                        }
                        final alkt alkt = a[n];
                        final Map b = this.b;
                        final String e = alkt.e;
                        String s;
                        if (alkt.c == 2) {
                            s = (String)alkt.d;
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
            array2 = new Class[] { vjs.class, zms.class };
        }
        return array2;
    }
}
