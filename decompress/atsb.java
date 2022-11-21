import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class atsb extends atsc implements Iterator, atov, atri
{
    public atov a;
    private int b;
    private Object c;
    private Iterator d;
    
    public atsb() {
    }
    
    private final Throwable d() {
        final int b = this.b;
        RuntimeException ex;
        if (b != 4) {
            if (b != 5) {
                final StringBuilder sb = new StringBuilder("Unexpected state of the iterator: ");
                sb.append(this.b);
                ex = new IllegalStateException(sb.toString());
            }
            else {
                ex = new IllegalStateException("Iterator has failed.");
            }
        }
        else {
            ex = new NoSuchElementException();
        }
        return ex;
    }
    
    @Override
    public final Object a(final Object c, final atov a) {
        this.c = c;
        this.b = 3;
        this.a = a;
        return atpc.a;
    }
    
    @Override
    public final Object b(final Iterator d, final atov a) {
        if (!d.hasNext()) {
            return atnn.a;
        }
        this.d = d;
        this.b = 2;
        this.a = a;
        return atpc.a;
    }
    
    @Override
    public final atpa getContext() {
        return (atpa)atpb.a;
    }
    
    @Override
    public final boolean hasNext() {
        while (true) {
            final int b = this.b;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2 || b == 3) {
                        return true;
                    }
                    if (b == 4) {
                        return false;
                    }
                    throw this.d();
                }
                else {
                    final Iterator d = this.d;
                    d.getClass();
                    if (d.hasNext()) {
                        this.b = 2;
                        return true;
                    }
                    this.d = null;
                }
            }
            this.b = 5;
            final atov a = this.a;
            a.getClass();
            this.a = null;
            a.resumeWith(atnn.a);
        }
    }
    
    @Override
    public final Object next() {
        final int b = this.b;
        if (b != 0 && b != 1) {
            if (b == 2) {
                this.b = 1;
                final Iterator d = this.d;
                d.getClass();
                return d.next();
            }
            if (b == 3) {
                this.b = 0;
                final Object c = this.c;
                this.c = null;
                return c;
            }
            throw this.d();
        }
        else {
            if (this.hasNext()) {
                return this.next();
            }
            throw new NoSuchElementException();
        }
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void resumeWith(final Object o) {
        areq.I(o);
        this.b = 4;
    }
}
