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

public final class eye implements eyb
{
    public final bu a;
    public final tny b;
    public final vmh c;
    public final Executor d;
    public EditText e;
    public AlertDialog f;
    public aihc g;
    public final vup h;
    private final akv i;
    private final boolean j;
    private View k;
    private TextInputLayout l;
    private final aeby m;
    
    public eye(final bu a, final tny b, final vmh c, final Executor d, final aeby m, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3) {
        this.h = vup.P((ttk)eyg.b);
        this.a = a;
        this.m = m;
        this.b = b;
        this.i = new eyd();
        this.c = c;
        this.d = d;
        this.j = uyi.s();
    }
    
    @Override
    public final void a(final aihc g) {
        if (this.f == null) {
            final View inflate = LayoutInflater.from((Context)this.a).inflate(2131624164, (ViewGroup)null);
            this.k = inflate;
            this.l = (TextInputLayout)inflate.findViewById(2131428628);
            this.e = (EditText)this.k.findViewById(2131428626);
            final abyy af = this.m.af((Context)this.a);
            final View k = this.k;
            k.getClass();
            final AlertDialog$Builder setView = af.setView(k);
            final bu a = this.a;
            int n;
            if (!this.j) {
                n = 17039370;
            }
            else {
                n = 2132017689;
            }
            (this.f = setView.setPositiveButton((CharSequence)a.getString(n), (DialogInterface$OnClickListener)null).setNegativeButton((CharSequence)this.a.getString(17039360), (DialogInterface$OnClickListener)null).create()).setOnShowListener((DialogInterface$OnShowListener)new eyh(this, 1));
        }
        (this.g = g).getClass();
        final TextInputLayout l = this.l;
        l.getClass();
        final EditText e = this.e;
        e.getClass();
        aihd aihd;
        if ((aihd = g.c) == null) {
            aihd = aihd.a;
        }
        ajse a2;
        if (aihd.b == 91739437) {
            a2 = (ajse)aihd.c;
        }
        else {
            a2 = ajse.a;
        }
        final agza builder = ((agzi)a2).toBuilder();
        ajsq ajsq;
        if ((ajsq = ((ajse)builder.instance).c) == null) {
            ajsq = ajsq.a;
        }
        l.t((CharSequence)abyh.b(ajsq));
        l.i(true);
        l.j(((ajse)builder.instance).e);
        ana.N((View)l, this.i);
        e.setText((CharSequence)((ajse)builder.instance).d);
        e.setSelection(0, ((ajse)builder.instance).d.length());
        final AlertDialog f = this.f;
        f.getClass();
        f.show();
        final Window window = f.getWindow();
        if (window != null) {
            window.setLayout((int)this.a.getResources().getDimension(2131165737), -2);
        }
    }
    
    @Override
    public final void b(final qpt qpt) {
        this.h.D((Object)qpt);
    }
}
