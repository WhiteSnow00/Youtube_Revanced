import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrc extends agzi implements ahax
{
    public static final alrc a;
    private static volatile ahbe g;
    public int b;
    public alqy c;
    public int d;
    public int e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(alrc.class, a = new alrc());
    }
    
    private alrc() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = alrc.g) == null) {
                    synchronized (alrc.class) {
                        if (alrc.g == null) {
                            alrc.g = (ahbe)new agzb((agzi)alrc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alrc.a;
            }
            case 4: {
                return new alrb();
            }
            case 3: {
                return new alrc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrc.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u1004\u0003", new Object[] { "b", "c", "d", alll.p, "e", alll.o, "f" });
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
