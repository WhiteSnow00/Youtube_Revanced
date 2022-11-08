import java.util.Collections;
import java.util.HashMap;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import java.util.Map;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftp extends acja
{
    public final gkv a;
    public final TextView b;
    private final Map c;
    
    public ftp(final Context context, final hmb hmb, final acqs c, final Map c2, final int n, final byte[] array, final byte[] array2) {
        final TextView b = (TextView)LayoutInflater.from(context).inflate(n, (ViewGroup)null, false);
        this.b = b;
        final gkv b2 = hmb.b(b);
        (this.a = b2).e(2131170082);
        if (c != null) {
            ((acqt)b2).c = c;
        }
        this.c = c2;
    }
    
    public ftp(final Context context, final hmb hmb, final uyi uyi, final acqs acqs, final Map map, final byte[] array, final byte[] array2) {
        int n;
        if (!uyi.aP()) {
            n = 2131624115;
        }
        else {
            n = 2131624845;
        }
        this(context, hmb, acqs, map, n, null, null);
    }
    
    public ftp(final Context context, final hmb hmb, final uyi uyi, final byte[] array, final byte[] array2) {
        this(context, hmb, uyi, null, null, null, null);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acir acir) {
        ((acqt)this.a).a(null, null, null);
    }
}
