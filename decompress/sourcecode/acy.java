import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class acy extends acr
{
    public ArrayList aI;
    
    public acy() {
        this.aI = new ArrayList();
    }
    
    @Override
    public final void S(final cdn cdn) {
        super.S(cdn);
        for (int size = this.aI.size(), i = 0; i < size; ++i) {
            ((acr)this.aI.get(i)).S(cdn);
        }
    }
    
    public void T() {
        final ArrayList ai = this.aI;
        if (ai == null) {
            return;
        }
        for (int size = ai.size(), i = 0; i < size; ++i) {
            final acr acr = this.aI.get(i);
            if (acr instanceof acy) {
                ((acy)acr).T();
            }
        }
    }
    
    public final void Y(final acr acr) {
        this.aI.remove(acr);
        acr.s();
    }
    
    @Override
    public void s() {
        this.aI.clear();
        super.s();
    }
}
