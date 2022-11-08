import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajea extends agzi implements ahax
{
    public static final ajea a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public ajdq d;
    public ajdo e;
    
    static {
        agzi.registerDefaultInstance(ajea.class, a = new ajea());
    }
    
    private ajea() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ajea.f) == null) {
                    synchronized (ajea.class) {
                        if (ajea.f == null) {
                            ajea.f = (ahbe)new agzb((agzi)ajea.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajea.a;
            }
            case 4: {
                return new agza((agzi)ajea.a);
            }
            case 3: {
                return new ajea();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajea.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
