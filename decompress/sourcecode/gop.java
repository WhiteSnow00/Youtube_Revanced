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

public abstract class gop implements vau
{
    public final Context a;
    public final tdz b;
    protected final tny c;
    protected final atjj d;
    protected final goo e;
    protected AlertDialog f;
    private final Executor g;
    private final aeby h;
    
    public gop(final Context a, final tdz b, final tny c, final atjj d, final goo e, final Executor g, final aeby h, final byte[] array, final byte[] array2, final byte[] array3) {
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
    
    public abstract vko e(final aioe p0, final Object p1);
    
    public void f(final aioe aioe) {
    }
    
    public final void g(final aioe aioe, final Object o) {
        final vjn vjn = (vjn)this.d.a();
        ((vii)vjn).j(vem.c(aioe));
        tcp.l(this.e.a(vjn), this.g, (tcn)new fcb(this.c, 10), (tco)new fct(this, aioe, o, 6), afua.a);
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final SpannableString spannableString = new SpannableString(this.a.getText(this.c()));
        final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.h.ai()) {
            this.f = ((AlertDialog$Builder)this.h.af(this.a)).setMessage((CharSequence)spannableString).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setPositiveButton(this.a.getText(this.b()), (DialogInterface$OnClickListener)new gio(this, aioe, m, 7)).create();
        }
        else {
            (this.f = ((AlertDialog$Builder)this.h.af(this.a)).setMessage((CharSequence)spannableString).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).create()).setButton(-1, this.a.getText(this.b()), (DialogInterface$OnClickListener)new gio(this, aioe, m, 8));
        }
        this.f.show();
        final TextView textView = (TextView)this.f.findViewById(16908299);
        Linkify.addLinks(textView, 1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
