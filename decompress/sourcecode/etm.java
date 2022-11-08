import java.util.HashMap;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etm extends etj
{
    public wwv a;
    private View ae;
    private ViewGroup af;
    private acij ag;
    private View b;
    private View c;
    private YouTubeTextView d;
    private YouTubeTextView e;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131625298, viewGroup, false);
        this.b = inflate;
        this.af = (ViewGroup)inflate.findViewById(2131431543);
        final ViewGroup viewGroup2 = (ViewGroup)this.b.findViewById(2131428999);
        final ViewGroup viewGroup3 = (ViewGroup)this.b.findViewById(2131429514);
        this.e = (YouTubeTextView)this.b.findViewById(2131428917);
        this.d = (YouTubeTextView)this.b.findViewById(2131428923);
        this.ae = this.b.findViewById(2131428919);
        final YouTubeTextView youTubeTextView = (YouTubeTextView)this.b.findViewById(2131432092);
        final YouTubeTextView youTubeTextView2 = (YouTubeTextView)this.b.findViewById(2131428624);
        super.K(layoutInflater, viewGroup, bundle);
        ((wwx)(this.ag = new acij())).a(this.a);
        new HashMap();
        this.c = this.b.findViewById(2131429666);
        final ViewGroup af = this.af;
        if (af != null) {
            af.removeAllViews();
        }
        final YouTubeTextView e = this.e;
        if (e != null) {
            e.setVisibility(8);
        }
        final View ae = this.ae;
        if (ae != null) {
            ae.setVisibility(8);
        }
        final YouTubeTextView d = this.d;
        if (d != null) {
            d.setVisibility(8);
        }
        final View c = this.c;
        if (c != null) {
            c.setVisibility(0);
        }
        return this.b;
    }
    
    protected final wwv n() {
        return this.a;
    }
    
    protected final wyb o() {
        return wya.b(76980);
    }
}
