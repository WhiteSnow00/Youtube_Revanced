import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afot extends agzi implements ahax
{
    private static final afot a;
    private static volatile ahbe b;
    private int c;
    private agzy d;
    private String e;
    private afok f;
    
    static {
        agzi.registerDefaultInstance(afot.class, a = new afot());
    }
    
    private afot() {
        this.d = agzi.emptyProtobufList();
        this.e = "";
    }
    
    public static afoi a() {
        return (afoi)afot.a.createBuilder();
    }
    
    public static afot c(final byte[] array) {
        return (afot)agzi.parseFrom(afot.a, array);
    }
    
    private void e(final afok f) {
        f.getClass();
        this.f = f;
        this.c |= 0x1000000;
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
                if ((b = afot.b) == null) {
                    synchronized (afot.class) {
                        if (afot.b == null) {
                            afot.b = (ahbe)new agzb((agzi)afot.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return afot.a;
            }
            case 4: {
                return new afoi();
            }
            case 3: {
                return new afot();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afot.a, "\u0001\u0001\u0000\u0001\u0019\u0019\u0001\u0000\u0000\u0000\u0019\u1009\u0018", new Object[] { "c", "f" });
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
