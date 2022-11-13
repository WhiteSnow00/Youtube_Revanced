import android.text.Editable;
import android.text.Spannable;
import android.text.SpanWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

final class htb implements SpanWatcher
{
    final hte a;
    
    public htb(final hte a) {
        this.a = a;
    }
    
    public final void onSpanAdded(final Spannable spannable, final Object o, final int n, final int n2) {
    }
    
    public final void onSpanChanged(final Spannable spannable, final Object o, int spanEnd, int selectionStart, int spanStart, int selectionEnd) {
        final hte a = this.a;
        if (a.l != null) {
            final Editable text = a.b.getText();
            spanStart = ((Spannable)text).getSpanStart((Object)this.a.l);
            spanEnd = ((Spannable)text).getSpanEnd((Object)this.a.l);
            selectionStart = this.a.b.getSelectionStart();
            selectionEnd = this.a.b.getSelectionEnd();
            if (selectionStart < spanStart || selectionEnd < spanStart || selectionStart > spanEnd || selectionEnd > spanEnd) {
                this.a.b();
            }
        }
    }
    
    public final void onSpanRemoved(final Spannable spannable, final Object o, final int n, final int n2) {
    }
}
