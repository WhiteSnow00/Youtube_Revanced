import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

final class agdk implements afza
{
    public static final byte[] a;
    
    static {
        Logger.getLogger(agdk.class.getName());
        a = new byte[] { 0 };
    }
    
    public agdk() {
    }
    
    @Override
    public final Class a() {
        return afyw.class;
    }
    
    @Override
    public final Class b() {
        return afyw.class;
    }
    
    @Override
    public final /* bridge */ Object c(final ahei ahei) {
        final Iterator iterator = ahei.a().iterator();
        while (iterator.hasNext()) {
            for (final afyy afyy : (List)iterator.next()) {
                final afyl d = afyy.d;
                if (d instanceof agdi) {
                    final agdi agdi = (agdi)d;
                    final agij a = agij.a(afyy.a());
                    if (a.equals((Object)agdi.b())) {
                        continue;
                    }
                    final String string = agdi.c().toString();
                    final String string2 = agdi.b().toString();
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
        return new agdj(ahei, null, null);
    }
}
