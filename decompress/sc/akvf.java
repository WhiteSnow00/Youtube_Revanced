import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvf extends ahbh implements ahcw
{
    public static final akvf a;
    private static volatile ahdd e;
    public int b;
    public aklg c;
    public ahab d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akvf.class, (ahbh)(a = new akvf()));
    }
    
    private akvf() {
        this.f = 2;
        this.d = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akvf.e) == null) {
                    synchronized (akvf.class) {
                        if (akvf.e == null) {
                            akvf.e = (ahdd)new ahba((ahbh)akvf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akvf.a;
            }
            case 4: {
                return new ahaz((ahbh)akvf.a);
            }
            case 3: {
                return new akvf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
