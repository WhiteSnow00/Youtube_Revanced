import android.view.View$DragShadowBuilder;
import android.content.ClipData;
import android.content.ClipData$Item;
import android.view.View;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acgg implements View$OnLongClickListener
{
    public acgg() {
    }
    
    public final boolean onLongClick(final View view) {
        view.startDrag(new ClipData((CharSequence)"", new String[0], new ClipData$Item((CharSequence)"")), new View$DragShadowBuilder(view), (Object)view, 0);
        return true;
    }
}
