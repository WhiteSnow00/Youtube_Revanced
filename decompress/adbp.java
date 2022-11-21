import android.widget.ImageView;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.RadioButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbp extends acmq
{
    public final RadioButton a;
    private final View b;
    private final AppCompatImageView c;
    private final acqv d;
    
    public adbp(final Context context, final acqv d) {
        this.d = d;
        final View inflate = LayoutInflater.from(context).inflate(2131625532, (ViewGroup)null);
        this.b = inflate;
        this.a = (RadioButton)inflate.findViewById(2131430769);
        this.c = (AppCompatImageView)inflate.findViewById(2131429270);
        inflate.setOnClickListener((View$OnClickListener)new acvy(this, 4));
    }
    
    @Override
    public final View a() {
        return this.b;
    }
    
    @Override
    public final void c(final acmh acmh) {
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
    }
    
    @Override
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aopo)o).h.I();
    }
    
    @Override
    protected final /* bridge */ void lR(final aclz aclz, final Object o) {
        final aopo aopo = (aopo)o;
        final adbo adbo = (adbo)aclz.c(adbo.p);
        if (adbo == null) {
            return;
        }
        final RadioButton a = this.a;
        ahkc ahkc;
        if ((ahkc = aopo.i) == null) {
            ahkc = ahkc.a;
        }
        ahkb ahkb;
        if ((ahkb = ahkc.c) == null) {
            ahkb = ahkb.a;
        }
        String c;
        if ((ahkb.b & 0x2) != 0x0) {
            ahkc ahkc2;
            if ((ahkc2 = aopo.i) == null) {
                ahkc2 = ahkc.a;
            }
            ahkb ahkb2;
            if ((ahkb2 = ahkc2.c) == null) {
                ahkb2 = ahkb.a;
            }
            c = ahkb2.c;
        }
        else {
            c = null;
        }
        a.setContentDescription((CharSequence)c);
        final RadioButton a2 = this.a;
        ajws ajws;
        if ((aopo.b & 0x1) != 0x0) {
            if ((ajws = aopo.c) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        a2.setText((CharSequence)acbu.b(ajws));
        if ((aopo.b & 0x2) != 0x0) {
            final AppCompatImageView c2 = this.c;
            final acqv d = this.d;
            akfj akfj;
            if ((akfj = aopo.d) == null) {
                akfj = akfj.a;
            }
            akfi akfi;
            if ((akfi = akfi.b(akfj.c)) == null) {
                akfi = akfi.a;
            }
            c2.setImageResource(d.a(akfi));
            final AppCompatImageView c3 = this.c;
            final Context context = this.b.getContext();
            int n;
            if (!adbo.f(aopo)) {
                n = 2130970864;
            }
            else {
                n = 2130970850;
            }
            apl.c((ImageView)c3, tqf.ct(context, n));
            this.c.setVisibility(0);
        }
        else {
            this.c.setVisibility(8);
        }
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        this.a.setChecked(adbo.f(aopo));
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new jrq(adbo, aopo, 4));
    }
}
