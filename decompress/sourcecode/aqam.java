import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqam extends agzi implements ahax
{
    public static final aqam a;
    private static volatile ahbe e;
    public int b;
    public ahca c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance(aqam.class, a = new aqam());
    }
    
    private aqam() {
        this.d = agzi.emptyProtobufList();
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
                final ahbe e;
                if ((e = aqam.e) == null) {
                    synchronized (aqam.class) {
                        if (aqam.e == null) {
                            aqam.e = (ahbe)new agzb((agzi)aqam.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqam.a;
            }
            case 4: {
                return new agza((float[])null, (char[])null);
            }
            case 3: {
                return new aqam();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqam.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\u1009\u0000", new Object[] { "b", "d", anzu.class, "c" });
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
