import android.os.Looper;
import java.util.concurrent.CancellationException;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsw extends atsx implements atrb
{
    private volatile atsw _immediate;
    private final Handler c;
    private final String d;
    private final boolean e;
    private final atsw f;
    
    public atsw(final Handler handler, final String s) {
        handler.getClass();
        this(handler, s, false);
    }
    
    private atsw(final Handler c, final String d, final boolean e) {
        this.c = c;
        this.d = d;
        this.e = e;
        atsw immediate;
        if (!e) {
            immediate = null;
        }
        else {
            immediate = this;
        }
        this._immediate = immediate;
        atsw immediate2;
        if ((immediate2 = this._immediate) == null) {
            immediate2 = new atsw(c, d, true);
            this._immediate = immediate2;
        }
        this.f = immediate2;
    }
    
    public final void d(final atmd atmd, final Runnable runnable) {
        atmd.getClass();
        if (!this.c.post(runnable)) {
            final StringBuilder sb = new StringBuilder("The task was rejected, the handler underlying the dispatcher '");
            sb.append(this);
            sb.append("' was closed");
            arbu.C(atmd, new CancellationException(sb.toString()));
            atrg.b.d(atmd, runnable);
        }
    }
    
    public final boolean e(final atmd atmd) {
        atmd.getClass();
        return !this.e || !atoc.c((Object)Looper.myLooper(), (Object)this.c.getLooper());
    }
    
    public final boolean equals(final Object o) {
        return o instanceof atsw && ((atsw)o).c == this.c;
    }
    
    public final atsh f() {
        return this.f;
    }
    
    public final int hashCode() {
        return System.identityHashCode(this.c);
    }
    
    public final String toString() {
        String s;
        if ((s = this.c()) == null) {
            String s2;
            if ((s2 = this.d) == null) {
                s2 = this.c.toString();
            }
            s = s2;
            if (this.e) {
                s = String.valueOf(s2).concat(".immediate");
            }
        }
        return s;
    }
}
