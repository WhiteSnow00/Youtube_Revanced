import android.view.View$OnClickListener;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.app.AlertDialog;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.app.AlertDialog$Builder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aajf
{
    protected final Context a;
    protected final AlertDialog$Builder b;
    protected final veh c;
    protected final acig d;
    protected View e;
    protected ImageView f;
    protected ImageView g;
    protected acip h;
    protected acip i;
    protected TextView j;
    protected TextView k;
    public AlertDialog l;
    public TextView m;
    public TextView n;
    public aies o;
    public aies p;
    protected xab q;
    
    protected aajf(final Context a, final AlertDialog$Builder b, final veh c, final acig d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static void b(final veh veh, final aplb aplb) {
        if (aplb.j.size() != 0) {
            for (final aisc aisc : aplb.j) {
                final HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aplb);
                veh.c(aisc, (Map)hashMap);
            }
        }
    }
    
    public final void a(final aies aies) {
        if (aies == null) {
            return;
        }
        if ((aies.b & 0x8000) != 0x0) {
            aisc aisc;
            if ((aisc = aies.o) == null) {
                aisc = aisc.a;
            }
            aisc f = aisc;
            if (!((ahcu)aisc).ry((ahci)amsk.b)) {
                final xab q = this.q;
                f = aisc;
                if (q != null) {
                    f = q.f(aisc);
                }
            }
            if (f != null) {
                this.c.c(f, (Map)null);
            }
        }
        if ((aies.b & 0x4000) != 0x0) {
            final veh c = this.c;
            aisc aisc2;
            if ((aisc2 = aies.n) == null) {
                aisc2 = aisc.a;
            }
            c.c(aisc2, xac.i((Object)aies, (0x8000 & aies.b) != 0x0 ^ true));
        }
    }
    
    public final void c(final aies aies, final TextView textView, final View$OnClickListener onClickListener) {
        if (aies == null) {
            tqf.v((View)textView, false);
            return;
        }
        ajws ajws;
        if ((aies.b & 0x200) != 0x0) {
            if ((ajws = aies.i) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        Object contentDescription = acbu.b(ajws);
        tqf.t(textView, (CharSequence)contentDescription);
        ahkc ahkc;
        if ((ahkc = aies.t) == null) {
            ahkc = ahkc.a;
        }
        if ((ahkc.b & 0x1) != 0x0) {
            ahkc ahkc2;
            if ((ahkc2 = aies.t) == null) {
                ahkc2 = ahkc.a;
            }
            ahkb ahkb;
            if ((ahkb = ahkc2.c) == null) {
                ahkb = ahkb.a;
            }
            contentDescription = ahkb.c;
        }
        textView.setContentDescription((CharSequence)contentDescription);
        textView.setOnClickListener(onClickListener);
        final xab q = this.q;
        if (q != null) {
            q.t((xbe)new wzy(aies.w), (alji)null);
        }
    }
}
