import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowb extends ahbh implements ahcw
{
    public static final aowb a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    
    static {
        ahbh.registerDefaultInstance((Class)aowb.class, (ahbh)(a = new aowb()));
    }
    
    private aowb() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aowb.h) == null) {
                    synchronized (aowb.class) {
                        if (aowb.h == null) {
                            aowb.h = (ahdd)new ahba((ahbh)aowb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aowb.a;
            }
            case 4: {
                return new ahaz((ahbh)aowb.a);
            }
            case 3: {
                return new aowb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aowb.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
