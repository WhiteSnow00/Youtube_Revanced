import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auht implements auio, auim
{
    public final auio[] a;
    public final auim[] b;
    private final int c;
    private final int d;
    
    public auht(final List list) {
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        final int size = list.size();
        final int n = 0;
        for (int i = 0; i < size; i += 2) {
            final Object value = list.get(i);
            if (value instanceof auht) {
                e(list2, ((auht)value).a);
            }
            else {
                list2.add(value);
            }
            final Object value2 = list.get(i + 1);
            if (value2 instanceof auht) {
                e(list3, ((auht)value2).b);
            }
            else {
                list3.add(value2);
            }
        }
        if (!list2.contains(null) && !list2.isEmpty()) {
            final int size2 = list2.size();
            this.a = new auio[size2];
            int j = 0;
            int c = 0;
            while (j < size2) {
                final auio auio = (auio)list2.get(j);
                c += auio.b();
                this.a[j] = auio;
                ++j;
            }
            this.c = c;
        }
        else {
            this.a = null;
            this.c = 0;
        }
        if (!list3.contains(null) && !list3.isEmpty()) {
            final int size3 = list3.size();
            this.b = new auim[size3];
            int d = 0;
            for (int k = n; k < size3; ++k) {
                final auim auim = (auim)list3.get(k);
                d += auim.a();
                this.b[k] = auim;
            }
            this.d = d;
            return;
        }
        this.b = null;
        this.d = 0;
    }
    
    private static final void e(final List list, final Object[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                list.add(array[i]);
            }
        }
    }
    
    public final int a() {
        return this.d;
    }
    
    public final int b() {
        return this.c;
    }
    
    public final int c(final auii auii, final CharSequence charSequence, int n) {
        final auim[] b = this.b;
        if (b != null) {
            final int length = b.length;
            final int n2 = 0;
            int c;
            for (c = n, n = n2; n < length && c >= 0; c = b[n].c(auii, charSequence, c), ++n) {}
            return c;
        }
        throw new UnsupportedOperationException();
    }
    
    public final void d(final Appendable appendable, final long n, final aueu aueu, final int n2, final aufc aufc, Locale default1) {
        final auio[] a = this.a;
        if (a != null) {
            if (default1 == null) {
                default1 = Locale.getDefault();
            }
            for (int length = a.length, i = 0; i < length; ++i) {
                a[i].d(appendable, n, aueu, n2, aufc, default1);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
