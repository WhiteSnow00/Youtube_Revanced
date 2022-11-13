import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokj extends ahbh implements ahcw
{
    public static final aokj a;
    private static volatile ahdd e;
    public int b;
    public aiqj c;
    public boolean d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aokj.class, (ahbh)(a = new aokj()));
    }
    
    private aokj() {
        this.f = 2;
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
                if ((e = aokj.e) == null) {
                    synchronized (aokj.class) {
                        if (aokj.e == null) {
                            aokj.e = (ahdd)new ahba((ahbh)aokj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aokj.a;
            }
            case 4: {
                return new ahaz((ahbh)aokj.a);
            }
            case 3: {
                return new aokj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
