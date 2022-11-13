import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokb extends ahbh implements ahcw
{
    public static final aokb a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public ahbx d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aokb.class, (ahbh)(a = new aokb()));
    }
    
    private aokb() {
        this.f = 2;
        this.d = emptyProtobufList();
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
                if ((e = aokb.e) == null) {
                    synchronized (aokb.class) {
                        if (aokb.e == null) {
                            aokb.e = (ahdd)new ahba((ahbh)aokb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aokb.a;
            }
            case 4: {
                return new ahaz((ahbh)aokb.a);
            }
            case 3: {
                return new aokb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "b", "d", anuv.class, "c" });
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
