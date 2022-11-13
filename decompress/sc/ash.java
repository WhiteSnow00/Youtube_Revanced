import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ash extends apq
{
    public final asf a;
    private final TextView b;
    
    public ash(final TextView b) {
        this.b = b;
        this.a = new asf(b);
    }
    
    public final void b() {
        Object transformationMethod = this.b.getTransformationMethod();
        if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
            final TextView b = this.b;
            if (!(transformationMethod instanceof ask)) {
                transformationMethod = new ask((TransformationMethod)transformationMethod);
            }
            b.setTransformationMethod((TransformationMethod)transformationMethod);
        }
    }
}
