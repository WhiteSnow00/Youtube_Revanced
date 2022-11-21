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

public final class afyx
{
    public final Class a;
    public ConcurrentMap b;
    public afyy c;
    public agdl d;
    
    public afyx(final Class a) {
        this.b = (ConcurrentMap)new ConcurrentHashMap();
        this.a = a;
        this.d = agdl.a;
    }
    
    public final void a(Object c, final agff agff, final boolean b) {
        final ConcurrentMap b2 = this.b;
        if (b2 == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        final int t = aexq.T(agff.c);
        if (t == 0 || t != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer value = agff.d;
        agfn agfn;
        if ((agfn = agfn.a(agff.e)) == null) {
            agfn = agfn.f;
        }
        if (agfn == agfn.d) {
            value = null;
        }
        final agch a = agch.a;
        agfc agfc;
        if ((agfc = agff.b) == null) {
            agfc = agfc.a;
        }
        final String b3 = agfc.b;
        final agfc b4 = agff.b;
        agfc a2;
        if (b4 == null) {
            a2 = agfc.a;
        }
        else {
            a2 = b4;
        }
        final ahbt c2 = a2.c;
        agfc a3 = b4;
        if (b4 == null) {
            a3 = agfc.a;
        }
        agfb agfb;
        if ((agfb = agfb.a(a3.d)) == null) {
            agfb = agfb.f;
        }
        agfn agfn2;
        if ((agfn2 = agfn.a(agff.e)) == null) {
            agfn2 = agfn.f;
        }
        if (agfn2 == agfn.d) {
            if (value != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        }
        else if (value == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        final afyl a4 = a.a(new agck(b3, c2, agfb, agfn2, value));
        agfn agfn3;
        if ((agfn3 = agfn.a(agff.e)) == null) {
            agfn3 = agfn.f;
        }
        final int ordinal = agfn3.ordinal();
        byte[] array = null;
        Label_0370: {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        array = afyh.a;
                        break Label_0370;
                    }
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                array = ByteBuffer.allocate(5).put((byte)0).putInt(agff.d).array();
            }
            else {
                array = ByteBuffer.allocate(5).put((byte)1).putInt(agff.d).array();
            }
        }
        int t2 = aexq.T(agff.c);
        if (t2 == 0) {
            t2 = 1;
        }
        agfn agfn4;
        if ((agfn4 = agfn.a(agff.e)) == null) {
            agfn4 = agfn.f;
        }
        c = new afyy(c, array, t2, agfn4, agff.d, a4);
        final ArrayList list = new ArrayList();
        list.add(c);
        final afyz afyz = new afyz(((afyy)c).a());
        final List list2 = (List)b2.put(afyz, Collections.unmodifiableList((List<?>)list));
        if (list2 != null) {
            final ArrayList list3 = new ArrayList();
            list3.addAll(list2);
            list3.add(c);
            b2.put(afyz, Collections.unmodifiableList((List<?>)list3));
        }
        if (!b) {
            return;
        }
        if (this.c == null) {
            this.c = (afyy)c;
            return;
        }
        throw new IllegalStateException("you cannot set two primary primitives");
    }
}
