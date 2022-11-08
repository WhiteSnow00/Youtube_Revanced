import android.text.Spannable;
import java.util.List;
import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;
import java.util.Iterator;
import com.google.android.apps.youtube.app.extensions.social.controller.MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan;
import android.text.TextUtils;
import android.support.v7.widget.RecyclerView;
import java.util.regex.Pattern;
import java.util.Collection;
import android.content.Context;
import android.widget.Toast;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import java.util.function.Consumer;
import android.text.Editable;
import android.support.v7.widget.SearchView;
import android.app.AlertDialog;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyi implements TextWatcher
{
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public eyi(final ackm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final AlertDialog a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final SearchView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final atdo a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final blt a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final eyk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final fug a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final hsi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final jhf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final juv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final kia a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final kie a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final sro a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final ssd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final ssv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final suu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final udw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final waz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eyi(final wpi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    private final void a(final long g) {
        final qpt f = ((fug)this.a).f;
        if (f != null) {
            final kvb kvb = (kvb)f.a;
            kvb.g = g;
            if (g <= 0L) {
                kvb.f.setEnabled(false);
                return;
            }
            kvb.f.setEnabled(true);
        }
    }
    
    public final void afterTextChanged(final Editable g) {
        final int b = this.b;
        final int n = 0;
        switch (b) {
            default: {
                return;
            }
            case 18: {
                ((ackm)this.a).a();
                return;
            }
            case 14: {
                ((udw)this.a).m();
                return;
            }
            case 13: {
                if (g.length() > 0) {
                    ((suu)this.a).c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231479, 0);
                    ((suu)this.a).d = true;
                }
                else {
                    ((suu)this.a).c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    final suu suu = (suu)this.a;
                    suu.d = false;
                    suu.b();
                }
                ((suu)this.a).d();
                return;
            }
            case 12: {
                ((ssv)this.a).g.ifPresent((Consumer)new inj(this, g, 14, null));
                return;
            }
            case 10: {
                final sro sro = (sro)this.a;
                final aexq al = sro.aL();
                if (al.h()) {
                    if (sro.aP().matcher((CharSequence)g).find()) {
                        if (sro.bc.getVisibility() == 0) {
                            anss anss;
                            if ((anss = ((anxb)al.c()).d) == null) {
                                anss = anss.a;
                            }
                            if (((agzd)anss).rs((agyr)HintRendererOuterClass.hintRenderer)) {
                                final actt am = sro.am;
                                anss anss2;
                                if ((anss2 = ((anxb)al.c()).d) == null) {
                                    anss2 = anss.a;
                                }
                                am.b((ajzl)((agzd)anss2).rr((agyr)HintRendererOuterClass.hintRenderer), sro.bc, al.c(), sro.ai);
                            }
                        }
                        else {
                            final anjm am2 = sro.aM();
                            if (am2 != null && (am2.b & 0x1) != 0x0 && !sro.bl) {
                                sro.aX();
                                if ((((anxb)al.c()).b & 0x10) != 0x0) {
                                    final bu od = sro.od();
                                    ajsq ajsq;
                                    if ((ajsq = ((anxb)al.c()).f) == null) {
                                        ajsq = ajsq.a;
                                    }
                                    Toast.makeText((Context)od, (CharSequence)abyh.b(ajsq), 1).show();
                                }
                            }
                        }
                    }
                }
                ((sro)this.a).aW();
                return;
            }
            case 8: {
                final Object a = this.a;
                final String string = g.toString();
                final blt blt = (blt)a;
                ((List)blt.d).clear();
                if (string.isEmpty()) {
                    ((List<Object>)blt.d).addAll((Collection<?>)blt.c);
                }
                else {
                    final Pattern compile = Pattern.compile(Pattern.quote(string), 2);
                    for (final kib kib : blt.c) {
                        if (compile.matcher(kib.a).find()) {
                            ((List<kib>)blt.d).add(kib);
                        }
                    }
                }
                ((RecyclerView)blt.e).m.rT();
                return;
            }
            case 6: {
                final juv juv = (juv)this.a;
                juv.g = (CharSequence)g;
                juv.j();
                return;
            }
            case 5: {
                ((AlertDialog)this.a).getButton(-1).setEnabled(TextUtils.isEmpty((CharSequence)g) ^ true);
                return;
            }
            case 4: {
                if (g.length() == 0 && ((jhf)this.a).ag.c().g()) {
                    ((jhf)this.a).aC.setVisibility(0);
                }
                else {
                    ((jhf)this.a).aC.setVisibility(8);
                }
                ((jhf)this.a).af.d();
                ((jhf)this.a).aE = g.toString();
                ((jhf)this.a).bs();
                final jhf jhf = (jhf)this.a;
                jhf.bu(jhf.aE);
                return;
            }
            case 3: {
                final hsi hsi = (hsi)this.a;
                if (hsi.l == null) {
                    if (hsi.f()) {
                        final int selectionStart = hsi.b.getSelectionStart();
                        if (selectionStart > 0 && "@\ufe6b\uff20+\ufe62\uff0b".indexOf(hsi.b.getText().charAt(selectionStart - 1)) != -1 && hsi.o < 10) {
                            final int selectionStart2 = hsi.b.getSelectionStart();
                            hsi.l = new MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan();
                            hsi.b.getText().setSpan((Object)hsi.l, selectionStart2 - 1, selectionStart2, 34);
                            hsi.h.e();
                            return;
                        }
                    }
                }
                if (hsi.l == null) {
                    return;
                }
                if (hsi.f()) {
                    final Editable text = hsi.b.getText();
                    final int selectionStart3 = hsi.b.getSelectionStart();
                    final boolean b2 = selectionStart3 > 0 && ((Spannable)text).charAt(selectionStart3 - 1) == ' ';
                    int n2 = n;
                    if (selectionStart3 >= 2) {
                        n2 = n;
                        if (((Spannable)text).charAt(selectionStart3 - 2) == ' ') {
                            n2 = 1;
                        }
                    }
                    if (((!hsi.n && n2 == 0) || !b2) && ((Spannable)text).getSpanStart((Object)hsi.l) < ((Spannable)text).getSpanEnd((Object)hsi.l)) {
                        final Editable text2 = hsi.b.getText();
                        hsi.h.d(((Spannable)text2).subSequence(((Spannable)text2).getSpanStart((Object)hsi.l) + 1, ((Spannable)text2).getSpanEnd((Object)hsi.l)).toString());
                        return;
                    }
                }
                hsi.b();
                return;
            }
            case 2: {
                try {
                    if (g.toString().isEmpty()) {
                        this.a(0L);
                        return;
                    }
                    final long n3 = Long.parseLong(g.toString()) * 1000000L;
                    final Object a2 = this.a;
                    final ajdi d = ((fug)a2).d;
                    if (n3 >= d.v && n3 <= d.w) {
                        ((fug)a2).c.setError((CharSequence)null);
                        this.a(n3);
                        return;
                    }
                    final PrefixedEditText c = ((fug)a2).c;
                    ajsq ajsq2;
                    if ((ajsq2 = d.x) == null) {
                        ajsq2 = ajsq.a;
                    }
                    c.setError((CharSequence)abyh.b(ajsq2));
                    this.a(0L);
                    return;
                }
                catch (final NumberFormatException ex) {
                    final fug fug = (fug)this.a;
                    final PrefixedEditText c2 = fug.c;
                    ajsq ajsq3;
                    if ((ajsq3 = fug.d.x) == null) {
                        ajsq3 = ajsq.a;
                    }
                    c2.setError((CharSequence)abyh.b(ajsq3));
                    this.a(0L);
                    return;
                }
                break;
            }
        }
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, int size, final int n, final int n2) {
        final int b = this.b;
        boolean h = false;
        switch (b) {
            default: {
                final Iterator iterator = ((acyq)((atdo)this.a).c).b.iterator();
                while (iterator.hasNext()) {
                    ((adaw)iterator.next()).f(charSequence.toString());
                }
                return;
            }
            case 18: {
                return;
            }
            case 17: {
                tmy.v(((wpi)this.a).c, TextUtils.isEmpty(charSequence) ^ true);
                final Object a = this.a;
                if (charSequence.length() > 0) {
                    final String string = charSequence.toString();
                    final String string2 = charSequence.toString();
                    final wpi wpi = (wpi)a;
                    wpi.f = string2;
                    final aaca g = wpi.g;
                    final wjk wjk = new wjk(g.c, ((zki)g.e).c(), charSequence.toString(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    ((vii)wjk).i();
                    final ListenableFuture b2 = ((vkh)g.g).b((vjn)wjk, (Executor)g.d);
                    b2.addListener((Runnable)new uqv(wpi, string, b2, 13), wpi.e);
                    return;
                }
                final wpi wpi2 = (wpi)a;
                wpi2.f = null;
                wpi2.d.b();
                ((nq)wpi2.d).rT();
                wpi2.b.setVisibility(8);
                return;
            }
            case 16: {
                final alos q = ((waz)this.a).q;
                if (q != null) {
                    if (q.g.size() != 0) {
                        size = ((waz)this.a).q.g.size();
                        final long c = ((alou)((waz)this.a).q.g.get(0)).c;
                        final long d = ((alou)((waz)this.a).q.g.get(size - 1)).d;
                        final long f = ((waz)this.a).f(String.valueOf(charSequence));
                        ((waz)this.a).p(f);
                        final waz waz = (waz)this.a;
                        waz.l(waz.g(f));
                        final Object a2 = this.a;
                        if (f < c || f > d) {
                            h = true;
                        }
                        final waz waz2 = (waz)a2;
                        waz2.h = h;
                        waz2.d();
                    }
                }
                return;
            }
            case 15: {
                final waz waz3 = (waz)this.a;
                waz3.o(((acrc)waz3.n).b((CharSequence)waz3.d.getText(), ((waz)this.a).p), ((waz)this.a).o);
            }
            case 12:
            case 13:
            case 14: {
                return;
            }
            case 11: {
                final ssd ssd = (ssd)this.a;
                ssd.aK(ssd.aP());
                final float lineSpacingExtra = ((ssd)this.a).am.getLineSpacingExtra();
                final float lineSpacingMultiplier = ((ssd)this.a).am.getLineSpacingMultiplier();
                ((ssd)this.a).am.setLineSpacing(0.0f, 1.0f);
                ((ssd)this.a).am.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
                return;
            }
            case 10: {
                final sro sro = (sro)this.a;
                sro.aN += Math.max(0, n - n2);
                return;
            }
            case 9: {
                final kie kie = (kie)this.a;
                if (!kie.h && !kie.g) {
                    final vax c2 = kie.c;
                    aioe aioe;
                    if ((aioe = kie.e.h) == null) {
                        aioe = aioe.a;
                    }
                    c2.c(aioe, (Map)null);
                    kie.g = true;
                }
                return;
            }
            case 8: {
                return;
            }
            case 7: {
                final kia kia = (kia)this.a;
                if (!kia.k && !kia.j) {
                    final vax d2 = kia.d;
                    aioe aioe2;
                    if ((aioe2 = kia.f.h) == null) {
                        aioe2 = aioe.a;
                    }
                    d2.c(aioe2, (Map)null);
                    kia.j = true;
                }
                return;
            }
            case 4:
            case 5:
            case 6: {
                return;
            }
            case 3: {
                if (charSequence.length() <= 0 || size >= charSequence.length()) {
                    return;
                }
                if (size < 0) {
                    return;
                }
                if (charSequence.charAt(size) == '\n') {
                    ((hsi)this.a).b();
                }
                return;
            }
            case 2: {
                return;
            }
            case 1: {
                ((SearchView)this.a).onTextChanged(charSequence);
                return;
            }
            case 0: {
                final eyk eyk = (eyk)this.a;
                eyk.d();
                trg trg;
                if (eyk.g.getText().toString().equals(eyk.i.c)) {
                    trg = new trg(4, (ajsq)null, (ajsq)null);
                }
                else {
                    eyk.m = new eyj(eyk);
                    final Handler d3 = eyk.d;
                    final Runnable m = eyk.m;
                    final aihf i = eyk.i;
                    long g2;
                    if ((i.b & 0x40) != 0x0) {
                        g2 = i.g;
                    }
                    else {
                        g2 = 1000L;
                    }
                    d3.postDelayed(m, g2);
                    trg = new trg(2, (ajsq)null, (ajsq)null);
                }
                eyk.f(trg);
            }
        }
    }
}
