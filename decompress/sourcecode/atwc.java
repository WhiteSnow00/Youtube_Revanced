import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwc extends agzi implements ahax
{
    public static final atwc a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public atwd d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(atwc.class, a = new atwc());
    }
    
    private atwc() {
        this.c = agzi.emptyProtobufList();
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
                if ((f = atwc.f) == null) {
                    synchronized (atwc.class) {
                        if (atwc.f == null) {
                            atwc.f = (ahbe)new agzb((agzi)atwc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atwc.a;
            }
            case 4: {
                return new agza((boolean[][])null, (short[][][])null);
            }
            case 3: {
                return new atwc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000\u0003\u1004\u0001", new Object[] { "b", "c", atwb.class, "d", "e" });
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
