import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jin implements acik
{
    public akac a;
    public jki b;
    public athj c;
    
    public final void a(final acij acij, final achk achk, final int n) {
        acij.f("REFINEMENT_POSITION", (Object)n);
        final HashMap hashMap = new HashMap();
        final akac a = this.a;
        if (a != null) {
            hashMap.put("HORIZONTAL_CARD_LIST", a);
            acij.f("HORIZONTAL_CARD_LIST", (Object)this.a);
        }
        acij.g((Map)hashMap);
        acij.f("REFINEMENT_SELECTION_CONTROLLER", (Object)this.c);
        acij.f("REFINEMENT_SELECTION_LISTENER", (Object)this.b);
    }
}
