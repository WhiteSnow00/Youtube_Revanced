import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apiu extends agzi implements ahax
{
    public static final apiu a;
    private static volatile ahbe i;
    public int b;
    public int c;
    public Object d;
    public apir e;
    public int f;
    public ajkd g;
    public apip h;
    
    static {
        agzi.registerDefaultInstance(apiu.class, a = new apiu());
    }
    
    private apiu() {
        this.c = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = apiu.i) == null) {
                    synchronized (apiu.class) {
                        if (apiu.i == null) {
                            apiu.i = (ahbe)new agzb((agzi)apiu.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apiu.a;
            }
            case 4: {
                return new agza((agzi)apiu.a);
            }
            case 3: {
                return new apiu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apiu.a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u1009\u0004\u0006\u1009\u0005", new Object[] { "d", "c", "b", "e", "f", apms.f, apio.class, apit.class, "g", "h" });
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
