import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import android.widget.EditText;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aecp extends akx
{
    private final TextInputLayout a;
    
    public aecp(final TextInputLayout a) {
        this.a = a;
    }
    
    public final void c(final View view, final aon aon) {
        super.c(view, aon);
        final EditText c = this.a.c;
        final CharSequence charSequence = null;
        Object text;
        if (c != null) {
            text = c.getText();
        }
        else {
            text = null;
        }
        final CharSequence e = this.a.e();
        final CharSequence d = this.a.d();
        final TextInputLayout a = this.a;
        CharSequence i;
        if (a.j) {
            i = a.i;
        }
        else {
            i = null;
        }
        int f = a.f;
        CharSequence contentDescription = charSequence;
        if (a.e) {
            contentDescription = charSequence;
            if (a.g) {
                final TextView h = a.h;
                contentDescription = charSequence;
                if (h != null) {
                    contentDescription = h.getContentDescription();
                }
            }
        }
        final boolean b = TextUtils.isEmpty((CharSequence)text) ^ true;
        final boolean empty = TextUtils.isEmpty(e);
        final boolean n = this.a.n;
        final boolean b2 = TextUtils.isEmpty(d) ^ true;
        final boolean b3 = b2 || !TextUtils.isEmpty(contentDescription);
        String string;
        if (empty ^ true) {
            string = e.toString();
        }
        else {
            string = "";
        }
        final aecn a2 = this.a.a;
        if (a2.a.getVisibility() == 0) {
            aon.C((View)a2.a);
            aon.G((View)a2.a);
        }
        else {
            aon.G((View)a2.c);
        }
        if (b) {
            aon.F((CharSequence)text);
        }
        else if (!TextUtils.isEmpty((CharSequence)string)) {
            aon.F((CharSequence)string);
            if ((n ^ true) && i != null) {
                final String string2 = i.toString();
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(", ");
                sb.append(string2);
                aon.F((CharSequence)sb.toString());
            }
        }
        else if (i != null) {
            aon.F(i);
        }
        if (!TextUtils.isEmpty((CharSequence)string)) {
            aon.B((CharSequence)string);
            aon.a.setShowingHintText(b ^ true);
        }
        if (text == null || ((CharSequence)text).length() != f) {
            f = -1;
        }
        aon.a.setMaxTextLength(f);
        if (b3) {
            if (b2) {
                contentDescription = d;
            }
            aon.a.setError(contentDescription);
        }
        final TextView n2 = this.a.d.n;
        if (n2 != null) {
            aon.C((View)n2);
        }
        this.a.b.b().v(aon);
    }
    
    public final void d(final View view, final AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        final TextInputLayout a = this.a;
        final int r = TextInputLayout.r;
        a.b.b().w(accessibilityEvent);
    }
}
