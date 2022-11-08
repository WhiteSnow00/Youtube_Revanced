import java.util.Iterator;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextUtils;
import android.text.Spanned;
import java.util.ArrayList;
import android.view.ViewStub;
import java.util.List;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgn implements acil
{
    private final Context a;
    private final vax b;
    private final acnj c;
    private final aceo d;
    private final FrameLayout e;
    private final acih f;
    private kgm g;
    private kgm h;
    private kgm i;
    private final jjg j;
    
    public kgn(final Context a, final aceo d, final vax b, final acnj c, final jjg j, final byte[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.j = j;
        final FrameLayout e = new FrameLayout(a);
        (this.e = e).setBackground((Drawable)new fyl(tmy.cn(a, 2130970822), a.getResources().getDimensionPixelSize(2131167246)));
        this.f = new acih(b, (View)e);
    }
    
    public final View a() {
        return (View)this.e;
    }
    
    public final void c(final acir acir) {
        this.f.c();
    }
}
