import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View$OnClickListener;
import android.widget.EditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aecl extends aecf
{
    public EditText a;
    private int b;
    private final View$OnClickListener c;
    
    public aecl(final aece aece, final int b) {
        super(aece);
        this.b = 2131231274;
        this.c = (View$OnClickListener)new acvy(this, 15);
        if (b != 0) {
            this.b = b;
        }
    }
    
    public final int a() {
        return 2132019093;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final View$OnClickListener c() {
        return this.c;
    }
    
    public final void g(final EditText a) {
        this.a = a;
        this.x();
    }
    
    public final void i() {
        final EditText a = this.a;
        if (a != null && (a.getInputType() == 16 || a.getInputType() == 128 || a.getInputType() == 144 || a.getInputType() == 224)) {
            this.a.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        }
    }
    
    public final void j() {
        final EditText a = this.a;
        if (a != null) {
            a.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        }
    }
    
    public final boolean k() {
        final EditText a = this.a;
        return a != null && a.getTransformationMethod() instanceof PasswordTransformationMethod;
    }
    
    public final boolean s() {
        return true;
    }
    
    public final boolean t() {
        return !this.k();
    }
    
    public final void y() {
        this.x();
    }
}
