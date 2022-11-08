import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agta extends agzi implements ahax
{
    public static final agta a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agta.class, a = new agta());
    }
    
    private agta() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = agta.b) == null) {
                    synchronized (agta.class) {
                        if (agta.b == null) {
                            agta.b = (ahbe)new agzb((agzi)agta.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agta.a;
            }
            case 4: {
                return new agza((agzi)agta.a);
            }
            case 3: {
                return new agta();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agta.a, "\u0001\u0000", null);
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
