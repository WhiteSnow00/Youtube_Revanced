import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwj extends agzi implements ahax
{
    public static final atwj a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public agzy d;
    public atwi e;
    
    static {
        agzi.registerDefaultInstance(atwj.class, a = new atwj());
    }
    
    private atwj() {
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
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
                if ((f = atwj.f) == null) {
                    synchronized (atwj.class) {
                        if (atwj.f == null) {
                            atwj.f = (ahbe)new agzb((agzi)atwj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atwj.a;
            }
            case 4: {
                return new agza((boolean[][][])null, (float[][])null);
            }
            case 3: {
                return new atwj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1009\u0000", new Object[] { "b", "c", atwm.class, "d", atwh.class, "e" });
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
