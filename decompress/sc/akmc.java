import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmc extends ahbh implements ahcw
{
    public static final akmc a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public akme d;
    public String e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akmc.class, (ahbh)(a = new akmc()));
    }
    
    private akmc() {
        this.g = 2;
        this.e = "";
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
                if ((f = akmc.f) == null) {
                    synchronized (akmc.class) {
                        if (akmc.f == null) {
                            akmc.f = (ahdd)new ahba((ahbh)akmc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akmc.a;
            }
            case 4: {
                return new ahaz((ahbh)akmc.a);
            }
            case 3: {
                return new akmc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
