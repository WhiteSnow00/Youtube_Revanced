import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqat extends agzi implements ahax
{
    public static final aqat a;
    private static volatile ahbe h;
    public int b;
    public aqbb c;
    public apym d;
    public apxz e;
    public boolean f;
    public boolean g;
    
    static {
        agzi.registerDefaultInstance(aqat.class, a = new aqat());
    }
    
    private aqat() {
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
                if ((h = aqat.h) == null) {
                    synchronized (aqat.class) {
                        if (aqat.h == null) {
                            aqat.h = (ahbe)new agzb((agzi)aqat.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqat.a;
            }
            case 4: {
                return new agza((agzi)aqat.a);
            }
            case 3: {
                return new aqat();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqat.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0003\u0004\u1009\u0002\u0005\u1007\u0004", new Object[] { "b", "c", "d", "f", "e", "g" });
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
