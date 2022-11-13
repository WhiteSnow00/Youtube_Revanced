import android.text.Spannable;
import android.text.Selection;
import java.lang.ref.WeakReference;
import android.widget.TextView;
import java.lang.ref.Reference;

// 
// Decompiled by Procyon v0.6.0
// 

final class ase extends apl
{
    private final Reference a;
    
    public ase(final TextView textView) {
        this.a = new WeakReference(textView);
    }
    
    public final void c() {
        final TextView textView = this.a.get();
        if (textView != null && textView.isAttachedToWindow()) {
            final CharSequence c = art.b().c(textView.getText());
            final int selectionStart = Selection.getSelectionStart(c);
            final int selectionEnd = Selection.getSelectionEnd(c);
            textView.setText(c);
            if (c instanceof Spannable) {
                asf.a((Spannable)c, selectionStart, selectionEnd);
            }
        }
    }
}
