import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atza
{
    public static final long b(final atyu atyu) {
        return atyu.b / 4L;
    }
    
    public static final atyw c(final atzh atzh) {
        return (atyw)new atzd(atzh);
    }
    
    public static final atld d(final atmp atmp, final Object o, final atld atld) {
        Object create;
        if (atmp instanceof atln) {
            create = ((atln)atmp).create(o, atld);
        }
        else {
            final atli context = atld.getContext();
            if (context == atlj.a) {
                create = new atll(atld, atmp, o);
            }
            else {
                create = new atlm(atld, context, atmp, o);
            }
        }
        return (atld)create;
    }
    
    public static final atld e(atld intercepted) {
        intercepted.getClass();
        atlp atlp;
        if (intercepted instanceof atlp) {
            atlp = (atlp)intercepted;
        }
        else {
            atlp = null;
        }
        if (atlp != null) {
            intercepted = atlp.intercepted();
        }
        return intercepted;
    }
    
    public final void a(long n, final atyu atyu, int i, final List list, int j, final int n2, final List list2) {
        int k = i;
        if (j >= n2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (i = j; i < n2; ++i) {
            if (list.get(i).b() < k) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        atyx atyx = list.get(j);
        final atyx atyx2 = list.get(n2 - 1);
        if (k == atyx.b()) {
            final int intValue = list2.get(j).intValue();
            i = j + 1;
            atyx = list.get(i);
            j = intValue;
        }
        else {
            final int n3 = -1;
            i = j;
            j = n3;
        }
        if (atyx.a(k) != atyx2.a(k)) {
            int l = i + 1;
            int n4 = 1;
            while (l < n2) {
                int n5 = n4;
                if (((atyx)list.get(l - 1)).a(k) != ((atyx)list.get(l)).a(k)) {
                    n5 = n4 + 1;
                }
                ++l;
                n4 = n5;
            }
            n = n + b(atyu) + 2L + (n4 + n4);
            atyu.r(n4);
            atyu.r(j);
            byte a;
            for (j = i; j < n2; ++j) {
                a = list.get(j).a(k);
                if (j == i || a != list.get(j - 1).a(k)) {
                    atyu.r(a & 0xFF);
                }
            }
            final atyu atyu2 = new atyu();
            j = i;
        Label_0365:
            while (j < n2) {
                final byte a2 = list.get(j).a(k);
                while (true) {
                    for (int n6 = i = j + 1; i < n2; ++i) {
                        if (a2 != list.get(i).a(k)) {
                            if (n6 == i && k + 1 == list.get(j).b()) {
                                atyu.r(list2.get(j).intValue());
                            }
                            else {
                                atyu.r(-(int)(b(atyu2) + n));
                                this.a(n, atyu2, k + 1, list, j, i, list2);
                            }
                            j = i;
                            continue Label_0365;
                        }
                    }
                    i = n2;
                    continue;
                }
            }
            atyu.o((atzh)atyu2);
            return;
        }
        final int min = Math.min(atyx.b(), atyx2.b());
        int n7 = 0;
        for (int n8 = k; n8 < min && atyx.a(n8) == atyx2.a(n8); ++n8) {
            ++n7;
        }
        n = 1L + (n + b(atyu) + 2L + n7);
        atyu.r(-n7);
        atyu.r(j);
        for (j = k + n7; k < j; ++k) {
            atyu.r(atyx.a(k) & 0xFF);
        }
        if (i + 1 != n2) {
            final atyu atyu3 = new atyu();
            atyu.r(-(int)(b(atyu3) + n));
            this.a(n, atyu3, j, list, i, n2, list2);
            atyu.o((atzh)atyu3);
            return;
        }
        if (j == list.get(i).b()) {
            atyu.r(list2.get(i).intValue());
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
