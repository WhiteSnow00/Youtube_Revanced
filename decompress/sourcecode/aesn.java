import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesn extends agzi implements ahax
{
    public static final aesn a;
    private static volatile ahbe j;
    public int b;
    public long c;
    public long d;
    public agzy e;
    public long f;
    public long g;
    public aeqb h;
    public int i;
    
    static {
        agzi.registerDefaultInstance(aesn.class, a = new aesn());
    }
    
    private aesn() {
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
                final ahbe j;
                if ((j = aesn.j) == null) {
                    synchronized (aesn.class) {
                        if (aesn.j == null) {
                            aesn.j = (ahbe)new agzb((agzi)aesn.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aesn.a;
            }
            case 4: {
                return new agza((agzi)aesn.a);
            }
            case 3: {
                return new aesn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aesn.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001\u1005\u0000\u0002\u1005\u0001\u0003\u001b\u0004\u1002\u0002\u0005\u1002\u0003\n\u1009\u0005\u000b\u100c\u0006", new Object[] { "b", "c", "d", "e", aerd.class, "f", "g", "h", "i", aeih.d });
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
