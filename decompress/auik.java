import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auik implements aujf, aujd
{
    public final aujf[] a;
    public final aujd[] b;
    private final int c;
    private final int d;
    
    public auik(final List list) {
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        final int size = list.size();
        final int n = 0;
        for (int i = 0; i < size; i += 2) {
            final Object value = list.get(i);
            if (value instanceof auik) {
                e(list2, ((auik)value).a);
            }
            else {
                list2.add(value);
            }
            final Object value2 = list.get(i + 1);
            if (value2 instanceof auik) {
                e(list3, ((auik)value2).b);
            }
            else {
                list3.add(value2);
            }
        }
        if (!list2.contains(null) && !list2.isEmpty()) {
            final int size2 = list2.size();
            this.a = new aujf[size2];
            int j = 0;
            int c = 0;
            while (j < size2) {
                final aujf aujf = (aujf)list2.get(j);
                c += aujf.b();
                this.a[j] = aujf;
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
            this.b = new aujd[size3];
            int d = 0;
            for (int k = n; k < size3; ++k) {
                final aujd aujd = (aujd)list3.get(k);
                d += aujd.a();
                this.b[k] = aujd;
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
    
    public final int c(final auiz auiz, final CharSequence charSequence, int c) {
        final aujd[] b = this.b;
        if (b != null) {
            for (int n = 0; n < b.length && c >= 0; c = b[n].c(auiz, charSequence, c), ++n) {}
            return c;
        }
        throw new UnsupportedOperationException();
    }
    
    public final void d(final Appendable appendable, final long n, final aufl aufl, final int n2, final auft auft, Locale default1) {
        final aujf[] a = this.a;
        if (a != null) {
            if (default1 == null) {
                default1 = Locale.getDefault();
            }
            for (int length = a.length, i = 0; i < length; ++i) {
                a[i].d(appendable, n, aufl, n2, auft, default1);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
