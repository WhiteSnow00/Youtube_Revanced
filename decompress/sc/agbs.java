import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

final class agbs implements afxj
{
    public static final byte[] a;
    
    static {
        Logger.getLogger(agbs.class.getName());
        a = new byte[] { 0 };
    }
    
    public agbs() {
    }
    
    public final Class a() {
        return afxf.class;
    }
    
    public final Class b() {
        return afxf.class;
    }
    
    public final /* bridge */ Object c(final ahcq ahcq) {
        final Iterator iterator = ahcq.a().iterator();
        while (iterator.hasNext()) {
            for (final afxh afxh : (List)iterator.next()) {
                final afwu d = afxh.d;
                if (d instanceof agbq) {
                    final agbq agbq = (agbq)d;
                    final aggr a = aggr.a(afxh.a());
                    if (a.equals((Object)agbq.b())) {
                        continue;
                    }
                    final String string = agbq.c().toString();
                    final String string2 = agbq.b().toString();
                    final String string3 = a.toString();
                    final StringBuilder sb = new StringBuilder("Mac Key with parameters ");
                    sb.append(string);
                    sb.append(" has wrong output prefix (");
                    sb.append(string2);
                    sb.append(") instead of (");
                    sb.append(string3);
                    sb.append(")");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
        }
        return new agbr(ahcq, null, null);
    }
}
