import android.text.Spanned;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjh extends jiw
{
    private final YouTubeTextView b;
    private final ackr c;
    
    public jjh(final Context context, final gjh c, final vcy vcy) {
        super(context, vcy);
        c.getClass();
        ((gjh)(this.c = (ackr)c)).c((View)(this.b = (YouTubeTextView)View.inflate(context, 2131624350, (ViewGroup)null)));
    }
    
    public final View a() {
        return ((gjh)this.c).a;
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final aizu aizu = (aizu)o;
        final wyw a = ackm.a;
        final wyt wyt = new wyt(aizu.f);
        final ajut ajut = null;
        a.t((wzz)wyt, (alhi)null);
        final YouTubeTextView b = this.b;
        ajut ajut2;
        if ((aizu.b & 0x1) != 0x0) {
            if ((ajut2 = aizu.c) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        final Spanned b2 = acak.b(ajut2);
        ajut ajut3 = ajut;
        if ((aizu.b & 0x2) != 0x0 && (ajut3 = aizu.d) == null) {
            ajut3 = ajut.a;
        }
        final Spanned b3 = acak.b(ajut3);
        aiqj aiqj;
        if ((aiqj = aizu.e) == null) {
            aiqj = aiqj.a;
        }
        b.setText(this.b((CharSequence)b2, (CharSequence)b3, aiqj, ackm.a.i()));
        this.c.e(ackm);
    }
}
