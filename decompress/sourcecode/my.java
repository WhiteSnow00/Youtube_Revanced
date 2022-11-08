import android.view.View;
import android.widget.PopupWindow;

// 
// Decompiled by Procyon v0.6.0
// 

public final class my
{
    static int a(final PopupWindow popupWindow, final View view, final int n, final boolean b) {
        return popupWindow.getMaxAvailableHeight(view, n, b);
    }
}
