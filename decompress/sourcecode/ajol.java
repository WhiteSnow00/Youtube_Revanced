import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajol extends agzi implements ahax
{
    public static final ajol a;
    private static volatile ahbe j;
    public int b;
    public boolean c;
    public agzy d;
    public int e;
    public boolean f;
    public boolean g;
    public ajom h;
    public boolean i;
    
    static {
        agzi.registerDefaultInstance((Class)ajol.class, (agzi)(a = new ajol()));
    }
    
    private ajol() {
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = ajol.j) == null) {
                    synchronized (ajol.class) {
                        if (ajol.j == null) {
                            ajol.j = (ahbe)new agzb((agzi)ajol.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajol.a;
            }
            case 4: {
                return new agza((agzi)ajol.a);
            }
            case 3: {
                return new ajol();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajol.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u001b\u0003\u1004\u0001\u0004\u1007\u0002\u0005\u1007\u0003\u0006\u1009\u0004\n\u1007\b", new Object[] { "b", "c", "d", ajon.class, "e", "f", "g", "h", "i" });
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
