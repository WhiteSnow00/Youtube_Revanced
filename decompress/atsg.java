import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsg implements Iterator, atri
{
    final atsh a;
    private int b;
    private int c;
    private int d;
    private atrq e;
    
    public atsg(final atsh a) {
        this.a = a;
        this.b = -1;
        final int length = ((CharSequence)a.a).length();
        if (length >= 0) {
            this.c = 0;
            this.d = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(length);
        sb.append(" is less than minimum 0.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private final void a() {
        final int d = this.d;
        int n = 0;
        if (d < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        if (d > ((CharSequence)this.a.a).length()) {
            this.e = new atrq(this.c, auop.n((CharSequence)this.a.a));
            this.d = -1;
        }
        else {
            final atsh a = this.a;
            final Object invoke = ((atqh)a.b).invoke(a.a, this.d);
            if (invoke == null) {
                this.e = new atrq(this.c, auop.n((CharSequence)this.a.a));
                this.d = -1;
            }
            else {
                final atnh atnh = (atnh)invoke;
                final int intValue = ((Number)atnh.a).intValue();
                final int intValue2 = ((Number)atnh.b).intValue();
                final int c = this.c;
                atrq d2;
                if (intValue <= Integer.MIN_VALUE) {
                    d2 = atrq.d;
                }
                else {
                    d2 = new atrq(c, intValue - 1);
                }
                this.e = d2;
                final int c2 = intValue + intValue2;
                this.c = c2;
                if (intValue2 == 0) {
                    n = 1;
                }
                this.d = c2 + n;
            }
        }
        this.b = 1;
    }
    
    @Override
    public final boolean hasNext() {
        if (this.b == -1) {
            this.a();
        }
        return this.b == 1;
    }
    
    @Override
    public final /* bridge */ Object next() {
        if (this.b == -1) {
            this.a();
        }
        if (this.b != 0) {
            final atrq e = this.e;
            e.getClass();
            this.e = null;
            this.b = -1;
            return e;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
