import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoj extends agzi implements ahax
{
    public static final ahoj a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public agyc d;
    public ahoi e;
    
    static {
        agzi.registerDefaultInstance(ahoj.class, a = new ahoj());
    }
    
    private ahoj() {
        emptyProtobufList();
        this.d = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahoj.f) == null) {
                    synchronized (ahoj.class) {
                        if (ahoj.f == null) {
                            ahoj.f = (ahbe)new agzb((agzi)ahoj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahoj.a;
            }
            case 4: {
                return new agza((agzi)ahoj.a);
            }
            case 3: {
                return new ahoj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahoj.a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004\u100c\u0002\u0005\u100a\u0003\u0006\u1009\u0004", new Object[] { "b", "c", ahho.s, "d", "e" });
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
