import android.widget.TextView;
import com.google.protos.youtube.api.innertube.DropdownRendererOuterClass;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.res.Resources;
import android.content.Context;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jft implements acil, jfy
{
    public final vax a;
    public final ggs b;
    public final NavigationDropdownView c;
    public acpd d;
    private final Context e;
    private final Resources f;
    private final View g;
    private final View h;
    private final View i;
    private final View j;
    private boolean k;
    
    public jft(final Context e, final vax a, final ggs b) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = e.getResources();
        final View inflate = LayoutInflater.from(e).inflate(2131624417, (ViewGroup)null);
        this.g = inflate;
        final NavigationDropdownView c = (NavigationDropdownView)inflate.findViewById(2131431310);
        this.c = c;
        c.g = (jfy)this;
        this.h = c.findViewById(2131428759);
        this.i = c.findViewById(2131428761);
        this.j = c.findViewById(2131427841);
        this.k = false;
    }
    
    @Override
    public final View a() {
        return this.g;
    }
    
    @Override
    public final void c(final acir acir) {
        this.c.b(false);
    }
}
