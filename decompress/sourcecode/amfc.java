import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfc extends agzi implements ahax
{
    public static final amfc a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance((Class)amfc.class, (agzi)(a = new amfc()));
    }
    
    private amfc() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = amfc.c) == null) {
                    synchronized (amfc.class) {
                        if (amfc.c == null) {
                            amfc.c = (ahbe)new agzb((agzi)amfc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amfc.a;
            }
            case 4: {
                return new agza((agzi)amfc.a);
            }
            case 3: {
                return new amfc();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", amfb.class });
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
