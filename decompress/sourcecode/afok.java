import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afok extends agzi implements ahax
{
    public static final afok a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public afos d;
    public float e;
    
    static {
        agzi.registerDefaultInstance(afok.class, a = new afok());
    }
    
    private afok() {
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
                if ((f = afok.f) == null) {
                    synchronized (afok.class) {
                        if (afok.f == null) {
                            afok.f = (ahbe)new agzb((agzi)afok.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afok.a;
            }
            case 4: {
                return new agza((agzi)afok.a);
            }
            case 3: {
                return new afok();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afok.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000\u0003\u1001\u0001", new Object[] { "b", "c", afos.class, "d", "e" });
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
