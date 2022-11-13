import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihu extends ahbh implements ahcw
{
    public static final aihu a;
    private static volatile ahdd g;
    public int b;
    public ahbx c;
    public ajut d;
    public aiqj e;
    public ahab f;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aihu.class, (ahbh)(a = new aihu()));
    }
    
    private aihu() {
        this.i = 2;
        this.c = emptyProtobufList();
        this.f = ahab.b;
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
                final ahdd g;
                if ((g = aihu.g) == null) {
                    synchronized (aihu.class) {
                        if (aihu.g == null) {
                            aihu.g = (ahdd)new ahba((ahbh)aihu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aihu.a;
            }
            case 4: {
                return new ahaz((ahbh)aihu.a);
            }
            case 3: {
                return new aihu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihu.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0004\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003", new Object[] { "b", "c", aihv.class, "d", "e", "h", "f" });
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
