import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzq
{
    public static final long b(final atzk atzk) {
        return atzk.b / 4L;
    }
    
    public static final atzm c(final atzx atzx) {
        return (atzm)new atzt(atzx);
    }
    
    public static atmd d(final atmd atmd, final atmd atmd2) {
        atmd2.getClass();
        if (atmd2 == atme.a) {
            return atmd;
        }
        return (atmd)atmd2.fold((Object)atmd, (atnk)atmc.a);
    }
    
    public static boolean e(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public final void a(long n, final atzk atzk, int i, final List list, int j, final int n2, final List list2) {
        int k = i;
        if (j >= n2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (i = j; i < n2; ++i) {
            if (list.get(i).b() < k) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        atzn atzn = list.get(j);
        final atzn atzn2 = list.get(n2 - 1);
        if (k == atzn.b()) {
            final int intValue = list2.get(j).intValue();
            i = j + 1;
            atzn = list.get(i);
            j = intValue;
        }
        else {
            final int n3 = -1;
            i = j;
            j = n3;
        }
        if (atzn.a(k) != atzn2.a(k)) {
            int l = i + 1;
            int n4 = 1;
            while (l < n2) {
                int n5 = n4;
                if (((atzn)list.get(l - 1)).a(k) != ((atzn)list.get(l)).a(k)) {
                    n5 = n4 + 1;
                }
                ++l;
                n4 = n5;
            }
            n = n + b(atzk) + 2L;
            final int n6 = n4 + n4;
            atzk.r(n4);
            atzk.r(j);
            byte a;
            for (j = i; j < n2; ++j) {
                a = list.get(j).a(k);
                if (j == i || a != list.get(j - 1).a(k)) {
                    atzk.r(a & 0xFF);
                }
            }
            final atzk atzk2 = new atzk();
            j = n6;
            int n7 = i;
        Label_0369:
            while (n7 < n2) {
                final byte a2 = list.get(n7).a(k);
                while (true) {
                    for (int n8 = i = n7 + 1; i < n2; ++i) {
                        if (a2 != list.get(i).a(k)) {
                            if (n8 == i && k + 1 == list.get(n7).b()) {
                                atzk.r(((Number)list2.get(n7)).intValue());
                            }
                            else {
                                final long n9 = n + j;
                                atzk.r(-(int)(b(atzk2) + n9));
                                this.a(n9, atzk2, k + 1, list, n7, i, list2);
                            }
                            n7 = i;
                            continue Label_0369;
                        }
                    }
                    i = n2;
                    continue;
                }
            }
            atzk.o((atzx)atzk2);
            return;
        }
        final int min = Math.min(atzn.b(), atzn2.b());
        int n10 = 0;
        for (int n11 = k; n11 < min && atzn.a(n11) == atzn2.a(n11); ++n11) {
            ++n10;
        }
        final long b = b(atzk);
        final long n12 = n10;
        atzk.r(-n10);
        atzk.r(j);
        for (j = k + n10; k < j; ++k) {
            atzk.r(atzn.a(k) & 0xFF);
        }
        if (i + 1 != n2) {
            n = n + b + 2L + n12 + 1L;
            final atzk atzk3 = new atzk();
            atzk.r(-(int)(b(atzk3) + n));
            this.a(n, atzk3, j, list, i, n2, list2);
            atzk.o((atzx)atzk3);
            return;
        }
        if (j == list.get(i).b()) {
            atzk.r(list2.get(i).intValue());
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
