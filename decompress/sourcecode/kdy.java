import android.widget.ImageView;
import android.widget.TextView;
import com.google.protobuf.MessageLite;
import android.graphics.drawable.Drawable;
import java.util.Map;
import java.util.HashMap;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdy extends acja
{
    public final Context a;
    public final vax b;
    public final acng c;
    public final thh d;
    public aits e;
    public boolean f;
    public kdx g;
    public kdx h;
    kdx i;
    public final gbn j;
    public final hmb k;
    private final acio l;
    private final aceo m;
    private final FrameLayout n;
    private final acih o;
    private final uyf p;
    private final adcr q;
    
    public kdy(final Context a, final aceo m, final giz l, final vax b, final acng c, final hmb k, final uyf p14, final adcr q, final thh d, final gbn j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.l = (acio)l;
        this.b = b;
        this.c = c;
        this.m = m;
        this.k = k;
        this.p = p14;
        this.q = q;
        final acih acih = new acih(b, (acio)l);
        this.o = acih;
        final FrameLayout n = new FrameLayout(a);
        (this.n = n).setOnClickListener((View$OnClickListener)acih);
        ((acio)l).c((View)n);
        this.d = d;
        this.j = j;
    }
    
    public final View a() {
        return ((giz)this.l).a;
    }
    
    public final void c(final acir acir) {
        this.o.c();
    }
}
