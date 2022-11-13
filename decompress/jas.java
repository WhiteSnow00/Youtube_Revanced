import java.util.List;
import android.view.ViewGroup$LayoutParams;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jas extends abtz implements fqk
{
    public final arkg a;
    public final acbm b;
    public final int c;
    public jar d;
    public ajmo e;
    public ViewGroup f;
    public ViewGroup g;
    public View h;
    public int i;
    public int j;
    public ahns k;
    public acbj l;
    private final vcy m;
    private fkr n;
    
    public jas(final Context context, final arkg a, final acbm b, final vcy m, final int c) {
        super(context);
        b.getClass();
        this.b = b;
        m.getClass();
        this.m = m;
        a.getClass();
        this.a = a;
        this.c = c;
        this.e();
    }
    
    private final Map g() {
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        return hashMap;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void e() {
        this.l = null;
        final ViewGroup f = this.f;
        if (f != null) {
            f.removeAllViews();
            this.g.removeAllViews();
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.f = null;
            this.g = null;
            this.h = null;
        }
        if (this.e != null) {
            this.b.c((acku)null);
            this.e = null;
        }
        this.i = 0;
        this.j = 0;
        this.k = null;
    }
    
    public final void f() {
        final fkr n = this.n;
        if (n != null) {
            final ahns k = this.k;
            if (k != null) {
                if (n.n()) {
                    this.m.d((List)k.d, this.g());
                    return;
                }
                if (n.c()) {
                    this.m.d((List)k.b, this.g());
                    return;
                }
                this.m.d((List)k.c, this.g());
            }
        }
    }
    
    public final void k(final fkr n) {
        final fkr n2 = this.n;
        if (n2 != null && n == n2) {
            return;
        }
        this.n = n;
        this.f();
    }
    
    public final boolean ow(final fkr fkr) {
        return ezt.d(fkr);
    }
}
