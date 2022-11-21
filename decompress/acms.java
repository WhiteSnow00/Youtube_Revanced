import android.view.View$OnClickListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acms implements acme
{
    public View a;
    private View$OnClickListener b;
    private boolean c;
    
    public acms() {
    }
    
    public acms(final View a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final View a() {
        return this.a;
    }
    
    @Override
    public final void b(final boolean b) {
        this.c = b;
        final View a = this.a;
        if (a != null) {
            a.setClickable(b);
        }
    }
    
    @Override
    public final void c(final View a) {
        a.getClass();
        this.a = a;
        final View$OnClickListener b = this.b;
        if (b != null) {
            a.setOnClickListener(b);
        }
        this.a.setClickable(this.c);
    }
    
    @Override
    public final void d(final View$OnClickListener view$OnClickListener) {
        this.b = view$OnClickListener;
        final View a = this.a;
        if (a != null) {
            a.setOnClickListener(view$OnClickListener);
        }
    }
    
    @Override
    public final void e(final aclz aclz) {
        this.a.getClass();
    }
}
