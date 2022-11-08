import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class foq extends abbx implements ariy
{
    private arit a;
    private boolean b;
    
    public foq(final abcb abcb, final Context context, final AttributeSet set) {
        super(abcb, context, set);
        if (!this.b) {
            this.b = true;
            ((fpi)this.aR()).g((foz)this);
        }
    }
    
    public final arit a() {
        if (this.a == null) {
            this.a = new arit((View)this, false);
        }
        return this.a;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
}
