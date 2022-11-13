import android.app.AlertDialog$Builder;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;
import android.content.DialogInterface$OnClickListener;
import android.text.SpannableString;
import java.util.Map;
import java.util.concurrent.Executor;
import android.app.AlertDialog;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gow implements vcv
{
    public final Context a;
    public final tgd b;
    protected final tqd c;
    protected final atke d;
    protected final gov e;
    protected AlertDialog f;
    private final Executor g;
    private final aeea h;
    
    public gow(final Context a, final tgd b, final tqd c, final atke d, final gov e, final Executor g, final aeea h, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.g = g;
        this.h = h;
    }
    
    protected abstract int b();
    
    protected abstract int c();
    
    public abstract int d();
    
    public abstract vms e(final aiqj p0, final Object p1);
    
    public void f(final aiqj aiqj) {
    }
    
    public final void g(final aiqj aiqj, final Object o) {
        final vls vls = (vls)this.d.a();
        ((vkk)vls).j(vdh.a(aiqj));
        teu.l(this.e.a(vls), this.g, (tes)new fcf(this.c, 10), (tet)new fcy(this, aiqj, o, 6), afwb.a);
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final SpannableString spannableString = new SpannableString(this.a.getText(this.c()));
        final Object m = tpe.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.h.ao()) {
            this.f = ((AlertDialog$Builder)this.h.al(this.a)).setMessage((CharSequence)spannableString).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setPositiveButton(this.a.getText(this.b()), (DialogInterface$OnClickListener)new giw(this, aiqj, m, 7)).create();
        }
        else {
            (this.f = ((AlertDialog$Builder)this.h.al(this.a)).setMessage((CharSequence)spannableString).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).create()).setButton(-1, this.a.getText(this.b()), (DialogInterface$OnClickListener)new giw(this, aiqj, m, 8));
        }
        this.f.show();
        final TextView textView = (TextView)this.f.findViewById(16908299);
        Linkify.addLinks(textView, 1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
