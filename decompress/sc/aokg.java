import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokg extends ahbh implements ahcw
{
    public static final aokg a;
    private static volatile ahdd i;
    public int b;
    public aotp c;
    public aiqj d;
    public aokh e;
    public ajut f;
    public ahbx g;
    public ahab h;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aokg.class, (ahbh)(a = new aokg()));
    }
    
    private aokg() {
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
                if ((i = aokg.i) == null) {
                    synchronized (aokg.class) {
                        if (aokg.i == null) {
                            aokg.i = (ahdd)new ahba((ahbh)aokg.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aokg.a;
            }
            case 4: {
                return new ahaz((ahbh)aokg.a);
            }
            case 3: {
                return new aokg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokg.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u041b", new Object[] { "b", "c", "d", "e", "f", "j", "h", "g", aotd.class });
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
