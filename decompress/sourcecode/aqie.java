import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqie extends agzi implements ahax
{
    public static final aqie a;
    public static final agzg b;
    private static volatile ahbe d;
    public aqid c;
    private int e;
    private int f;
    private ahfw g;
    private aqgd h;
    private aqge i;
    private aqib j;
    private CommandOuterClass$Command k;
    private aqfg l;
    private aqhp m;
    private aqfq n;
    private aqgf o;
    private aqbw p;
    private apmx q;
    private aqia r;
    private CommandOuterClass$Command s;
    private CommandOuterClass$Command t;
    private aqgj u;
    private byte v;
    
    static {
        final aqie a2 = new aqie();
        agzi.registerDefaultInstance((Class)aqie.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, (Object)a2, (MessageLite)a2, (agzn)null, 232954548, ahcm.k, (Class)aqie.class);
    }
    
    private aqie() {
        this.v = 2;
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aqie.d) == null) {
                    synchronized (aqie.class) {
                        if (aqie.d == null) {
                            aqie.d = (ahbe)new agzb((agzi)aqie.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqie.a;
            }
            case 4: {
                return new agza((agzi)aqie.a);
            }
            case 3: {
                return new aqie();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqie.a, "\u0001\u0010\u0000\u0002\u0001$\u0010\u0000\u0000\u000f\u0001\u1409\u001c\u0004\u1409\u0002\u0007\u1409\u001e\b\u1409\u001f\f\u1409!\u000e\u1409\b\u0011\u1409\t\u0012\u1409\u0000\u0013\u1409\n\u0014\u1409\u000b\u0015\u1409\f\u0018\u1409\u000f\u001d\u1009\u0017\u001f\u1409\u0019!\u1409\u0011$\u1409\u0010", new Object[] { "e", "f", "r", "g", "s", "t", "u", "h", "i", "c", "j", "k", "l", "m", "p", "q", "o", "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.v = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
