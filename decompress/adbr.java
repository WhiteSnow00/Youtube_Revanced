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

public final class adbr extends acmq
{
    public final CheckBox a;
    public String b;
    private final View c;
    
    public adbr(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131625533, (ViewGroup)null);
        this.c = inflate;
        (this.a = (CheckBox)inflate.findViewById(2131428178)).setClickable(false);
        inflate.setOnClickListener((View$OnClickListener)new acvy(this, 5));
    }
    
    @Override
    public final View a() {
        return this.c;
    }
    
    @Override
    public final void c(final acmh acmh) {
        this.b = null;
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
    }
    
    @Override
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aopp)o).c.I();
    }
    
    @Override
    protected final /* bridge */ void lR(final aclz aclz, final Object o) {
        final aopp aopp = (aopp)o;
        final adbo adbo = (adbo)aclz.c(adbo.p);
        if (adbo == null) {
            return;
        }
        final int b = aopp.b;
        String f;
        if ((b & 0x20) != 0x0) {
            f = aopp.f;
        }
        else {
            f = null;
        }
        this.b = f;
        ajws ajws;
        if ((b & 0x4) != 0x0) {
            if ((ajws = aopp.d) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        final Spanned b2 = acbu.b(ajws);
        this.a.setText((CharSequence)b2);
        this.a.setContentDescription((CharSequence)b2);
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        if (adbo.d()) {
            this.c.setEnabled(false);
            this.c.setAlpha(0.5f);
            this.a.setEnabled(false);
            this.a.setChecked(false);
        }
        else {
            this.c.setEnabled(true);
            this.c.setAlpha(1.0f);
            this.a.setEnabled(true);
            this.a.setChecked((boolean)Optional.ofNullable((Object)this.b).map((Function)new adgy(adbo, 1)).orElse((Object)false));
        }
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new jrq(this, adbo, 5));
    }
}
