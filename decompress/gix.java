import java.util.Iterator;
import android.text.TextUtils;
import android.view.View;
import android.content.DialogInterface;
import java.util.List;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import android.widget.EditText;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gix implements DialogInterface$OnClickListener
{
    public final EditText a;
    public final PrivacySpinner b;
    public final List c;
    public final String d;
    public final String e;
    public final aezp f;
    public final gug g;
    
    public gix(final gug g, final EditText a, final PrivacySpinner b, final List c, final String d, final String e, final aezp f, final byte[] array) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void onClick(final DialogInterface dialogInterface, int d) {
        final gug g = this.g;
        final EditText a = this.a;
        final PrivacySpinner b = this.b;
        final List c = this.c;
        final String d2 = this.d;
        final String e = this.e;
        final aezp f = this.f;
        tpe.p((View)a);
        if (d == -1) {
            final String trim = a.getText().toString().trim();
            if (!TextUtils.isEmpty((CharSequence)trim)) {
                d = b.d();
                final vtz d3 = ((vuf)g.a).d();
                d3.x(trim);
                d3.c = d;
                ((vkk)d3).i();
                final Iterator iterator = c.iterator();
                while (iterator.hasNext()) {
                    d3.w((String)iterator.next());
                }
                if (!TextUtils.isEmpty((CharSequence)d2)) {
                    d3.a = d2;
                }
                if (!TextUtils.isEmpty((CharSequence)e)) {
                    d3.b = e;
                }
                ((vuf)g.a).g(d3, (zpf)new fch(g, 3, (byte[])null));
                if (f.h()) {
                    ((jfr)((jfe)f.c()).a.l).dismiss();
                }
            }
        }
    }
}
