import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alav extends agzi implements ahax
{
    public static final alav a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)alav.class, (agzi)(a = new alav()));
    }
    
    private alav() {
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
                if ((d = alav.d) == null) {
                    synchronized (alav.class) {
                        if (alav.d == null) {
                            alav.d = (ahbe)new agzb((agzi)alav.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alav.a;
            }
            case 4: {
                return new agza((agzi)alav.a);
            }
            case 3: {
                return new alav();
            }
            case 2: {
                return newMessageInfo((MessageLite)alav.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0000", new Object[] { "b", "c" });
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
