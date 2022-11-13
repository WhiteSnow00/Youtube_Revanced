import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkn extends ahbh implements ahcw
{
    public static final aqkn a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private aqht e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private CommandOuterClass$Command i;
    private aqkc j;
    private CommandOuterClass$Command k;
    private CommandOuterClass$Command l;
    private CommandOuterClass$Command m;
    private CommandOuterClass$Command n;
    private CommandOuterClass$Command o;
    private aqii p;
    private ahyc q;
    private aqhv r;
    private aqiu s;
    private aqkh t;
    private byte u;
    
    static {
        ahbh.registerDefaultInstance((Class)aqkn.class, (ahbh)(a = new aqkn()));
    }
    
    private aqkn() {
        this.u = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqkn.b) == null) {
                    synchronized (aqkn.class) {
                        if (aqkn.b == null) {
                            aqkn.b = (ahdd)new ahba((ahbh)aqkn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkn.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkn.a);
            }
            case 3: {
                return new aqkn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkn.a, "\u0001\u0010\u0000\u0002\u00018\u0010\u0000\u0000\u0010\u0001\u1409\u0000\u0004\u1409\u0004\u0006\u1409\u0006\b\u1409\b\n\u1409\n\u000b\u1409\u000b\u000f\u1409\u000e\u0010\u1409\u000f\u0011\u1409\u0010\u0012\u1409\u0013\u0014\u1409\u0014%\u1409\u001e&\u1409\u00120\u1409&3\u1409\u001f8\u1409\u0011", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "p", "q", "r", "o", "t", "s", "n" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.u = u;
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
