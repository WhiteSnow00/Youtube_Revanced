import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqae extends agzi implements ahax
{
    public static final aqae a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aqae.class, a = new aqae());
    }
    
    private aqae() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aqae.c) == null) {
                    synchronized (aqae.class) {
                        if (aqae.c == null) {
                            aqae.c = (ahbe)new agzb((agzi)aqae.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqae.a;
            }
            case 4: {
                return new agza((agzi)aqae.a);
            }
            case 3: {
                return new aqae();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqae.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", pcz.class });
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
