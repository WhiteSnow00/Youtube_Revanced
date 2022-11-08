import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzv extends agzi implements ahax
{
    public static final afzv a;
    private static volatile ahbe e;
    public int b;
    public agyc c;
    public afzx d;
    
    static {
        agzi.registerDefaultInstance(afzv.class, a = new afzv());
    }
    
    private afzv() {
        this.c = agyc.b;
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
                if ((e = afzv.e) == null) {
                    synchronized (afzv.class) {
                        if (afzv.e == null) {
                            afzv.e = (ahbe)new agzb((agzi)afzv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afzv.a;
            }
            case 4: {
                return new agza((agzi)afzv.a);
            }
            case 3: {
                return new afzv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afzv.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[] { "b", "c", "d" });
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
