import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawy extends aawx implements aawt
{
    public aawy(final Context context, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final ajmx ajmx, final uyi uyi) {
        super(context, creatorEndscreenOverlayPresenter, ajmx, uyi);
    }
    
    public final void g(final aaxe aaxe) {
        super.g(aaxe);
        final ist s = ((aawv)this).c.s;
        if (s != null) {
            ajmw ajmw;
            if ((ajmw = ((aawv)this).b.u) == null) {
                ajmw = ajmw.a;
            }
            if (ajmw.b == 55419609) {
                ((FrameLayout)aaxe.m).setVisibility(0);
                final ajmx b = ((aawv)this).b;
                final Object m = aaxe.m;
                if (s.e == null) {
                    s.e = (TextView)s.a.getLayoutInflater().inflate(2131625518, (ViewGroup)m, true).findViewById(2131431807);
                }
                if (s.d == null) {
                    (s.d = s.c.a(s.e, (fwd)null)).d((fvd)s);
                }
                ajmw ajmw2;
                if ((ajmw2 = b.u) == null) {
                    ajmw2 = ajmw.a;
                }
                aokb a;
                if (ajmw2.b == 55419609) {
                    a = (aokb)ajmw2.c;
                }
                else {
                    a = aokb.a;
                }
                s.f = (aawt)this;
                s.d.j(a, s.b);
                return;
            }
        }
        ((TextView)aaxe.h).setVisibility(0);
    }
}
