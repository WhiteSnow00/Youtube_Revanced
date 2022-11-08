// 
// Decompiled by Procyon v0.6.0
// 

public final class atuu extends atpu implements Runnable, atqg
{
    private final atpu c;
    private final int d;
    private final Object e;
    private final aubp f;
    private volatile int runningWorkers;
    
    public atuu(final atpu c, int a) {
        this.c = c;
        this.d = a;
        a = atqe.a;
        this.f = new aubp((byte[])null, (byte[])null);
        this.e = new Object();
    }
    
    public final void d(final atli atli, final Runnable runnable) {
        atli.getClass();
        this.f.l(runnable);
        if (this.runningWorkers >= this.d) {
            return;
        }
        synchronized (this.e) {
            if (this.runningWorkers >= this.d) {
                return;
            }
            ++this.runningWorkers;
            monitorexit(this.e);
            this.c.d((atli)this, (Runnable)this);
        }
    }
    
    public final void run() {
    Label_0000:
        while (true) {
            int n = 0;
            do {
                final Runnable runnable = (Runnable)this.f.j();
                if (runnable != null) {
                    try {
                        runnable.run();
                    }
                    finally {
                        final Throwable t;
                        aume.k((atli)atlj.a, t);
                    }
                }
                else {
                    final Object e = this.e;
                    monitorenter(e);
                    try {
                        --this.runningWorkers;
                        if (this.f.i() == 0) {
                            monitorexit(e);
                            return;
                        }
                        ++this.runningWorkers;
                        monitorexit(e);
                        continue Label_0000;
                    }
                    finally {
                        monitorexit(e);
                        while (true) {}
                    }
                }
            } while (++n < 16);
            break;
        }
        this.c.e((atli)this);
        this.c.d((atli)this, (Runnable)this);
    }
}
