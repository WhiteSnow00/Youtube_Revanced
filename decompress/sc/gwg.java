import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.LinkedList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwg
{
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public gwg(final Context f) {
        this.d = new Object();
        this.b = true;
        this.a = false;
        this.f = f;
        this.e = new eih(f);
        this.c = new LinkedList();
        new Thread((Runnable)new eif(this, (byte[])null)).start();
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        long n = eij.b(f) + 300000L - eij.a();
        final dmc dmc = new dmc(this, 13, (byte[])null);
        if (n <= 0L) {
            n = 0L;
        }
        scheduledThreadPoolExecutor.scheduleAtFixedRate((Runnable)dmc, n, 300000L, TimeUnit.MILLISECONDS);
    }
    
    public gwg(final Context context, final ukj c, final CreationButtonView d, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.d = d;
        this.e = fc.b(context, 2131231565);
        this.f = fc.b(context, 2131231563);
        d.setOnClickListener((View$OnClickListener)new gcd(this, aeea, 9, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        c.U(new pvh(this));
        this.a(c.e());
    }
    
    private final void c(final int visibility) {
        ((CreationButtonView)this.d).setVisibility(visibility);
    }
    
    public final void a(final int n) {
        boolean a = true;
        if (1 != n) {
            a = false;
        }
        this.a = a;
        if (n != 0) {
            this.b = false;
            ((ukj)this.c).O(false);
        }
        this.b();
    }
    
    public final void b() {
        if (this.a) {
            this.c(8);
            return;
        }
        Object e = this.e;
        if (e != null) {
            final Object f = this.f;
            if (f != null) {
                final Object d = this.d;
                if (!this.b) {
                    e = f;
                }
                ((CreationButtonView)d).d((Drawable)e);
                this.c(0);
                return;
            }
        }
        this.c(8);
    }
}
