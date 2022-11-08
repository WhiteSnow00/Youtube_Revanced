import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquw extends agzi implements ahax
{
    public static final aquw a;
    private static volatile ahbe f;
    public int b;
    public agyc c;
    public int d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(aquw.class, a = new aquw());
    }
    
    private aquw() {
        emptyProtobufList();
        this.c = agyc.b;
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
                if ((f = aquw.f) == null) {
                    synchronized (aquw.class) {
                        if (aquw.f == null) {
                            aquw.f = (ahbe)new agzb((agzi)aquw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aquw.a;
            }
            case 4: {
                return new agza((agzi)aquw.a);
            }
            case 3: {
                return new aquw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aquw.a, "\u0001\u0003\u0000\u0001\u0004\n\u0003\u0000\u0000\u0000\u0004\u100a\u0002\u0007\u100b\u0005\n\u100b\b", new Object[] { "b", "c", "d", "e" });
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
