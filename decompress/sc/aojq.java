import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojq extends ahbh implements ahcw
{
    public static final aojq a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public aotp d;
    public aotp e;
    public ajut f;
    public ajut g;
    public ajut h;
    private aiqj j;
    private ajut k;
    private anuv l;
    private anuv m;
    private anuv n;
    private anuv o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)aojq.class, (ahbh)(a = new aojq()));
    }
    
    private aojq() {
        this.p = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aojq.i) == null) {
                    synchronized (aojq.class) {
                        if (aojq.i == null) {
                            aojq.i = (ahdd)new ahba((ahbh)aojq.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aojq.a;
            }
            case 4: {
                return new ahaz((ahbh)aojq.a);
            }
            case 3: {
                return new aojq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojq.a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u000b\u0001\u100b\u0000\u0002\u1409\u0005\u0004\u1409\t\u0005\u1409\n\u0006\u1409\f\u0007\u1409\u0001\b\u1409\u000b\t\u1409\r\n\u1409\u000e\u000b\u1409\b\r\u1409\u000f\u000f\u1409\u0006", new Object[] { "b", "c", "e", "f", "g", "l", "d", "h", "m", "n", "k", "o", "j" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
