import android.database.sqlite.SQLiteException;
import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafa implements aads
{
    private final aack a;
    private final aadr b;
    private final zzo c;
    private final Object d;
    private boolean e;
    
    public aafa(final aack a, final zzo c, final aadr b) {
        this.d = new Object();
        this.e = false;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final int n) {
        synchronized (this.d) {
            this.e = true;
        }
    }
    
    public final void run() {
        Process.setThreadPriority(10);
        synchronized (this.d) {
            if (!this.e) {
                final ztu b = this.a.B();
                final zxz f = this.a.f();
                if (b != null && f != null) {
                    try {
                        this.b.b(this.c.a, 0L, 0.0, false);
                        aafi.f(b, (zya)f, this.c);
                        this.b.a(this.c.a, (zyq)new zzn());
                    }
                    catch (final Exception ex) {
                        zjp.c(zjo.b, zjn.B, "Thumbnail save exception: ".concat(String.valueOf(ex.getMessage())), (Throwable)ex);
                        this.b.d(this.c.a, aadt.a("Unknown error encountered while saving the thumbnail.", ex, zyw.d, amtj.a), (zyq)new zzn());
                    }
                    catch (final SQLiteException ex2) {
                        this.b.d(this.c.a, aadt.a("SQL error encountered while saving the thumbnail.", (Exception)ex2, zyw.d, amtj.a), (zyq)new zzn());
                    }
                    catch (final aadt aadt) {
                        this.b.d(this.c.a, aadt, (zyq)new zzn());
                    }
                }
            }
        }
    }
}
