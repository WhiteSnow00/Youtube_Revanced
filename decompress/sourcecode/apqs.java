import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqs extends agzi implements ahax
{
    public static final apqs a;
    private static volatile ahbe i;
    public int b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public boolean h;
    
    static {
        agzi.registerDefaultInstance((Class)apqs.class, (agzi)(a = new apqs()));
    }
    
    private apqs() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = apqs.i) == null) {
                    synchronized (apqs.class) {
                        if (apqs.i == null) {
                            apqs.i = (ahbe)new agzb((agzi)apqs.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apqs.a;
            }
            case 4: {
                return new agza((agzi)apqs.a);
            }
            case 3: {
                return new apqs();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqs.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u1007\u0001\u0003\u1004\u0004\u0004\u1004\u0005\u0005\u1004\u0000\u0006\u1002\u0003\u0007\u1007\u0006", new Object[] { "b", "d", "f", "g", "c", "e", "h" });
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
