import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import android.view.MotionEvent;
import android.text.method.LinkMovementMethod;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeie extends LinkMovementMethod
{
    public boolean a;
    public MotionEvent b;
    
    public aeie() {
        this.a = false;
    }
    
    public final boolean onTouchEvent(final TextView textView, final Spannable spannable, final MotionEvent b) {
        this.b = b;
        final boolean onTouchEvent = super.onTouchEvent(textView, spannable, b);
        if (b.getAction() == 0) {
            this.a = (Selection.getSelectionStart((CharSequence)spannable) != -1);
        }
        else {
            this.a = onTouchEvent;
        }
        return onTouchEvent;
    }
}
