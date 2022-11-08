import android.view.ViewStub;
import android.widget.ProgressBar;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import android.widget.TextView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class jhl
{
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final DurationBadgeView e;
    public final View f;
    public final ProgressBar g;
    final /* synthetic */ jhn h;
    
    public jhl(final jhn h, final View view) {
        this.h = h;
        this.a = (ImageView)view.findViewById(2131432006);
        this.b = (TextView)view.findViewById(2131432092);
        this.c = (TextView)view.findViewById(2131427696);
        this.d = (TextView)view.findViewById(2131428648);
        this.e = (DurationBadgeView)view.findViewById(2131428769);
        final View viewById = view.findViewById(2131431187);
        this.f = viewById;
        (this.g = (ProgressBar)((ViewStub)viewById).inflate()).setMax(100);
    }
}
