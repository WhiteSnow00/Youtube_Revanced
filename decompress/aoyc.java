import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyc extends ahbh implements ahcw
{
    public static final aoyc a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public String d;
    public ajut e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyc.class, (ahbh)(a = new aoyc()));
    }
    
    private aoyc() {
        this.g = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aoyc.f) == null) {
                    synchronized (aoyc.class) {
                        if (aoyc.f == null) {
                            aoyc.f = (ahdd)new ahba((ahbh)aoyc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoyc.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyc.a);
            }
            case 3: {
                return new aoyc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
