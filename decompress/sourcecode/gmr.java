import com.google.android.apps.youtube.app.player.controls.ReportVideoController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmr implements zku
{
    final /* synthetic */ agzi a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public gmr(final ReportVideoController b, final alcc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (agzi)a;
    }
    
    public gmr(final fve b, final aokb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (agzi)a;
    }
    
    public gmr(final gms b, final aioe a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (agzi)a;
    }
    
    public gmr(final hoa b, final alcc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (agzi)a;
    }
    
    public gmr(final jdw b, final aioe a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (agzi)a;
    }
    
    public final void a() {
    }
    
    public final void b() {
        final int c = this.c;
        if (c == 0) {
            ((gms)this.b).b((aioe)this.a);
            return;
        }
        if (c == 1) {
            ((fve)this.b).m((aokb)this.a, true);
            return;
        }
        if (c == 2) {
            ((hoa)this.b).br((alcc)this.a);
            return;
        }
        if (c != 3) {
            ((jdw)this.b).b((aioe)this.a);
            return;
        }
        ((ReportVideoController)this.b).j((alcc)this.a);
    }
    
    public final void c(final Exception ex) {
        final int c = this.c;
        if (c == 0) {
            ((gms)this.b).a.e((Throwable)ex);
            return;
        }
        if (c == 1) {
            ((fve)this.b).g.e((Throwable)ex);
            return;
        }
        if (c == 2) {
            ((hoa)this.b).aB.e((Throwable)ex);
            return;
        }
        if (c != 3) {
            ((jdw)this.b).a.e((Throwable)ex);
            return;
        }
        ((ReportVideoController)this.b).c.e((Throwable)ex);
    }
}
