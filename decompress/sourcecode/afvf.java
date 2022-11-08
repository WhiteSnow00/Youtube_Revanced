import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvf
{
    public final Class a;
    public ConcurrentMap b;
    public afvg c;
    public afzs d;
    
    public afvf(final Class a) {
        this.b = (ConcurrentMap)new ConcurrentHashMap();
        this.a = a;
        this.d = afzs.a;
    }
    
    public final void a(Object c, final agbm agbm, final boolean b) {
        final ConcurrentMap b2 = this.b;
        if (b2 == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        final int ab = aety.ab(agbm.c);
        if (ab == 0 || ab != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer value = agbm.d;
        agbu agbu;
        if ((agbu = agbu.a(agbm.e)) == null) {
            agbu = agbu.f;
        }
        if (agbu == agbu.d) {
            value = null;
        }
        final afyo a = afyo.a;
        agbj agbj;
        if ((agbj = agbm.b) == null) {
            agbj = agbj.a;
        }
        final String b3 = agbj.b;
        final agbj b4 = agbm.b;
        agbj a2;
        if (b4 == null) {
            a2 = agbj.a;
        }
        else {
            a2 = b4;
        }
        final agyc c2 = a2.c;
        agbj a3 = b4;
        if (b4 == null) {
            a3 = agbj.a;
        }
        agbi agbi;
        if ((agbi = agbi.a(a3.d)) == null) {
            agbi = agbi.f;
        }
        agbu agbu2;
        if ((agbu2 = agbu.a(agbm.e)) == null) {
            agbu2 = agbu.f;
        }
        if (agbu2 == agbu.d) {
            if (value != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        }
        else if (value == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        final afus a4 = a.a(new afyr(b3, c2, agbi, agbu2, value));
        agbu agbu3;
        if ((agbu3 = agbu.a(agbm.e)) == null) {
            agbu3 = agbu.f;
        }
        final int ordinal = agbu3.ordinal();
        byte[] array = null;
        Label_0370: {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        array = afuo.a;
                        break Label_0370;
                    }
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                array = ByteBuffer.allocate(5).put((byte)0).putInt(agbm.d).array();
            }
            else {
                array = ByteBuffer.allocate(5).put((byte)1).putInt(agbm.d).array();
            }
        }
        int ab2 = aety.ab(agbm.c);
        if (ab2 == 0) {
            ab2 = 1;
        }
        agbu agbu4;
        if ((agbu4 = agbu.a(agbm.e)) == null) {
            agbu4 = agbu.f;
        }
        c = new afvg(c, array, ab2, agbu4, agbm.d, a4);
        final ArrayList list = new ArrayList();
        list.add(c);
        final afvh afvh = new afvh(((afvg)c).a());
        final List list2 = (List)b2.put(afvh, Collections.unmodifiableList((List<?>)list));
        if (list2 != null) {
            final ArrayList list3 = new ArrayList();
            list3.addAll(list2);
            list3.add(c);
            b2.put(afvh, Collections.unmodifiableList((List<?>)list3));
        }
        if (!b) {
            return;
        }
        if (this.c == null) {
            this.c = (afvg)c;
            return;
        }
        throw new IllegalStateException("you cannot set two primary primitives");
    }
}
