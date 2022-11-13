import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigd extends ahbh implements ahcw
{
    public static final aigd a;
    private static volatile ahdd h;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public aiqj f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aigd.class, (ahbh)(a = new aigd()));
    }
    
    private aigd() {
        this.j = 2;
        this.g = ahab.b;
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
                final ahdd h;
                if ((h = aigd.h) == null) {
                    synchronized (aigd.class) {
                        if (aigd.h == null) {
                            aigd.h = (ahdd)new ahba((ahbh)aigd.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aigd.a;
            }
            case 4: {
                return new ahaz((ahbh)aigd.a);
            }
            case 3: {
                return new aigd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigd.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005", new Object[] { "b", "c", "d", "e", "f", "i", "g" });
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
