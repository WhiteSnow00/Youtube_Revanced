import android.text.TextPaint;
import android.content.Context;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import android.util.Log;
import android.content.ContextWrapper;
import android.view.View;
import android.text.style.ClickableSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aehp extends ClickableSpan
{
    public final void onClick(final View view) {
        if (view instanceof aeho) {
            ((aeho)view).a();
        }
        while (true) {
            Context context;
            for (context = view.getContext(); !(context instanceof aehn); context = ((ContextWrapper)context).getBaseContext()) {
                if (!(context instanceof ContextWrapper)) {
                    final aehn aehn = null;
                    if (aehn != null) {
                        aehn.a();
                        view.cancelPendingInputEvents();
                    }
                    else {
                        Log.w("LinkSpan", "Dropping click event. No listener attached.");
                    }
                    if (view instanceof TextView) {
                        final CharSequence text = ((TextView)view).getText();
                        if (text instanceof Spannable) {
                            Selection.setSelection((Spannable)text, 0);
                        }
                    }
                    return;
                }
            }
            final aehn aehn = (aehn)context;
            continue;
        }
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
