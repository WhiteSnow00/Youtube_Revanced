import android.widget.PopupWindow;

// 
// Decompiled by Procyon v0.6.0
// 

public class aps
{
    static int a(final PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }
    
    public static void b(final PopupWindow popupWindow, final boolean overlapAnchor) {
        popupWindow.setOverlapAnchor(overlapAnchor);
    }
    
    public static void c(final PopupWindow popupWindow, final int windowLayoutType) {
        popupWindow.setWindowLayoutType(windowLayoutType);
    }
    
    static boolean d(final PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }
}
