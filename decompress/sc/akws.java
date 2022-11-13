import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akws extends ahbh implements ahcw
{
    public static final akws a;
    private static volatile ahdd k;
    public int b;
    public String c;
    public long d;
    public long e;
    public String f;
    public boolean g;
    public boolean h;
    public ahab i;
    public akwr j;
    
    static {
        ahbh.registerDefaultInstance((Class)akws.class, (ahbh)(a = new akws()));
    }
    
    private akws() {
        this.c = "";
        this.f = "";
        this.i = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = akws.k) == null) {
                    synchronized (akws.class) {
                        if (akws.k == null) {
                            akws.k = (ahdd)new ahba((ahbh)akws.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akws.a;
            }
            case 4: {
                return new ahaz((ahbh)akws.a);
            }
            case 3: {
                return new akws();
            }
            case 2: {
                return newMessageInfo((MessageLite)akws.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0005\u1008\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u100a\u0006\t\u1009\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j" });
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
