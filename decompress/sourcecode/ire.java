import android.view.View$OnClickListener;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.LinearLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ire
{
    public final aceo a;
    public final Context b;
    public final LinearLayout c;
    public final YouTubeTextView d;
    public final TextView e;
    public final ImageView f;
    public final DurationBadgeView g;
    public final View h;
    public anec i;
    public final cxz j;
    
    public ire(View viewById, final aceo a, final Context context, final cxz j, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3) {
        viewById.getClass();
        this.a = a;
        this.j = j;
        this.d = (YouTubeTextView)viewById.findViewById(2131432344);
        this.e = (TextView)viewById.findViewById(2131427946);
        final ImageView f = (ImageView)viewById.findViewById(2131432006);
        this.f = f;
        final DurationBadgeView g = (DurationBadgeView)viewById.findViewById(2131428769);
        this.g = g;
        this.h = viewById.findViewById(2131432164);
        this.c = (LinearLayout)viewById.findViewById(2131432137);
        this.b = uji.S(context, (AttributeSet)null, 2132084265);
        if (uyi.aR()) {
            viewById = viewById.findViewById(2131432026);
            viewById.setClipToOutline(true);
            viewById.setBackgroundResource(2131230999);
            f.setClipToOutline(true);
            f.setBackgroundResource(2131231034);
            g.setBackgroundResource(2131231291);
        }
    }
    
    public final anec a() {
        final anec i = this.i;
        i.getClass();
        return i;
    }
    
    final void b(final View$OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
        tmy.v(this.h, onClickListener != null);
    }
}
