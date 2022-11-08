import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import java.util.ArrayList;
import android.widget.LinearLayout;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezw extends acja
{
    private final Context a;
    private final acae b;
    private final atjj c;
    private final List d;
    private final LinearLayout e;
    private final fyx f;
    
    public ezw(final Context a, final acae b, final atjj c, final fyx f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        final LinearLayout e = new LinearLayout(a);
        (this.e = e).setOrientation(1);
        e.setImportantForAccessibility(1);
        this.d = new ArrayList();
    }
    
    private final View f(final acij acij, final ajkj ajkj) {
        final abzh d = this.b.d(ajkj);
        final abzk abzk = (abzk)this.c.a();
        this.d.add(abzk);
        abzk.b(acij, d);
        final View a = abzk.a();
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, -2);
        linearLayout$LayoutParams.gravity = 1;
        this.e.addView(a, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        return a;
    }
    
    public final View a() {
        return (View)this.e;
    }
    
    public final void c(final acir acir) {
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((abzk)iterator.next()).c(acir);
        }
    }
}
