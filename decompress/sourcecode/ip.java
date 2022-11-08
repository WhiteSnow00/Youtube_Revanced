import android.view.SubMenu;
import android.view.View;
import android.view.ActionProvider;

// 
// Decompiled by Procyon v0.6.0
// 

class ip extends akw
{
    final ActionProvider a;
    final /* synthetic */ iu b;
    
    public ip(final iu b, final ActionProvider a) {
        this.b = b;
        this.a = a;
    }
    
    public final View a() {
        return this.a.onCreateActionView();
    }
    
    public final void b(final SubMenu subMenu) {
        this.a.onPrepareSubMenu(((id)this.b).b(subMenu));
    }
    
    public final boolean c() {
        return this.a.hasSubMenu();
    }
    
    public final boolean d() {
        return this.a.onPerformDefaultAction();
    }
}
