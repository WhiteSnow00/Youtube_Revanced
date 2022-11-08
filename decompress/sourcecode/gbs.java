import android.text.TextUtils;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import com.google.android.libraries.quantum.snackbar.Snackbar;

// 
// Decompiled by Procyon v0.6.0
// 

final class gbs implements gaw
{
    private final Snackbar a;
    private final uyi b;
    private final zhb c;
    
    public gbs(final Snackbar a, final zhb c, final uyi b, final byte[] array) {
        this.c = c;
        this.b = b;
        (this.a = a).setOnClickListener((View$OnClickListener)null);
        a.setClickable(false);
        a.setOnTouchListener((View$OnTouchListener)new gmg(1));
    }
}
