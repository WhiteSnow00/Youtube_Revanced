// 
// Decompiled by Procyon v0.6.0
// 

public final class dwj
{
    public final Object[] a;
    public short b;
    
    public dwj() {
        this.a = new Object[5];
        this.b = 0;
    }
    
    public dwj(final dwj dwj) {
        this.a = new Object[5];
        int i = 0;
        this.b = 0;
        while (i < 5) {
            this.a[i] = dwj.a[i];
            ++i;
        }
        this.b = dwj.b;
    }
    
    private static String g(final int n) {
        if (n == 0) {
            return "CONTENT";
        }
        if (n == 1) {
            return "BACKGROUND";
        }
        if (n == 2) {
            return "FOREGROUND";
        }
        if (n == 3) {
            return "HOST";
        }
        if (n != 4) {
            return null;
        }
        return "BORDER";
    }
    
    public final int a(final int n) {
        if (n >= 0 && n < this.b) {
            int i = 0;
            int n2 = 0;
            while (i <= n) {
                int n3 = i;
                if (this.a[n2] != null) {
                    n3 = i + 1;
                }
                ++n2;
                i = n3;
            }
            return n2 - 1;
        }
        final short b = this.b;
        final StringBuilder sb = new StringBuilder("index=");
        sb.append(n);
        sb.append(", size=");
        sb.append(b);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public final Object b(final int n) {
        return this.a[n];
    }
    
    public final Object c(final int n) {
        return this.b(this.a(n));
    }
    
    public final Object d() {
        final Object[] a = this.a;
        if (a[3] != null) {
            return this.b(3);
        }
        if (a[0] != null) {
            return this.b(0);
        }
        if (a[1] != null) {
            return this.b(1);
        }
        if (a[2] != null) {
            return this.b(2);
        }
        return this.b(4);
    }
    
    public final void e(final int n, final Object o) {
        if (o == null) {
            throw new IllegalArgumentException("value should not be null");
        }
        final Object[] a = this.a;
        if (a[n] == null) {
            if (a[3] == null) {
                int n2;
                if ((n2 = n) == 3) {
                    if (this.b > 0) {
                        throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
                    }
                    n2 = 3;
                }
                a[n2] = o;
                ++this.b;
                return;
            }
            throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
        }
        throw new RuntimeException("Already contains unit for type ".concat(String.valueOf(g(n))));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final dwj dwj = (dwj)o;
                if (this.b == dwj.b) {
                    for (int i = 0; i < 5; ++i) {
                        if (this.a[i] != dwj.a[i]) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void f(final int n, final Object o) {
        if (o != null) {
            final Object[] a = this.a;
            if (a[n] != null) {
                a[n] = o;
                return;
            }
        }
        if (o != null && this.a[n] == null) {
            this.e(n, o);
            return;
        }
        if (o == null) {
            final Object[] a2 = this.a;
            if (a2[n] != null) {
                a2[n] = null;
                --this.b;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        for (short n = 0; n < this.b; ++n) {
            final int a = this.a(n);
            final Object c = this.c(n);
            sb.append("\n\t");
            sb.append(g(a));
            sb.append(": ");
            sb.append(c.toString());
        }
        return sb.toString();
    }
}
