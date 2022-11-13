import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class acz extends acs
{
    public ArrayList aI;
    
    public acz() {
        this.aI = new ArrayList();
    }
    
    public final void S(final cdo cdo) {
        super.S(cdo);
        for (int size = this.aI.size(), i = 0; i < size; ++i) {
            ((acs)this.aI.get(i)).S(cdo);
        }
    }
    
    public void T() {
        final ArrayList ai = this.aI;
        if (ai == null) {
            return;
        }
        for (int size = ai.size(), i = 0; i < size; ++i) {
            final acs acs = this.aI.get(i);
            if (acs instanceof acz) {
                ((acz)acs).T();
            }
        }
    }
    
    public final void Y(final acs acs) {
        this.aI.remove(acs);
        acs.s();
    }
    
    public void s() {
        this.aI.clear();
        super.s();
    }
}
