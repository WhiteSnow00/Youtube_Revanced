import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.app.AlertDialog;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eya
{
    public final Activity a;
    public final aceo b;
    public final vax c;
    public aigk d;
    public aiiq e;
    public AlertDialog f;
    public View g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public final aeby n;
    private final View o;
    private final View p;
    private final TextView q;
    private final TextView r;
    private final TextView s;
    
    public eya(final Activity a, final aceo b, final vax c, final aeby n, final View o, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.n = n;
        this.o = o;
        this.q = (TextView)o.findViewById(2131429196);
        this.r = (TextView)o.findViewById(2131430591);
        this.s = (TextView)o.findViewById(2131427550);
        (this.p = o.findViewById(2131427553)).setOnClickListener((View$OnClickListener)new jl(this, 13));
    }
    
    public static aiiq a(final aigk aigk) {
        if (aigk != null) {
            aigm aigm;
            if ((aigm = aigk.d) == null) {
                aigm = aigm.a;
            }
            if ((aigm.b & 0x1) != 0x0) {
                aigm aigm2;
                if ((aigm2 = aigk.d) == null) {
                    aigm2 = aigm.a;
                }
                aiiq aiiq;
                if ((aiiq = aigm2.c) == null) {
                    aiiq = aiiq.a;
                }
                return aiiq;
            }
        }
        return null;
    }
    
    public final void b(final aigk d) {
        this.d = d;
        int visibility = 8;
        if (d == null) {
            this.o.setVisibility(8);
            return;
        }
        this.o.setVisibility(0);
        final TextView q = this.q;
        if (q != null) {
            ajsq ajsq;
            if ((ajsq = d.b) == null) {
                ajsq = ajsq.a;
            }
            tmy.t(q, (CharSequence)abyh.b(ajsq));
        }
        aigm aigm;
        if ((aigm = d.c) == null) {
            aigm = aigm.a;
        }
        aiiq aiiq;
        if ((aiiq = aigm.c) == null) {
            aiiq = aiiq.a;
        }
        final TextView r = this.r;
        final int b = aiiq.b;
        final ajsq ajsq2 = null;
        ajsq ajsq3;
        if ((b & 0x10) != 0x0) {
            if ((ajsq3 = aiiq.g) == null) {
                ajsq3 = ajsq.a;
            }
        }
        else {
            ajsq3 = null;
        }
        r.setText((CharSequence)abyh.b(ajsq3));
        final TextView s = this.s;
        ajsq ajsq4 = ajsq2;
        if ((aiiq.b & 0x20) != 0x0 && (ajsq4 = aiiq.h) == null) {
            ajsq4 = ajsq.a;
        }
        s.setText((CharSequence)abyh.b(ajsq4));
        final View p = this.p;
        if (a(d) != null) {
            visibility = 0;
        }
        p.setVisibility(visibility);
    }
}
