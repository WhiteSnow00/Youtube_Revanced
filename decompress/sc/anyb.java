import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anyb extends ahbh implements ahcw
{
    public static final anyb a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public akzi d;
    public ahab e;
    private aiqj g;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)anyb.class, (ahbh)(a = new anyb()));
    }
    
    private anyb() {
        this.i = 2;
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = anyb.f) == null) {
                    synchronized (anyb.class) {
                        if (anyb.f == null) {
                            anyb.f = (ahdd)new ahba((ahbh)anyb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anyb.a;
            }
            case 4: {
                return new ahaz((ahbh)anyb.a);
            }
            case 3: {
                return new anyb();
            }
            case 2: {
                return newMessageInfo((MessageLite)anyb.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u100a\u0006\u0006\u1009\u0004", new Object[] { "b", "c", "g", "h", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
