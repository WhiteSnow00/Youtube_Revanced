import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class actm implements actn
{
    public final veh a;
    public final Map b;
    public final xaa c;
    
    public actm(final veh a, final Map b, final xaa c) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static void a(final bu bu, final amiv amiv, final veh veh, final acqv acqv, final Map map) {
        b(bu, amiv, veh, acqv, map, null, null, null);
    }
    
    public static void b(final bu bu, final amiv amiv, final veh veh, final acqv acqv, final Map map, final xaa xaa, final vhw vhw, final bx bx) {
        c(bu, amiv, veh, acqv, map, xaa, null, vhw, bx, null, true, true, null, null, null);
    }
    
    public static void c(final bu bu, final amiv amiv, final veh veh, final acqv acqv, final Map map, final xaa xaa, final aheu aheu, final vhw vhw, final bx bx, final Integer n, final boolean b, final boolean aa, final arna arna, final accx accx, final aefs aefs) {
        amiv amiv2 = amiv;
        Object a;
        if (xaa != null) {
            a = xaa;
        }
        else {
            a = actl.a;
        }
        final actm ae = new actm(veh, map, (xaa)a);
        if (aamz.af(amiv, null, bx, vhw)) {
            final ahcr builder = amiv.toBuilder();
            final afgh ae2 = aamz.ae(amiv, null, bx, vhw);
            builder.copyOnWrite();
            ((amiv)builder.instance).c = ahcz.emptyProtobufList();
            builder.bp((Iterable)ae2);
            amiv2 = (amiv)builder.build();
        }
        acto acto;
        if (aheu != null) {
            final acub o = aheu.O(acua.a().d());
            acto = acto.aM(amiv2, acqv, (xaa)new hyt(o, 9), n, vhw, b, arna, accx, aefs);
            acto.aZ((acuf)o);
        }
        else {
            acto = acto.aM(amiv2, acqv, xaa, n, vhw, b, arna, accx, aefs);
        }
        acto.ae = (actn)ae;
        acto.aA = aa;
        acto.be();
        ((bi)acto).r(bu.getSupportFragmentManager(), (String)null);
    }
}
