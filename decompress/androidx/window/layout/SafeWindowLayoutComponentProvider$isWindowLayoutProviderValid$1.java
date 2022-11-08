// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import java.lang.reflect.Method;

final class SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1 extends atni implements atma
{
    final /* synthetic */ SafeWindowLayoutComponentProvider this$0;
    
    public SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(final SafeWindowLayoutComponentProvider this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final Boolean invoke() {
        final Class access$getWindowExtensionsProviderClass = SafeWindowLayoutComponentProvider.access$getWindowExtensionsProviderClass(this.this$0);
        final boolean b = false;
        final Method declaredMethod = access$getWindowExtensionsProviderClass.getDeclaredMethod("getWindowExtensions", (Class[])new Class[0]);
        final Class access$getWindowExtensionsClass = SafeWindowLayoutComponentProvider.access$getWindowExtensionsClass(this.this$0);
        final SafeWindowLayoutComponentProvider this$0 = this.this$0;
        declaredMethod.getClass();
        boolean b2 = b;
        if (SafeWindowLayoutComponentProvider.access$doesReturn(this$0, declaredMethod, access$getWindowExtensionsClass)) {
            b2 = b;
            if (SafeWindowLayoutComponentProvider.access$isPublic(this.this$0, declaredMethod)) {
                b2 = true;
            }
        }
        return b2;
    }
}
