import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import android.widget.EditText;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeax extends akw
{
    private final TextInputLayout a;
    
    public aeax(final TextInputLayout a) {
        this.a = a;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
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
        final aeav a2 = this.a.a;
        if (a2.a.getVisibility() == 0) {
            aom.B((View)a2.a);
            aom.F((View)a2.a);
        }
        else {
            aom.F((View)a2.c);
        }
        if (b) {
            aom.E((CharSequence)text);
        }
        else if (!TextUtils.isEmpty((CharSequence)string)) {
            aom.E(string);
            if ((n ^ true) && i != null) {
                final String string2 = i.toString();
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(", ");
                sb.append(string2);
                aom.E(sb.toString());
            }
        }
        else if (i != null) {
            aom.E(i);
        }
        if (!TextUtils.isEmpty((CharSequence)string)) {
            aom.A(string);
            aom.a.setShowingHintText(b ^ true);
        }
        if (text == null || ((CharSequence)text).length() != f) {
            f = -1;
        }
        aom.a.setMaxTextLength(f);
        if (b3) {
            if (b2) {
                contentDescription = d;
            }
            aom.a.setError(contentDescription);
        }
        final TextView n2 = this.a.d.n;
        if (n2 != null) {
            aom.B((View)n2);
        }
        this.a.b.b().v(aom);
    }
    
    public final void d(final View view, final AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        final TextInputLayout a = this.a;
        final int r = TextInputLayout.r;
        a.b.b().w(accessibilityEvent);
    }
}
