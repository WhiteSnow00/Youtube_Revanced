import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class ada extends act
{
    public ArrayList aI;
    
    public ada() {
        this.aI = new ArrayList();
    }
    
    public final void S(final cdr cdr) {
        super.S(cdr);
        for (int size = this.aI.size(), i = 0; i < size; ++i) {
            ((act)this.aI.get(i)).S(cdr);
        }
    }
    
    public void T() {
        final ArrayList ai = this.aI;
        if (ai == null) {
            return;
        }
        for (int size = ai.size(), i = 0; i < size; ++i) {
            final act act = this.aI.get(i);
            if (act instanceof ada) {
                ((ada)act).T();
            }
        }
    }
    
    public final void Y(final act act) {
        this.aI.remove(act);
        act.s();
    }
    
    public void s() {
        this.aI.clear();
        super.s();
    }
}
