import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsu extends agzi implements ahax
{
    public static final amsu a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(amsu.class, a = new amsu());
    }
    
    private amsu() {
        this.c = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = amsu.b) == null) {
                    synchronized (amsu.class) {
                        if (amsu.b == null) {
                            amsu.b = (ahbe)new agzb((agzi)amsu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amsu.a;
            }
            case 4: {
                return new agza((agzi)amsu.a);
            }
            case 3: {
                return new amsu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsu.a, "\u0001\u0000", null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
