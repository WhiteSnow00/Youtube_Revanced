import java.util.List;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knv implements acil
{
    public final vax a;
    public hyq b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final PlaylistThumbnailView g;
    private final View h;
    private final View i;
    private final ImageView j;
    private final TextView k;
    private final aceo l;
    private final acnj m;
    private final acih n;
    
    public knv(final Context context, final aceo l, final vax a, final acnj m) {
        l.getClass();
        this.l = l;
        m.getClass();
        this.m = m;
        a.getClass();
        this.a = a;
        final View inflate = View.inflate(context, 2131625042, (ViewGroup)null);
        this.c = inflate;
        this.d = (TextView)inflate.findViewById(2131432092);
        this.e = (TextView)inflate.findViewById(2131427696);
        this.f = (TextView)inflate.findViewById(2131432299);
        this.g = (PlaylistThumbnailView)inflate.findViewById(2131430487);
        this.h = inflate.findViewById(2131428448);
        final View viewById = inflate.findViewById(2131428992);
        this.i = viewById;
        this.j = (ImageView)inflate.findViewById(2131428086);
        this.k = (TextView)inflate.findViewById(2131428998);
        this.n = new acih(a, inflate);
        viewById.setOnClickListener((View$OnClickListener)new kmk(this, 5));
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
        this.n.c();
    }
}
