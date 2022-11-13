import android.text.Spannable;
import android.text.style.UnderlineSpan;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;
import android.view.View;
import android.view.View$OnLayoutChangeListener;
import android.text.TextWatcher;
import java.util.ArrayList;
import android.util.Log;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.social.controller.MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan;
import java.util.List;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hte implements svt, utr
{
    public final CoordinatorLayout a;
    public final EditText b;
    public final ViewGroup c;
    public final BottomSheetBehavior d;
    public final float e;
    public final float f;
    public final int g;
    public final uts h;
    public final apiy i;
    public final List j;
    public final boolean k;
    public MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan l;
    public arag m;
    public boolean n;
    public int o;
    private final Context p;
    private RecyclerView q;
    private final vai r;
    
    public hte(final Context context, final vai vai, final aaad aaad, final CoordinatorLayout coordinatorLayout, final EditText editText, final ViewGroup viewGroup, final aiqj aiqj, final wyw wyw, final apiy apiy, final adtm adtm, final byte[] array, final byte[] array2) {
        this(context, vai, aaad, coordinatorLayout, editText, viewGroup, aiqj, wyw, apiy, false, null, null);
        final BottomSheetBehavior d = this.d;
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        d.F.clear();
        d.F.add(adtm);
    }
    
    public hte(final Context p12, final vai r, final aaad aaad, final CoordinatorLayout a, final EditText b, final ViewGroup c, final aiqj aiqj, final wyw wyw, final apiy i, final boolean k, final byte[] array, final byte[] array2) {
        this.j = new ArrayList();
        this.p = p12;
        this.r = r;
        this.i = i;
        this.a = a;
        this.b = b;
        this.k = k;
        this.c = c;
        int orElse;
        if (i == apiy.d) {
            orElse = 0;
        }
        else {
            orElse = tpe.cx(p12, 2130970838).orElse(0);
        }
        this.g = orElse;
        final eyl eyl = new eyl(this, 3);
        final htb htb = new htb(this);
        b.addTextChangedListener((TextWatcher)eyl);
        b.addTextChangedListener((TextWatcher)new swe());
        b.getText().setSpan((Object)htb, 0, 0, 18);
        a.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fti(this, 11));
        c.addView((View)(this.q = new RecyclerView(p12)), -1, -2);
        this.h = aaad.s((utr)this, this.q, aiqj, wyw, i);
        (this.d = BottomSheetBehavior.y((View)c)).H(5);
        final Resources resources = p12.getResources();
        this.e = resources.getDimension(2131170224);
        this.f = resources.getDimension(2131170225);
        if (i == apiy.d) {
            b.addTextChangedListener((TextWatcher)new hta(this));
        }
    }
    
    public final String a() {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.b.getText());
        qdt.T((Editable)spannableStringBuilder);
        return spannableStringBuilder.toString().trim();
    }
    
    public final void b() {
        if (this.l != null) {
            this.b.getText().removeSpan((Object)this.l);
            this.h.f();
        }
        this.l = null;
        this.c();
    }
    
    public final void c() {
        this.d.H(5);
    }
    
    public final void d(final String s, final String s2, final int n, int n2) {
        String concat;
        if (this.r.aH() && this.i != apiy.d) {
            concat = s;
        }
        else {
            concat = "@".concat(String.valueOf(s));
        }
        String string = concat;
        if (this.i != apiy.d) {
            final StringBuilder sb = new StringBuilder(" ");
            sb.append(concat);
            sb.append(" ");
            string = sb.toString();
        }
        this.b.getText().replace(n, n2, (CharSequence)string);
        final acoc acoc = new acoc(s2, this.e, this.f, this.b.getMeasuredWidth() * 0.9f, this.g);
        n2 = string.length() + n;
        if (this.i == apiy.d) {
            final UnderlineSpan underlineSpan = new UnderlineSpan();
            this.b.getText().setSpan((Object)underlineSpan, n, n2, 33);
            this.j.add(new htd(this, s2, s, underlineSpan));
            ++this.o;
            return;
        }
        this.b.getText().setSpan((Object)acoc, n, n2, 33);
        this.b.getText().setSpan((Object)new swd(), n, n2, 33);
    }
    
    public final void e(final boolean n) {
        if (n) {
            this.c();
        }
        else {
            final BottomSheetBehavior d = this.d;
            if (d.z == 5) {
                d.H(4);
            }
        }
        this.n = n;
    }
    
    public final boolean f() {
        return this.b.getSelectionStart() == this.b.getSelectionEnd();
    }
    
    public final void g(final apjc apjc) {
        if (this.l == null) {
            return;
        }
        final Editable text = this.b.getText();
        final int spanStart = ((Spannable)text).getSpanStart((Object)this.l);
        final int spanEnd = ((Spannable)text).getSpanEnd((Object)this.l);
        this.b();
        if (this.i == apiy.d) {
            final ahaz builder = arag.a.createBuilder();
            final String c = apjc.c;
            builder.copyOnWrite();
            final arag arag = (arag)builder.instance;
            c.getClass();
            arag.b |= 0x1;
            arag.c = c;
            final String d = apjc.d;
            builder.copyOnWrite();
            final arag arag2 = (arag)builder.instance;
            d.getClass();
            arag2.b |= 0x2;
            arag2.d = d;
            builder.copyOnWrite();
            final arag arag3 = (arag)builder.instance;
            arag3.b |= 0x4;
            arag3.e = spanStart;
            builder.copyOnWrite();
            final arag arag4 = (arag)builder.instance;
            arag4.b |= 0x8;
            arag4.f = spanEnd;
            this.m = (arag)builder.build();
            return;
        }
        this.d(apjc.d, apjc.c, spanStart, spanEnd);
        this.b.getText().insert(this.b.getSelectionStart(), (CharSequence)" ");
    }
}
