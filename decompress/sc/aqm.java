import android.view.ViewGroup;
import android.view.Gravity;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqm extends akw
{
    final aqr a;
    
    public aqm(final aqr a) {
        this.a = a;
        new Rect();
    }
    
    public final void b(final View view, final AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.drawerlayout.widget.DrawerLayout");
    }
    
    public final void c(final View view, final aom aom) {
        final int h = aqr.h;
        super.c(view, aom);
        aom.q("androidx.drawerlayout.widget.DrawerLayout");
        aom.x(false);
        aom.y(false);
        aom.M(aol.a);
        aom.M(aol.b);
    }
    
    public final boolean g(View e, final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText();
            e = this.a.e();
            if (e != null) {
                Gravity.getAbsoluteGravity(this.a.b(e), anb.f((View)this.a));
            }
            return true;
        }
        return super.g(e, accessibilityEvent);
    }
    
    public final boolean h(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        final int h = aqr.h;
        return super.h(viewGroup, view, accessibilityEvent);
    }
}
