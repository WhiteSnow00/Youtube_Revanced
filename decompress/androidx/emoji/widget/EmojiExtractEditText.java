// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji.widget;

import android.view.View;
import android.text.method.KeyListener;
import android.widget.TextView;
import android.view.ActionMode$Callback;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.inputmethodservice.ExtractEditText;

public class EmojiExtractEditText extends ExtractEditText
{
    private boolean a;
    private avv b;
    
    public EmojiExtractEditText(final Context context) {
        super(context);
        this.a(null, 0, 0);
    }
    
    public EmojiExtractEditText(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(set, 16842862, 0);
    }
    
    public EmojiExtractEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(set, n, 0);
    }
    
    public EmojiExtractEditText(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a(set, n, n2);
    }
    
    private final void a(final AttributeSet set, final int n, final int n2) {
        if (!this.a) {
            this.a = true;
            int integer = 0;
            if (set != null) {
                final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(set, arn.a, n, n2);
                integer = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
                obtainStyledAttributes.recycle();
            }
            final avv b = this.b();
            afc.i(integer, "maxEmojiCount should be greater than 0");
            ((asl)((kh)b.a).a).a = integer;
            this.setKeyListener(super.getKeyListener());
        }
    }
    
    private final avv b() {
        if (this.b == null) {
            this.b = new avv((EditText)this, (byte[])null);
        }
        return this.b;
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        return this.b().d(super.onCreateInputConnection(editorInfo), editorInfo);
    }
    
    public final void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(apj.c((TextView)this, actionMode$Callback));
    }
    
    public final void setKeyListener(final KeyListener keyListener) {
        KeyListener e = keyListener;
        if (keyListener != null) {
            this.b();
            e = avv.e(keyListener);
        }
        super.setKeyListener(e);
    }
}
