import android.os.Bundle;
import android.content.res.TypedArray;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater$Factory2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ca implements LayoutInflater$Factory2
{
    public final cl a;
    
    public ca(final cl a) {
        this.a = a;
    }
    
    public final View onCreateView(View o, final String s, Context context, final AttributeSet set) {
        if (FragmentContainerView.class.getName().equals(s)) {
            return (View)new FragmentContainerView(context, set, this.a);
        }
        final boolean equals = "fragment".equals(s);
        br e = null;
        if (!equals) {
            return null;
        }
        final String attributeValue = set.getAttributeValue((String)null, "class");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ar.a);
        int id = 0;
        String string;
        if ((string = attributeValue) == null) {
            string = obtainStyledAttributes.getString(0);
        }
        final int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        final String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (string == null || !by.b(context.getClassLoader(), string)) {
            return null;
        }
        if (o != null) {
            id = o.getId();
        }
        int e2 = id;
        int id2 = resourceId;
        if (id == -1) {
            if (resourceId == -1) {
                if (string2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(set.getPositionDescription());
                    sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                    sb.append(string);
                    throw new IllegalArgumentException(sb.toString());
                }
                e2 = -1;
                id2 = -1;
            }
            else {
                e2 = -1;
                id2 = resourceId;
            }
        }
        if (id2 != -1) {
            e = this.a.e(id2);
        }
        br f;
        if ((f = e) == null) {
            f = e;
            if (string2 != null) {
                f = this.a.f(string2);
            }
        }
        br e3;
        if ((e3 = f) == null) {
            e3 = f;
            if (e2 != -1) {
                e3 = this.a.e(e2);
            }
        }
        msg msg2;
        br br;
        if (e3 == null) {
            final by h = this.a.h();
            context.getClassLoader();
            final br c = h.c(string);
            c.u = true;
            int d;
            if (id2 != 0) {
                d = id2;
            }
            else {
                d = e2;
            }
            c.D = d;
            c.E = e2;
            c.F = string2;
            c.v = true;
            c.z = this.a;
            final cl a = this.a;
            c.A = a.l;
            context = a.l.c;
            final Bundle h2 = c.h;
            c.aD();
            final msg msg = msg2 = this.a.aj(c);
            br = c;
            if (cl.W(2)) {
                new StringBuilder("Fragment ").append(c);
                Integer.toHexString(id2);
                msg2 = msg;
                br = c;
            }
        }
        else {
            if (e3.v) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(set.getPositionDescription());
                sb2.append(": Duplicate id 0x");
                sb2.append(Integer.toHexString(id2));
                sb2.append(", tag ");
                sb2.append(string2);
                sb2.append(", or parent id 0x");
                sb2.append(Integer.toHexString(e2));
                sb2.append(" with another fragment for ");
                sb2.append(string);
                throw new IllegalArgumentException(sb2.toString());
            }
            e3.v = true;
            e3.z = this.a;
            final cl a2 = this.a;
            e3.A = a2.l;
            context = a2.l.c;
            e3.aD();
            final msg msg3 = msg2 = this.a.ak(e3);
            br = e3;
            if (cl.W(2)) {
                new StringBuilder("Retained Fragment ").append(e3);
                Integer.toHexString(id2);
                br = e3;
                msg2 = msg3;
            }
        }
        final ViewGroup n = (ViewGroup)o;
        atj.b(br, n);
        br.N = n;
        msg2.g();
        msg2.f();
        o = br.O;
        if (o != null) {
            if (id2 != 0) {
                o.setId(id2);
            }
            if (br.O.getTag() == null) {
                br.O.setTag((Object)string2);
            }
            br.O.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ojt(this, msg2, 1, (byte[])null, (byte[])null));
            return br.O;
        }
        final StringBuilder sb3 = new StringBuilder("Fragment ");
        sb3.append(string);
        sb3.append(" did not create a view.");
        throw new IllegalStateException(sb3.toString());
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
}
