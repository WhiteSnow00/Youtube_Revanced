import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amez extends agzi implements ahax
{
    public static final amez a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)amez.class, (agzi)(a = new amez()));
    }
    
    private amez() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = amez.d) == null) {
                    synchronized (amez.class) {
                        if (amez.d == null) {
                            amez.d = (ahbe)new agzb((agzi)amez.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amez.a;
            }
            case 4: {
                return new agza((agzi)amez.a);
            }
            case 3: {
                return new amez();
            }
            case 2: {
                return newMessageInfo((MessageLite)amez.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
