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

public final class adab extends acld
{
    public final RadioButton a;
    private final View b;
    private final AppCompatImageView c;
    private final acpk d;
    
    public adab(final Context context, final acpk d) {
        this.d = d;
        final View inflate = LayoutInflater.from(context).inflate(2131625530, (ViewGroup)null);
        this.b = inflate;
        this.a = (RadioButton)inflate.findViewById(2131430769);
        this.c = (AppCompatImageView)inflate.findViewById(2131429270);
        inflate.setOnClickListener((View$OnClickListener)new acun(this, 5));
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acku acku) {
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aone)o).h.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aone aone = (aone)o;
        final adaa adaa = (adaa)ackm.c(adaa.p);
        if (adaa == null) {
            return;
        }
        final RadioButton a = this.a;
        ahil ahil;
        if ((ahil = aone.i) == null) {
            ahil = ahil.a;
        }
        ahik ahik;
        if ((ahik = ahil.c) == null) {
            ahik = ahik.a;
        }
        String c;
        if ((ahik.b & 0x2) != 0x0) {
            ahil ahil2;
            if ((ahil2 = aone.i) == null) {
                ahil2 = ahil.a;
            }
            ahik ahik2;
            if ((ahik2 = ahil2.c) == null) {
                ahik2 = ahik.a;
            }
            c = ahik2.c;
        }
        else {
            c = null;
        }
        a.setContentDescription((CharSequence)c);
        final RadioButton a2 = this.a;
        ajut ajut;
        if ((aone.b & 0x1) != 0x0) {
            if ((ajut = aone.c) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        a2.setText((CharSequence)acak.b(ajut));
        if ((aone.b & 0x2) != 0x0) {
            final AppCompatImageView c2 = this.c;
            final acpk d = this.d;
            akdi akdi;
            if ((akdi = aone.d) == null) {
                akdi = akdi.a;
            }
            akdh akdh;
            if ((akdh = akdh.b(akdi.c)) == null) {
                akdh = akdh.a;
            }
            c2.setImageResource(d.a(akdh));
            final AppCompatImageView c3 = this.c;
            final Context context = this.b.getContext();
            int n;
            if (!adaa.f(aone)) {
                n = 2130970866;
            }
            else {
                n = 2130970852;
            }
            apk.c((ImageView)c3, tpe.ct(context, n));
            this.c.setVisibility(0);
        }
        else {
            this.c.setVisibility(8);
        }
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        this.a.setChecked(adaa.f(aone));
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new jrh(adaa, aone, 4));
    }
}
