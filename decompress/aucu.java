import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucu
{
    public static final byte[] a(final String s) {
        final byte[] bytes = s.getBytes(atsf.a);
        bytes.getClass();
        return bytes;
    }
    
    public static final long c(final aucg aucg) {
        return aucg.b / 4L;
    }
    
    public static atpa d(final atpa atpa, final atpa atpa2) {
        atpa2.getClass();
        if (atpa2 == atpb.a) {
            return atpa;
        }
        return (atpa)atpa2.fold(atpa, (atqh)atoz.a);
    }
    
    public static boolean e(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public final void b(long n, final aucg aucg, int i, final List list, int j, final int n2, final List list2) {
        int k = i;
        if (j >= n2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (i = j; i < n2; ++i) {
            if (list.get(i).b() < k) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        aucj aucj = list.get(j);
        final aucj aucj2 = list.get(n2 - 1);
        if (k == aucj.b()) {
            final int intValue = list2.get(j).intValue();
            i = j + 1;
            aucj = list.get(i);
            j = intValue;
        }
        else {
            final int n3 = -1;
            i = j;
            j = n3;
        }
        if (aucj.a(k) != aucj2.a(k)) {
            int l = i + 1;
            int n4 = 1;
            while (l < n2) {
                int n5 = n4;
                if (((aucj)list.get(l - 1)).a(k) != ((aucj)list.get(l)).a(k)) {
                    n5 = n4 + 1;
                }
                ++l;
                n4 = n5;
            }
            n = n + c(aucg) + 2L;
            final int n6 = n4 + n4;
            aucg.r(n4);
            aucg.r(j);
            byte a;
            for (j = i; j < n2; ++j) {
                a = list.get(j).a(k);
                if (j == i || a != list.get(j - 1).a(k)) {
                    aucg.r(a & 0xFF);
                }
            }
            final aucg aucg2 = new aucg();
            final int n7 = n6;
            j = i;
        Label_0369:
            while (j < n2) {
                final byte a2 = list.get(j).a(k);
                while (true) {
                    for (int n8 = i = j + 1; i < n2; ++i) {
                        if (a2 != list.get(i).a(k)) {
                            if (n8 == i && k + 1 == list.get(j).b()) {
                                aucg.r(list2.get(j).intValue());
                            }
                            else {
                                final long n9 = n + n7;
                                aucg.r(-(int)(c(aucg2) + n9));
                                this.b(n9, aucg2, k + 1, list, j, i, list2);
                            }
                            j = i;
                            continue Label_0369;
                        }
                    }
                    i = n2;
                    continue;
                }
            }
            aucg.o((auct)aucg2);
            return;
        }
        final int min = Math.min(aucj.b(), aucj2.b());
        int n10 = 0;
        for (int n11 = k; n11 < min && aucj.a(n11) == aucj2.a(n11); ++n11) {
            ++n10;
        }
        final long c = c(aucg);
        final long n12 = n10;
        aucg.r(-n10);
        aucg.r(j);
        for (j = k + n10; k < j; ++k) {
            aucg.r(aucj.a(k) & 0xFF);
        }
        if (i + 1 != n2) {
            n = n + c + 2L + n12 + 1L;
            final aucg aucg3 = new aucg();
            aucg.r(-(int)(c(aucg3) + n));
            this.b(n, aucg3, j, list, i, n2, list2);
            aucg.o((auct)aucg3);
            return;
        }
        if (j == list.get(i).b()) {
            aucg.r(list2.get(i).intValue());
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
