import android.view.ViewParent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import android.window.OnBackInvokedCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fn
{
    static OnBackInvokedCallback a(final Object o, final fw fw) {
        fw.getClass();
        final pq pq = new pq(fw, 1);
        ((OnBackInvokedDispatcher)o).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)pq);
        return (OnBackInvokedCallback)pq;
    }
    
    static OnBackInvokedDispatcher b(final Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
    
    static void c(final Object o, final Object o2) {
        ((OnBackInvokedDispatcher)o).unregisterOnBackInvokedCallback((OnBackInvokedCallback)o2);
    }
    
    public static void d(final InputConnection inputConnection, final EditorInfo editorInfo, final View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                if (viewParent instanceof qc) {
                    editorInfo.hintText = ((qc)viewParent).a();
                    return;
                }
            }
        }
    }
}
