import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdv extends acja
{
    private final Context a;
    private final View b;
    private final aceo c;
    private final acnj d;
    private final ImageView e;
    private final acng f;
    private final acih g;
    private final acio h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final ViewGroup p;
    private final ViewGroup q;
    private final View r;
    private final View s;
    
    public kdv(final Context a, final aceo c, final acng f, final aeby aeby, final acnj d, final giz h, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        f.getClass();
        this.f = f;
        d.getClass();
        this.d = d;
        h.getClass();
        this.h = (acio)h;
        this.g = aeby.V((acio)h);
        final View inflate = LayoutInflater.from(a).inflate(2131624256, (ViewGroup)null);
        this.s = inflate;
        this.b = inflate.findViewById(2131432026);
        this.e = (ImageView)inflate.findViewById(2131432006);
        this.k = (TextView)inflate.findViewById(2131432030);
        this.l = (TextView)inflate.findViewById(2131432010);
        this.r = inflate.findViewById(2131428448);
        this.n = (TextView)inflate.findViewById(2131432092);
        this.q = (ViewGroup)inflate.findViewById(2131432158);
        this.m = (TextView)inflate.findViewById(2131431819);
        this.o = (TextView)inflate.findViewById(2131432148);
        this.j = (TextView)inflate.findViewById(2131428624);
        this.i = (TextView)inflate.findViewById(2131427849);
        this.p = (ViewGroup)inflate.findViewById(2131427882);
        ((acio)h).c(inflate);
    }
    
    private static CharSequence f(final List list) {
        if (list.isEmpty()) {
            return null;
        }
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(abyh.b((ajsq)iterator.next()));
        }
        return TextUtils.join((CharSequence)System.getProperty("line.separator"), (Iterable)list2);
    }
    
    public final View a() {
        return ((giz)this.h).a;
    }
    
    public final void c(final acir acir) {
        this.g.c();
    }
}
