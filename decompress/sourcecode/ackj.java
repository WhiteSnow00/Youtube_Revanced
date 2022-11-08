import android.app.AlertDialog;
import java.util.Map;
import java.util.List;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ackj implements znj
{
    public aexq a;
    public Object b;
    private final Context c;
    private final vax d;
    private final tny e;
    private final atjj f;
    private final aeby g;
    private final aeby h;
    
    public ackj(final Context c, final vax d, final tny e, final atjj f, final aeby h, final aeby g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
        this.a = (aexq)aewp.a;
        this.b = this;
    }
    
    public final void a(final dbi dbi) {
        this.e.e((Throwable)dbi);
    }
    
    public final void mX(final Object o) {
        if (!(o instanceof akmi)) {
            return;
        }
        final akmi akmi = (akmi)o;
        akml akml;
        if ((akml = akmi.f) == null) {
            akml = akml.a;
        }
        alli a;
        if (akml.b == 171313147) {
            akml akml2;
            if ((akml2 = akmi.f) == null) {
                akml2 = akml.a;
            }
            if (akml2.b == 171313147) {
                a = (alli)akml2.c;
            }
            else {
                a = alli.a;
            }
        }
        else {
            a = null;
        }
        if (a != null) {
            ((acko)this.f.a()).a(a, this.a, this.b);
        }
        final akml f = akmi.f;
        akml a2;
        if (f == null) {
            a2 = akml.a;
        }
        else {
            a2 = f;
        }
        ajpr a4;
        if (a2.b == 85374086) {
            akml a3;
            if ((a3 = f) == null) {
                a3 = akml.a;
            }
            if (a3.b == 85374086) {
                a4 = (ajpr)a3.c;
            }
            else {
                a4 = ajpr.a;
            }
        }
        else {
            a4 = null;
        }
        if (a4 != null) {
            abyx.h(this.c, a4, this.d, this.h, this.b, this.g);
        }
        if (a == null && a4 == null && (akmi.b & 0x2) != 0x0) {
            final AlertDialog$Builder setCancelable = new AlertDialog$Builder(this.c).setCancelable(true);
            final Context c = this.c;
            ajsq ajsq;
            if ((ajsq = akmi.d) == null) {
                ajsq = ajsq.a;
            }
            final AlertDialog create = setCancelable.setMessage((CharSequence)vbd.b(c, ajsq, this.d, true)).setPositiveButton(2132018938, (DialogInterface$OnClickListener)null).create();
            create.show();
            ((TextView)create.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (akmi.g.size() > 0) {
            this.d.d((List)akmi.g, (Map)null);
        }
    }
}
