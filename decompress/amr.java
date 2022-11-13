import android.content.ClipData;
import android.view.View$DragShadowBuilder;
import android.view.PointerIcon;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amr
{
    static void a(final View view) {
        view.cancelDragAndDrop();
    }
    
    static void b(final View view) {
        view.dispatchFinishTemporaryDetach();
    }
    
    static void c(final View view) {
        view.dispatchStartTemporaryDetach();
    }
    
    static void d(final View view, final PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }
    
    static void e(final View view, final View$DragShadowBuilder view$DragShadowBuilder) {
        view.updateDragShadow(view$DragShadowBuilder);
    }
    
    static boolean f(final View view, final ClipData clipData, final View$DragShadowBuilder view$DragShadowBuilder, final Object o, final int n) {
        return view.startDragAndDrop(clipData, view$DragShadowBuilder, o, n);
    }
}
