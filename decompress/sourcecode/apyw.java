import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyw extends agzi implements ahax
{
    public static final apyw a;
    private static volatile ahbe g;
    public int b;
    public agzy c;
    public agzy d;
    public agzy e;
    public aico f;
    
    static {
        agzi.registerDefaultInstance(apyw.class, a = new apyw());
    }
    
    private apyw() {
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
        this.e = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = apyw.g) == null) {
                    synchronized (apyw.class) {
                        if (apyw.g == null) {
                            apyw.g = (ahbe)new agzb((agzi)apyw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apyw.a;
            }
            case 4: {
                return new agza((float[][][])null, (int[])null);
            }
            case 3: {
                return new apyw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u1009\u0000", new Object[] { "b", "c", aico.class, "d", aico.class, "e", aico.class, "f" });
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
