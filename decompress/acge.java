import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acge implements asmc
{
    public final Object a;
    public final ahcz b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public acge(final acgf a, final aoiu b, final aqiq c, final ojm d, final int e) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public acge(final wkd a, final Pair d, final String c, final aotz b, final int e, final byte[] array) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = (ahcz)b;
    }
    
    @Override
    public final void a() {
        if (this.e == 0) {
            final Object a = this.a;
            final ahcz b = this.b;
            final Object c = this.c;
            final Object d = this.d;
            final aoiu aoiu = (aoiu)b;
            final acgf acgf = (acgf)a;
            acgf.f(aoiu, false);
            acgf.a.b((aqiq)c, ((ojm)d).a());
            return;
        }
        final Object a2 = this.a;
        final Object d2 = this.d;
        Object o = this.c;
        final ahcz b2 = this.b;
        final Pair pair = (Pair)d2;
        final aoub aoub = (aoub)pair.first;
        final aqnc aqnc = (aqnc)pair.second;
        if (o == null && aqnc.c.isEmpty()) {
            return;
        }
        if (o == null) {
            o = String.valueOf(aqnc.c).concat("\n");
        }
        boolean e = aqnc.e;
        final ahdp b3 = aoub.b;
        final String s = (String)o;
        afbh afbh = null;
        Label_0193: {
            if (s.length() != 0) {
                final char char1 = s.charAt(s.length() - 1);
                if (char1 == '\n' || char1 == ',') {
                    final String trim = s.substring(0, s.length() - 1).trim();
                    if (trim.length() > 0) {
                        afbh = afbh.k(trim);
                        break Label_0193;
                    }
                }
            }
            afbh = afag.a;
        }
        Object o2;
        String s4;
        if (afbh.h()) {
            final ahcr builder = ((ahcz)aoub).toBuilder();
            final String s2 = (String)afbh.c();
            builder.copyOnWrite();
            final aoub aoub2 = (aoub)builder.instance;
            aoub2.a();
            aoub2.b.add((Object)s2);
            final aoub aoub3 = (aoub)builder.build();
            final Object a3 = ((wkd)a2).a;
            final aotz aotz = (aotz)b2;
            ((ouc)a3).b(aotz.c, ((ahbc)aoub3).toByteArray());
            final ahdp b4 = aoub3.b;
            aoub aoub4;
            if ((aoub4 = aotz.e) == null) {
                aoub4 = aoub.a;
            }
            e = ywr.t((List)b4, (List)aoub4.b);
            final String s3 = "";
            o2 = b4;
            s4 = s3;
        }
        else {
            final ArrayList list = new ArrayList<String>((Collection<?>)b3);
            list.add((String)o);
            s4 = (String)o;
            o2 = list;
        }
        final Object a4 = ((wkd)a2).a;
        final String d3 = ((aotz)b2).d;
        final ahcr builder2 = ((ahcz)aqnc).toBuilder();
        builder2.copyOnWrite();
        final aqnc aqnc2 = (aqnc)builder2.instance;
        aqnc2.b |= 0x2;
        aqnc2.c = s4;
        builder2.copyOnWrite();
        final aqnc aqnc3 = (aqnc)builder2.instance;
        aqnc3.b |= 0x10;
        aqnc3.e = e;
        final int u = ywr.u((List)o2);
        builder2.copyOnWrite();
        final aqnc aqnc4 = (aqnc)builder2.instance;
        aqnc4.f = u - 1;
        aqnc4.b |= 0x40;
        ((ouc)a4).b(d3, ((ahbc)builder2.build()).toByteArray());
    }
}
