import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atoo implements Iterator, atnq
{
    final /* synthetic */ atop a;
    private int b;
    private int c;
    private int d;
    private atny e;
    
    public atoo(final atop a) {
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
            this.e = new atny(this.c, aubt.f((CharSequence)this.a.a));
            this.d = -1;
        }
        else {
            final atop a = this.a;
            final Object invoke = ((atmp)a.b).invoke(a.a, this.d);
            if (invoke == null) {
                this.e = new atny(this.c, aubt.f((CharSequence)this.a.a));
                this.d = -1;
            }
            else {
                final atjp atjp = (atjp)invoke;
                final int intValue = ((Number)atjp.a).intValue();
                final int intValue2 = ((Number)atjp.b).intValue();
                final int c = this.c;
                atny d2;
                if (intValue <= Integer.MIN_VALUE) {
                    d2 = atny.d;
                }
                else {
                    d2 = new atny(c, intValue - 1);
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
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
