import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgs extends ahbh implements ahcw
{
    public static final akgs a;
    private static volatile ahdd f;
    public akli b;
    public ahbx c;
    public aiqj d;
    public ahab e;
    private int g;
    private ahhu h;
    private ajut i;
    private aiqj j;
    private anuu k;
    private anuv l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)akgs.class, (ahbh)(a = new akgs()));
    }
    
    private akgs() {
        this.m = 2;
        this.c = emptyProtobufList();
        this.e = ahab.b;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akgs.f) == null) {
                    synchronized (akgs.class) {
                        if (akgs.f == null) {
                            akgs.f = (ahdd)new ahba((ahbh)akgs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akgs.a;
            }
            case 4: {
                return new ahaz((ahbh)akgs.a);
            }
            case 3: {
                return new akgs();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgs.a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0001\b\u0001\u1409\u0001\u0003\u041b\u0004\u1409\u0003\b\u1409\u0004\n\u1409\u0006\u000b\u1409\u0005\f\u100a\u0007\u000e\u1409\u0000\u0010\u1409\t", new Object[] { "g", "b", "c", akgt.class, "i", "d", "k", "j", "e", "h", "l" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
