import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class kni implements acil
{
    public final View a;
    private final TextView b;
    private final TextView c;
    private final LinearLayout d;
    private Map e;
    private final alm f;
    
    public kni(final View a, final alm f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.f = f;
        this.e = new HashMap();
        this.b = (TextView)a.findViewById(2131431177);
        this.c = (TextView)a.findViewById(2131431818);
        this.d = (LinearLayout)a.findViewById(2131427938);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void b(final acij acij, final amps amps) {
        (this.e = new HashMap()).put("com.google.android.libraries.youtube.innertube.endpoint.tag", amps);
        final TextView b = this.b;
        ajsq ajsq;
        if ((amps.b & 0x1) != 0x0) {
            if ((ajsq = amps.c) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        tmy.t(b, (CharSequence)abyh.b(ajsq));
        final TextView b2 = this.b;
        ajsq ajsq2;
        if ((amps.b & 0x1) != 0x0) {
            if ((ajsq2 = amps.c) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        b2.setContentDescription(abyh.i(ajsq2));
        final TextView c = this.c;
        ajsq ajsq3;
        if ((amps.b & 0x2) != 0x0) {
            if ((ajsq3 = amps.d) == null) {
                ajsq3 = ajsq.a;
            }
        }
        else {
            ajsq3 = null;
        }
        tmy.t(c, (CharSequence)abyh.b(ajsq3));
        final TextView c2 = this.c;
        ajsq ajsq4;
        if ((amps.b & 0x2) != 0x0) {
            if ((ajsq4 = amps.d) == null) {
                ajsq4 = ajsq.a;
            }
        }
        else {
            ajsq4 = null;
        }
        c2.setContentDescription(abyh.i(ajsq4));
        final agzy e = amps.e;
        this.d.removeAllViews();
        tmy.v((View)this.d, ((List)e).isEmpty() ^ true);
        for (final aibc aibc : e) {
            if (aibc != null && (aibc.b & 0x1) != 0x0) {
                final ftp o = this.f.o((acqs)null, this.e);
                aibb aibb;
                if ((aibb = aibc.c) == null) {
                    aibb = aibb.a;
                }
                o.mN(acij, (Object)aibb);
                this.d.addView((View)o.b);
            }
        }
    }
    
    public final void c(final acir acir) {
    }
}
