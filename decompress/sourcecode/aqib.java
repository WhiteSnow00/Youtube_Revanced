import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqib extends agzi implements ahax
{
    public static final aqib a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private aqfh e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private CommandOuterClass$Command i;
    private aqhq j;
    private CommandOuterClass$Command k;
    private CommandOuterClass$Command l;
    private CommandOuterClass$Command m;
    private CommandOuterClass$Command n;
    private CommandOuterClass$Command o;
    private aqfw p;
    private ahwe q;
    private aqfj r;
    private aqgi s;
    private aqhv t;
    private byte u;
    
    static {
        agzi.registerDefaultInstance((Class)aqib.class, (agzi)(a = new aqib()));
    }
    
    private aqib() {
        this.u = 2;
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
                final ahbe b2;
                if ((b2 = aqib.b) == null) {
                    synchronized (aqib.class) {
                        if (aqib.b == null) {
                            aqib.b = (ahbe)new agzb((agzi)aqib.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqib.a;
            }
            case 4: {
                return new agza((agzi)aqib.a);
            }
            case 3: {
                return new aqib();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqib.a, "\u0001\u0010\u0000\u0002\u00018\u0010\u0000\u0000\u0010\u0001\u1409\u0000\u0004\u1409\u0004\u0006\u1409\u0006\b\u1409\b\n\u1409\n\u000b\u1409\u000b\u000f\u1409\u000e\u0010\u1409\u000f\u0011\u1409\u0010\u0012\u1409\u0013\u0014\u1409\u0014%\u1409\u001d&\u1409\u00120\u1409%3\u1409\u001e8\u1409\u0011", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "p", "q", "r", "o", "t", "s", "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.u = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
