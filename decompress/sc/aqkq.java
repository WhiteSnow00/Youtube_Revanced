import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkq extends ahbh implements ahcw
{
    public static final aqkq a;
    public static final ahbf b;
    private static volatile ahdd d;
    public aqkp c;
    private int e;
    private int f;
    private ahhu g;
    private aqip h;
    private aqiq i;
    private aqkn j;
    private CommandOuterClass$Command k;
    private aqhs l;
    private aqkb m;
    private aqic n;
    private aqir o;
    private aqei p;
    private appb q;
    private aqkm r;
    private CommandOuterClass$Command s;
    private CommandOuterClass$Command t;
    private aqiv u;
    private byte v;
    
    static {
        final aqkq a2 = new aqkq();
        ahbh.registerDefaultInstance((Class)aqkq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 232954548, ahek.k, (Class)aqkq.class);
    }
    
    private aqkq() {
        this.v = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte v = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqkq.d) == null) {
                    synchronized (aqkq.class) {
                        if (aqkq.d == null) {
                            aqkq.d = (ahdd)new ahba((ahbh)aqkq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqkq.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkq.a);
            }
            case 3: {
                return new aqkq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkq.a, "\u0001\u0010\u0000\u0002\u0001$\u0010\u0000\u0000\u000f\u0001\u1409\u001c\u0004\u1409\u0002\u0007\u1409\u001e\b\u1409\u001f\f\u1409!\u000e\u1409\b\u0011\u1409\t\u0012\u1409\u0000\u0013\u1409\n\u0014\u1409\u000b\u0015\u1409\f\u0018\u1409\u000f\u001d\u1009\u0017\u001f\u1409\u0019!\u1409\u0011$\u1409\u0010", new Object[] { "e", "f", "r", "g", "s", "t", "u", "h", "i", "c", "j", "k", "l", "m", "p", "q", "o", "n" });
            }
            case 1: {
                if (o == null) {
                    v = 0;
                }
                this.v = v;
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
