import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsl extends ahbh implements ahcw
{
    public static final apsl a;
    private static volatile ahdd f;
    public int b;
    public andl c;
    public andk d;
    public andm e;
    
    static {
        ahbh.registerDefaultInstance((Class)apsl.class, (ahbh)(a = new apsl()));
    }
    
    private apsl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apsl.f) == null) {
                    synchronized (apsl.class) {
                        if (apsl.f == null) {
                            apsl.f = (ahdd)new ahba((ahbh)apsl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apsl.a;
            }
            case 4: {
                return new ahaz((ahbh)apsl.a);
            }
            case 3: {
                return new apsl();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsl.a, "\u0001\u0003\u0000\u0001\uf027\u2085\ue433\u2ca7\u0003\u0000\u0000\u0000\uf027\u2085\u1009\u0001\ue7c7\u20a1\u1009\u0000\ue433\u2ca7\u1009\u0003", new Object[] { "b", "d", "c", "e" });
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
