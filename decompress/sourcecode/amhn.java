import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhn extends agzi implements ahax
{
    private static final amhn a;
    private static volatile ahbe b;
    private int c;
    private String d;
    private String e;
    private String f;
    
    static {
        agzi.registerDefaultInstance((Class)amhn.class, (agzi)(a = new amhn()));
    }
    
    private amhn() {
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    public static amhm a() {
        return (amhm)amhn.a.createBuilder();
    }
    
    private void e(final String d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final String e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = amhn.b) == null) {
                    synchronized (amhn.class) {
                        if (amhn.b == null) {
                            amhn.b = (ahbe)new agzb((agzi)amhn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amhn.a;
            }
            case 4: {
                return new amhm();
            }
            case 3: {
                return new amhn();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
