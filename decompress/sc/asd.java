import android.text.Editable;
import java.nio.ByteBuffer;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.view.inputmethod.InputConnectionWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asd extends InputConnectionWrapper
{
    private final TextView a;
    
    public asd(final TextView a, final InputConnection inputConnection, final EditorInfo editorInfo) {
        int int1 = 0;
        super(inputConnection, false);
        this.a = a;
        final art b = art.b();
        if (b.e()) {
            if (editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                final aro e = b.e;
                final Bundle extras = editorInfo.extras;
                final arn arn = (arn)e;
                final chs chs = (chs)arn.b.a;
                final int a2 = chs.a(4);
                if (a2 != 0) {
                    int1 = ((ByteBuffer)chs.b).getInt(a2 + chs.a);
                }
                extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", int1);
                editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", arn.c.g);
            }
        }
    }
    
    private final Editable a() {
        return this.a.getEditableText();
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        return auda.p((InputConnection)this, this.a(), n, n2, false) || super.deleteSurroundingText(n, n2);
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        return auda.p((InputConnection)this, this.a(), n, n2, true) || super.deleteSurroundingTextInCodePoints(n, n2);
    }
}
