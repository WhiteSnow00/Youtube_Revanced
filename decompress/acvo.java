import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acvo implements acsd
{
    public acfs a;
    public Object b;
    public hzf c;
    private final xab d;
    private final ovc e;
    private final acvn f;
    private final ouy g;
    private final atnb h;
    private final onm i;
    
    public acvo(final onm i, final ovc e, final vbs vbs, final xab d, final ouy g, final atnb h) {
        this.a = acfs.a;
        this.i = i;
        this.d = d;
        this.e = e;
        this.f = new acvn(e, vbs);
        this.g = g;
        this.h = h;
    }
    
    public acvo(final onm i, final xab d, final acfc acfc, final vbs vbs, final acfn acfn, final ouy g, final atnb h) {
        this.a = acfs.a;
        this.i = i;
        this.d = d;
        this.e = null;
        this.f = new acvn(vbs, acfc, acfn, this.a);
        this.g = g;
        this.h = h;
    }
    
    public final /* bridge */ acsc a(final RecyclerView recyclerView, final acmm acmm) {
        return (acsc)this.b(recyclerView, acmm);
    }
    
    public final acvt b(final RecyclerView recyclerView, final acmm acmm) {
        return new acvt(this.f, recyclerView, acmm, this.i, this.d, this.e, this.g, this.h, this.b, this.c, null, null, null);
    }
}
