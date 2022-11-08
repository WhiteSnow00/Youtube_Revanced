import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxu extends agzi implements ahax
{
    public static final ahxu a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahxu.class, a = new ahxu());
    }
    
    private ahxu() {
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
                if ((c = ahxu.c) == null) {
                    synchronized (ahxu.class) {
                        if (ahxu.c == null) {
                            ahxu.c = (ahbe)new agzb((agzi)ahxu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahxu.a;
            }
            case 4: {
                return new agza((agzi)ahxu.a);
            }
            case 3: {
                return new ahxu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxu.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
