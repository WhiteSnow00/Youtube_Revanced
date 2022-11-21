// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

public class ComponentActivity$4 implements aun
{
    final qu a;
    
    public ComponentActivity$4(final qu a) {
        this.a = a;
    }
    
    public final void a(final aup aup, final aui aui) {
        if (aui == aui.ON_DESTROY) {
            this.a.mContextAwareHelper.b = null;
            if (!this.a.isChangingConfigurations()) {
                this.a.getViewModelStore().c();
            }
        }
    }
}
