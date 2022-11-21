import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlw extends ahcz implements aheo
{
    private static final amlw a;
    private static volatile ahev b;
    private int c;
    private String d;
    private String e;
    private String f;
    
    static {
        ahcz.registerDefaultInstance(amlw.class, a = new amlw());
    }
    
    private amlw() {
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    public static amlv a() {
        return (amlv)amlw.a.createBuilder();
    }
    
    static amlw b() {
        return amlw.a;
    }
    
    public static void c(final amlw amlw, final String s) {
        amlw.e(s);
    }
    
    public static void d(final amlw amlw, final String s) {
        amlw.f(s);
    }
    
    private void e(final String d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final String e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amlw.b) == null) {
                    synchronized (amlw.class) {
                        if (amlw.b == null) {
                            amlw.b = (ahev)new ahcs((ahcz)amlw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amlw.a;
            }
            case 4: {
                return new amlv();
            }
            case 3: {
                return new amlw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
