import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anli extends agzi implements ahax
{
    public static final anli a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(anli.class, a = new anli());
    }
    
    private anli() {
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
                if ((b = anli.b) == null) {
                    synchronized (anli.class) {
                        if (anli.b == null) {
                            anli.b = (ahbe)new agzb((agzi)anli.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anli.a;
            }
            case 4: {
                return new agza((agzi)anli.a);
            }
            case 3: {
                return new anli();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anli.a, "\u0000\u0000", null);
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
