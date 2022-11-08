import android.util.Log;
import android.os.SystemClock;
import java.io.IOException;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvu extends Handler implements Runnable
{
    public volatile Thread a;
    public final lsm b;
    final /* synthetic */ abbu c;
    private final lvt d;
    
    public lvu(final abbu c, final Looper looper, final lsm b, final lvt d, final byte[] array) {
        this.c = c;
        super(looper);
        this.b = b;
        this.d = d;
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 2) {
            throw (Error)message.obj;
        }
        final abbu c = this.c;
        c.a = false;
        c.c = null;
        if (this.b.d) {
            final lsp lsp = (lsp)this.d;
            if (lsp.c > 0) {
                lsp.r(lsp.d);
                return;
            }
            lsp.p();
            lsp.k.B();
        }
        else {
            final int what = message.what;
            int f = 1;
            if (what == 0) {
                ((lsp)this.d).h = true;
                return;
            }
            if (what != 1) {
                return;
            }
            final lvt d = this.d;
            final IOException e = (IOException)message.obj;
            final lsp lsp2 = (lsp)d;
            lsp2.e = e;
            if (lsp2.i <= lsp2.j) {
                f = 1 + lsp2.f;
            }
            lsp2.f = f;
            lsp2.g = SystemClock.elapsedRealtime();
            lsp2.q();
        }
    }
    
    public final void run() {
        try {
            this.a = Thread.currentThread();
            if (!this.b.d) {
                this.b.getClass().getSimpleName();
                int n = lwj.a;
                final lsm b = this.b;
                while (!b.d) {
                    lsh lsh2 = null;
                    Label_0268: {
                        try {
                            final long a = b.g.a;
                            long b2;
                            final long n2 = b2 = b.b.b(new lvm(b.a, a, a));
                            if (n2 != -1L) {
                                b2 = n2 + a;
                            }
                            final lsh lsh = new lsh(b.b, a, b2);
                            try {
                                final lsk g = b.h.g(lsh);
                                if (b.e) {
                                    g.d();
                                    b.e = false;
                                }
                                n = 0;
                                int n3;
                                while (true) {
                                    n3 = n;
                                    if (n == 0) {
                                        try {
                                            if (!b.d) {
                                                b.f.A(b.c);
                                                n3 = (n = g.f(lsh, b.g));
                                                continue;
                                            }
                                            n3 = 0;
                                        }
                                        finally {
                                            break Label_0268;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                if (n3 == 1) {
                                    n3 = 0;
                                }
                                else {
                                    b.g.a = lsh.c;
                                }
                                lwj.j(b.b);
                                if (n3 != 0) {
                                    break;
                                }
                                continue;
                            }
                            finally {}
                        }
                        finally {
                            lsh2 = null;
                        }
                        n = 0;
                    }
                    if (n != 1 && lsh2 != null) {
                        b.g.a = lsh2.c;
                    }
                    lwj.j(b.b);
                }
            }
            this.sendEmptyMessage(0);
        }
        catch (final Error error) {
            Log.e("LoadTask", "Unexpected error loading stream", (Throwable)error);
            this.obtainMessage(2, (Object)error).sendToTarget();
            throw error;
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            Log.e("LoadTask", "OutOfMemory error loading stream", (Throwable)outOfMemoryError);
            this.obtainMessage(1, (Object)new lvv(outOfMemoryError)).sendToTarget();
        }
        catch (final Exception ex) {
            Log.e("LoadTask", "Unexpected exception loading stream", (Throwable)ex);
            this.obtainMessage(1, (Object)new lvv(ex)).sendToTarget();
        }
        catch (final InterruptedException ex2) {
            jfi.U(this.b.d);
            this.sendEmptyMessage(0);
        }
        catch (final IOException ex3) {
            this.obtainMessage(1, (Object)ex3).sendToTarget();
        }
    }
}
