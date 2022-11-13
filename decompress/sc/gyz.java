import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import android.widget.ImageView;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyz implements acko, tpn
{
    private final AudioTrackView a;
    private final achb b;
    
    public gyz(final acgs acgs, final ViewGroup viewGroup) {
        final AudioTrackView a = (AudioTrackView)LayoutInflater.from(viewGroup.getContext()).inflate(2131624055, viewGroup, false);
        this.a = a;
        this.b = new achb((tpo)acgs, a.c);
    }
    
    @Override
    public final View a() {
        return (View)this.a;
    }
    
    public final void b(final ImageView imageView) {
        zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Edit]Failure while loading thumbnail.");
    }
    
    @Override
    public final void c(final acku acku) {
    }
    
    public final void d(final ImageView imageView) {
    }
    
    public final void f(final ImageView imageView) {
    }
    
    public final void g() {
    }
    
    @Override
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final ShortsCreationSelectedTrack a = ((gza)o).a;
        final aotp k = a.k();
        if (k != null) {
            this.b.m(k, true, false, (tpn)this);
        }
        final String m = a.m();
        if (m != null) {
            this.a.b.setText((CharSequence)m);
        }
        if (a.f().h()) {
            final AudioTrackView a2 = this.a;
            a2.e = Math.min(a.b(), a2.a());
            this.a.e(a.c(), (long)a.f().c(), a.g());
        }
    }
}
