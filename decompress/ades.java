import android.view.View;
import android.view.inputmethod.InputMethodManager;

// 
// Decompiled by Procyon v0.6.0
// 

public class ades implements adeu
{
    private final bu a;
    
    protected ades(final bu a) {
        this.a = a;
    }
    
    private final void a() {
        final View currentFocus = this.a.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }
    
    public void b() {
        this.a();
        this.a.getSupportFragmentManager().I();
    }
    
    public void c(final anmz anmz) {
        this.a();
        this.a.getSupportFragmentManager().I();
    }
    
    public void f(final aqfw aqfw, final oup oup) {
        adds.w(this.a.getSupportFragmentManager(), (br)ader.a(aqfw, oup));
    }
    
    public void g(final aqfw aqfw, final oup oup, final anmz anmz) {
        final cl supportFragmentManager = this.a.getSupportFragmentManager();
        final ader a = ader.a(aqfw, oup);
        final anmz a2 = anmz.a;
        if (anmz.ordinal() != 2) {
            adds.w(supportFragmentManager, (br)a);
            return;
        }
        final ct i = supportFragmentManager.i();
        i.y(2130772101, 2130772032, 2130772031, 2130772104);
        i.A(2131428812, (br)a);
        i.t((String)null);
        i.a();
    }
}
