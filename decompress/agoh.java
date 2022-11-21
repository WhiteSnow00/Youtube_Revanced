import java.io.IOException;
import java.util.Map;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoh implements lsb
{
    public static final agoh a;
    public static final agoh b;
    private final int c;
    
    static {
        b = new agoh(1);
        a = new agoh(0);
    }
    
    private agoh(final int c) {
        this.c = c;
    }
    
    public final Object a(Object o) {
        if (this.c != 0) {
            return ((ahbc)o).toByteArray();
        }
        final agpb agpb = (agpb)o;
        final aapu a = ehl.a;
        o = new ByteArrayOutputStream();
        try {
            final agma agma = new agma((OutputStream)o, (Map)a.c, (Map)a.a, (agls)a.b);
            final agls agls = agma.c.get(agpb.getClass());
            if (agls != null) {
                agls.a((Object)agpb, (Object)agma);
                return ((ByteArrayOutputStream)o).toByteArray();
            }
            throw new aglq("No encoder for ".concat(String.valueOf(String.valueOf(agpb.getClass()))));
        }
        catch (final IOException ex) {
            return ((ByteArrayOutputStream)o).toByteArray();
        }
    }
}
