import com.google.protobuf.ExtensionRegistryLite;
import android.content.DialogInterface;
import java.util.Iterator;
import android.widget.RadioButton;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.google.protobuf.MessageLite;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.RadioGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmd extends jll
{
    public vax ae;
    public zki af;
    public wvu ag;
    wwv ah;
    anyc ai;
    jmc aj;
    public String ak;
    public RadioGroup al;
    public RadioGroup am;
    public ScrollView an;
    public uyi ao;
    public zhb ap;
    public adbp aq;
    public cxz ar;
    
    public static jmd aM(final anyc anyc, final wwv ah) {
        anyc.getClass();
        final jmd jmd = new jmd();
        jmd.ah = ah;
        final Bundle bundle = new Bundle();
        aeda.av(bundle, "renderer", (MessageLite)anyc);
        ((br)jmd).ag(bundle);
        return jmd;
    }
    
    private final RadioGroup$OnCheckedChangeListener aQ() {
        return (RadioGroup$OnCheckedChangeListener)new isb(this, 2);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        if (((br)this).od() instanceof jmc) {
            this.aj = (jmc)((br)this).od();
        }
        final View inflate = layoutInflater.inflate(2131625745, viewGroup, false);
        this.an = (ScrollView)inflate.findViewById(2131431274);
        ((TextView)inflate.findViewById(2131432092)).setText(2132019670);
        this.al = (RadioGroup)inflate.findViewById(2131431880);
        this.am = (RadioGroup)inflate.findViewById(2131427593);
        tcp.i(this.ar.F(), (tco)new jma(this, layoutInflater, 0));
        final TextView textView = (TextView)inflate.findViewById(2131427999);
        final acqu g = this.ap.g(textView);
        final agzc agzc = (agzc)((agzi)aibb.a).createBuilder();
        final ajsq g2 = abyh.g(new String[] { ((br)this).nZ().getString(17039360) });
        agzc.copyOnWrite();
        final aibb aibb = (aibb)agzc.instance;
        g2.getClass();
        aibb.i = g2;
        aibb.b |= 0x200;
        agzc.copyOnWrite();
        final aibb aibb2 = (aibb)agzc.instance;
        final Integer value = 13;
        aibb2.d = value;
        aibb2.c = 1;
        ((acqt)g).b((aibb)agzc.build(), (wwv)null);
        textView.setOnClickListener((View$OnClickListener)new jlq(this, 3));
        this.ah.l((wxz)new wws(wya.c(95980)));
        final TextView textView2 = (TextView)inflate.findViewById(2131427629);
        final acqu g3 = this.ap.g(textView2);
        final agzc agzc2 = (agzc)((agzi)aibb.a).createBuilder();
        final ajsq g4 = abyh.g(new String[] { ((br)this).nZ().getString(2132018939) });
        agzc2.copyOnWrite();
        final aibb aibb3 = (aibb)agzc2.instance;
        g4.getClass();
        aibb3.i = g4;
        aibb3.b |= 0x200;
        agzc2.copyOnWrite();
        final aibb aibb4 = (aibb)agzc2.instance;
        aibb4.d = value;
        aibb4.c = 1;
        ((acqt)g3).b((aibb)agzc2.build(), (wwv)null);
        textView2.setOnClickListener((View$OnClickListener)new jlq(this, 4));
        this.ah.l((wxz)new wws(wya.c(95981)));
        this.al.setOnCheckedChangeListener(this.aQ());
        this.am.setOnCheckedChangeListener(this.aQ());
        if (this.ao.aO()) {
            textView2.setAllCaps(false);
            textView.setAllCaps(false);
        }
        if (this.ao.aT()) {
            inflate.setBackgroundColor(tmy.cn(((br)this).nT(), 2130970893));
            final int cn = tmy.cn(((br)this).nT(), 2130970869);
            inflate.findViewById(2131429210).setBackgroundColor(cn);
            inflate.findViewById(2131429489).setBackgroundColor(cn);
            inflate.findViewById(2131429070).setBackgroundColor(cn);
        }
        return inflate;
    }
    
    public final String aN() {
        final String n = adbp.n();
        final String a = this.aq.a();
        if (!n.isEmpty() && !a.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append("-");
            sb.append(a);
            return sb.toString();
        }
        return "";
    }
    
    public final void aO(final RadioGroup radioGroup) {
        radioGroup.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)null);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(this.aQ());
    }
    
    public final void aP(final LayoutInflater layoutInflater, final RadioGroup radioGroup, final anyj anyj) {
        final TextView textView = (TextView)layoutInflater.inflate(2131625748, (ViewGroup)radioGroup, false);
        ajsq ajsq;
        if ((ajsq = anyj.b) == null) {
            ajsq = ajsq.a;
        }
        textView.setText((CharSequence)abyh.b(ajsq));
        radioGroup.addView((View)textView);
        for (final anyb anyb : anyj.c) {
            final RadioButton radioButton = (RadioButton)layoutInflater.inflate(2131625746, (ViewGroup)radioGroup, false);
            radioButton.setId(View.generateViewId());
            anya a;
            if (anyb.b == 64166933) {
                a = (anya)anyb.c;
            }
            else {
                a = anya.a;
            }
            radioButton.setText((CharSequence)a.c);
            radioGroup.addView((View)radioButton);
            anya a2;
            if (anyb.b == 64166933) {
                a2 = (anya)anyb.c;
            }
            else {
                a2 = anya.a;
            }
            if (aeda.y((CharSequence)a2.e, (CharSequence)this.ak)) {
                radioButton.setChecked(true);
                this.an.post((Runnable)new jku(this, radioButton, 3));
            }
        }
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        final bu od = ((br)this).od();
        if (od instanceof jmc) {
            ((jmc)od).b();
        }
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        final Bundle m = ((br)this).m;
        final anyc a = anyc.a;
        Object ar;
        try {
            ar = aeda.ar(m, "renderer", (MessageLite)a, ExtensionRegistryLite.getGeneratedRegistry());
        }
        catch (final RuntimeException ex) {
            trn.b("Failed to merge proto for renderer");
            ar = null;
        }
        this.ai = (anyc)ar;
    }
}
