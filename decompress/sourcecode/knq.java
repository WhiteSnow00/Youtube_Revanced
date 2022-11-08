import android.view.ViewStub;
import android.text.Spanned;
import android.view.ViewGroup$LayoutParams;
import com.google.protobuf.MessageLite;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.List;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knq extends jes
{
    private final acio p;
    private final acih q;
    private ins r;
    private final kzl s;
    
    public knq(final Context context, final aceo aceo, final giz p12, final vax vax, final acnj acnj, final acng acng, final kzl s, final qbo qbo, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context, aceo, acnj, 2131624247, acng, (ViewGroup)null, qbo, (cxz)null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.p = (acio)p12;
        this.s = s;
        p12.c(super.c);
        this.q = new acih(vax, (acio)p12);
    }
    
    public final View a() {
        return ((giz)this.p).a;
    }
    
    public final void c(final acir acir) {
        super.c(acir);
        this.q.c();
        final ins r = this.r;
        if (r != null) {
            r.o.cancel(false);
            r.c.m((Object)r);
            final fmc i = r.i;
            if (i != null) {
                r.e.b(i);
            }
            tmy.v((View)r.g, true);
            final TypedValue typedValue = new TypedValue();
            int color;
            if (r.a.getTheme().resolveAttribute(16842808, typedValue, true)) {
                color = r.a.getResources().getColor(typedValue.resourceId);
            }
            else {
                color = -1;
            }
            r.h.setTextColor(color);
            final TextView h = r.h;
            h.setTypeface(h.getTypeface(), 0);
            tmy.v((View)r.h, false);
            final acio k = r.k;
            if (k != null) {
                k.d((View$OnClickListener)r.d);
            }
            r.j = null;
            r.k = null;
            r.l = null;
            r.m = null;
            r.n = null;
            this.r = null;
        }
    }
}
