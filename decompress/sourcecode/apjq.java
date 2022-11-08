import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjq extends agzi implements ahax
{
    public static final apjq a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public agzy d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(apjq.class, a = new apjq());
    }
    
    private apjq() {
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
        emptyProtobufList();
        this.e = "";
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
                if ((f = apjq.f) == null) {
                    synchronized (apjq.class) {
                        if (apjq.f == null) {
                            apjq.f = (ahbe)new agzb((agzi)apjq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apjq.a;
            }
            case 4: {
                return new agza((short[][][])null, (char[][][])null);
            }
            case 3: {
                return new apjq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1008\u0000", new Object[] { "b", "c", apjj.class, "d", apjn.class, "e" });
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
