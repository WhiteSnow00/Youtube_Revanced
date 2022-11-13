import java.io.IOException;
import java.util.Map;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmp implements lrn
{
    public static final agmp a;
    public static final agmp b;
    private final int c;
    
    static {
        b = new agmp(1);
        a = new agmp(0);
    }
    
    private agmp(final int c) {
        this.c = c;
    }
    
    public final Object a(Object o) {
        if (this.c != 0) {
            return ((agzk)o).toByteArray();
        }
        final agnj agnj = (agnj)o;
        final aujg a = ehi.a;
        o = new ByteArrayOutputStream();
        try {
            final agkj agkj = new agkj((OutputStream)o, (Map)a.b, (Map)a.a, (agkb)a.c);
            final agkb agkb = agkj.c.get(agnj.getClass());
            if (agkb != null) {
                agkb.a((Object)agnj, (Object)agkj);
                return ((ByteArrayOutputStream)o).toByteArray();
            }
            throw new agjz("No encoder for ".concat(String.valueOf(String.valueOf(agnj.getClass()))));
        }
        catch (final IOException ex) {
            return ((ByteArrayOutputStream)o).toByteArray();
        }
    }
}
