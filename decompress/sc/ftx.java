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

public final class ftx extends acld
{
    public final gld a;
    public final TextView b;
    private final Map c;
    
    public ftx(final Context context, final hmw hmw, final acsw c, final Map c2, final int n, final byte[] array, final byte[] array2) {
        final TextView b = (TextView)LayoutInflater.from(context).inflate(n, (ViewGroup)null, false);
        this.b = b;
        final gld b2 = hmw.b(b);
        (this.a = b2).e(2131170083);
        if (c != null) {
            ((acsx)b2).c = c;
        }
        this.c = c2;
    }
    
    public ftx(final Context context, final hmw hmw, final vai vai, final acsw acsw, final Map map, final byte[] array, final byte[] array2) {
        int n;
        if (!vai.aP()) {
            n = 2131624114;
        }
        else {
            n = 2131624846;
        }
        this(context, hmw, acsw, map, n, null, null);
    }
    
    public ftx(final Context context, final hmw hmw, final vai vai, final byte[] array, final byte[] array2) {
        this(context, hmw, vai, null, null, null, null);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acku acku) {
        ((acsx)this.a).a(null, null, null);
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aicz)o).w.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aicz aicz = (aicz)o;
        final HashMap hashMap = new HashMap();
        Map<Object, Object> map;
        if ((map = this.c) == null) {
            map = Collections.emptyMap();
        }
        hashMap.putAll(map);
        hashMap.putAll(ackm.e());
        ((acsx)this.a).a(aicz, ((wyy)ackm).a, hashMap);
    }
}
