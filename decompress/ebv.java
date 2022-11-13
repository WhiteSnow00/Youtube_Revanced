import android.view.MotionEvent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebv
{
    public eek a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    
    public final void a(final View view) {
        if (this.c && !this.d) {
            if (!this.e) {
                this.d = true;
                final eek a = this.a;
                if (a != null) {
                    a.a(view, 1);
                }
                this.c = false;
            }
            this.e = false;
        }
    }
    
    public final void b(final View view) {
        if (!this.b && !this.d) {
            this.b = true;
            final eek a = this.a;
            if (a != null) {
                a.a(view, 0);
            }
        }
        this.e = true;
    }
    
    public final void c(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
            if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !this.c && this.b && !this.d) {
                this.d = true;
                final eek a = this.a;
                if (a != null) {
                    a.a(view, 1);
                }
            }
            return;
        }
        if (this.d) {
            this.b = false;
            this.c = false;
            this.d = false;
            return;
        }
        this.c = false;
        this.e = true;
    }
    
    public final void d() {
        this.c = true;
    }
}
