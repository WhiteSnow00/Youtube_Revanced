import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alre extends agzi implements ahax
{
    public static final alre a;
    private static volatile ahbe h;
    public int b;
    public alqy c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    static {
        agzi.registerDefaultInstance(alre.class, a = new alre());
    }
    
    private alre() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = alre.h) == null) {
                    synchronized (alre.class) {
                        if (alre.h == null) {
                            alre.h = (ahbe)new agzb((agzi)alre.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alre.a;
            }
            case 4: {
                return new alrd();
            }
            case 3: {
                return new alre();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alre.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0004\u100c\u0002\u0005\u100c\u0003\u0006\u1004\u0004\u0007\u100c\u0005", new Object[] { "b", "c", "d", alll.u, "e", alll.m, "f", "g", alll.l });
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
