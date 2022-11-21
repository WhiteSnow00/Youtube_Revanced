import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asj extends apo
{
    public final ash a;
    private final TextView b;
    
    public asj(final TextView b) {
        this.b = b;
        this.a = new ash(b);
    }
    
    @Override
    public final void b() {
        Object transformationMethod = this.b.getTransformationMethod();
        if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
            final TextView b = this.b;
            if (!(transformationMethod instanceof asm)) {
                transformationMethod = new asm((TransformationMethod)transformationMethod);
            }
            b.setTransformationMethod((TransformationMethod)transformationMethod);
        }
    }
}
