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

public final class acnz implements zrb
{
    public afbh a;
    public Object b;
    private final Context c;
    private final veh d;
    private final tre e;
    private final atnb f;
    private final aefs g;
    private final aefs h;
    
    public acnz(final Context c, final veh d, final tre e, final atnb f, final aefs h, final aefs g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
        this.a = afag.a;
        this.b = this;
    }
    
    public final void a(final dbm dbm) {
        this.e.e((Throwable)dbm);
    }
    
    public final void mU(final Object o) {
        if (!(o instanceof akqm)) {
            return;
        }
        final akqm akqm = (akqm)o;
        akqp akqp;
        if ((akqp = akqm.f) == null) {
            akqp = akqp.a;
        }
        alpm a;
        if (akqp.b == 171313147) {
            akqp akqp2;
            if ((akqp2 = akqm.f) == null) {
                akqp2 = akqp.a;
            }
            if (akqp2.b == 171313147) {
                a = (alpm)akqp2.c;
            }
            else {
                a = alpm.a;
            }
        }
        else {
            a = null;
        }
        if (a != null) {
            ((acoe)this.f.a()).a(a, this.a, this.b);
        }
        final akqp f = akqm.f;
        akqp a2;
        if (f == null) {
            a2 = akqp.a;
        }
        else {
            a2 = f;
        }
        ajtu a4;
        if (a2.b == 85374086) {
            akqp a3;
            if ((a3 = f) == null) {
                a3 = akqp.a;
            }
            if (a3.b == 85374086) {
                a4 = (ajtu)a3.c;
            }
            else {
                a4 = ajtu.a;
            }
        }
        else {
            a4 = null;
        }
        if (a4 != null) {
            acck.h(this.c, a4, this.d, this.h, this.b, this.g);
        }
        if (a == null && a4 == null && (akqm.b & 0x2) != 0x0) {
            final AlertDialog$Builder setCancelable = new AlertDialog$Builder(this.c).setCancelable(true);
            final Context c = this.c;
            ajws ajws;
            if ((ajws = akqm.d) == null) {
                ajws = ajws.a;
            }
            final AlertDialog create = setCancelable.setMessage((CharSequence)ven.b(c, ajws, this.d, true)).setPositiveButton(2132018941, (DialogInterface$OnClickListener)null).create();
            create.show();
            ((TextView)create.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (akqm.g.size() > 0) {
            this.d.d((List)akqm.g, (Map)null);
        }
    }
    
    public final void mV() {
    }
}
