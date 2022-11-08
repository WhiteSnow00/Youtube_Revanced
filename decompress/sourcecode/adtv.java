import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtv extends op
{
    final /* synthetic */ adtx d;
    
    public adtv(final adtx d, final RecyclerView recyclerView) {
        this.d = d;
        super(recyclerView);
    }
    
    public final void c(final View view, final aol aol) {
        super.c(view, aol);
        final adtq e = this.d.e;
        int n;
        if (e.g.b.getChildCount() == 0) {
            n = 0;
        }
        else {
            n = 1;
        }
        int i = 0;
        int n2 = n;
        while (i < e.g.e.a()) {
            final int d = e.g.e.d(i);
            int n3 = 0;
            Label_0088: {
                if (d != 0) {
                    n3 = n2;
                    if (d != 1) {
                        break Label_0088;
                    }
                }
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        aol.s((Object)new bx((Object)AccessibilityNodeInfo$CollectionInfo.obtain(n2, 1, false)));
    }
}
