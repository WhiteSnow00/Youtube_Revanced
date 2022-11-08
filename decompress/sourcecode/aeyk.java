import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.regex.Matcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyk
{
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;
    
    public aeyk() {
        this.d = "YouTube";
        this.c = "LithoView:0-height";
        this.b = 0;
        this.a = false;
    }
    
    public aeyk(final int b, final cwt d, final cwp c, final boolean a) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public aeyk(final int b, final boolean a, final byte[] d, final byte[] c) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public aeyk(final aeyj aeyj) {
        this(aeyj, false, (aexa)aewx.a, Integer.MAX_VALUE);
    }
    
    public aeyk(final aeyj d, final boolean a, final aexa c, final int b) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aeyk(final String c, final boolean a) {
        this.d = "com.mgoogle.android.gms";
        this.c = c;
        this.b = 4225;
        this.a = a;
    }
    
    public aeyk(final wvu c, final tda tda) {
        this.c = c;
        altp altp;
        if ((altp = tda.a().p) == null) {
            altp = altp.a;
        }
        ajok d;
        if ((d = altp.b) == null) {
            d = ajok.a;
        }
        this.d = d;
        final ajok ajok = d;
        final int b = d.b;
        int d2 = 1;
        this.a = ((b & 0x1) == 0x0 || d.c);
        if ((b & 0x2) != 0x0) {
            d2 = d.d;
        }
        this.b = d2;
    }
    
    public static aeyk b(final char c) {
        return new aeyk((aeyj)new aeye(aexa.e(c), 1));
    }
    
    public static aeyk c(final String s) {
        agot.v(s.length() != 0, (Object)"The separator may not be the empty string.");
        if (s.length() == 1) {
            return b(s.charAt(0));
        }
        return new aeyk((aeyj)new aeye(s, 0));
    }
    
    public static aeyk d(final String s) {
        final aexc b = aexs.b(s);
        agot.z(((Matcher)b.a("").a).matches() ^ true, "The pattern may not match the empty string: %s", (Object)b);
        return new aeyk((aeyj)new aeye(b, 2));
    }
    
    public final aeyk a() {
        return new aeyk((aeyj)this.d, true, (aexa)this.c, this.b);
    }
    
    public final aeyk e() {
        final aewz b = aewz.b;
        b.getClass();
        return new aeyk((aeyj)this.d, this.a, (aexa)b, this.b);
    }
    
    public final Iterable f(final CharSequence charSequence) {
        charSequence.getClass();
        return new aeyi(this, charSequence);
    }
    
    public final Iterator g(final CharSequence charSequence) {
        return ((aeyj)this.d).a(this, charSequence);
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
    
    public final void i(aijq aijq) {
        aijv aijv;
        if ((aijv = ((aijq)((agzi)aijq).toBuilder().instance).e) == null) {
            aijv = aijv.a;
        }
        if ((aijv.b & 0x10) == 0x0) {
            final agza builder = ((agzi)aijq).toBuilder();
            aijv aijv2;
            if ((aijv2 = aijq.e) == null) {
                aijv2 = aijv.a;
            }
            final agza builder2 = ((agzi)aijv2).toBuilder();
            final int b = this.b;
            builder2.copyOnWrite();
            final aijv aijv3 = (aijv)builder2.instance;
            aijv3.b |= 0x10;
            aijv3.f = b;
            builder.copyOnWrite();
            aijq = (aijq)builder.instance;
            final aijv e = (aijv)builder2.build();
            e.getClass();
            aijq.e = e;
            aijq.b |= 0x4;
            aijq = (aijq)builder.build();
        }
        final aklo d = aklq.d();
        ((agza)d).copyOnWrite();
        aklq.bm((aklq)d.instance, aijq);
        final aklq aklq = (aklq)((agza)d).build();
        if (!this.a) {
            return;
        }
        ((wvu)this.c).d(aklq);
    }
}
