// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import java.lang.reflect.Method;

final class SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1 extends atni implements atma
{
    final /* synthetic */ SafeWindowLayoutComponentProvider this$0;
    
    public SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(final SafeWindowLayoutComponentProvider this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final Boolean invoke() {
        final Class access$getWindowExtensionsClass = SafeWindowLayoutComponentProvider.access$getWindowExtensionsClass(this.this$0);
        final boolean b = false;
        final Method method = access$getWindowExtensionsClass.getMethod("getWindowLayoutComponent", (Class[])new Class[0]);
        final Class access$getWindowLayoutComponentClass = SafeWindowLayoutComponentProvider.access$getWindowLayoutComponentClass(this.this$0);
        final SafeWindowLayoutComponentProvider this$0 = this.this$0;
        method.getClass();
        boolean b2 = b;
        if (SafeWindowLayoutComponentProvider.access$isPublic(this$0, method)) {
            b2 = b;
            if (SafeWindowLayoutComponentProvider.access$doesReturn(this.this$0, method, access$getWindowLayoutComponentClass)) {
                b2 = true;
            }
        }
        return b2;
    }
}
