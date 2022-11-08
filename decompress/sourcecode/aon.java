import android.view.accessibility.AccessibilityNodeInfo;

// 
// Decompiled by Procyon v0.6.0
// 

class aon extends aom
{
    public aon(final aop aop) {
        super(aop);
    }
    
    public final AccessibilityNodeInfo findFocus(final int n) {
        final aol b = this.a.b(n);
        if (b == null) {
            return null;
        }
        return b.a;
    }
}
