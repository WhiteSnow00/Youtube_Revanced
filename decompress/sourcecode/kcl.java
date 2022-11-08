import android.text.Spanned;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcl implements acil
{
    public final irp a;
    public wwv b;
    public aibk c;
    private final View d;
    private final TextView e;
    private final TextView f;
    private final CompoundButton g;
    private final aamv h;
    private final int i;
    private CharSequence j;
    private CharSequence k;
    
    public kcl(final Context context, final irp a) {
        this.a = a;
        final View inflate = View.inflate(context, 2131624061, (ViewGroup)null);
        this.d = inflate;
        this.e = (TextView)inflate.findViewById(2131427718);
        this.f = (TextView)inflate.findViewById(2131427721);
        this.h = (aamv)new jqf(this, 3);
        (this.g = (CompoundButton)inflate.findViewById(2131427719)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfl(a, 12));
        this.i = inflate.getPaddingTop();
    }
    
    public final View a() {
        return this.d;
    }
    
    public final void b(final boolean checked) {
        this.g.setChecked(checked);
        final TextView f = this.f;
        CharSequence text;
        if (checked) {
            text = this.k;
        }
        else {
            text = this.j;
        }
        f.setText(text);
    }
    
    public final void c(final acir acir) {
        this.a.h(this.h);
    }
}
