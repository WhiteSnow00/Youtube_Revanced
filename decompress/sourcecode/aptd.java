import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptd extends agzi implements ahax
{
    private static final aptd a;
    private static volatile ahbe b;
    private agzy c;
    
    static {
        agzi.registerDefaultInstance((Class)aptd.class, (agzi)(a = new aptd()));
    }
    
    private aptd() {
        this.c = emptyProtobufList();
    }
    
    public static /* synthetic */ aptd a() {
        return aptd.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aptd.b) == null) {
                    synchronized (aptd.class) {
                        if (aptd.b == null) {
                            aptd.b = (ahbe)new agzb((agzi)aptd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptd.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aptd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptd.a, "\u0001\u0000", (Object[])null);
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
