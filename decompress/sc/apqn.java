import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apqn extends ahbh implements ahcw
{
    public static final apqn a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiqj e;
    private aprd f;
    private aprn g;
    private ajut h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)apqn.class, (ahbh)(a = new apqn()));
    }
    
    private apqn() {
        this.j = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apqn.b) == null) {
                    synchronized (apqn.class) {
                        if (apqn.b == null) {
                            apqn.b = (ahdd)new ahba((ahbh)apqn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqn.a;
            }
            case 4: {
                return new ahaz((ahbh)apqn.a);
            }
            case 3: {
                return new apqn();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqn.a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0003\t\u1409\u0005\n\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
