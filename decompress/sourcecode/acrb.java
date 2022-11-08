import java.util.Iterator;
import android.text.style.ImageSpan;
import android.text.Editable;
import java.util.concurrent.CopyOnWriteArrayList;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

final class acrb implements TextWatcher
{
    final /* synthetic */ acrc a;
    final /* synthetic */ acrc b;
    private final CopyOnWriteArrayList c;
    
    public acrb(final acrc b, final acrc a) {
        this.b = b;
        this.a = a;
        this.c = new CopyOnWriteArrayList();
    }
    
    public final void afterTextChanged(Editable editableText) {
        final acrc b = this.b;
        if (b.i) {
            return;
        }
        b.i = true;
        editableText = this.a.f.getEditableText();
        for (final ImageSpan imageSpan : this.c) {
            final int spanStart = editableText.getSpanStart((Object)imageSpan);
            final int spanEnd = editableText.getSpanEnd((Object)imageSpan);
            editableText.removeSpan((Object)imageSpan);
            if (spanStart != spanEnd) {
                editableText.delete(spanStart, spanEnd);
            }
        }
        this.c.clear();
        this.b.e(editableText);
        this.b.i = false;
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, int i, int length) {
        if (this.b.i) {
            return;
        }
        if (i > 0) {
            final int n2 = i + n;
            final Editable editableText = this.a.f.getEditableText();
            final ImageSpan[] array = (ImageSpan[])editableText.getSpans(n, n2, (Class)ImageSpan.class);
            ImageSpan imageSpan;
            int spanStart;
            int spanEnd;
            for (length = array.length, i = 0; i < length; ++i) {
                imageSpan = array[i];
                spanStart = editableText.getSpanStart((Object)imageSpan);
                spanEnd = editableText.getSpanEnd((Object)imageSpan);
                if (spanStart < n2 && spanEnd > n) {
                    this.c.add(imageSpan);
                }
            }
        }
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
