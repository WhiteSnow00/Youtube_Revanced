import android.content.ClipData$Item;
import android.content.Context;
import android.content.ClipData;
import android.text.Spannable;
import android.text.Selection;
import android.text.Spanned;
import android.text.Editable;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apy implements aly
{
    public final alf a(final View view, final alf alf) {
        if (alf.a() == 2) {
            return alf;
        }
        final ClipData b = alf.b();
        final int a = alf.a.a();
        final TextView textView = (TextView)view;
        final Editable editable = (Editable)textView.getText();
        final Context context = textView.getContext();
        int i = 0;
        int n = 0;
        while (i < b.getItemCount()) {
            final ClipData$Item item = b.getItemAt(i);
            CharSequence charSequence2;
            if ((a & 0x1) != 0x0) {
                final CharSequence charSequence = charSequence2 = item.coerceToText(context);
                if (charSequence instanceof Spanned) {
                    charSequence2 = charSequence.toString();
                }
            }
            else {
                charSequence2 = item.coerceToStyledText(context);
            }
            int n2 = n;
            if (charSequence2 != null) {
                if (n == 0) {
                    final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                    final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                    final int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    final int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection((Spannable)editable, max2);
                    editable.replace(max, max2, charSequence2);
                }
                else {
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), (CharSequence)"\n");
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), charSequence2);
                }
                n2 = 1;
            }
            ++i;
            n = n2;
        }
        return null;
    }
}
