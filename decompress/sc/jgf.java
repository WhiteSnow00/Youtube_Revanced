import android.text.Spanned;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgf extends acld
{
    private final View a;
    private final Context b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final float f;
    private final float g;
    private final float h;
    
    public jgf(final Context b) {
        this.b = b;
        final View inflate = LayoutInflater.from(b).inflate(2131625050, (ViewGroup)null);
        this.a = inflate;
        final TextView c = (TextView)inflate.findViewById(2131430518);
        this.c = c;
        final TextView d = (TextView)inflate.findViewById(2131432095);
        this.d = d;
        final TextView e = (TextView)inflate.findViewById(2131427610);
        this.e = e;
        this.f = c.getTextSize();
        this.g = d.getTextSize();
        this.h = e.getTextSize();
    }
    
    private final void f(final ackm ackm, final TextView textView, final ajut ajut) {
        final Spanned b = acak.b(ajut);
        if (!TextUtils.isEmpty((CharSequence)b)) {
            if (ackm != null && ackm.j("nested_fragment_key", false)) {
                textView.setTextSize(0, this.b.getResources().getDimension(2131169781));
            }
            textView.setContentDescription(acak.i(ajut));
            textView.setText((CharSequence)b);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acku acku) {
        this.c.setTextSize(0, this.f);
        this.d.setTextSize(0, this.g);
        this.e.setTextSize(0, this.h);
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((jge)o).a.e.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final anjc a = ((jge)o).a;
        final TextView c = this.c;
        ajut ajut;
        if ((ajut = a.c) == null) {
            ajut = ajut.a;
        }
        this.f(ackm, c, ajut);
        final TextView d = this.d;
        ajut ajut2;
        if ((ajut2 = a.b) == null) {
            ajut2 = ajut.a;
        }
        this.f(ackm, d, ajut2);
        final TextView e = this.e;
        ajut ajut3;
        if ((ajut3 = a.d) == null) {
            ajut3 = ajut.a;
        }
        this.f(ackm, e, ajut3);
    }
}
