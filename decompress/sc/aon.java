import android.os.Bundle;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

// 
// Decompiled by Procyon v0.6.0
// 

class aon extends AccessibilityNodeProvider
{
    final aoq a;
    
    public aon(final aoq a) {
        this.a = a;
    }
    
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
        final aom a = this.a.a(n);
        if (a == null) {
            return null;
        }
        return a.a;
    }
    
    public final List findAccessibilityNodeInfosByText(final String s, final int n) {
        return null;
    }
    
    public final boolean performAction(final int n, final int n2, final Bundle bundle) {
        return this.a.c(n, n2, bundle);
    }
}
