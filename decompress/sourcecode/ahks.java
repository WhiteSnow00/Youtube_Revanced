import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahks extends agzi implements ahax
{
    public static final ahks a;
    private static volatile ahbe e;
    public agzy b;
    public agzy c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)ahks.class, (agzi)(a = new ahks()));
    }
    
    private ahks() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahks.e) == null) {
                    synchronized (ahks.class) {
                        if (ahks.e == null) {
                            ahks.e = (ahbe)new agzb((agzi)ahks.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahks.a;
            }
            case 4: {
                return new agza((agzi)ahks.a);
            }
            case 3: {
                return new ahks();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahks.a, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0002\u0000\u0005\u001b\u0006\u001b\u0007\u100c\u0000", new Object[] { "f", "b", ahky.class, "c", ahky.class, "d", ahho.j });
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
