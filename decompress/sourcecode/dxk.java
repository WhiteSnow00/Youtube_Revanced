import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxk extends dxf
{
    public final ArrayList a;
    
    public dxk(final List list) {
        this.a = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final dxf dxf = list.get(i);
            if (dxf instanceof dwz) {
                final ArrayList a = ((dwz)dxf).a();
                if (a.size() > 1) {
                    this.a.add(new dxk(a));
                }
                else {
                    this.a.add(a.get(0));
                }
            }
            else {
                if (dxf == null) {
                    throw new IllegalStateException("Null element is not allowed in transition set");
                }
                this.a.add(dxf);
            }
        }
    }
}
