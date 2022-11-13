// 
// Decompiled by Procyon v0.6.0
// 

public final class auin implements aujd
{
    private final aujd[] a;
    private final int b;
    
    public auin(final aujd[] a) {
        this.a = a;
        int length = a.length;
        int b = 0;
        while (true) {
            final int n = length - 1;
            if (n < 0) {
                break;
            }
            final aujd aujd = a[n];
            length = n;
            if (aujd == null) {
                continue;
            }
            final int a2 = aujd.a();
            length = n;
            if (a2 <= b) {
                continue;
            }
            b = a2;
            length = n;
        }
        this.b = b;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final int c(final auiz auiz, final CharSequence charSequence, final int n) {
        final aujd[] a = this.a;
        final int length = a.length;
        final Object b = auiz.b();
        final int n2 = 0;
        Object o = null;
        int n4;
        int n3 = n4 = n;
        int n5 = 0;
        int n6 = 0;
        Label_0240: {
            int c;
            while (true) {
                n6 = n2;
                if (n5 >= length) {
                    break Label_0240;
                }
                final aujd aujd = a[n5];
                if (aujd == null) {
                    if (n3 > n) {
                        n6 = 1;
                        break Label_0240;
                    }
                    return n;
                }
                else {
                    c = aujd.c(auiz, charSequence, n);
                    Object b2;
                    int n7;
                    int n8;
                    if (c >= n) {
                        b2 = o;
                        n7 = n3;
                        n8 = n4;
                        if (c > n3) {
                            if (c >= charSequence.length()) {
                                break;
                            }
                            final int n9 = n5 + 1;
                            if (n9 >= length) {
                                break;
                            }
                            if (a[n9] == null) {
                                break;
                            }
                            b2 = auiz.b();
                            n7 = c;
                            n8 = n4;
                        }
                    }
                    else {
                        b2 = o;
                        n7 = n3;
                        n8 = n4;
                        if (c < 0) {
                            final int n10 = ~c;
                            b2 = o;
                            n7 = n3;
                            if (n10 > (n8 = n4)) {
                                n8 = n10;
                                n7 = n3;
                                b2 = o;
                            }
                        }
                    }
                    auiz.h(b);
                    ++n5;
                    o = b2;
                    n3 = n7;
                    n4 = n8;
                }
            }
            return c;
        }
        if (n3 <= n && (n3 != n || n6 == 0)) {
            return ~n4;
        }
        if (o != null) {
            auiz.h(o);
        }
        return n3;
    }
}
