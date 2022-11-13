import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.content.res.Resources;
import android.view.View;
import android.text.style.TtsSpan;
import android.os.PersistableBundle;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.TypedValue;
import android.content.Context;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;
import java.util.ArrayList;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxc implements View$OnClickListener, uud
{
    public final SegmentedControl a;
    public final CreationButtonView b;
    public final float c;
    public gwz d;
    private final ArrayList e;
    private final CharSequence f;
    private SegmentedControlSegment g;
    private final aeea h;
    
    public gxc(final Context context, final CreationButtonView b, final SegmentedControl a, final aeea h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        this.f = b.getContentDescription();
        final TypedValue typedValue = new TypedValue();
        context.getResources().getValue(2131169720, typedValue, true);
        final float float1 = typedValue.getFloat();
        this.c = float1;
        final Resources resources = context.getResources();
        final ArrayList list = new ArrayList();
        final TypedValue typedValue2 = new TypedValue();
        resources.getValue(2131169723, typedValue2, true);
        final float float2 = typedValue2.getFloat();
        final gxa a2 = gxb.a();
        a2.e(float2);
        a2.b(resources.getString(2132019796));
        a2.f(resources.getString(2132019797));
        a2.d(2131231961);
        a2.c(b(resources, float2));
        list.add(a2.a());
        resources.getValue(2131169721, typedValue2, true);
        final float float3 = typedValue2.getFloat();
        final gxa a3 = gxb.a();
        a3.e(float3);
        a3.b(resources.getString(2132019792));
        a3.f(resources.getString(2132019793));
        a3.d(2131231962);
        a3.c(b(resources, float3));
        list.add(a3.a());
        final gxa a4 = gxb.a();
        a4.e(float1);
        a4.b(resources.getString(2132019790));
        a4.f(resources.getString(2132019791));
        a4.d(2131231963);
        a4.c(b(resources, float1));
        list.add(a4.a());
        resources.getValue(2131169719, typedValue2, true);
        final float float4 = typedValue2.getFloat();
        final gxa a5 = gxb.a();
        a5.e(float4);
        a5.b(resources.getString(2132019788));
        a5.f(resources.getString(2132019789));
        a5.d(2131231965);
        a5.c(b(resources, float4));
        list.add(a5.a());
        resources.getValue(2131169722, typedValue2, true);
        final float float5 = typedValue2.getFloat();
        final gxa a6 = gxb.a();
        a6.e(float5);
        a6.b(resources.getString(2132019794));
        a6.f(resources.getString(2132019795));
        a6.d(2131231966);
        a6.c(b(resources, float5));
        list.add(a6.a());
        this.e = list;
        this.a = a;
        a.h = list;
        this.h = h;
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Object value = list.get(i);
            final SegmentedControlSegment g = (SegmentedControlSegment)LayoutInflater.from(context).inflate(2131625388, (ViewGroup)null);
            final gxb gxb = (gxb)value;
            final SpannableString textOn = new SpannableString((CharSequence)gxb.c);
            textOn.setSpan((Object)new TtsSpan("android.type.verbatim", PersistableBundle.EMPTY), textOn.length() - 1, textOn.length(), 33);
            g.setText((CharSequence)textOn);
            g.setTextOff((CharSequence)textOn);
            g.setTextOn((CharSequence)textOn);
            g.setContentDescription((CharSequence)gxb.e);
            if (gxb.a == this.c) {
                g.setChecked(true);
                this.g = g;
            }
            this.a.addView((View)g);
        }
        this.a.post((Runnable)new gsb(this, 17));
    }
    
    static String b(final Resources resources, final float n) {
        String s;
        if (n % 1.0f == 0.0f) {
            s = resources.getString(2132019717, new Object[] { (int)n });
        }
        else {
            s = resources.getString(2132019716, new Object[] { n });
        }
        return s;
    }
    
    private static void k(final View view) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY((float)view.getHeight());
    }
    
    public final gxb a() {
        final int d = this.a.d;
        if (d >= 0) {
            return (gxb)this.e.get(d);
        }
        return null;
    }
    
    public final void c() {
        this.d(false);
    }
    
    public final void d(final boolean b) {
        if (b) {
            final SegmentedControlSegment g = this.g;
            if (g != null) {
                this.a.e(g, false, true);
            }
        }
        final gxb a = this.a();
        if (a != null && a.a == this.c) {
            this.f(2131231964);
        }
        k((View)this.a);
        gxv.f((View)this.a, false);
        this.h.cG(xaa.c(98571)).f();
    }
    
    public final void e(final int n, final boolean b) {
        this.h.cG(xaa.c(98571)).d();
        final gxb gxb = this.e.get(n);
        this.f(gxb.d);
        if (gxb.a != this.c) {
            this.b.setContentDescription((CharSequence)gxb.e);
        }
        else {
            this.b.setContentDescription(this.f);
        }
        final gwz d = this.d;
        if (d != null) {
            final gww gww = (gww)d;
            final YouTubeTextView ad = gww.ad;
            if (ad != null && b) {
                gxu.c(ad, gxb.b);
            }
            gww.s.f = gxb.a;
        }
    }
    
    final void f(final int n) {
        this.b.b(n);
    }
    
    public final void g() {
        final gxb a = this.a();
        if (a != null && a.a == this.c) {
            this.f(a.d);
        }
        k((View)this.a);
        gxv.f((View)this.a, true);
        this.h.cG(xaa.c(98571)).h();
    }
    
    public final void h(final boolean b) {
        final CreationButtonView b2 = this.b;
        int visibility;
        if (!b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        b2.setVisibility(visibility);
    }
    
    public final void i(final boolean b, final uby uby) {
        boolean b2 = false;
        Label_0026: {
            if (!b) {
                if (uby != null) {
                    b2 = b2;
                    if (uby.W()) {
                        break Label_0026;
                    }
                }
                b2 = true;
            }
        }
        this.h(b2);
    }
    
    public final void j() {
        if (this.a.getVisibility() == 0) {
            this.g();
            return;
        }
        this.c();
    }
    
    public final void onClick(final View view) {
        if (view == this.b) {
            this.h.cG(xaa.c(96648)).d();
            if (this.a.getVisibility() == 0) {
                this.c();
                return;
            }
            this.g();
        }
    }
}
