import android.view.ViewConfiguration;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.litho.ComponentHost;
import android.graphics.Rect;
import android.view.TouchDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwy extends TouchDelegate
{
    private static final Rect c;
    public final abp a;
    public abp b;
    
    static {
        c = new Rect();
    }
    
    public dwy(final ComponentHost componentHost) {
        super(dwy.c, (View)componentHost);
        this.a = new abp();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        int c = this.a.c();
        while (true) {
            final int n = c - 1;
            boolean a = false;
            if (n < 0) {
                return false;
            }
            final cgj cgj = (cgj)this.a.e(n);
            c = n;
            if (cgj == null) {
                continue;
            }
            final int n2 = (int)motionEvent.getX();
            final int n3 = (int)motionEvent.getY();
            final Rect e = cgj.e();
            if (e == null) {
                c = n;
            }
            else {
                final int scaledTouchSlop = ViewConfiguration.get(((View)cgj.c).getContext()).getScaledTouchSlop();
                final Rect rect = new Rect();
                rect.set(e);
                final int n4 = -scaledTouchSlop;
                rect.inset(n4, n4);
                final int action = motionEvent.getAction();
                boolean b2 = false;
                Label_0241: {
                    if (action != 0) {
                        if (action == 1 || action == 2) {
                            a = cgj.a;
                            final boolean b = !a || rect.contains(n2, n3);
                            if (motionEvent.getAction() == 1) {
                                cgj.a = false;
                            }
                            b2 = b;
                            break Label_0241;
                        }
                        if (action == 3) {
                            a = cgj.a;
                            cgj.a = false;
                        }
                    }
                    else {
                        a = e.contains(n2, n3);
                        cgj.a = a;
                    }
                    b2 = true;
                }
                c = n;
                if (!a) {
                    continue;
                }
                if (b2) {
                    motionEvent.setLocation((float)(((View)cgj.c).getWidth() / 2), (float)(((View)cgj.c).getHeight() / 2));
                }
                else {
                    final float n5 = (float)(-(scaledTouchSlop + scaledTouchSlop));
                    motionEvent.setLocation(n5, n5);
                }
                c = n;
                if (((View)cgj.c).dispatchTouchEvent(motionEvent)) {
                    return true;
                }
                continue;
            }
        }
    }
}
