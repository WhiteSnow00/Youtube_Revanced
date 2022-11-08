import android.view.View$MeasureSpec;
import android.view.View;
import android.support.v7.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class kfc extends LinearLayoutManager
{
    public kfc() {
        this.ac(0);
    }
    
    public final void bt(final View view) {
        view.measure(View$MeasureSpec.makeMeasureSpec(((nw)this).E, 0), View$MeasureSpec.makeMeasureSpec(((nw)this).F, 1073741824));
    }
}
