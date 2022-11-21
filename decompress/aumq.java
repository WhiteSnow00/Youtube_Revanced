// 
// Decompiled by Procyon v0.6.0
// 

final class aumq
{
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;
    
    public aumq(final char a, final int b, final int c, final int d, final boolean e, final int f) {
        if (a != 'u' && a != 'w' && a != 's') {
            final StringBuilder sb = new StringBuilder("Unknown mode: ");
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private final long d(final auih auih, long n) {
        final int c = this.c;
        if (c >= 0) {
            n = ((aujo)auih).k.h(n, c);
        }
        else {
            final aujo aujo = (aujo)auih;
            n = aujo.k.h(n, 1);
            n = aujo.m.e(n, 1);
            n = aujo.k.e(n, this.c);
        }
        return n;
    }
    
    public final long a(final auih auih, long n) {
        try {
            n = this.d(auih, n);
            return n;
        }
        catch (final IllegalArgumentException ex) {
            if (this.b == 2 && this.c == 29) {
                while (true) {
                    final aujo aujo = (aujo)auih;
                    if (aujo.n.t(n)) {
                        break;
                    }
                    n = aujo.n.e(n, 1);
                }
                n = this.d(auih, n);
                return n;
            }
            throw ex;
        }
    }
    
    public final long b(final auih auih, long n) {
        try {
            n = this.d(auih, n);
            return n;
        }
        catch (final IllegalArgumentException ex) {
            if (this.b == 2 && this.c == 29) {
                while (true) {
                    final aujo aujo = (aujo)auih;
                    if (aujo.n.t(n)) {
                        break;
                    }
                    n = aujo.n.e(n, -1);
                }
                n = this.d(auih, n);
                return n;
            }
            throw ex;
        }
    }
    
    public final long c(final auih auih, final long n) {
        final aujo aujo = (aujo)auih;
        final int n2 = this.d - aujo.j.a(n);
        long e = n;
        if (n2 != 0) {
            int n3;
            if (this.e) {
                if ((n3 = n2) < 0) {
                    n3 = n2 + 7;
                }
            }
            else if ((n3 = n2) > 0) {
                n3 = n2 - 7;
            }
            e = aujo.j.e(n, n3);
        }
        return e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof aumq) {
            final aumq aumq = (aumq)o;
            if (this.a == aumq.a && this.b == aumq.b && this.c == aumq.c && this.d == aumq.d && this.e == aumq.e && this.f == aumq.f) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final char a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final boolean e = this.e;
        final int f = this.f;
        final StringBuilder sb = new StringBuilder("[OfYear]\nMode: ");
        sb.append(a);
        sb.append("\nMonthOfYear: ");
        sb.append(b);
        sb.append("\nDayOfMonth: ");
        sb.append(c);
        sb.append("\nDayOfWeek: ");
        sb.append(d);
        sb.append("\nAdvanceDayOfWeek: ");
        sb.append(e);
        sb.append("\nMillisOfDay: ");
        sb.append(f);
        sb.append("\n");
        return sb.toString();
    }
}
