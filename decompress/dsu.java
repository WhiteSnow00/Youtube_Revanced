import android.os.Bundle;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class dsu extends akw
{
    final dsv a;
    
    public dsu(final dsv a) {
        this.a = a;
    }
    
    public final void b(final View view, final AccessibilityEvent accessibilityEvent) {
        dsv.w(this.a, view, accessibilityEvent);
    }
    
    public final void c(final View view, final aom aom) {
        dsv.x(this.a, view, aom);
    }
    
    public final void d(final View view, final AccessibilityEvent accessibilityEvent) {
        dsv.y(this.a, view, accessibilityEvent);
    }
    
    public final void e(final View view, final int n) {
        dsv.z(this.a, view, n);
    }
    
    public final void f(final View view, final AccessibilityEvent accessibilityEvent) {
        dsv.A(this.a, view, accessibilityEvent);
    }
    
    public final boolean g(final View view, final AccessibilityEvent accessibilityEvent) {
        return dsv.B(this.a, view, accessibilityEvent);
    }
    
    public final boolean h(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return dsv.C(this.a, viewGroup, view, accessibilityEvent);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        return dsv.D(this.a, view, n, bundle);
    }
}
