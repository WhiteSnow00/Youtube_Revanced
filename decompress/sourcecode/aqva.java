import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqva extends agzi implements ahax
{
    public static final aqva a;
    private static volatile ahbe b;
    private ahas c;
    private ahas d;
    
    static {
        agzi.registerDefaultInstance(aqva.class, a = new aqva());
    }
    
    private aqva() {
        this.c = ahas.a;
        this.d = ahas.a;
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
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
                if ((b = aqva.b) == null) {
                    synchronized (aqva.class) {
                        if (aqva.b == null) {
                            aqva.b = (ahbe)new agzb((agzi)aqva.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqva.a;
            }
            case 4: {
                return new agza((agzi)aqva.a);
            }
            case 3: {
                return new aqva();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqva.a, "\u0001\u0002\u0000\u0000\u0018\u0019\u0002\u0002\u0000\u0000\u00182\u00192", new Object[] { "c", aquy.a, "d", aquz.a });
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
