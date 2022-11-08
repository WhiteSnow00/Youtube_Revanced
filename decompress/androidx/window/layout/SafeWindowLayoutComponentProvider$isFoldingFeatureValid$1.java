// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import java.lang.reflect.Method;
import android.graphics.Rect;

final class SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1 extends atni implements atma
{
    final /* synthetic */ SafeWindowLayoutComponentProvider this$0;
    
    public SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(final SafeWindowLayoutComponentProvider this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final Boolean invoke() {
        final Class access$getFoldingFeatureClass = SafeWindowLayoutComponentProvider.access$getFoldingFeatureClass(this.this$0);
        final boolean b = false;
        final Method method = access$getFoldingFeatureClass.getMethod("getBounds", (Class[])new Class[0]);
        final Method method2 = access$getFoldingFeatureClass.getMethod("getType", (Class[])new Class[0]);
        final Method method3 = access$getFoldingFeatureClass.getMethod("getState", (Class[])new Class[0]);
        final SafeWindowLayoutComponentProvider this$0 = this.this$0;
        method.getClass();
        boolean b2 = b;
        if (SafeWindowLayoutComponentProvider.access$doesReturn(this$0, method, atno.b(Rect.class))) {
            b2 = b;
            if (SafeWindowLayoutComponentProvider.access$isPublic(this.this$0, method)) {
                final SafeWindowLayoutComponentProvider this$2 = this.this$0;
                method2.getClass();
                b2 = b;
                if (SafeWindowLayoutComponentProvider.access$doesReturn(this$2, method2, atno.b(Integer.TYPE))) {
                    b2 = b;
                    if (SafeWindowLayoutComponentProvider.access$isPublic(this.this$0, method2)) {
                        final SafeWindowLayoutComponentProvider this$3 = this.this$0;
                        method3.getClass();
                        b2 = b;
                        if (SafeWindowLayoutComponentProvider.access$doesReturn(this$3, method3, atno.b(Integer.TYPE))) {
                            b2 = b;
                            if (SafeWindowLayoutComponentProvider.access$isPublic(this.this$0, method3)) {
                                b2 = true;
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
}
