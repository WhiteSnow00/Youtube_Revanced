import android.view.Window;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import android.app.AlertDialog;
import android.widget.EditText;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyh implements eye
{
    public final bu a;
    public final tqd b;
    public final vol c;
    public final Executor d;
    public EditText e;
    public AlertDialog f;
    public aija g;
    public final vwa h;
    private final akw i;
    private final boolean j;
    private View k;
    private TextInputLayout l;
    private final aeea m;
    
    public eyh(final bu a, final tqd b, final vol c, final Executor d, final aeea m, final vai vai, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = vwa.Z((tvo)eyj.b);
        this.a = a;
        this.m = m;
        this.b = b;
        this.i = (akw)new eyg();
        this.c = c;
        this.d = d;
        this.j = vai.s();
    }
    
    public final void a(final aija g) {
        if (this.f == null) {
            final View inflate = LayoutInflater.from((Context)this.a).inflate(2131624163, (ViewGroup)null);
            this.k = inflate;
            this.l = (TextInputLayout)inflate.findViewById(2131428628);
            this.e = (EditText)this.k.findViewById(2131428626);
            final acba al = this.m.al((Context)this.a);
            final View k = this.k;
            k.getClass();
            final AlertDialog$Builder setView = al.setView(k);
            final bu a = this.a;
            int n;
            if (!this.j) {
                n = 17039370;
            }
            else {
                n = 2132017689;
            }
            (this.f = setView.setPositiveButton((CharSequence)a.getString(n), (DialogInterface$OnClickListener)null).setNegativeButton((CharSequence)this.a.getString(17039360), (DialogInterface$OnClickListener)null).create()).setOnShowListener((DialogInterface$OnShowListener)new eyk(this, 1));
        }
        (this.g = g).getClass();
        final TextInputLayout l = this.l;
        l.getClass();
        final EditText e = this.e;
        e.getClass();
        aijb aijb;
        if ((aijb = g.c) == null) {
            aijb = aijb.a;
        }
        ajuh a2;
        if (aijb.b == 91739437) {
            a2 = (ajuh)aijb.c;
        }
        else {
            a2 = ajuh.a;
        }
        final ahaz builder = a2.toBuilder();
        ajut ajut;
        if ((ajut = ((ajuh)builder.instance).c) == null) {
            ajut = ajut.a;
        }
        l.t((CharSequence)acak.b(ajut));
        l.i(true);
        l.j(((ajuh)builder.instance).e);
        anb.N((View)l, this.i);
        e.setText((CharSequence)((ajuh)builder.instance).d);
        e.setSelection(0, ((ajuh)builder.instance).d.length());
        final AlertDialog f = this.f;
        f.getClass();
        f.show();
        final Window window = f.getWindow();
        if (window != null) {
            window.setLayout((int)this.a.getResources().getDimension(2131165737), -2);
        }
    }
    
    public final void b(final pvh pvh) {
        this.h.H((Object)pvh);
    }
}
