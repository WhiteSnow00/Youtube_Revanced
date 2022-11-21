// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import android.view.View;
import android.view.Window;

public class ComponentActivity$3 implements aun
{
    final qu a;
    
    public ComponentActivity$3(final qu a) {
        this.a = a;
    }
    
    public final void a(final aup aup, final aui aui) {
        if (aui == aui.ON_STOP) {
            final Window window = this.a.getWindow();
            View peekDecorView;
            if (window != null) {
                peekDecorView = window.peekDecorView();
            }
            else {
                peekDecorView = null;
            }
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
