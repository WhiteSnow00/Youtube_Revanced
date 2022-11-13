import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aois extends ahbh implements ahcw
{
    public static final aois a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public aoie d;
    public aoie e;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aois.class, (ahbh)(a = new aois()));
    }
    
    private aois() {
        this.h = 2;
        this.c = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aois.f) == null) {
                    synchronized (aois.class) {
                        if (aois.f == null) {
                            aois.f = (ahdd)new ahba((ahbh)aois.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aois.a;
            }
            case 4: {
                return new ahaz((ahbh)aois.a);
            }
            case 3: {
                return new aois();
            }
            case 2: {
                return newMessageInfo((MessageLite)aois.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", aoid.class, "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
