import android.text.Spanned;
import android.widget.ImageView;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import java.util.Map;
import android.widget.RadioButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmp implements acil
{
    public final RadioButton a;
    public final Map b;
    public aioe c;
    public kmo d;
    public wwv e;
    public akly f;
    private final int g;
    private final int h;
    private final Context i;
    private final acio j;
    private final View k;
    private final TextView l;
    private final ViewStub m;
    private View n;
    private final arhr o;
    
    public kmp(final Context i, final giz j, final vax vax, final arhr o, final arhr arhr, final agfu agfu, final byte[] array) {
        i.getClass();
        this.i = i;
        j.getClass();
        this.j = (acio)j;
        o.getClass();
        this.o = o;
        final View inflate = LayoutInflater.from(i).inflate(2131624354, (ViewGroup)null);
        this.k = inflate;
        final RadioButton a = (RadioButton)inflate.findViewById(2131430767);
        (this.a = a).setOnClickListener((View$OnClickListener)new ezl(this, vax, arhr, i, 11));
        this.l = (TextView)inflate.findViewById(2131430786);
        this.m = (ViewStub)inflate.findViewById(2131432320);
        this.b = new HashMap();
        this.g = tmy.cn(i, 2130970926);
        this.h = tmy.cn(i, 2130970852);
        ((acio)j).c(inflate);
        ((acio)j).b(true);
        ((acio)j).d((View$OnClickListener)new kmk(this, 2));
        if (agfu.a) {
            a.getClass();
            a.setBackground(tmy.cq(a.getContext(), 2130970890));
            a.setButtonDrawable((Drawable)null);
        }
    }
    
    public final View a() {
        return ((giz)this.j).a;
    }
    
    public final byte[] b() {
        final akly f = this.f;
        aklz a;
        if (f.b == 106353983) {
            a = (aklz)f.c;
        }
        else {
            a = aklz.a;
        }
        if ((a.b & 0x2) != 0x0) {
            final akly f2 = this.f;
            aklz a2;
            if (f2.b == 106353983) {
                a2 = (aklz)f2.c;
            }
            else {
                a2 = aklz.a;
            }
            return a2.e.I();
        }
        final akly f3 = this.f;
        akma a3;
        if (f3.b == 106118680) {
            a3 = (akma)f3.c;
        }
        else {
            a3 = akma.a;
        }
        if ((a3.b & 0x2) != 0x0) {
            final akly f4 = this.f;
            akma a4;
            if (f4.b == 106118680) {
                a4 = (akma)f4.c;
            }
            else {
                a4 = akma.a;
            }
            return a4.e.I();
        }
        return null;
    }
    
    public final void c(final acir acir) {
        this.b.clear();
    }
}
