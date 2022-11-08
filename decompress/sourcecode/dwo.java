import java.util.concurrent.RejectedExecutionException;
import java.util.ArrayDeque;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwo implements dvj
{
    public final Deque a;
    public long b;
    public int c;
    private final dvj d;
    private final aekc e;
    
    public dwo(final dvj d) {
        this.a = new ArrayDeque();
        this.c = 1;
        this.b = 0L;
        this.d = d;
        this.e = new aekc(this, 1);
    }
    
    public final void a(final Runnable runnable) {
        if (!this.a.isEmpty()) {
            synchronized (this.a) {
                this.a.remove(runnable);
            }
        }
    }
    
    public final void b() {
    }
    
    public final void c(final Runnable error) {
        if (error == null) {
            return;
        }
        final Deque a = this.a;
        monitorenter(a);
        try {
            final int c = this.c;
            if (c != 4) {
                if (c != 3) {
                    final long b = this.b;
                    boolean b2 = true;
                    final afub afub = new afub((Runnable)error, 1);
                    this.a.add(afub);
                    this.c = 2;
                    monitorexit(a);
                    try {
                        this.d.c((Runnable)this.e);
                        if (this.c != 2) {
                            return;
                        }
                        synchronized (this.a) {
                            if (this.b == b && this.c == 2) {
                                this.c = 3;
                            }
                            return;
                        }
                    }
                    catch (final Error error) {}
                    catch (final RuntimeException ex) {}
                    synchronized (this.a) {
                        final int c2 = this.c;
                        if ((c2 != 1 && c2 != 2) || !this.a.removeLastOccurrence(afub)) {
                            b2 = false;
                        }
                        if (error instanceof RejectedExecutionException && !b2) {
                            return;
                        }
                        throw error;
                    }
                }
            }
            this.a.add(error);
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final String toString() {
        final int identityHashCode = System.identityHashCode(this);
        final String value = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("SequentialLithoHandler@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
