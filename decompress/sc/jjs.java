import android.text.Spanned;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjs extends jiw
{
    private final View b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final ackr e;
    
    public jjs(final Context context, final gjh e, final vcy vcy) {
        super(context, vcy);
        e.getClass();
        this.e = (ackr)e;
        final View inflate = View.inflate(context, 2131624549, (ViewGroup)null);
        this.b = inflate;
        this.c = (YouTubeTextView)inflate.findViewById(2131429354);
        this.d = (YouTubeTextView)inflate.findViewById(2131431302);
        e.c(inflate);
    }
    
    public final View a() {
        return ((gjh)this.e).a;
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final aizw aizw = (aizw)o;
        final wyw a = ackm.a;
        final wyt wyt = new wyt(aizw.i);
        final ajut ajut = null;
        a.t((wzz)wyt, (alhi)null);
        final YouTubeTextView c = this.c;
        ajut ajut2;
        if ((aizw.b & 0x1) != 0x0) {
            if ((ajut2 = aizw.c) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        final Spanned b = acak.b(ajut2);
        ajut ajut3;
        if ((aizw.b & 0x2) != 0x0) {
            if ((ajut3 = aizw.d) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        final Spanned b2 = acak.b(ajut3);
        aiqj aiqj;
        if ((aiqj = aizw.e) == null) {
            aiqj = aiqj.a;
        }
        tpe.t((TextView)c, this.b((CharSequence)b, (CharSequence)b2, aiqj, ackm.a.i()));
        final YouTubeTextView d = this.d;
        ajut ajut4;
        if ((aizw.b & 0x8) != 0x0) {
            if ((ajut4 = aizw.f) == null) {
                ajut4 = ajut.a;
            }
        }
        else {
            ajut4 = null;
        }
        final Spanned b3 = acak.b(ajut4);
        ajut ajut5 = ajut;
        if ((aizw.b & 0x10) != 0x0 && (ajut5 = aizw.g) == null) {
            ajut5 = ajut.a;
        }
        final Spanned b4 = acak.b(ajut5);
        aiqj aiqj2;
        if ((aiqj2 = aizw.h) == null) {
            aiqj2 = aiqj.a;
        }
        tpe.t((TextView)d, this.b((CharSequence)b3, (CharSequence)b4, aiqj2, ackm.a.i()));
        this.e.e(ackm);
    }
}
