import java.util.Iterator;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.view.View;
import android.content.Context;
import android.widget.HorizontalScrollView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdm extends acja
{
    private final acio a;
    private final FrameLayout b;
    private final ChipCloudView c;
    private final HorizontalScrollView d;
    private final kdl e;
    
    public kdm(final Context context, final giz a, final acno acno) {
        a.getClass();
        this.a = (acio)a;
        final Resources resources = context.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131165834);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165823);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131165833);
        final ChipCloudView c = new ChipCloudView(context);
        (this.c = c).setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2);
        c.a(dimensionPixelSize3, dimensionPixelSize3);
        (this.d = new HorizontalScrollView(context)).setHorizontalScrollBarEnabled(false);
        final FrameLayout b = new FrameLayout(context);
        this.b = b;
        this.e = new kdl(context, (acir)acno.a());
        a.c((View)b);
        a.b(false);
    }
    
    public final View a() {
        return ((giz)this.a).a;
    }
    
    public final void c(final acir acir) {
        this.e.e((ViewGroup)this.c);
    }
}
