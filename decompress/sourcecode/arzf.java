import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzf
{
    private ArrayList a;
    private volatile arrx b;
    
    public arzf() {
        this.a = new ArrayList();
        this.b = arrx.d;
    }
    
    public final void a(final arrx b) {
        b.getClass();
        if (this.b != b && this.b != arrx.e) {
            this.b = b;
            if (this.a.isEmpty()) {
                return;
            }
            final ArrayList a = this.a;
            this.a = new ArrayList();
            if (a.size() > 0) {
                final arxj arxj = (arxj)a.get(0);
                throw null;
            }
        }
    }
}
