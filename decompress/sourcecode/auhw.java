// 
// Decompiled by Procyon v0.6.0
// 

public final class auhw implements auim
{
    private final auim[] a;
    private final int b;
    
    public auhw(final auim[] a) {
        this.a = a;
        int length = a.length;
        int b = 0;
        while (true) {
            final int n = length - 1;
            if (n < 0) {
                break;
            }
            final auim auim = a[n];
            length = n;
            if (auim == null) {
                continue;
            }
            final int a2 = auim.a();
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
    
    public final int c(final auii auii, final CharSequence charSequence, final int n) {
        final auim[] a = this.a;
        final int length = a.length;
        final Object b = auii.b();
        Object o = null;
        final int n2 = 0;
        int n3 = n;
        final int n4 = 0;
        int n5 = n;
        int n6 = n4;
        int n7 = 0;
        Label_0248: {
            int c;
            while (true) {
                n7 = n2;
                if (n6 >= length) {
                    break Label_0248;
                }
                final auim auim = a[n6];
                if (auim == null) {
                    if (n5 > n) {
                        n7 = 1;
                        break Label_0248;
                    }
                    return n;
                }
                else {
                    c = auim.c(auii, charSequence, n);
                    Object b2;
                    int n8;
                    int n9;
                    if (c >= n) {
                        b2 = o;
                        n8 = n5;
                        n9 = n3;
                        if (c > n5) {
                            if (c >= charSequence.length()) {
                                break;
                            }
                            final int n10 = n6 + 1;
                            if (n10 >= length) {
                                break;
                            }
                            if (a[n10] == null) {
                                break;
                            }
                            b2 = auii.b();
                            n8 = c;
                            n9 = n3;
                        }
                    }
                    else {
                        b2 = o;
                        n8 = n5;
                        n9 = n3;
                        if (c < 0) {
                            final int n11 = ~c;
                            b2 = o;
                            n8 = n5;
                            if (n11 > (n9 = n3)) {
                                n9 = n11;
                                n8 = n5;
                                b2 = o;
                            }
                        }
                    }
                    auii.h(b);
                    ++n6;
                    o = b2;
                    n5 = n8;
                    n3 = n9;
                }
            }
            return c;
        }
        if (n5 <= n && (n5 != n || n7 == 0)) {
            return ~n3;
        }
        if (o != null) {
            auii.h(o);
        }
        return n5;
    }
}
