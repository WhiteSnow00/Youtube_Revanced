import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegd extends agzi implements ahax
{
    public static final aegd a;
    private static volatile ahbe f;
    public int b;
    public aegb c;
    public String d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance(aegd.class, a = new aegd());
    }
    
    private aegd() {
        this.d = "";
        agzi.emptyProtobufList();
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
                if ((f = aegd.f) == null) {
                    synchronized (aegd.class) {
                        if (aegd.f == null) {
                            aegd.f = (ahbe)new agzb((agzi)aegd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aegd.a;
            }
            case 4: {
                return new agza((agzi)aegd.a);
            }
            case 3: {
                return new aegd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aegd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
