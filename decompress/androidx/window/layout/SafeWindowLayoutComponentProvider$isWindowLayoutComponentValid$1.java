// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import java.lang.reflect.Method;
import android.app.Activity;

final class SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1 extends atni implements atma
{
    final /* synthetic */ SafeWindowLayoutComponentProvider this$0;
    
    public SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(final SafeWindowLayoutComponentProvider this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final Boolean invoke() {
        final Class consumerClassOrNull$window_release = SafeWindowLayoutComponentProvider.access$getConsumerAdapter$p(this.this$0).consumerClassOrNull$window_release();
        final boolean b = false;
        if (consumerClassOrNull$window_release == null) {
            return false;
        }
        final Class access$getWindowLayoutComponentClass = SafeWindowLayoutComponentProvider.access$getWindowLayoutComponentClass(this.this$0);
        final Method method = access$getWindowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, consumerClassOrNull$window_release);
        final Method method2 = access$getWindowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", consumerClassOrNull$window_release);
        final SafeWindowLayoutComponentProvider this$0 = this.this$0;
        method.getClass();
        boolean b2 = b;
        if (SafeWindowLayoutComponentProvider.access$isPublic(this$0, method)) {
            final SafeWindowLayoutComponentProvider this$2 = this.this$0;
            method2.getClass();
            b2 = b;
            if (SafeWindowLayoutComponentProvider.access$isPublic(this$2, method2)) {
                b2 = true;
            }
        }
        return b2;
    }
}
