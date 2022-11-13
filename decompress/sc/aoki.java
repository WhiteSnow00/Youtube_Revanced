import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoki extends ahbh implements ahcw
{
    public static final aoki a;
    private static volatile ahdd i;
    public int b;
    public aotp c;
    public aokh d;
    public ajut e;
    public aiqj f;
    public ahbx g;
    public ahab h;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aoki.class, (ahbh)(a = new aoki()));
    }
    
    private aoki() {
        this.k = 2;
        this.g = emptyProtobufList();
        this.h = ahab.b;
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
                final ahdd i;
                if ((i = aoki.i) == null) {
                    synchronized (aoki.class) {
                        if (aoki.i == null) {
                            aoki.i = (ahdd)new ahba((ahbh)aoki.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoki.a;
            }
            case 4: {
                return new ahaz((ahbh)aoki.a);
            }
            case 3: {
                return new aoki();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoki.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u100a\u0006\b\u041b", new Object[] { "b", "c", "d", "e", "f", "j", "h", "g", aotd.class });
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
