import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwj extends AtomicReference implements Executor, Runnable
{
    afwk a;
    Executor b;
    Runnable c;
    Thread d;
    
    public afwj(final Executor b, final afwk a) {
        super(afwi.a);
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        if (this.get() == afwi.b) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            final afwk a = this.a;
            a.getClass();
            final asdz a2 = a.a;
            if (a2.a == this.d) {
                this.a = null;
                adme.T(a2.c == null);
                a2.c = runnable;
                final Executor b = this.b;
                b.getClass();
                a2.b = b;
                this.b = null;
            }
            else {
                final Executor b2 = this.b;
                b2.getClass();
                this.b = null;
                this.c = runnable;
                b2.execute(this);
            }
        }
        finally {
            this.d = null;
        }
    }
    
    @Override
    public final void run() {
        final Thread currentThread = Thread.currentThread();
        if (currentThread != this.d) {
            final Runnable c = this.c;
            c.getClass();
            this.c = null;
            c.run();
            return;
        }
        final asdz a = new asdz((byte[])null, (byte[])null);
        a.a = currentThread;
        final afwk a2 = this.a;
        a2.getClass();
        a2.a = a;
        this.a = null;
        try {
            final Runnable c2 = this.c;
            c2.getClass();
            this.c = null;
            c2.run();
            while (true) {
                final Object c3 = a.c;
                if (c3 == null) {
                    break;
                }
                final Object b = a.b;
                if (b == null) {
                    break;
                }
                a.c = null;
                a.b = null;
                ((Executor)b).execute((Runnable)c3);
            }
            a.a = null;
        }
        finally {
            a.a = null;
            while (true) {}
        }
    }
}
