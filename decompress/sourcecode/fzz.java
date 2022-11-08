import android.widget.TextView;
import android.view.ViewStub;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzz extends fzx
{
    private final int a;
    
    public fzz(final View view, final int a) {
        super(view);
        this.a = a;
    }
    
    public fzz(final ViewStub viewStub, final int a) {
        super(viewStub);
        this.a = a;
    }
    
    private static void f(final TextView textView, final int n) {
        textView.setTextColor(tmy.ct(textView.getContext(), n).orElse(0));
    }
    
    private static void g(final TextView textView) {
        textView.setTextColor(ahu.a(textView.getResources(), 2131102354, textView.getContext().getTheme()));
    }
    
    public final void a(final ahyu ahyu) {
        final ViewStub d = super.d;
        final View f = super.f;
        if (ahyu == null) {
            if (d != null) {
                ((View)d).setVisibility(8);
            }
            if (f != null) {
                f.setVisibility(8);
            }
            return;
        }
        final View c = this.c();
        c.setVisibility(0);
        final TextView textView = (TextView)c.findViewById(2131432509);
        final TextView textView2 = (TextView)c.findViewById(2131432510);
        final TextView textView3 = (TextView)c.findViewById(2131432508);
        final TextView textView4 = (TextView)c.findViewById(2131432511);
        final int b = ahyu.b;
        ajsq ajsq = null;
        final ajsq ajsq2 = null;
        if ((b & 0x4) != 0x0) {
            ajsq ajsq3;
            if ((0x8 & b) != 0x0) {
                if ((ajsq3 = ahyu.f) == null) {
                    ajsq3 = ajsq.a;
                }
            }
            else {
                ajsq3 = null;
            }
            tmy.t(textView3, (CharSequence)abyh.b(ajsq3));
            ajsq ajsq4 = ajsq2;
            if ((ahyu.b & 0x4) != 0x0 && (ajsq4 = ahyu.e) == null) {
                ajsq4 = ajsq.a;
            }
            tmy.t(textView4, (CharSequence)abyh.b(ajsq4));
            tmy.v((View)textView, false);
            tmy.v((View)textView2, false);
        }
        else {
            tmy.t(textView, (CharSequence)ahyu.c);
            if ((ahyu.b & 0x2) != 0x0 && (ajsq = ahyu.d) == null) {
                ajsq = ajsq.a;
            }
            tmy.t(textView2, (CharSequence)abyh.b(ajsq));
            tmy.v((View)textView3, false);
            tmy.v((View)textView4, false);
        }
        final int a = this.a;
        if (a != 0) {
            if (a != 2) {
                textView.setTextAppearance(2132083668);
                textView.setBackground(b(textView.getContext()));
                f(textView3, 2130970926);
                f(textView4, 2130970926);
                textView3.setBackground(b(textView3.getContext()));
                textView4.setBackground(b(textView4.getContext()));
                textView2.setTextAppearance(2132084070);
            }
            else {
                textView.setTextAppearance(2132083668);
                textView.setBackgroundResource(2131233304);
                f(textView3, 2130970926);
                f(textView4, 2130970850);
                textView3.setBackgroundResource(2131233304);
                textView4.setBackgroundResource(2131233304);
                textView2.setTextAppearance(2132084071);
            }
        }
        else {
            textView.setTextAppearance(2132083669);
            textView.setBackgroundResource(2131233303);
            g(textView3);
            g(textView4);
            textView3.setBackgroundResource(2131233302);
            textView4.setBackgroundResource(2131233302);
            textView2.setTextAppearance(2132084071);
        }
        if ((ahyu.b & 0x20) != 0x0) {
            ahyv ahyv;
            if ((ahyv = ahyu.g) == null) {
                ahyv = ahyv.a;
            }
            final int aq = aesy.aQ(ahyv.b);
            if (aq != 0) {
                if (aq == 2) {
                    f(textView4, 2130970941);
                }
            }
        }
    }
}
