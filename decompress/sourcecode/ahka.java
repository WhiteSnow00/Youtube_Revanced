import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahka extends agzi implements ahax
{
    public static final ahka a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)ahka.class, (agzi)(a = new ahka()));
    }
    
    private ahka() {
        this.c = 2;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ahka.b) == null) {
                    synchronized (ahka.class) {
                        if (ahka.b == null) {
                            ahka.b = (ahbe)new agzb((agzi)ahka.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahka.a;
            }
            case 4: {
                return new agza((agzi)ahka.a);
            }
            case 3: {
                return new ahka();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahka.a, "\u0001\u0000", (Object[])null);
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
