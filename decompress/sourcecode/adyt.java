import android.view.View$OnClickListener;
import android.widget.EditText;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.support.v7.widget.AppCompatTextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.internal.CheckableImageButton;
import android.widget.TextView;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyt extends LinearLayout
{
    public final TextView a;
    public CharSequence b;
    public final CheckableImageButton c;
    private final TextInputLayout d;
    private ColorStateList e;
    private PorterDuff$Mode f;
    private int g;
    private boolean h;
    
    public adyt(final TextInputLayout d, final cdn cdn, final byte[] array, final byte[] array2) {
        super(d.getContext());
        this.d = d;
        this.setVisibility(8);
        this.setOrientation(0);
        this.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1, 8388611));
        final CheckableImageButton c = (CheckableImageButton)LayoutInflater.from(this.getContext()).inflate(2131624347, (ViewGroup)this, false);
        this.c = c;
        final AppCompatTextView a = new AppCompatTextView(this.getContext());
        this.a = (TextView)a;
        if (adwd.h(this.getContext())) {
            alk.f((ViewGroup$MarginLayoutParams)c.getLayoutParams(), 0);
        }
        this.h();
        this.i();
        final int[] a2 = adys.a;
        if (cdn.q(66)) {
            this.e = adwd.s(this.getContext(), cdn, 66);
        }
        if (cdn.q(67)) {
            this.f = adwd.q(cdn.f(67, -1), (PorterDuff$Mode)null);
        }
        if (cdn.q(63)) {
            final Drawable k = cdn.k(63);
            c.setImageDrawable(k);
            if (k != null) {
                adwd.T(d, c, this.e, this.f);
                this.e(true);
                this.b();
            }
            else {
                this.e(false);
                this.h();
                this.i();
                this.d(null);
            }
            if (cdn.q(62)) {
                this.d(cdn.m(62));
            }
            c.a(cdn.p(61, true));
        }
        final int e = cdn.e(64, this.getResources().getDimensionPixelSize(2131168149));
        if (e >= 0) {
            if (e != this.g) {
                adwd.V(c, this.g = e);
            }
            if (cdn.q(65)) {
                c.setScaleType(adwd.S(cdn.f(65, -1)));
            }
            ((TextView)a).setVisibility(8);
            ((TextView)a).setId(2131431990);
            ((TextView)a).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -2));
            ana.aw((View)a);
            ((TextView)a).setTextAppearance(cdn.i(57, 0));
            if (cdn.q(58)) {
                ((TextView)a).setTextColor(cdn.j(58));
            }
            this.c(cdn.m(56));
            this.addView((View)c);
            this.addView((View)a);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }
    
    private final void j() {
        final CharSequence b = this.b;
        final int n = 0;
        int visibility;
        if (b != null && !this.h) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        int visibility2 = n;
        if (this.c.getVisibility() != 0) {
            if (visibility == 0) {
                visibility2 = n;
            }
            else {
                visibility2 = 8;
            }
        }
        this.setVisibility(visibility2);
        this.a.setVisibility(visibility);
        this.d.L();
    }
    
    public final void a(final boolean h) {
        this.h = h;
        this.j();
    }
    
    public final void b() {
        adwd.U(this.d, this.c, this.e);
    }
    
    public final void c(final CharSequence text) {
        CharSequence b;
        if (!TextUtils.isEmpty(text)) {
            b = text;
        }
        else {
            b = null;
        }
        this.b = b;
        this.a.setText(text);
        this.j();
    }
    
    final void d(final CharSequence contentDescription) {
        if (this.c.getContentDescription() != contentDescription) {
            this.c.setContentDescription(contentDescription);
        }
    }
    
    final void e(final boolean b) {
        if (this.g() != b) {
            final CheckableImageButton c = this.c;
            int visibility;
            if (!b) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            c.setVisibility(visibility);
            this.f();
            this.j();
        }
    }
    
    final void f() {
        final EditText c = this.d.c;
        if (c == null) {
            return;
        }
        int j;
        if (this.g()) {
            j = 0;
        }
        else {
            j = ana.j((View)c);
        }
        ana.ab((View)this.a, j, c.getCompoundPaddingTop(), this.getContext().getResources().getDimensionPixelSize(2131167843), c.getCompoundPaddingBottom());
    }
    
    final boolean g() {
        return this.c.getVisibility() == 0;
    }
    
    final void h() {
        adwd.W(this.c, (View$OnClickListener)null);
    }
    
    final void i() {
        adwd.X(this.c);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.f();
    }
}
