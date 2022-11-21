import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.regex.Matcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afcb
{
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;
    
    public afcb() {
        this.d = "YouTube";
        this.c = "LithoView:0-height";
        this.b = 0;
        this.a = false;
    }
    
    public afcb(final int b, final cwx d, final cwt c, final boolean a) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public afcb(final int b, final boolean a, final byte[] d, final byte[] c) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public afcb(final afca afca) {
        this(afca, false, (afar)afao.a, Integer.MAX_VALUE);
    }
    
    public afcb(final afca d, final boolean a, final afar c, final int b) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public afcb(final String c, final boolean a) {
        this.d = "com.mgoogle.android.gms";
        this.c = c;
        this.b = 4225;
        this.a = a;
    }
    
    public afcb(final wza c, final tgi tgi) {
        this.c = c;
        alxt alxt;
        if ((alxt = tgi.a().p) == null) {
            alxt = alxt.a;
        }
        ajso d;
        if ((d = alxt.b) == null) {
            d = ajso.a;
        }
        this.d = d;
        final ajso ajso = d;
        final int b = d.b;
        int d2 = 1;
        this.a = ((b & 0x1) == 0x0 || d.c);
        if ((b & 0x2) != 0x0) {
            d2 = d.d;
        }
        this.b = d2;
    }
    
    public static afcb b(final char c) {
        return new afcb(new afbv(afar.e(c), 1));
    }
    
    public static afcb c(final String s) {
        adme.L(s.length() != 0, "The separator may not be the empty string.");
        if (s.length() == 1) {
            return b(s.charAt(0));
        }
        return new afcb(new afbv(s, 0));
    }
    
    public static afcb d(final String s) {
        final afat b = afbj.b(s);
        adme.P(((Matcher)b.a("").a).matches() ^ true, "The pattern may not match the empty string: %s", b);
        return new afcb(new afbv(b, 2));
    }
    
    public final afcb a() {
        return new afcb((afca)this.d, true, (afar)this.c, this.b);
    }
    
    public final afcb e() {
        final afaq b = afaq.b;
        b.getClass();
        return new afcb((afca)this.d, this.a, (afar)b, this.b);
    }
    
    public final Iterable f(final CharSequence charSequence) {
        charSequence.getClass();
        return new afbz(this, charSequence);
    }
    
    public final Iterator g(final CharSequence charSequence) {
        return ((afca)this.d).a(this, charSequence);
    }
    
    public final List h(final CharSequence charSequence) {
        charSequence.getClass();
        final Iterator g = this.g(charSequence);
        final ArrayList list = new ArrayList();
        while (g.hasNext()) {
            list.add(g.next());
        }
        return Collections.unmodifiableList((List<?>)list);
    }
    
    public final void i(ainh ainh) {
        ainm ainm;
        if ((ainm = ((ainh)((ahcz)ainh).toBuilder().instance).e) == null) {
            ainm = ainm.a;
        }
        if ((ainm.b & 0x10) == 0x0) {
            final ahcr builder = ((ahcz)ainh).toBuilder();
            ainm ainm2;
            if ((ainm2 = ainh.e) == null) {
                ainm2 = ainm.a;
            }
            final ahcr builder2 = ((ahcz)ainm2).toBuilder();
            final int b = this.b;
            builder2.copyOnWrite();
            final ainm ainm3 = (ainm)builder2.instance;
            ainm3.b |= 0x10;
            ainm3.f = b;
            builder.copyOnWrite();
            final ainh ainh2 = (ainh)builder.instance;
            final ainm e = (ainm)builder2.build();
            e.getClass();
            ainh2.e = e;
            ainh2.b |= 0x4;
            ainh = (ainh)builder.build();
        }
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.bn((akpu)d.instance, ainh);
        final akpu akpu = (akpu)((ahcr)d).build();
        if (!this.a) {
            return;
        }
        ((wza)this.c).d(akpu);
    }
}
