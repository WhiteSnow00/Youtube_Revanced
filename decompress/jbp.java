import android.view.View$OnClickListener;
import android.net.Uri;
import java.util.Map;
import java.util.HashMap;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout.MetadataHighlightsColumnLinearLayout;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbp implements acko
{
    public final Object a;
    public final View b;
    private final int c;
    private final View d;
    private final Object e;
    private final Object f;
    
    public jbp(final Context context, final acgs a, final int c) {
        this.c = c;
        this.a = a;
        final LinearLayout b = (LinearLayout)LayoutInflater.from(context).inflate(2131624836, (ViewGroup)null);
        this.b = (View)b;
        final LinearLayout linearLayout = b;
        this.e = b.findViewById(2131432095);
        final LinearLayout linearLayout2 = b;
        this.d = b.findViewById(2131432009);
        final LinearLayout linearLayout3 = b;
        this.f = b.findViewById(2131428003);
    }
    
    public jbp(final Context context, final adaw a, final int c) {
        this.c = c;
        final View inflate = View.inflate(context, 2131625372, (ViewGroup)null);
        this.d = inflate;
        this.e = inflate.findViewById(2131432095);
        this.b = inflate.findViewById(2131430019);
        this.f = inflate.findViewById(2131430020);
        this.a = a;
        addn.e(inflate);
    }
    
    public jbp(final Context context, final arkg a, final acbm e, final wyw f, final vai vai, final ViewGroup viewGroup, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        final ViewGroup d = (ViewGroup)LayoutInflater.from(context).inflate(2131624469, viewGroup, false);
        this.d = (View)d;
        Object b;
        if (d instanceof MetadataHighlightsColumnLinearLayout) {
            b = d;
        }
        else {
            b = null;
        }
        this.b = (View)b;
        if (vai.aX()) {
            final ViewGroup viewGroup2 = d;
            d.setBackgroundResource(2131232276);
        }
    }
    
    public final View a() {
        final int c = this.c;
        if (c == 0) {
            return this.d;
        }
        if (c != 1) {
            return this.d;
        }
        return this.b;
    }
    
    public final void c(final acku acku) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                ((CompoundButton)this.b).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
            }
            return;
        }
        ((acbm)this.e).c(acku);
    }
    
    public final void mN(final ackm ackm, Object onClickListener) {
        final int c = this.c;
        if (c == 0) {
            final ajmo ajmo = (ajmo)onClickListener;
            ((acbm)this.e).c((acku)null);
            ((ViewGroup)this.d).removeAllViews();
            final View a = ((acbm)this.e).a();
            final ViewGroup viewGroup = (ViewGroup)a.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(a);
            }
            if (this.b != null) {
                final Integer n = (Integer)ackm.c("ITEM_COUNT");
                int n2 = 2132083259;
                if (n != null) {
                    n2 = n2;
                    if (n == 1) {
                        n2 = 2132083255;
                    }
                }
                ((MetadataHighlightsColumnLinearLayout)this.b).b(n2);
            }
            if (ajmo != null) {
                final ackm ackm2 = new ackm();
                ackm2.g((Map)new HashMap());
                ((wyy)ackm2).a((wyw)this.f);
                ((acbm)this.e).b(ackm2, ((accf)((arkg)this.a).a()).d(ajmo));
                ((ViewGroup)this.d).addView(((acbm)this.e).a());
            }
            return;
        }
        if (c == 1) {
            final amii amii = (amii)onClickListener;
            final Object e = this.e;
            ajut ajut;
            if ((ajut = amii.b) == null) {
                ajut = ajut.a;
            }
            ((TextView)e).setText((CharSequence)acak.b(ajut));
            final Object f = this.f;
            ajut ajut2;
            if ((ajut2 = amii.d) == null) {
                ajut2 = ajut.a;
            }
            ((TextView)f).setText((CharSequence)acak.b(ajut2));
            ((acgs)this.a).f((ImageView)this.d, Uri.parse(amii.c));
            return;
        }
        final aozy aozy = (aozy)onClickListener;
        final Object e2 = this.e;
        ajut ajut3;
        if ((aozy.b & 0x1) != 0x0) {
            if ((ajut3 = aozy.c) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        ((TextView)e2).setText((CharSequence)acak.b(ajut3));
        aibz aibz;
        if ((aibz = aozy.d) == null) {
            aibz = aibz.a;
        }
        aica aica;
        if ((aibz.b & 0x2) != 0x0) {
            aibz aibz2;
            if ((aibz2 = aozy.d) == null) {
                aibz2 = aibz.a;
            }
            if ((aica = aibz2.c) == null) {
                aica = aica.a;
            }
        }
        else {
            aica = null;
        }
        if (aica != null) {
            ((CompoundButton)this.b).setChecked(aica.d);
            ((CompoundButton)this.b).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfm(this, 19, null));
            final Object f2 = this.f;
            ajut ajut4;
            if ((aica.b & 0x1) != 0x0) {
                if ((ajut4 = aica.c) == null) {
                    ajut4 = ajut.a;
                }
            }
            else {
                ajut4 = null;
            }
            ((TextView)f2).setText((CharSequence)acak.b(ajut4));
            final Object f3 = this.f;
            onClickListener = new acun(this, 11, (byte[])null);
            ((TextView)f3).setOnClickListener((View$OnClickListener)onClickListener);
            ((CompoundButton)this.b).setVisibility(0);
            ((TextView)this.f).setVisibility(0);
            return;
        }
        ((CompoundButton)this.b).setVisibility(8);
        ((TextView)this.f).setVisibility(8);
    }
}
