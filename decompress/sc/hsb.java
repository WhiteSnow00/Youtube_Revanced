import j$.util.Optional;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsb implements asjr
{
    public static final hsb a;
    public static final hsb b;
    public static final hsb c;
    public static final hsb d;
    public static final hsb e;
    public static final hsb f;
    public static final hsb g;
    public static final hsb h;
    public static final hsb i;
    public static final hsb j;
    public static final hsb k;
    public static final hsb l;
    public static final hsb m;
    public static final hsb n;
    public static final hsb o;
    public static final hsb p;
    public static final hsb q;
    public static final hsb r;
    public static final hsb s;
    public static final hsb t;
    public static final hsb u;
    private final int v;
    
    static {
        u = new hsb(20);
        t = new hsb(19);
        s = new hsb(18);
        r = new hsb(17);
        q = new hsb(16);
        p = new hsb(15);
        o = new hsb(14);
        n = new hsb(13);
        m = new hsb(12);
        l = new hsb(11);
        k = new hsb(10);
        j = new hsb(9);
        i = new hsb(8);
        h = new hsb(7);
        g = new hsb(6);
        f = new hsb(5);
        e = new hsb(4);
        d = new hsb(3);
        c = new hsb(2);
        b = new hsb(1);
        a = new hsb(0);
    }
    
    private hsb(final int v) {
        this.v = v;
    }
    
    public final Object a(final Object o) {
        final int v = this.v;
        boolean b = true;
        switch (v) {
            default: {
                final hvf hvf = (hvf)o;
                return "";
            }
            case 19: {
                return ((hvc)o) instanceof hvf ^ true;
            }
            case 18: {
                return false;
            }
            case 17: {
                return ((aezp)o).b((aezf)huo.c).e((Object)hvf.a());
            }
            case 16: {
                final aezp aezp = (aezp)o;
                Object o2;
                if (aezp.f() instanceof apij) {
                    o2 = aezp.b((aezf)huo.d);
                }
                else {
                    o2 = aeyo.a;
                }
                return o2;
            }
            case 15: {
                return atcg.c((ashw)o).e(0);
            }
            case 14: {
                final apij b2 = ((huq)o).b;
                if (b2 == null || b2.getNumVideosFailed() <= 0) {
                    b = false;
                }
                return b;
            }
            case 13: {
                final huq huq = (huq)o;
                return twb.a;
            }
            case 12: {
                return huq.a((vft)o);
            }
            case 11: {
                return atcg.c((ashw)o).e(0);
            }
            case 10: {
                final huq huq2 = (huq)o;
                return twb.a;
            }
            case 9: {
                return huq.a((vft)o);
            }
            case 8: {
                return qcy.R((apij)o);
            }
            case 7: {
                return o;
            }
            case 6: {
                final huq huq3 = (huq)o;
                final apij a = huq3.a;
                final apij b3 = huq3.b;
                hur hur;
                if (b3 == null) {
                    hur = hur.d;
                }
                else if (a == null) {
                    hur = qcy.R(b3);
                }
                else if (b3.getNumVideosFailed() > a.getNumVideosFailed()) {
                    hur = hur.a;
                }
                else if (b3.getNumVideosInProgress() > a.getNumVideosInProgress()) {
                    hur = hur.b;
                }
                else if (b3.getNumVideosCompleted() > a.getNumVideosCompleted()) {
                    hur = hur.c;
                }
                else {
                    hur = hur.d;
                }
                return hur;
            }
            case 5: {
                return huq.a((vft)o);
            }
            case 4: {
                final byte[] array = (byte[])o;
                asht asht;
                try {
                    asht = asht.X(ahbh.parseFrom((ahbh)amhq.a, array, ExtensionRegistryLite.getGeneratedRegistry()));
                }
                catch (final ahca ahca) {
                    asht = asht.J((Throwable)ahca);
                }
                return asht;
            }
            case 3: {
                return ((aezp)o).c();
            }
            case 2: {
                return Optional.of((Object)o);
            }
            case 1: {
                return aald.ab((Object)o);
            }
            case 0: {
                return aald.ab((Object)o);
            }
        }
    }
}
