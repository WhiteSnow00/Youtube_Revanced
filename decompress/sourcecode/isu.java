import android.view.MotionEvent;
import java.util.Iterator;
import android.view.View;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.view.ViewConfiguration;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isu extends tpt
{
    public final Set a;
    public boolean b;
    private final jdj c;
    private final int d;
    private boolean e;
    private boolean g;
    private float h;
    private float i;
    private final a j;
    
    public isu(final Context context, final jdj c, final abfv abfv, final a j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.g = true;
        this.c = c;
        this.j = j;
        abfv.a(new iuw(this, 1));
    }
    
    private final void e(final View view, final float n) {
        if (this.e) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((abfw)iterator.next()).i(n);
            }
        }
        this.f(view, false);
        this.g = true;
    }
    
    private final void f(final View view, final boolean e) {
        if (this.e == e) {
            return;
        }
        this.e = e;
        if (view != null) {
            if (view.getParent() != null) {
                view.getParent().requestDisallowInterceptTouchEvent(this.e);
            }
        }
    }
    
    public final void a(final boolean f) {
        if (!(super.f = f)) {
            this.c();
        }
    }
    
    public final void b(final abfw abfw) {
        this.a.add(abfw);
    }
    
    public final void c() {
        this.f(null, false);
        this.g = true;
    }
    
    public final boolean d(final View view, final MotionEvent motionEvent) {
        final float abs = Math.abs(motionEvent.getX() - this.h);
        final float n = motionEvent.getY() - this.i;
        final float abs2 = Math.abs(n);
        if (motionEvent.getPointerCount() <= 1 && !this.c.c()) {
            final int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return this.e;
                        }
                    }
                    else {
                        Label_0156: {
                            if (!this.e) {
                                final float n2 = (float)this.d;
                                if (abs <= n2) {
                                    if (abs2 >= n2) {
                                        if (this.j.n()) {
                                            if (this.b) {
                                                if (n <= 0.0f) {
                                                    break Label_0156;
                                                }
                                            }
                                            else if (n >= 0.0f) {
                                                break Label_0156;
                                            }
                                        }
                                        this.f(view, true);
                                    }
                                }
                            }
                        }
                        if (this.e) {
                            if (this.g) {
                                final Iterator iterator = this.a.iterator();
                                while (iterator.hasNext()) {
                                    ((abfw)iterator.next()).h(n);
                                }
                            }
                            else {
                                final Iterator iterator2 = this.a.iterator();
                                while (iterator2.hasNext()) {
                                    ((abfw)iterator2.next()).pg(n);
                                }
                            }
                            this.g = false;
                            return this.e;
                        }
                        return this.e;
                    }
                }
                this.e(view, n);
            }
            else {
                this.h = motionEvent.getX();
                this.i = motionEvent.getY();
            }
            return this.e;
        }
        this.e(view, n);
        return false;
    }
}
