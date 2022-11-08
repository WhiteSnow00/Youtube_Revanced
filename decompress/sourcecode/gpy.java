import android.app.AlertDialog$Builder;
import android.content.res.Resources;
import android.view.View;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.content.DialogInterface$OnClickListener;
import android.widget.ImageView;
import android.text.method.LinkMovementMethod;
import java.util.List;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.protos.youtube.api.innertube.ConnectGpgDialogRenderer;
import com.google.protos.youtube.api.innertube.ConnectGpgDialogCommand$ConnectGPGDialogCommand;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpy implements vau
{
    private final Context a;
    private final vax b;
    private final wwv c;
    private final acng d;
    private final aceo e;
    private final aeby f;
    private final aeby g;
    
    public gpy(final Context a, final aceo e, final vax b, final wwv c, final acng d, final aeby g, final aeby f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        aioe.getClass();
        final gqe gqe = new gqe(this.b, this.c, this.d, this.e, this.g, this.f, null, null, null, null);
        anss anss;
        if ((anss = ((ConnectGpgDialogCommand$ConnectGPGDialogCommand)((agzd)aioe).rr((agyr)ConnectGpgDialogCommand$ConnectGPGDialogCommand.connectGpgDialogCommand)).b) == null) {
            anss = anss.a;
        }
        aivb aivb;
        if (((agzd)anss).rs((agyr)ConnectGpgDialogRenderer.connectGpgDialogRenderer)) {
            aivb = (aivb)((agzd)anss).rr((agyr)ConnectGpgDialogRenderer.connectGpgDialogRenderer);
        }
        else {
            aivb = null;
        }
        if (aivb == null) {
            trn.b("Could not get ConnectGPGDialog from command.");
            return;
        }
        this.c.D((wxz)new wws(wya.c(94289)));
        final Context a = this.a;
        final View inflate = LayoutInflater.from(a).inflate(2131624277, (ViewGroup)null);
        final TextView textView = (TextView)inflate.findViewById(2131432092);
        ajsq ajsq;
        if ((ajsq = aivb.f) == null) {
            ajsq = ajsq.a;
        }
        tmy.t(textView, (CharSequence)abyh.b(ajsq));
        final TextView textView2 = (TextView)inflate.findViewById(2131429843);
        textView2.setText(gqe.c(aivb.g, gqe.a));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        final Resources resources = a.getResources();
        final ImageView imageView = (ImageView)inflate.findViewById(2131432261);
        aorm aorm;
        if ((aorm = aivb.c) == null) {
            aorm = aorm.a;
        }
        gqe.g(resources, imageView, aorm);
        final ImageView imageView2 = (ImageView)inflate.findViewById(2131430412);
        final acng c = gqe.c;
        akbf akbf;
        if ((akbf = aivb.d) == null) {
            akbf = akbf.a;
        }
        akbe akbe;
        if ((akbe = akbe.b(akbf.c)) == null) {
            akbe = akbe.a;
        }
        imageView2.setImageResource(c.a(akbe));
        final TextView textView3 = (TextView)inflate.findViewById(2131429117);
        ajsq ajsq2;
        if ((ajsq2 = aivb.b) == null) {
            ajsq2 = ajsq.a;
        }
        tmy.t(textView3, (CharSequence)abyh.b(ajsq2));
        final TextView textView4 = (TextView)inflate.findViewById(2131432270);
        ajsq ajsq3;
        if ((ajsq3 = aivb.e) == null) {
            ajsq3 = ajsq.a;
        }
        tmy.t(textView4, (CharSequence)abyh.b(ajsq3));
        final abyy af = gqe.g.af(a);
        ((AlertDialog$Builder)af).setNegativeButton((CharSequence)null, (DialogInterface$OnClickListener)gqe);
        ((AlertDialog$Builder)af).setPositiveButton((CharSequence)null, (DialogInterface$OnClickListener)gqe);
        aibc aibc;
        if ((aibc = aivb.h) == null) {
            aibc = aibc.a;
        }
        aibb d;
        if ((d = aibc.c) == null) {
            d = aibb.a;
        }
        gqe.d = d;
        final TextView textView5 = (TextView)inflate.findViewById(2131429552);
        new tnw(a).b(textView5.getBackground(), tmy.ct(a, 2130970852).orElse(0));
        textView5.setTextColor(tmy.ct(a, 2130970857).orElse(0));
        textView5.setText(gqe.b(gqe.d));
        final View viewById = inflate.findViewById(2131429553);
        viewById.setOnClickListener((View$OnClickListener)new fuh(gqe, 11));
        viewById.setOnTouchListener((View$OnTouchListener)acsy.c());
        inflate.findViewById(2131428234).setOnClickListener((View$OnClickListener)new fuh(gqe, 12));
        aibc aibc2;
        if ((aibc2 = aivb.i) == null) {
            aibc2 = aibc.a;
        }
        aibb e;
        if ((e = aibc2.c) == null) {
            e = aibb.a;
        }
        gqe.e = e;
        final aibb e2 = gqe.e;
        if (e2 != null && (e2.b & 0x800000) != 0x0) {
            gqe.b.D((wxz)new wws(e2.w));
        }
        ((AlertDialog$Builder)af).setView(inflate);
        gqe.j(((AlertDialog$Builder)af).create());
        gqe.k();
    }
}
