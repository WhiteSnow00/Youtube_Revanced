import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anou extends ahbh implements ahcw
{
    public static final anou a;
    private static volatile ahdd h;
    public int b;
    public anov c;
    public ahbx d;
    public ahmo e;
    public ahab f;
    public String g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anou.class, (ahbh)(a = new anou()));
    }
    
    private anou() {
        this.j = 2;
        this.d = emptyProtobufList();
        this.f = ahab.b;
        this.g = "";
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
                if ((h = anou.h) == null) {
                    synchronized (anou.class) {
                        if (anou.h == null) {
                            anou.h = (ahdd)new ahba((ahbh)anou.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anou.a;
            }
            case 4: {
                return new ahaz((ahbh)anou.a);
            }
            case 3: {
                return new anou();
            }
            case 2: {
                return newMessageInfo((MessageLite)anou.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003\u0006\u1008\u0004", new Object[] { "b", "c", "d", anpi.class, "e", "i", "f", "g" });
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
