import java.util.Collection;
import java.util.ArrayList;
import android.graphics.PointF;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxh
{
    public final List a;
    public PointF b;
    public boolean c;
    
    public cxh() {
        this.a = new ArrayList();
    }
    
    public cxh(final PointF b, final boolean c, final List list) {
        this.b = b;
        this.c = c;
        this.a = new ArrayList(list);
    }
    
    @Override
    public final String toString() {
        final int size = this.a.size();
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(size);
        sb.append("closed=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
