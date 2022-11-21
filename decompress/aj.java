import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aj
{
    final ak a;
    public aj b;
    public int c;
    int d;
    public int e;
    public ai f;
    final int g;
    public int h;
    public int i;
    
    public aj(final ak a, final int g) {
        this.c = 0;
        this.d = -1;
        this.h = 1;
        this.i = 1;
        this.e = 0;
        this.a = a;
        this.g = g;
    }
    
    private final String f(final HashSet set) {
        if (set.add(this)) {
            final StringBuilder sb = new StringBuilder("null:");
            sb.append(c.g(this.g));
            final aj b = this.b;
            String concat;
            if (b != null) {
                concat = " connected to ".concat(b.f(set));
            }
            else {
                concat = "";
            }
            sb.append(concat);
            return sb.toString();
        }
        return "<-";
    }
    
    public final int a() {
        if (this.a.K == 8) {
            return 0;
        }
        final int d = this.d;
        if (d >= 0) {
            final aj b = this.b;
            if (b != null && b.a.K == 8) {
                return d;
            }
        }
        return this.c;
    }
    
    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }
    
    public final boolean c() {
        return this.b != null;
    }
    
    public final void d(final aj b, final int c, final int d, final int h, final int e, final boolean b2) {
        final boolean b3 = true;
        if (b == null) {
            this.b = null;
            this.c = 0;
            this.d = -1;
            this.h = 1;
            this.e = 2;
            return;
        }
        Label_0333: {
            if (!b2) {
                final int g = b.g;
                int g2 = this.g;
                if (g == g2) {
                    if (g2 != 7) {
                        if (g2 != 6) {
                            break Label_0333;
                        }
                        if (b.a.r() && this.a.r()) {
                            break Label_0333;
                        }
                    }
                }
                else {
                    int n5 = 0;
                    Label_0327: {
                        Label_0317: {
                            Label_0241: {
                                if (--g2 != 1) {
                                    if (g2 != 2) {
                                        if (g2 == 3) {
                                            break Label_0241;
                                        }
                                        if (g2 != 4) {
                                            if (g2 != 6) {
                                                return;
                                            }
                                            if (g != 6 && g != 8 && g != 9) {
                                                break Label_0333;
                                            }
                                            return;
                                        }
                                    }
                                    int n2 = 0;
                                    int n3 = 0;
                                    Label_0201: {
                                        int n;
                                        if ((n = g) != 3) {
                                            if (g != 5) {
                                                n2 = 0;
                                                n3 = g;
                                                break Label_0201;
                                            }
                                            n = 5;
                                        }
                                        final int n4 = 1;
                                        n3 = n;
                                        n2 = n4;
                                    }
                                    if (!(b.a instanceof am)) {
                                        n5 = n2;
                                        break Label_0327;
                                    }
                                    n5 = (b3 ? 1 : 0);
                                    if (n2 != 0) {
                                        break Label_0327;
                                    }
                                    if (n3 == 9) {
                                        n5 = (b3 ? 1 : 0);
                                        break Label_0327;
                                    }
                                    break Label_0317;
                                }
                            }
                            int n7 = 0;
                            int n8 = 0;
                            Label_0284: {
                                int n6;
                                if ((n6 = g) != 2) {
                                    if (g != 4) {
                                        n7 = 0;
                                        n8 = g;
                                        break Label_0284;
                                    }
                                    n6 = 4;
                                }
                                final int n9 = 1;
                                n8 = n6;
                                n7 = n9;
                            }
                            if (!(b.a instanceof am)) {
                                n5 = n7;
                                break Label_0327;
                            }
                            n5 = (b3 ? 1 : 0);
                            if (n7 != 0) {
                                break Label_0327;
                            }
                            if (n8 == 8) {
                                n5 = (b3 ? 1 : 0);
                                break Label_0327;
                            }
                        }
                        n5 = 0;
                    }
                    if (n5 != 0) {
                        break Label_0333;
                    }
                }
                return;
            }
        }
        this.b = b;
        if (c > 0) {
            this.c = c;
        }
        else {
            this.c = 0;
        }
        this.d = d;
        this.h = h;
        this.e = e;
    }
    
    public final void e() {
        final ai f = this.f;
        if (f == null) {
            this.f = new ai(1);
            return;
        }
        f.b();
    }
    
    @Override
    public final String toString() {
        final HashSet set = new HashSet();
        final StringBuilder sb = new StringBuilder("null:");
        sb.append(c.g(this.g));
        final aj b = this.b;
        String concat;
        if (b != null) {
            concat = " connected to ".concat(b.f(set));
        }
        else {
            concat = "";
        }
        sb.append(concat);
        return sb.toString();
    }
}
