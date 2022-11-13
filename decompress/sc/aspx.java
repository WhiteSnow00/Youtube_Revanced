// 
// Decompiled by Procyon v0.6.0
// 

final class aspx extends aspy
{
    private static final long serialVersionUID = 2587302975077663557L;
    final aukf a;
    
    public aspx(final aukf a, final Object[] array) {
        super(array);
        this.a = a;
    }
    
    public final void d() {
        final Object[] b = this.b;
        final int length = b.length;
        final aukf a = this.a;
        for (int i = this.c; i != length; ++i) {
            if (this.d) {
                return;
            }
            final Object o = b[i];
            if (o == null) {
                final StringBuilder sb = new StringBuilder("The element at index ");
                sb.append(i);
                sb.append(" is null");
                a.b((Throwable)new NullPointerException(sb.toString()));
                return;
            }
            a.tu(o);
        }
        if (this.d) {
            return;
        }
        a.tx();
    }
    
    public final void f(long n) {
        final Object[] b = this.b;
        final int length = b.length;
        int c = this.c;
        final aukf a = this.a;
        while (true) {
            long n2 = 0L;
            while (true) {
                if (n2 != n && c != length) {
                    if (this.d) {
                        return;
                    }
                    final Object o = b[c];
                    if (o == null) {
                        final StringBuilder sb = new StringBuilder("The element at index ");
                        sb.append(c);
                        sb.append(" is null");
                        a.b((Throwable)new NullPointerException(sb.toString()));
                        return;
                    }
                    a.tu(o);
                    ++n2;
                    ++c;
                }
                else {
                    if (c == length) {
                        if (!this.d) {
                            a.tx();
                        }
                        return;
                    }
                    if (n2 != (n = this.get())) {
                        continue;
                    }
                    this.c = c;
                    n = this.addAndGet(-n2);
                    if (n != 0L) {
                        break;
                    }
                }
            }
        }
    }
}
