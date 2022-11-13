import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apra extends ahbh implements ahcw
{
    public static final apra a;
    private static volatile ahdd c;
    public ahbx b;
    private int d;
    private ajut e;
    private aiqj f;
    private ajut g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)apra.class, (ahbh)(a = new apra()));
    }
    
    private apra() {
        this.i = 2;
        this.b = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = apra.c) == null) {
                    synchronized (apra.class) {
                        if (apra.c == null) {
                            apra.c = (ahdd)new ahba((ahbh)apra.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apra.a;
            }
            case 4: {
                return new ahaz((ahbh)apra.a);
            }
            case 3: {
                return new apra();
            }
            case 2: {
                return newMessageInfo((MessageLite)apra.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0003\u0005\u1409\u0001\u0006\u1409\u0002", new Object[] { "d", "e", "b", apqz.class, "h", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
