import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public class hy
{
    static void kE(final Window$Callback window$Callback, final boolean b) {
        window$Callback.onPointerCaptureChanged(b);
    }
    
    public void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        ((nx)view.getLayoutParams()).lt();
        rect.set(0, 0, 0, 0);
    }
    
    public void c(final Canvas canvas, final RecyclerView recyclerView) {
    }
    
    public void d(final Canvas canvas, final RecyclerView recyclerView) {
    }
}
