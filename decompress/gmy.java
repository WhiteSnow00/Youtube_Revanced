import com.google.android.apps.youtube.app.player.controls.ReportVideoController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmy implements zmr
{
    final ahbh a;
    final Object b;
    private final int c;
    
    public gmy(final ReportVideoController b, final alef a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (ahbh)a;
    }
    
    public gmy(final fvn b, final aome a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (ahbh)a;
    }
    
    public gmy(final gmz b, final aiqj a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (ahbh)a;
    }
    
    public gmy(final how b, final alef a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (ahbh)a;
    }
    
    public gmy(final jew b, final aiqj a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (ahbh)a;
    }
    
    public final void a() {
    }
    
    public final void b() {
        final int c = this.c;
        if (c == 0) {
            ((gmz)this.b).b((aiqj)this.a);
            return;
        }
        if (c == 1) {
            ((fvn)this.b).m((aome)this.a, true);
            return;
        }
        if (c == 2) {
            ((how)this.b).br((alef)this.a);
            return;
        }
        if (c != 3) {
            ((jew)this.b).b((aiqj)this.a);
            return;
        }
        ((ReportVideoController)this.b).j((alef)this.a);
    }
    
    public final void c(final Exception ex) {
        final int c = this.c;
        if (c == 0) {
            ((gmz)this.b).a.e((Throwable)ex);
            return;
        }
        if (c == 1) {
            ((fvn)this.b).g.e((Throwable)ex);
            return;
        }
        if (c == 2) {
            ((how)this.b).az.e((Throwable)ex);
            return;
        }
        if (c != 3) {
            ((jew)this.b).a.e((Throwable)ex);
            return;
        }
        ((ReportVideoController)this.b).c.e((Throwable)ex);
    }
}
