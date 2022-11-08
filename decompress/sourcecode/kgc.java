import java.util.Iterator;
import java.util.List;
import android.text.TextUtils;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgc extends acja
{
    private final Context a;
    private final aceo b;
    private final acng c;
    private final acio d;
    private final acih e;
    private final View f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final ViewGroup m;
    private final acqu n;
    
    public kgc(final Context a, final aceo b, final acng c, final aeby aeby, final zhb zhb, final giz d, final uyi uyi, final ViewGroup viewGroup, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (acio)d;
        this.e = aeby.V((acio)d);
        final View inflate = LayoutInflater.from(a).inflate(2131625093, viewGroup, false);
        this.f = inflate;
        if (uyi.aR()) {
            final View viewById = inflate.findViewById(2131432026);
            viewById.setClipToOutline(true);
            viewById.setBackgroundResource(2131231033);
        }
        this.g = (ImageView)inflate.findViewById(2131432006);
        this.h = (TextView)inflate.findViewById(2131432030);
        this.i = (TextView)inflate.findViewById(2131432010);
        this.j = (TextView)inflate.findViewById(2131432092);
        this.k = (TextView)inflate.findViewById(2131431819);
        this.l = (TextView)inflate.findViewById(2131429866);
        this.m = (ViewGroup)inflate.findViewById(2131427882);
        this.n = zhb.g((TextView)inflate.findViewById(2131430109));
        ((acio)d).c(inflate);
    }
    
    public final View a() {
        return ((giz)this.d).a;
    }
    
    public final void c(final acir acir) {
        this.e.c();
    }
}
