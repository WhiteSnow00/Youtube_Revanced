import android.view.View;
import android.view.inputmethod.InputMethodManager;

// 
// Decompiled by Procyon v0.6.0
// 

public class adcq implements adcs
{
    private final bu a;
    
    protected adcq(final bu a) {
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
    
    public void c(final ankw ankw) {
        this.a();
        this.a.getSupportFragmentManager().I();
    }
    
    public void f(final aqdk aqdk, final otg otg) {
        adio.Y(this.a.getSupportFragmentManager(), (br)adcp.a(aqdk, otg));
    }
    
    public void g(final aqdk aqdk, final otg otg, final ankw ankw) {
        final cl supportFragmentManager = this.a.getSupportFragmentManager();
        final adcp a = adcp.a(aqdk, otg);
        final ankw a2 = ankw.a;
        if (ankw.ordinal() != 2) {
            adio.Y(supportFragmentManager, (br)a);
            return;
        }
        final ct i = supportFragmentManager.i();
        i.y(2130772101, 2130772032, 2130772031, 2130772104);
        i.A(2131428812, (br)a);
        i.t((String)null);
        i.a();
    }
}
