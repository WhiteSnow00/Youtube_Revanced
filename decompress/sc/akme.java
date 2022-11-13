import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akme extends ahbh implements ahcw
{
    public static final akme a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)akme.class, (ahbh)(a = new akme()));
    }
    
    private akme() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akme.f) == null) {
                    synchronized (akme.class) {
                        if (akme.f == null) {
                            akme.f = (ahdd)new ahba((ahbh)akme.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akme.a;
            }
            case 4: {
                return new ahaz((ahbh)akme.a);
            }
            case 3: {
                return new akme();
            }
            case 2: {
                return newMessageInfo((MessageLite)akme.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0004\u100c\u0006\u0005\u1008\u0007", new Object[] { "b", "c", "d", akjo.m, "e" });
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
