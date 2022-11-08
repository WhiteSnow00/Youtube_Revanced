import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsz extends agzi implements ahax
{
    public static final amsz a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amsz.class, a = new amsz());
    }
    
    private amsz() {
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
                if ((b = amsz.b) == null) {
                    synchronized (amsz.class) {
                        if (amsz.b == null) {
                            amsz.b = (ahbe)new agzb((agzi)amsz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amsz.a;
            }
            case 4: {
                return new agza((agzi)amsz.a);
            }
            case 3: {
                return new amsz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsz.a, "\u0001\u0000", null);
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
