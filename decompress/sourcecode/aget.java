import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aget extends agzi implements ahax
{
    public static final aget a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(aget.class, a = new aget());
    }
    
    private aget() {
        this.c = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
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
                if ((b = aget.b) == null) {
                    synchronized (aget.class) {
                        if (aget.b == null) {
                            aget.b = (ahbe)new agzb((agzi)aget.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aget.a;
            }
            case 4: {
                return new agza((agzi)aget.a);
            }
            case 3: {
                return new aget();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aget.a, "\u0000\u0000", null);
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
