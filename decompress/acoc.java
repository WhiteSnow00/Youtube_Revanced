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

public final class acoc extends fz
{
    public final alpm a;
    public ImageButton b;
    public TextInputLayout c;
    public EditText d;
    public Spinner e;
    public Spinner f;
    public EditText g;
    public final acod h;
    private final afbh i;
    
    public acoc(final Context context, final twt twt, final alpm a, final afbh i, final acod h) {
        super(context, twt.a);
        this.a = a;
        this.i = i;
        this.h = h;
        ((qv)this).setContentView(2131624663);
    }
    
    public final void a() {
        final acod h = this.h;
        h.d.b(h.a, this, this.d.getText().toString(), (ajmb)this.e.getSelectedItem(), (ajmb)this.f.getSelectedItem(), false);
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Toolbar toolbar = (Toolbar)this.findViewById(2131432126);
        final Drawable a = agy.a(this.getContext(), 2131232661);
        trc.e(a, tqf.cr(this.getContext(), 2130970846), PorterDuff$Mode.SRC_IN);
        toolbar.s(a);
        toolbar.t((View$OnClickListener)new zhw(this, 13));
        final alpm a2 = this.a;
        final int b = a2.b;
        final ajws ajws = null;
        ajws ajws2;
        if ((b & 0x1) != 0x0) {
            if ((ajws2 = a2.c) == null) {
                ajws2 = ajws.a;
            }
        }
        else {
            ajws2 = null;
        }
        toolbar.z((CharSequence)acbu.b(ajws2));
        toolbar.q(2132017611);
        (this.b = (ImageButton)this.findViewById(2131431380)).setOnClickListener((View$OnClickListener)new zhw(this, 14));
        final ImageButton b2 = this.b;
        aiet aiet;
        if ((aiet = this.a.n) == null) {
            aiet = aiet.a;
        }
        aies aies;
        if ((aies = aiet.c) == null) {
            aies = aies.a;
        }
        ajws ajws3;
        if ((aies.b & 0x200) != 0x0) {
            aiet aiet2;
            if ((aiet2 = this.a.n) == null) {
                aiet2 = aiet.a;
            }
            aies aies2;
            if ((aies2 = aiet2.c) == null) {
                aies2 = aies.a;
            }
            if ((ajws3 = aies2.i) == null) {
                ajws3 = ajws.a;
            }
        }
        else {
            ajws3 = null;
        }
        b2.setContentDescription((CharSequence)acbu.b(ajws3));
        if (this.i.h()) {
            final TextView textView = (TextView)this.findViewById(2131432085);
            final alpm a3 = this.a;
            ajws ajws4;
            if ((a3.b & 0x2) != 0x0) {
                if ((ajws4 = a3.d) == null) {
                    ajws4 = ajws.a;
                }
            }
            else {
                ajws4 = null;
            }
            tqf.t(textView, (CharSequence)acbu.b(ajws4));
            ((TextView)this.findViewById(2131432082)).setText((CharSequence)((acof)this.i.c()).toString());
            this.findViewById(2131432084).setVisibility(0);
        }
        final YouTubeTextView youTubeTextView = (YouTubeTextView)this.findViewById(2131428629);
        final alpm a4 = this.a;
        ajws ajws5;
        if ((a4.b & 0x20) != 0x0) {
            if ((ajws5 = a4.g) == null) {
                ajws5 = ajws.a;
            }
        }
        else {
            ajws5 = null;
        }
        youTubeTextView.setText((CharSequence)acbu.b(ajws5));
        (this.c = (TextInputLayout)this.findViewById(2131428625)).u(false);
        final EditText d = (EditText)this.findViewById(2131428624);
        this.d = d;
        final alpm a5 = this.a;
        ajws ajws6 = ajws;
        if ((a5.b & 0x20) != 0x0 && (ajws6 = a5.g) == null) {
            ajws6 = ajws.a;
        }
        d.setContentDescription((CharSequence)acbu.b(ajws6));
        this.d.addTextChangedListener((TextWatcher)new eyo(this, 18));
        if (this.a.f > 0) {
            this.c.i(true);
            this.c.j(this.a.f);
            this.d.setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(this.a.f) });
        }
        final acut acut = new acut(this, 1);
        this.e = (Spinner)this.findViewById(2131429463);
        if ((this.a.b & 0x100) != 0x0) {
            final Spinner e = this.e;
            final Context context = this.getContext();
            anxb anxb;
            if ((anxb = this.a.j) == null) {
                anxb = anxb.a;
            }
            e.setAdapter((SpinnerAdapter)new acoa(context, (ajmc)aamp.v(anxb, DropdownRendererOuterClass.dropdownRenderer)));
            this.e.setOnTouchListener((View$OnTouchListener)acut);
            final Spinner e2 = this.e;
            anxb anxb2;
            if ((anxb2 = this.a.j) == null) {
                anxb2 = anxb.a;
            }
            e2.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new acob(this, e2, ((ajmc)aamp.v(anxb2, DropdownRendererOuterClass.dropdownRenderer)).d));
            this.e.setVisibility(0);
        }
        this.f = (Spinner)this.findViewById(2131427569);
        if ((this.a.b & 0x200) != 0x0) {
            final Spinner f = this.f;
            final Context context2 = this.getContext();
            anxb anxb3;
            if ((anxb3 = this.a.k) == null) {
                anxb3 = anxb.a;
            }
            f.setAdapter((SpinnerAdapter)new acoa(context2, (ajmc)aamp.v(anxb3, DropdownRendererOuterClass.dropdownRenderer)));
            this.f.setOnTouchListener((View$OnTouchListener)acut);
            final Spinner f2 = this.f;
            anxb anxb4;
            if ((anxb4 = this.a.k) == null) {
                anxb4 = anxb.a;
            }
            f2.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new acob(this, f2, ((ajmc)aamp.v(anxb4, DropdownRendererOuterClass.dropdownRenderer)).d));
            this.f.setVisibility(0);
        }
        this.g = (EditText)this.findViewById(2131430009);
        final alpm a6 = this.a;
        if ((a6.b & 0x800) != 0x0) {
            final EditText g = this.g;
            ajws ajws7;
            if ((ajws7 = a6.l) == null) {
                ajws7 = ajws.a;
            }
            g.setContentDescription((CharSequence)acbu.b(ajws7));
            final TextInputLayout textInputLayout = (TextInputLayout)this.findViewById(2131430010);
            textInputLayout.u(true);
            textInputLayout.p = true;
            ajws ajws8;
            if ((ajws8 = this.a.l) == null) {
                ajws8 = ajws.a;
            }
            textInputLayout.t((CharSequence)acbu.b(ajws8));
            textInputLayout.setVisibility(0);
        }
        final TextView textView2 = (TextView)this.findViewById(2131430016);
        ajws ajws9;
        if ((ajws9 = this.a.m) == null) {
            ajws9 = ajws.a;
        }
        tqf.t(textView2, (CharSequence)acbu.b(ajws9));
        final TextView textView3 = (TextView)this.findViewById(2131431175);
        ajws ajws10;
        if ((ajws10 = this.a.i) == null) {
            ajws10 = ajws.a;
        }
        tqf.t(textView3, (CharSequence)acbu.b(ajws10));
        final TextView textView4 = (TextView)this.findViewById(2131429064);
        ajws ajws11;
        if ((ajws11 = this.a.h) == null) {
            ajws11 = ajws.a;
        }
        tqf.t(textView4, (CharSequence)acbu.b(ajws11));
    }
}
