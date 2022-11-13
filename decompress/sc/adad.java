import android.text.Spanned;
import java.util.function.Function;
import j$.util.Optional;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adad extends acld
{
    public final CheckBox a;
    public String b;
    private final View c;
    
    public adad(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131625531, (ViewGroup)null);
        this.c = inflate;
        (this.a = (CheckBox)inflate.findViewById(2131428178)).setClickable(false);
        inflate.setOnClickListener((View$OnClickListener)new acun(this, 6));
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acku acku) {
        this.b = null;
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aonf)o).c.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aonf aonf = (aonf)o;
        final adaa adaa = (adaa)ackm.c(adaa.p);
        if (adaa == null) {
            return;
        }
        final int b = aonf.b;
        String f;
        if ((b & 0x20) != 0x0) {
            f = aonf.f;
        }
        else {
            f = null;
        }
        this.b = f;
        ajut ajut;
        if ((b & 0x4) != 0x0) {
            if ((ajut = aonf.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        final Spanned b2 = acak.b(ajut);
        this.a.setText((CharSequence)b2);
        this.a.setContentDescription((CharSequence)b2);
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        if (adaa.d()) {
            this.c.setEnabled(false);
            this.c.setAlpha(0.5f);
            this.a.setEnabled(false);
            this.a.setChecked(false);
        }
        else {
            this.c.setEnabled(true);
            this.c.setAlpha(1.0f);
            this.a.setEnabled(true);
            this.a.setChecked((boolean)Optional.ofNullable((Object)this.b).map((Function)new yud(adaa, 20)).orElse((Object)false));
        }
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new jrh(this, adaa, 5));
    }
}
