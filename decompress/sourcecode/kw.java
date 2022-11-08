import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kw
{
    public static TextClassifier a(final TextView textView) {
        final TextClassificationManager textClassificationManager = (TextClassificationManager)textView.getContext().getSystemService((Class)TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
    
    public static boolean b(final int n) {
        return (n & 0x8000) != 0x0;
    }
    
    public static boolean c(final int n) {
        return n == 15 || n == 255 || n == 0;
    }
    
    public static boolean d(final int n) {
        return (n & 0xFF) == 0xFF;
    }
    
    public static int e(final aucj aucj, final blt blt) {
        int n;
        if (blt != null) {
            n = 15;
        }
        else {
            n = 255;
        }
        if (aucj.a) {
            return 0x8000 | n;
        }
        return n;
    }
}
