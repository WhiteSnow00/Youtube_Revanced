import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afov extends agzi implements ahax
{
    public static final afov a;
    private static volatile ahbe e;
    public int b;
    public afow c;
    public agzq d;
    
    static {
        agzi.registerDefaultInstance(afov.class, a = new afov());
    }
    
    private afov() {
        emptyProtobufList();
        this.d = agzi.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = afov.e) == null) {
                    synchronized (afov.class) {
                        if (afov.e == null) {
                            afov.e = (ahbe)new agzb((agzi)afov.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afov.a;
            }
            case 4: {
                return new agza((agzi)afov.a);
            }
            case 3: {
                return new afov();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afov.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0004\u001e", new Object[] { "b", "c", "d", afou.b() });
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
