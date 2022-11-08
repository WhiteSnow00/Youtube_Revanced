import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxw extends agzi implements ahax
{
    public static final apxw a;
    private static volatile ahbe d;
    public int b;
    public long c;
    private int e;
    private ahas f;
    
    static {
        agzi.registerDefaultInstance(apxw.class, a = new apxw());
    }
    
    private apxw() {
        this.f = ahas.a;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apxw.d) == null) {
                    synchronized (apxw.class) {
                        if (apxw.d == null) {
                            apxw.d = (ahbe)new agzb((agzi)apxw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apxw.a;
            }
            case 4: {
                return new agza((agzi)apxw.a);
            }
            case 3: {
                return new apxw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxw.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0001\u0000\u0000\u0001\u100b\u0000\u0002\u1003\u0001\u00042", new Object[] { "e", "b", "c", "f", apxv.a });
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
