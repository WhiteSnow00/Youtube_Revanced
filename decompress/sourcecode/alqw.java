import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqw extends agzi implements ahax
{
    public static final alqw a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(alqw.class, a = new alqw());
    }
    
    private alqw() {
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
                if ((e = alqw.e) == null) {
                    synchronized (alqw.class) {
                        if (alqw.e == null) {
                            alqw.e = (ahbe)new agzb((agzi)alqw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alqw.a;
            }
            case 4: {
                return new agza((agzi)alqw.a);
            }
            case 3: {
                return new alqw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001", new Object[] { "b", "c", "d" });
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