import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afah implements Iterator
{
    public int a;
    final CharSequence b;
    final afar c;
    final boolean d;
    int e;
    int f;
    private Object g;
    
    protected afah(final afcb afcb, final CharSequence b) {
        this.a = 2;
        this.e = 0;
        this.c = (afar)afcb.c;
        this.d = afcb.a;
        this.f = afcb.b;
        this.b = b;
    }
    
    public abstract int a(final int p0);
    
    public abstract int b(final int p0);
    
    @Override
    public final boolean hasNext() {
        adme.T(this.a != 4);
        final int a = this.a;
        final int n = a - 1;
        Object string = null;
        if (a == 0) {
            throw null;
        }
        if (n != 0) {
            if (n != 2) {
                this.a = 4;
                int n2 = this.e;
                while (true) {
                    final int e = this.e;
                    if (e == -1) {
                        this.a = 3;
                        break;
                    }
                    int n3 = this.b(e);
                    int a2;
                    if (n3 == -1) {
                        n3 = this.b.length();
                        this.e = -1;
                        a2 = -1;
                    }
                    else {
                        a2 = this.a(n3);
                        this.e = a2;
                    }
                    int i = n2;
                    if (a2 == n2) {
                        if ((this.e = a2 + 1) <= this.b.length()) {
                            continue;
                        }
                        this.e = -1;
                    }
                    else {
                        int j;
                        while (i < (j = n3)) {
                            j = n3;
                            if (!this.c.b(this.b.charAt(i))) {
                                break;
                            }
                            ++i;
                        }
                        while (j > i) {
                            final afar c = this.c;
                            final CharSequence b = this.b;
                            final int n4 = j - 1;
                            if (!c.b(b.charAt(n4))) {
                                break;
                            }
                            j = n4;
                        }
                        if (!this.d || i != j) {
                            final int f = this.f;
                            int n5;
                            if (f == 1) {
                                int length = this.b.length();
                                this.e = -1;
                                while (true) {
                                    n5 = length;
                                    if (length <= i) {
                                        break;
                                    }
                                    final afar c2 = this.c;
                                    final CharSequence b2 = this.b;
                                    final int n6 = length - 1;
                                    n5 = length;
                                    if (!c2.b(b2.charAt(n6))) {
                                        break;
                                    }
                                    length = n6;
                                }
                            }
                            else {
                                this.f = f - 1;
                                n5 = j;
                            }
                            string = this.b.subSequence(i, n5).toString();
                            break;
                        }
                        n2 = this.e;
                    }
                }
                this.g = string;
                if (this.a != 3) {
                    this.a = 1;
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            this.a = 2;
            final Object g = this.g;
            this.g = null;
            return g;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
