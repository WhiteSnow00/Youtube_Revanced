import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqi extends agzi implements ahax
{
    public static final alqi a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(alqi.class, a = new alqi());
    }
    
    private alqi() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = alqi.e) == null) {
                    synchronized (alqi.class) {
                        if (alqi.e == null) {
                            alqi.e = (ahbe)new agzb((agzi)alqi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alqi.a;
            }
            case 4: {
                return new agza((agzi)alqi.a);
            }
            case 3: {
                return new alqi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
