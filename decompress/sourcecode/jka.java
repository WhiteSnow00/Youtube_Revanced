import java.util.List;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.Iterator;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.View;
import android.view.LayoutInflater;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jka extends acja
{
    public final vax a;
    private final aceo b;
    private final acio c;
    private final Resources d;
    private final LayoutInflater e;
    private final View f;
    private LinearLayout g;
    private appf h;
    private boolean i;
    private int j;
    
    public jka(final Context context, final aceo b, final giz c, final vax a) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = (acio)c;
        a.getClass();
        this.a = a;
        this.d = context.getResources();
        final LayoutInflater from = LayoutInflater.from(context);
        this.e = from;
        c.c(this.f = from.inflate(2131625782, (ViewGroup)null));
    }
    
    public final View a() {
        return ((giz)this.c).a;
    }
    
    public final void c(final acir acir) {
    }
    
    protected final boolean pS() {
        return true;
    }
}
