import java.util.Iterator;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfo implements ven, tec
{
    public final atjj a;
    public final Map b;
    
    public adfo(final atjj a) {
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
                final zkv zkv = (zkv)o;
                this.b.clear();
                array2 = array;
            }
            else {
                final aliq[] a = ((vhs)o).a();
                array2 = array;
                if (a != null) {
                    final int length = a.length;
                    n = n2;
                    while (true) {
                        array2 = array;
                        if (n >= length) {
                            break;
                        }
                        final aliq aliq = a[n];
                        final Map b = this.b;
                        final String e = aliq.e;
                        String s;
                        if (aliq.c == 2) {
                            s = (String)aliq.d;
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
            array2 = new Class[] { vhs.class, zkv.class };
        }
        return array2;
    }
}
