import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprs extends ahbh implements ahcw
{
    public static final aprs a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public int d;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aprs.class, (ahbh)(a = new aprs()));
    }
    
    private aprs() {
        this.g = 2;
        this.c = emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aprs.e) == null) {
                    synchronized (aprs.class) {
                        if (aprs.e == null) {
                            aprs.e = (ahdd)new ahba((ahbh)aprs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aprs.a;
            }
            case 4: {
                return new ahaz((ahbh)aprs.a);
            }
            case 3: {
                return new aprs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprs.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0002\u0001\u041b\u0003\u1409\u0001\u0005\u1004\u0000", new Object[] { "b", "c", aprk.class, "f", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
