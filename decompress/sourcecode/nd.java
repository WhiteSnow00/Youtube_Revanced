import android.transition.Transition;
import android.widget.PopupWindow;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nd
{
    public static void a(final PopupWindow popupWindow, final Transition enterTransition) {
        popupWindow.setEnterTransition(enterTransition);
    }
    
    public static void b(final PopupWindow popupWindow, final Transition exitTransition) {
        popupWindow.setExitTransition(exitTransition);
    }
}
