import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.ImageView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgp extends FrameLayout
{
    public final ImageView a;
    public final View b;
    public final ProgressBar c;
    public final YouTubeTextView d;
    public final aexq e;
    public final aexq f;
    public aexq g;
    private final View h;
    
    public hgp(final Context context, final aexq e, final aexq f) {
        super(context, (AttributeSet)null);
        LayoutInflater.from(context).inflate(2131624125, (ViewGroup)this, true);
        final View viewById = this.findViewById(2131428038);
        this.h = viewById;
        this.a = (ImageView)this.findViewById(2131428037);
        this.b = this.findViewById(2131428035);
        this.c = (ProgressBar)this.findViewById(2131428036);
        this.d = (YouTubeTextView)this.findViewById(2131428034);
        this.e = e;
        this.f = f;
        if (e.h() && f.h()) {
            ((tpw)e.c()).a((tpx)f.c());
            ((tpw)e.c()).c(viewById);
        }
        this.g = aewp.a;
    }
    
    public final void a(final aexq aexq) {
        this.c.setVisibility(8);
        if (aexq.h()) {
            this.a.setBackground((Drawable)null);
            this.a.setImageBitmap((Bitmap)aexq.c());
            return;
        }
        this.a.setBackground(this.getContext().getDrawable(2131233099));
        final Drawable drawable = this.getContext().getDrawable(2131233625);
        if (drawable != null) {
            aip.f(drawable, tmy.ct(this.getContext(), 2130970856).orElse(-65536));
            this.a.setImageDrawable(drawable);
        }
    }
}
