import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frd implements od
{
    public final ArrayList a;
    
    public frd() {
        this.a = new ArrayList(2);
    }
    
    public final void a(final on on) {
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((od)a.get(i)).a(on);
        }
    }
}
