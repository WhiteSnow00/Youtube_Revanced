import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktu extends ahbh implements ahcw
{
    public static final aktu a;
    private static volatile ahdd h;
    public int b;
    public double c;
    public double d;
    public String e;
    public String f;
    public int g;
    
    static {
        ahbh.registerDefaultInstance((Class)aktu.class, (ahbh)(a = new aktu()));
    }
    
    private aktu() {
        this.e = "";
        this.f = "";
        this.g = 1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aktu.h) == null) {
                    synchronized (aktu.class) {
                        if (aktu.h == null) {
                            aktu.h = (ahdd)new ahba((ahbh)aktu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aktu.a;
            }
            case 4: {
                return new ahaz((ahbh)aktu.a);
            }
            case 3: {
                return new aktu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktu.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "g", aldq.b });
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
