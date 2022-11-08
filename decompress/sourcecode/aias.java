import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aias extends agzi implements ahax
{
    private static final aias a;
    private static volatile ahbe b;
    private agzy c;
    
    static {
        agzi.registerDefaultInstance((Class)aias.class, (agzi)(a = new aias()));
    }
    
    private aias() {
        this.c = emptyProtobufList();
    }
    
    public static /* synthetic */ aias a() {
        return aias.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aias.b) == null) {
                    synchronized (aias.class) {
                        if (aias.b == null) {
                            aias.b = (ahbe)new agzb((agzi)aias.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aias.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aias();
            }
            case 2: {
                return newMessageInfo((MessageLite)aias.a, "\u0001\u0000", (Object[])null);
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
