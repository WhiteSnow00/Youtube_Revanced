import android.text.Editable;
import android.text.Spannable;
import android.text.Selection;
import java.lang.ref.WeakReference;
import android.widget.EditText;
import java.lang.ref.Reference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asi extends apl
{
    private final Reference a;
    
    public asi(final EditText editText) {
        this.a = new WeakReference(editText);
    }
    
    public final void c() {
        final EditText editText = this.a.get();
        if (editText != null && editText.isAttachedToWindow()) {
            final Editable editableText = editText.getEditableText();
            final int selectionStart = Selection.getSelectionStart((CharSequence)editableText);
            final int selectionEnd = Selection.getSelectionEnd((CharSequence)editableText);
            art.b().c((CharSequence)editableText);
            asf.a((Spannable)editableText, selectionStart, selectionEnd);
        }
    }
}
