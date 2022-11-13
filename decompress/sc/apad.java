import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apad extends ahbh implements ahcw
{
    public static final apad a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public aoco d;
    public ahbx e;
    private apaf g;
    private anuv h;
    private anuv i;
    private anuv j;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)apad.class, (ahbh)(a = new apad()));
    }
    
    private apad() {
        this.l = 2;
        this.c = emptyProtobufList();
        this.e = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apad.f) == null) {
                    synchronized (apad.class) {
                        if (apad.f == null) {
                            apad.f = (ahdd)new ahba((ahbh)apad.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apad.a;
            }
            case 4: {
                return new ahaz((ahbh)apad.a);
            }
            case 3: {
                return new apad();
            }
            case 2: {
                return newMessageInfo((MessageLite)apad.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0002\u0007\u0001\u041b\u0004\u1409\u0001\u0007\u001b\b\u1409\u0005\n\u1409\u0000\u000b\u1409\u0002\f\u1409\u0003\r\u1409\u0004", new Object[] { "b", "c", aocn.class, "d", "e", aocf.class, "k", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
