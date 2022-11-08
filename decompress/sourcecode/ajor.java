import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajor extends agzi implements ahax
{
    public static final ajor a;
    private static volatile ahbe h;
    public long b;
    public int c;
    public ajoq d;
    public ajoq e;
    public boolean f;
    public boolean g;
    private int i;
    
    static {
        agzi.registerDefaultInstance((Class)ajor.class, (agzi)(a = new ajor()));
    }
    
    private ajor() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ajor.h) == null) {
                    synchronized (ajor.class) {
                        if (ajor.h == null) {
                            ajor.h = (ahbe)new agzb((agzi)ajor.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajor.a;
            }
            case 4: {
                return new agza((agzi)ajor.a);
            }
            case 3: {
                return new ajor();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajor.a, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0000\u0003\u1003\u0002\u0004\u100c\u0003\u0005\u1009\u0004\u0006\u1009\u0005\u0007\u1007\u0006\b\u1007\u0007", new Object[] { "i", "b", "c", ajoa.j, "d", "e", "f", "g" });
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
