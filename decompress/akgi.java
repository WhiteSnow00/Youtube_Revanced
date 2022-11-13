import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgi extends ahbh implements ahcw
{
    public static final akgi a;
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
        ahbh.registerDefaultInstance((Class)akgi.class, (ahbh)(a = new akgi()));
    }
    
    private akgi() {
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
                if ((h = akgi.h) == null) {
                    synchronized (akgi.class) {
                        if (akgi.h == null) {
                            akgi.h = (ahdd)new ahba((ahbh)akgi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akgi.a;
            }
            case 4: {
                return new ahaz((ahbh)akgi.a);
            }
            case 3: {
                return new akgi();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgi.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005", new Object[] { "b", "c", "d", "e", "f", "i", "g" });
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
