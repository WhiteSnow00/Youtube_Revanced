import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akph extends ahbh implements ahcw
{
    public static final akph a;
    private static volatile ahdd j;
    public int b;
    public Object c;
    public akli d;
    public akpe e;
    public ahbx f;
    public int g;
    public ahab h;
    public anuv i;
    private int k;
    private ahhu l;
    private anuv m;
    private aiqj n;
    private anuv o;
    private ajvo p;
    private byte q;
    
    static {
        ahbh.registerDefaultInstance((Class)akph.class, (ahbh)(a = new akph()));
    }
    
    private akph() {
        this.b = 0;
        this.q = 2;
        this.f = emptyProtobufList();
        this.h = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = akph.j) == null) {
                    synchronized (akph.class) {
                        if (akph.j == null) {
                            akph.j = (ahdd)new ahba((ahbh)akph.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akph.a;
            }
            case 4: {
                return new ahaz((ahbh)akph.a);
            }
            case 3: {
                return new akph();
            }
            case 2: {
                return newMessageInfo((MessageLite)akph.a, "\u0001\u000f\u0001\u0001\u0001\u0309\u000f\u0000\u0001\r\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u041b\u0005\u143c\u0000\u0006\u143c\u0000\u0007\u1409\u0007\b\u100a\b\n\u143c\u0000\u000b\u100c\u0006\f\u1409\t\u000e\u1409\u000b\u000f\u1409\f\u0010\u143c\u0000\u0011\u1409\r\u0309\u1409\u000e", new Object[] { "c", "b", "k", "d", "e", "f", akpd.class, akpf.class, akpc.class, "l", "h", anuv.class, "g", aibi.g, "m", "n", "o", anuv.class, "i", "p" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
