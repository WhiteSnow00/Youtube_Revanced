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

public final class asc extends InputConnectionWrapper
{
    private final TextView a;
    
    public asc(final TextView a, final InputConnection inputConnection, final EditorInfo editorInfo) {
        int int1 = 0;
        super(inputConnection, false);
        this.a = a;
        final ars b = ars.b();
        if (b.e()) {
            if (editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                final arn e = b.e;
                final Bundle extras = editorInfo.extras;
                final arm arm = (arm)e;
                final chr chr = (chr)arm.b.a;
                final int a2 = chr.a(4);
                if (a2 != 0) {
                    int1 = ((ByteBuffer)chr.b).getInt(a2 + chr.a);
                }
                extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", int1);
                editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", arm.c.g);
            }
        }
    }
    
    private final Editable a() {
        return this.a.getEditableText();
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        return aucj.p((InputConnection)this, this.a(), n, n2, false) || super.deleteSurroundingText(n, n2);
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        return aucj.p((InputConnection)this, this.a(), n, n2, true) || super.deleteSurroundingTextInCodePoints(n, n2);
    }
}
