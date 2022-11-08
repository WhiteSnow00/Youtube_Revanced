import android.view.animation.Animation;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.os.Handler;
import android.widget.ViewSwitcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmv
{
    public final kms a;
    public final ViewSwitcher b;
    public final ViewSwitcher c;
    public final Handler d;
    public final Runnable e;
    public final int f;
    public final kmu g;
    public boolean h;
    public boolean i;
    private final aceo j;
    private final ImageView k;
    private final TextView l;
    private ajmt m;
    
    public kmv(final Context context, final aceo j, final ViewSwitcher b, final ViewSwitcher c, final ImageView k, final TextView l, final kmu g) {
        this.j = j;
        this.b = b;
        this.c = c;
        this.k = k;
        this.l = l;
        this.d = new Handler();
        this.a = new kms(context);
        this.g = g;
        this.e = (Runnable)new klc(this, 8);
        this.f = context.getResources().getInteger(2131492899);
    }
    
    public final void a() {
        this.d.removeCallbacks(this.e);
    }
    
    public final void b() {
        this.i = false;
        if (this.m != null) {
            this.h = false;
            this.d.removeCallbacks(this.e);
            if (this.b.getDisplayedChild() == 0) {
                this.d.post(this.e);
            }
        }
    }
    
    public final void c() {
        this.i = true;
        if (this.m != null && !this.h) {
            this.h = true;
            this.d.post(this.e);
        }
    }
    
    public final void d() {
        this.b.setDisplayedChild(1);
        this.c.setDisplayedChild(1);
    }
    
    public final void e(final ajmt m) {
        this.m = m;
        if (m != null) {
            final aceo j = this.j;
            final ImageView k = this.k;
            aorm aorm;
            if ((aorm = m.c) == null) {
                aorm = aorm.a;
            }
            j.j(k, aorm, this.j.b());
            final TextView l = this.l;
            ajsq ajsq;
            if ((ajsq = m.b) == null) {
                ajsq = ajsq.a;
            }
            l.setText((CharSequence)abyh.b(ajsq));
            this.b.setInAnimation((Animation)null);
            this.b.setOutAnimation((Animation)null);
            this.c.setInAnimation((Animation)null);
            this.c.setOutAnimation((Animation)null);
            this.b.setDisplayedChild(1);
            this.c.setDisplayedChild(1);
            this.h = false;
            return;
        }
        this.d();
    }
}
