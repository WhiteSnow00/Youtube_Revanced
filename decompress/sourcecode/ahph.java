import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahph extends agzi implements ahax
{
    public static final ahph a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(ahph.class, a = new ahph());
    }
    
    private ahph() {
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
                if ((b = ahph.b) == null) {
                    synchronized (ahph.class) {
                        if (ahph.b == null) {
                            ahph.b = (ahbe)new agzb((agzi)ahph.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahph.a;
            }
            case 4: {
                return new agza((agzi)ahph.a);
            }
            case 3: {
                return new ahph();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahph.a, "\u0001\u0000", null);
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
