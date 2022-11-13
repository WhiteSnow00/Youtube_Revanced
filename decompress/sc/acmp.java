import android.graphics.drawable.Drawable;
import android.widget.AdapterView$OnItemSelectedListener;
import android.view.View$OnTouchListener;
import android.widget.SpinnerAdapter;
import com.google.protos.youtube.api.innertube.DropdownRendererOuterClass;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.text.TextWatcher;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.graphics.PorterDuff$Mode;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.content.Context;
import android.widget.Spinner;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmp extends fy
{
    public final alnm a;
    public ImageButton b;
    public TextInputLayout c;
    public EditText d;
    public Spinner e;
    public Spinner f;
    public EditText g;
    public final acmq h;
    private final aezp i;
    
    public acmp(final Context context, final tvr tvr, final alnm a, final aezp i, final acmq h) {
        super(context, tvr.a);
        this.a = a;
        this.i = i;
        this.h = h;
        ((qu)this).setContentView(2131624661);
    }
    
    public final void a() {
        final acmq h = this.h;
        h.d.b(h.a, this, this.d.getText().toString(), (ajkc)this.e.getSelectedItem(), (ajkc)this.f.getSelectedItem(), false);
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Toolbar toolbar = (Toolbar)this.findViewById(2131432125);
        final Drawable a = agx.a(this.getContext(), 2131232661);
        tqb.e(a, tpe.cr(this.getContext(), 2130970848), PorterDuff$Mode.SRC_IN);
        toolbar.s(a);
        toolbar.t((View$OnClickListener)new xqn(this, 14));
        final alnm a2 = this.a;
        final int b = a2.b;
        final ajut ajut = null;
        ajut ajut2;
        if ((b & 0x1) != 0x0) {
            if ((ajut2 = a2.c) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        toolbar.z((CharSequence)acak.b(ajut2));
        toolbar.q(2132017611);
        (this.b = (ImageButton)this.findViewById(2131431379)).setOnClickListener((View$OnClickListener)new xqn(this, 15));
        final ImageButton b2 = this.b;
        aida aida;
        if ((aida = this.a.n) == null) {
            aida = aida.a;
        }
        aicz aicz;
        if ((aicz = aida.c) == null) {
            aicz = aicz.a;
        }
        ajut ajut3;
        if ((aicz.b & 0x200) != 0x0) {
            aida aida2;
            if ((aida2 = this.a.n) == null) {
                aida2 = aida.a;
            }
            aicz aicz2;
            if ((aicz2 = aida2.c) == null) {
                aicz2 = aicz.a;
            }
            if ((ajut3 = aicz2.i) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        b2.setContentDescription((CharSequence)acak.b(ajut3));
        if (this.i.h()) {
            final TextView textView = (TextView)this.findViewById(2131432084);
            final alnm a3 = this.a;
            ajut ajut4;
            if ((a3.b & 0x2) != 0x0) {
                if ((ajut4 = a3.d) == null) {
                    ajut4 = ajut.a;
                }
            }
            else {
                ajut4 = null;
            }
            tpe.t(textView, (CharSequence)acak.b(ajut4));
            ((TextView)this.findViewById(2131432081)).setText((CharSequence)((acms)this.i.c()).toString());
            this.findViewById(2131432083).setVisibility(0);
        }
        final YouTubeTextView youTubeTextView = (YouTubeTextView)this.findViewById(2131428629);
        final alnm a4 = this.a;
        ajut ajut5;
        if ((a4.b & 0x20) != 0x0) {
            if ((ajut5 = a4.g) == null) {
                ajut5 = ajut.a;
            }
        }
        else {
            ajut5 = null;
        }
        youTubeTextView.setText((CharSequence)acak.b(ajut5));
        (this.c = (TextInputLayout)this.findViewById(2131428625)).u(false);
        final EditText d = (EditText)this.findViewById(2131428624);
        this.d = d;
        final alnm a5 = this.a;
        ajut ajut6 = ajut;
        if ((a5.b & 0x20) != 0x0 && (ajut6 = a5.g) == null) {
            ajut6 = ajut.a;
        }
        d.setContentDescription((CharSequence)acak.b(ajut6));
        this.d.addTextChangedListener((TextWatcher)new eyl(this, 18));
        if (this.a.f > 0) {
            this.c.i(true);
            this.c.j(this.a.f);
            this.d.setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(this.a.f) });
        }
        final acti acti = new acti(this, 1);
        this.e = (Spinner)this.findViewById(2131429463);
        if ((this.a.b & 0x100) != 0x0) {
            final Spinner e = this.e;
            final Context context = this.getContext();
            anuv anuv;
            if ((anuv = this.a.j) == null) {
                anuv = anuv.a;
            }
            e.setAdapter((SpinnerAdapter)new acmn(context, (ajkd)aakt.v(anuv, (ahaq)DropdownRendererOuterClass.dropdownRenderer)));
            this.e.setOnTouchListener((View$OnTouchListener)acti);
            final Spinner e2 = this.e;
            anuv anuv2;
            if ((anuv2 = this.a.j) == null) {
                anuv2 = anuv.a;
            }
            e2.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new acmo(this, e2, ((ajkd)aakt.v(anuv2, (ahaq)DropdownRendererOuterClass.dropdownRenderer)).d));
            this.e.setVisibility(0);
        }
        this.f = (Spinner)this.findViewById(2131427569);
        if ((this.a.b & 0x200) != 0x0) {
            final Spinner f = this.f;
            final Context context2 = this.getContext();
            anuv anuv3;
            if ((anuv3 = this.a.k) == null) {
                anuv3 = anuv.a;
            }
            f.setAdapter((SpinnerAdapter)new acmn(context2, (ajkd)aakt.v(anuv3, (ahaq)DropdownRendererOuterClass.dropdownRenderer)));
            this.f.setOnTouchListener((View$OnTouchListener)acti);
            final Spinner f2 = this.f;
            anuv anuv4;
            if ((anuv4 = this.a.k) == null) {
                anuv4 = anuv.a;
            }
            f2.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new acmo(this, f2, ((ajkd)aakt.v(anuv4, (ahaq)DropdownRendererOuterClass.dropdownRenderer)).d));
            this.f.setVisibility(0);
        }
        this.g = (EditText)this.findViewById(2131430009);
        final alnm a6 = this.a;
        if ((a6.b & 0x800) != 0x0) {
            final EditText g = this.g;
            ajut ajut7;
            if ((ajut7 = a6.l) == null) {
                ajut7 = ajut.a;
            }
            g.setContentDescription((CharSequence)acak.b(ajut7));
            final TextInputLayout textInputLayout = (TextInputLayout)this.findViewById(2131430010);
            textInputLayout.u(true);
            textInputLayout.p = true;
            ajut ajut8;
            if ((ajut8 = this.a.l) == null) {
                ajut8 = ajut.a;
            }
            textInputLayout.t((CharSequence)acak.b(ajut8));
            textInputLayout.setVisibility(0);
        }
        final TextView textView2 = (TextView)this.findViewById(2131430016);
        ajut ajut9;
        if ((ajut9 = this.a.m) == null) {
            ajut9 = ajut.a;
        }
        tpe.t(textView2, (CharSequence)acak.b(ajut9));
        final TextView textView3 = (TextView)this.findViewById(2131431175);
        ajut ajut10;
        if ((ajut10 = this.a.i) == null) {
            ajut10 = ajut.a;
        }
        tpe.t(textView3, (CharSequence)acak.b(ajut10));
        final TextView textView4 = (TextView)this.findViewById(2131429064);
        ajut ajut11;
        if ((ajut11 = this.a.h) == null) {
            ajut11 = ajut.a;
        }
        tpe.t(textView4, (CharSequence)acak.b(ajut11));
    }
}
