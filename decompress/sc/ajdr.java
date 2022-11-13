import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdr extends ahbh implements ahcw
{
    public static final ajdr a;
    public static final ahbf b;
    private static volatile ahdd e;
    public String c;
    public ahbx d;
    private int f;
    private byte g;
    
    static {
        final ajdr a2 = new ajdr();
        ahbh.registerDefaultInstance((Class)ajdr.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 89668214, ahek.k, (Class)ajdr.class);
    }
    
    private ajdr() {
        this.g = 2;
        this.c = "";
        this.d = emptyProtobufList();
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
                if ((e = ajdr.e) == null) {
                    synchronized (ajdr.class) {
                        if (ajdr.e == null) {
                            ajdr.e = (ahdd)new ahba((ahbh)ajdr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajdr.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdr.a);
            }
            case 3: {
                return new ajdr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "f", "c", "d", aiqj.class });
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
