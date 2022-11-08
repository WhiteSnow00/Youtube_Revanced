import java.util.List;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knw extends acja
{
    private final Context a;
    private final int b;
    private final View c;
    private final TextView d;
    private final gkv e;
    
    public knw(final Context a, final hmb hmb, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        final View inflate = View.inflate(a, 2131625047, (ViewGroup)null);
        this.c = inflate;
        this.d = (TextView)inflate.findViewById(2131430096);
        this.e = hmb.b((TextView)inflate.findViewById(2131427452));
        this.b = tmy.aZ(a.getResources().getDisplayMetrics(), 15);
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
    }
}
