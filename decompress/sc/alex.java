import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.CompleteTransactionActionOuterClass$CompleteTransactionAction;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alex extends ahbh implements ahcw
{
    public static final alex a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public Object d;
    public akli e;
    public aiqj f;
    public ahab g;
    public int h;
    private ajvo j;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)alex.class, (ahbh)(a = new alex()));
    }
    
    private alex() {
        this.c = 0;
        this.l = 2;
        this.g = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = alex.i) == null) {
                    synchronized (alex.class) {
                        if (alex.i == null) {
                            alex.i = (ahdd)new ahba((ahbh)alex.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alex.a;
            }
            case 4: {
                return new ahaz((ahbh)alex.a);
            }
            case 3: {
                return new alex();
            }
            case 2: {
                return newMessageInfo((MessageLite)alex.a, "\u0001\b\u0001\u0001\u0001\u0309\b\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u143c\u0000\u0003\u143c\u0000\u0004\u100a\u0005\u0005\u1409\u0006\u0006\u100c\u0007\u0007\u1409\u0003\u0309\u1409\u0004", new Object[] { "d", "c", "b", "e", CompleteTransactionActionOuterClass$CompleteTransactionAction.class, aohb.class, "g", "k", "h", apuh.n, "f", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
