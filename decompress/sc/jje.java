import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import android.view.ViewGroup;
import android.os.Handler;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jje extends jjd
{
    private final TextView l;
    private final TextView m;
    
    public jje(final Context context, final acgs acgs, final vcy vcy, final acpn acpn, final Handler handler, final acpk acpk, final ViewGroup viewGroup) {
        super(context, acgs, vcy, acpn, handler, acpk, 2131624184, viewGroup);
        this.l = (TextView)this.g.findViewById(2131429196);
        this.m = (TextView)this.g.findViewById(2131431335);
    }
    
    protected final void f(final aile aile) {
        super.f(aile);
        final TextView l = this.l;
        ajut ajut;
        if ((ajut = aile.j) == null) {
            ajut = ajut.a;
        }
        tpe.t(l, (CharSequence)acak.b(ajut));
        final TextView m = this.m;
        ajut ajut2;
        if ((ajut2 = aile.k) == null) {
            ajut2 = ajut.a;
        }
        tpe.t(m, (CharSequence)acak.b(ajut2));
        final WrappingTextViewForClarifyBox h = this.h;
        ajut ajut3;
        if ((ajut3 = aile.e) == null) {
            ajut3 = ajut.a;
        }
        tpe.t((TextView)h, (CharSequence)acak.b(ajut3));
    }
    
    public final void g(final int n, final boolean b) {
    }
}
