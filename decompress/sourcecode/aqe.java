import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqe extends aop
{
    final /* synthetic */ aqf b;
    
    public aqe(final aqf b) {
        this.b = b;
    }
    
    @Override
    public final aol a(final int n) {
        return aol.c(AccessibilityNodeInfo.obtain(this.b.k(n).a));
    }
    
    @Override
    public final aol b(int n) {
        if (n == 2) {
            n = this.b.d;
        }
        else {
            n = this.b.e;
        }
        if (n == Integer.MIN_VALUE) {
            return null;
        }
        return this.a(n);
    }
    
    @Override
    public final boolean c(final int n, int n2, final Bundle bundle) {
        final aqf b = this.b;
        boolean b2;
        if (n != -1) {
            b2 = true;
            if (n2 != 1) {
                if (n2 == 2) {
                    b2 = b.r(n);
                    return b2;
                }
                if (n2 != 64) {
                    if (n2 != 128) {
                        b2 = b.t(n, n2);
                        return b2;
                    }
                    b2 = b.q(n);
                    return b2;
                }
                else if (b.a.isEnabled()) {
                    if (b.a.isTouchExplorationEnabled()) {
                        n2 = b.d;
                        if (n2 != n) {
                            if (n2 != Integer.MIN_VALUE) {
                                b.q(n2);
                            }
                            b.d = n;
                            b.b.invalidate();
                            b.v(n, 32768);
                            return b2;
                        }
                    }
                }
            }
            else if (b.b.isFocused() || b.b.requestFocus()) {
                n2 = b.e;
                if (n2 != n) {
                    if (n2 != Integer.MIN_VALUE) {
                        b.r(n2);
                    }
                    if (n != Integer.MIN_VALUE) {
                        b.v(b.e = n, 8);
                        return b2;
                    }
                }
            }
            b2 = false;
        }
        else {
            b2 = ana.as(b.b, n2, bundle);
        }
        return b2;
    }
}
