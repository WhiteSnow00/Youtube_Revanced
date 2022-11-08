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

public final class ackm extends fy
{
    public final alli a;
    public ImageButton b;
    public TextInputLayout c;
    public EditText d;
    public Spinner e;
    public Spinner f;
    public EditText g;
    public final ackn h;
    private final aexq i;
    
    public ackm(final Context context, final ttn ttn, final alli a, final aexq i, final ackn h) {
        super(context, ttn.a);
        this.a = a;
        this.i = i;
        this.h = h;
        ((qu)this).setContentView(2131624660);
    }
    
    public final void a() {
        final ackn h = this.h;
        h.d.b(h.a, this, this.d.getText().toString(), (ajhy)this.e.getSelectedItem(), (ajhy)this.f.getSelectedItem(), false);
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Toolbar toolbar = (Toolbar)this.findViewById(2131432122);
        final Drawable a = agw.a(this.getContext(), 2131232661);
        tnw.e(a, tmy.cn(this.getContext(), 2130970848), PorterDuff$Mode.SRC_IN);
        toolbar.s(a);
        toolbar.t((View$OnClickListener)new zee(this, 13));
        final alli a2 = this.a;
        final int b = a2.b;
        final ajsq ajsq = null;
        ajsq ajsq2;
        if ((b & 0x1) != 0x0) {
            if ((ajsq2 = a2.c) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        toolbar.z((CharSequence)abyh.b(ajsq2));
        toolbar.q(2132017611);
        (this.b = (ImageButton)this.findViewById(2131431376)).setOnClickListener((View$OnClickListener)new zee(this, 14));
        final ImageButton b2 = this.b;
        aibc aibc;
        if ((aibc = this.a.n) == null) {
            aibc = aibc.a;
        }
        aibb aibb;
        if ((aibb = aibc.c) == null) {
            aibb = aibb.a;
        }
        ajsq ajsq3;
        if ((aibb.b & 0x200) != 0x0) {
            aibc aibc2;
            if ((aibc2 = this.a.n) == null) {
                aibc2 = aibc.a;
            }
            aibb aibb2;
            if ((aibb2 = aibc2.c) == null) {
                aibb2 = aibb.a;
            }
            if ((ajsq3 = aibb2.i) == null) {
                ajsq3 = ajsq.a;
            }
        }
        else {
            ajsq3 = null;
        }
        b2.setContentDescription((CharSequence)abyh.b(ajsq3));
        if (this.i.h()) {
            final TextView textView = (TextView)this.findViewById(2131432081);
            final alli a3 = this.a;
            ajsq ajsq4;
            if ((a3.b & 0x2) != 0x0) {
                if ((ajsq4 = a3.d) == null) {
                    ajsq4 = ajsq.a;
                }
            }
            else {
                ajsq4 = null;
            }
            tmy.t(textView, (CharSequence)abyh.b(ajsq4));
            ((TextView)this.findViewById(2131432078)).setText((CharSequence)((ackp)this.i.c()).toString());
            this.findViewById(2131432080).setVisibility(0);
        }
        final YouTubeTextView youTubeTextView = (YouTubeTextView)this.findViewById(2131428629);
        final alli a4 = this.a;
        ajsq ajsq5;
        if ((a4.b & 0x20) != 0x0) {
            if ((ajsq5 = a4.g) == null) {
                ajsq5 = ajsq.a;
            }
        }
        else {
            ajsq5 = null;
        }
        youTubeTextView.setText((CharSequence)abyh.b(ajsq5));
        (this.c = (TextInputLayout)this.findViewById(2131428625)).u(false);
        final EditText d = (EditText)this.findViewById(2131428624);
        this.d = d;
        final alli a5 = this.a;
        ajsq ajsq6 = ajsq;
        if ((a5.b & 0x20) != 0x0 && (ajsq6 = a5.g) == null) {
            ajsq6 = ajsq.a;
        }
        d.setContentDescription((CharSequence)abyh.b(ajsq6));
        this.d.addTextChangedListener((TextWatcher)new eyi(this, 18));
        if (this.a.f > 0) {
            this.c.i(true);
            this.c.j(this.a.f);
            this.d.setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(this.a.f) });
        }
        final acrd acrd = new acrd(this, 1);
        this.e = (Spinner)this.findViewById(2131429463);
        if ((this.a.b & 0x100) != 0x0) {
            final Spinner e = this.e;
            final Context context = this.getContext();
            anss anss;
            if ((anss = this.a.j) == null) {
                anss = anss.a;
            }
            e.setAdapter((SpinnerAdapter)new ackk(context, (ajhz)aaiy.w(anss, (agyr)DropdownRendererOuterClass.dropdownRenderer)));
            this.e.setOnTouchListener((View$OnTouchListener)acrd);
            final Spinner e2 = this.e;
            anss anss2;
            if ((anss2 = this.a.j) == null) {
                anss2 = anss.a;
            }
            e2.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new ackl(this, e2, ((ajhz)aaiy.w(anss2, (agyr)DropdownRendererOuterClass.dropdownRenderer)).d));
            this.e.setVisibility(0);
        }
        this.f = (Spinner)this.findViewById(2131427569);
        if ((this.a.b & 0x200) != 0x0) {
            final Spinner f = this.f;
            final Context context2 = this.getContext();
            anss anss3;
            if ((anss3 = this.a.k) == null) {
                anss3 = anss.a;
            }
            f.setAdapter((SpinnerAdapter)new ackk(context2, (ajhz)aaiy.w(anss3, (agyr)DropdownRendererOuterClass.dropdownRenderer)));
            this.f.setOnTouchListener((View$OnTouchListener)acrd);
            final Spinner f2 = this.f;
            anss anss4;
            if ((anss4 = this.a.k) == null) {
                anss4 = anss.a;
            }
            f2.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new ackl(this, f2, ((ajhz)aaiy.w(anss4, (agyr)DropdownRendererOuterClass.dropdownRenderer)).d));
            this.f.setVisibility(0);
        }
        this.g = (EditText)this.findViewById(2131430009);
        final alli a6 = this.a;
        if ((a6.b & 0x800) != 0x0) {
            final EditText g = this.g;
            ajsq ajsq7;
            if ((ajsq7 = a6.l) == null) {
                ajsq7 = ajsq.a;
            }
            g.setContentDescription((CharSequence)abyh.b(ajsq7));
            final TextInputLayout textInputLayout = (TextInputLayout)this.findViewById(2131430010);
            textInputLayout.u(true);
            textInputLayout.p = true;
            ajsq ajsq8;
            if ((ajsq8 = this.a.l) == null) {
                ajsq8 = ajsq.a;
            }
            textInputLayout.t((CharSequence)abyh.b(ajsq8));
            textInputLayout.setVisibility(0);
        }
        final TextView textView2 = (TextView)this.findViewById(2131430016);
        ajsq ajsq9;
        if ((ajsq9 = this.a.m) == null) {
            ajsq9 = ajsq.a;
        }
        tmy.t(textView2, (CharSequence)abyh.b(ajsq9));
        final TextView textView3 = (TextView)this.findViewById(2131431172);
        ajsq ajsq10;
        if ((ajsq10 = this.a.i) == null) {
            ajsq10 = ajsq.a;
        }
        tmy.t(textView3, (CharSequence)abyh.b(ajsq10));
        final TextView textView4 = (TextView)this.findViewById(2131429064);
        ajsq ajsq11;
        if ((ajsq11 = this.a.h) == null) {
            ajsq11 = ajsq.a;
        }
        tmy.t(textView4, (CharSequence)abyh.b(ajsq11));
    }
}
