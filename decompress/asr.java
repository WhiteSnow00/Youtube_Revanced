import android.os.Build$VERSION;
import android.text.Spannable;
import android.text.Editable;
import java.util.concurrent.atomic.AtomicInteger;
import android.text.SpanWatcher;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

final class asr implements TextWatcher, SpanWatcher
{
    final Object a;
    public final AtomicInteger b;
    
    public asr(final Object a) {
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
        if (this.b.get() > 0 && o instanceof asq) {
            return;
        }
        ((SpanWatcher)this.a).onSpanAdded(spannable, o, n, n2);
    }
    
    public final void onSpanChanged(final Spannable spannable, final Object o, int n, final int n2, final int n3, final int n4) {
        if (this.b.get() > 0 && o instanceof asq) {
            return;
        }
        int n5 = n;
        Label_0067: {
            if (Build$VERSION.SDK_INT < 28) {
                int n6;
                if ((n6 = n) > n2) {
                    n6 = 0;
                }
                n5 = n6;
                if (n3 > n4) {
                    n = 0;
                    n5 = n6;
                    break Label_0067;
                }
            }
            n = n3;
        }
        ((SpanWatcher)this.a).onSpanChanged(spannable, o, n5, n2, n, n4);
    }
    
    public final void onSpanRemoved(final Spannable spannable, final Object o, final int n, final int n2) {
        if (this.b.get() > 0 && o instanceof asq) {
            return;
        }
        ((SpanWatcher)this.a).onSpanRemoved(spannable, o, n, n2);
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        ((TextWatcher)this.a).onTextChanged(charSequence, n, n2, n3);
    }
}
