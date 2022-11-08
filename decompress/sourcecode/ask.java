import android.text.Spannable;
import android.text.Editable;
import java.util.concurrent.atomic.AtomicInteger;
import android.text.SpanWatcher;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

final class ask implements TextWatcher, SpanWatcher
{
    final Object a;
    public final AtomicInteger b;
    
    public ask(final Object a) {
        this.b = new AtomicInteger(0);
        this.a = a;
    }
    
    public final void afterTextChanged(final Editable editable) {
        ((TextWatcher)this.a).afterTextChanged(editable);
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        ((TextWatcher)this.a).beforeTextChanged(charSequence, n, n2, n3);
    }
    
    public final void onSpanAdded(final Spannable spannable, final Object o, final int n, final int n2) {
        if (this.b.get() > 0 && o instanceof arw) {
            return;
        }
        ((SpanWatcher)this.a).onSpanAdded(spannable, o, n, n2);
    }
    
    public final void onSpanChanged(final Spannable spannable, final Object o, final int n, final int n2, final int n3, final int n4) {
        if (this.b.get() > 0 && o instanceof arw) {
            return;
        }
        ((SpanWatcher)this.a).onSpanChanged(spannable, o, n, n2, n3, n4);
    }
    
    public final void onSpanRemoved(final Spannable spannable, final Object o, final int n, final int n2) {
        if (this.b.get() > 0 && o instanceof arw) {
            return;
        }
        ((SpanWatcher)this.a).onSpanRemoved(spannable, o, n, n2);
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        ((TextWatcher)this.a).onTextChanged(charSequence, n, n2, n3);
    }
}
