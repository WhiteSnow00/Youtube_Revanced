import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahla extends agzi implements ahax
{
    public static final ahla a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance((Class)ahla.class, (agzi)(a = new ahla()));
    }
    
    private ahla() {
        this.b = agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahla.c) == null) {
                    synchronized (ahla.class) {
                        if (ahla.c == null) {
                            ahla.c = (ahbe)new agzb((agzi)ahla.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahla.a;
            }
            case 4: {
                return new agza((agzi)ahla.a);
            }
            case 3: {
                return new ahla();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahla.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
