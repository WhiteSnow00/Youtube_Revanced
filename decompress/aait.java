import android.database.sqlite.SQLiteException;
import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aait implements aahl
{
    private final aage a;
    private final aahk b;
    private final aadf c;
    private final Object d;
    private boolean e;
    
    public aait(final aage a, final aadf c, final aahk b) {
        this.d = new Object();
        this.e = false;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final int n) {
        synchronized (this.d) {
            this.e = true;
        }
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(10);
        synchronized (this.d) {
            if (!this.e) {
                final zxm b = this.a.B();
                final aabr f = this.a.f();
                if (b != null && f != null) {
                    try {
                        this.b.b(this.c.a, 0L, 0.0, false);
                        aajb.f(b, (aabs)f, this.c);
                        this.b.a(this.c.a, (aach)new aade());
                    }
                    catch (final Exception ex) {
                        znh.c(zng.b, znf.B, "Thumbnail save exception: ".concat(String.valueOf(ex.getMessage())), (Throwable)ex);
                        this.b.d(this.c.a, aahm.a("Unknown error encountered while saving the thumbnail.", ex, aacn.d, amxs.a), (aach)new aade());
                    }
                    catch (final SQLiteException ex2) {
                        this.b.d(this.c.a, aahm.a("SQL error encountered while saving the thumbnail.", (Exception)ex2, aacn.d, amxs.a), (aach)new aade());
                    }
                    catch (final aahm aahm) {
                        this.b.d(this.c.a, aahm, (aach)new aade());
                    }
                }
            }
        }
    }
}
