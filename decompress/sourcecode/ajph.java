import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajph extends agzi implements ahax
{
    public static final ajph a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)ajph.class, (agzi)(a = new ajph()));
    }
    
    private ajph() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajph.d) == null) {
                    synchronized (ajph.class) {
                        if (ajph.d == null) {
                            ajph.d = (ahbe)new agzb((agzi)ajph.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajph.a;
            }
            case 4: {
                return new agza((agzi)ajph.a);
            }
            case 3: {
                return new ajph();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajph.a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u103a\u0000\u0002\u1035\u0000\u0003\u103b\u0000\u0004\u1033\u0000\u0005\u103d\u0000", new Object[] { "c", "b" });
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
