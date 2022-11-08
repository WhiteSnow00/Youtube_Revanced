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

public final class izu extends abry implements fqb
{
    public final arhr a;
    public final abzk b;
    public final int c;
    public izt d;
    public ajkj e;
    public ViewGroup f;
    public ViewGroup g;
    public View h;
    public int i;
    public int j;
    public ahlu k;
    public abzh l;
    private final vax m;
    private fkk n;
    
    public izu(final Context context, final arhr a, final abzk b, final vax m, final int c) {
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
            this.b.c((acir)null);
            this.e = null;
        }
        this.i = 0;
        this.j = 0;
        this.k = null;
    }
    
    public final void f() {
        final fkk n = this.n;
        if (n != null) {
            final ahlu k = this.k;
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
    
    public final void j(final fkk n) {
        final fkk n2 = this.n;
        if (n2 != null && n == n2) {
            return;
        }
        this.n = n;
        this.f();
    }
    
    public final boolean ow(final fkk fkk) {
        return ezp.d(fkk);
    }
}
