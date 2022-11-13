import android.text.style.UnderlineSpan;
import java.util.Iterator;
import android.text.Editable;
import java.util.HashMap;
import java.util.Map;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

final class hta implements TextWatcher
{
    final hte a;
    private final Map b;
    
    public hta(final hte a) {
        this.a = a;
        this.b = new HashMap();
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, int spanEnd) {
        for (final htd htd : this.a.j) {
            final UnderlineSpan c = htd.c;
            final int spanStart = this.a.b.getText().getSpanStart((Object)c);
            spanEnd = this.a.b.getText().getSpanEnd((Object)c);
            if (n + n2 >= spanStart && n < spanEnd && !this.b.containsKey(c)) {
                this.b.put(c, new fzw(this.a.b.getText().toString().substring(spanStart, spanEnd), htd));
            }
        }
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, int spanStart, int spanEnd) {
        while (this.b.entrySet().iterator().hasNext()) {
            final Map.Entry<UnderlineSpan, V> entry = this.b.entrySet().iterator().next();
            final UnderlineSpan underlineSpan = entry.getKey();
            final fzw fzw = (fzw)entry.getValue();
            this.b.remove(underlineSpan);
            spanStart = this.a.b.getText().getSpanStart((Object)underlineSpan);
            spanEnd = this.a.b.getText().getSpanEnd((Object)underlineSpan);
            if (this.a.b.getText().toString().isEmpty()) {
                this.a.j.clear();
                this.a.o = 0;
            }
            else {
                if (spanStart < 0 || spanEnd < 0 || this.a.b.getText().toString().substring(spanStart, spanEnd).equals(fzw.b)) {
                    continue;
                }
                this.a.j.remove(fzw.a);
                this.a.b.getText().removeSpan((Object)underlineSpan);
                final hte a = this.a;
                --a.o;
                if (n == spanStart) {
                    continue;
                }
                a.b.getText().replace(spanStart, spanStart + 1, (CharSequence)"");
            }
        }
    }
}
