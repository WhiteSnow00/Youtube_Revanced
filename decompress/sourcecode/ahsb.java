import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsb extends agzi implements ahax
{
    public static final ahsb a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahsb.class, a = new ahsb());
    }
    
    private ahsb() {
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
                if ((c = ahsb.c) == null) {
                    synchronized (ahsb.class) {
                        if (ahsb.c == null) {
                            ahsb.c = (ahbe)new agzb((agzi)ahsb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahsb.a;
            }
            case 4: {
                return new agza((agzi)ahsb.a);
            }
            case 3: {
                return new ahsb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsb.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahsc.class });
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
