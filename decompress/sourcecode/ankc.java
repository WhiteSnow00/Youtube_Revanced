import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankc extends agzi implements ahax
{
    public static final ankc a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(ankc.class, a = new ankc());
    }
    
    private ankc() {
        this.c = 2;
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
                if ((b = ankc.b) == null) {
                    synchronized (ankc.class) {
                        if (ankc.b == null) {
                            ankc.b = (ahbe)new agzb((agzi)ankc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ankc.a;
            }
            case 4: {
                return new agza((agzi)ankc.a);
            }
            case 3: {
                return new ankc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankc.a, "\u0001\u0000", null);
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