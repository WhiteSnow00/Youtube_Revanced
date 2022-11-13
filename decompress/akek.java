import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akek extends ahbh implements ahcw
{
    public static final akek a;
    private static volatile ahdd d;
    public ahbx b;
    public ahab c;
    private int e;
    private ajut f;
    private ajut g;
    private ajut h;
    private aiqj i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akek.class, (ahbh)(a = new akek()));
    }
    
    private akek() {
        this.k = 2;
        this.b = emptyProtobufList();
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akek.d) == null) {
                    synchronized (akek.class) {
                        if (akek.d == null) {
                            akek.d = (ahdd)new ahba((ahbh)akek.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akek.a;
            }
            case 4: {
                return new ahaz((ahbh)akek.a);
            }
            case 3: {
                return new akek();
            }
            case 2: {
                return newMessageInfo((MessageLite)akek.a, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0001\u0005\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u001b\t\u100a\u0006", new Object[] { "e", "f", "g", "h", "i", "j", "b", alwh.class, "c" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
