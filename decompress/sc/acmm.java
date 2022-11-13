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

public final class acmm implements zpf
{
    public aezp a;
    public Object b;
    private final Context c;
    private final vcy d;
    private final tqd e;
    private final atke f;
    private final aeea g;
    private final aeea h;
    
    public acmm(final Context c, final vcy d, final tqd e, final atke f, final aeea h, final aeea g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
        this.a = (aezp)aeyo.a;
        this.b = this;
    }
    
    public final void a(final dbj dbj) {
        this.e.e((Throwable)dbj);
    }
    
    public final void mX(final Object o) {
        if (!(o instanceof akol)) {
            return;
        }
        final akol akol = (akol)o;
        akoo akoo;
        if ((akoo = akol.f) == null) {
            akoo = akoo.a;
        }
        alnm a;
        if (akoo.b == 171313147) {
            akoo akoo2;
            if ((akoo2 = akol.f) == null) {
                akoo2 = akoo.a;
            }
            if (akoo2.b == 171313147) {
                a = (alnm)akoo2.c;
            }
            else {
                a = alnm.a;
            }
        }
        else {
            a = null;
        }
        if (a != null) {
            ((acmr)this.f.a()).a(a, this.a, this.b);
        }
        final akoo f = akol.f;
        akoo a2;
        if (f == null) {
            a2 = akoo.a;
        }
        else {
            a2 = f;
        }
        ajrv a4;
        if (a2.b == 85374086) {
            akoo a3;
            if ((a3 = f) == null) {
                a3 = akoo.a;
            }
            if (a3.b == 85374086) {
                a4 = (ajrv)a3.c;
            }
            else {
                a4 = ajrv.a;
            }
        }
        else {
            a4 = null;
        }
        if (a4 != null) {
            acaz.h(this.c, a4, this.d, this.h, this.b, this.g);
        }
        if (a == null && a4 == null && (akol.b & 0x2) != 0x0) {
            final AlertDialog$Builder setCancelable = new AlertDialog$Builder(this.c).setCancelable(true);
            final Context c = this.c;
            ajut ajut;
            if ((ajut = akol.d) == null) {
                ajut = ajut.a;
            }
            final AlertDialog create = setCancelable.setMessage((CharSequence)vde.b(c, ajut, this.d, true)).setPositiveButton(2132018939, (DialogInterface$OnClickListener)null).create();
            create.show();
            ((TextView)create.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (akol.g.size() > 0) {
            this.d.d((List)akol.g, (Map)null);
        }
    }
    
    public final void mY() {
    }
}
