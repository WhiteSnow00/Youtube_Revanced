import android.text.TextUtils;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaet implements afwr
{
    final afbk a;
    final aacd b;
    final String c;
    final ListenableFuture d;
    final Executor e;
    final int f;
    
    public aaet(final afbk a, final aacd b, final String c, final int f, final ListenableFuture d, final Executor e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final /* bridge */ void b(final Object o) {
        final arjd arjd = (arjd)o;
        if (this.a.a(arjd.b)) {
            final int a = arjd.a;
            int n;
            if (a != 1) {
                if (a != 2) {
                    n = 1;
                }
                else {
                    n = 4;
                }
            }
            else {
                n = 3;
            }
            if (n == 1) {
                tut.b("[Offline] Encountered unknown fallback reason. Likely bug in fallback strategy.");
            }
            final aacd b = this.b;
            afbh afbh;
            if (TextUtils.isEmpty((CharSequence)this.c)) {
                afbh = afag.a;
            }
            else {
                afbh = afbh.k(this.c);
            }
            b.e(afbh, this.f, n);
            return;
        }
        afxr.v(this.d, new aaeu(this.b, this.c, this.f), this.e);
    }
    
    @Override
    public final void rF(final Throwable t) {
    }
}
