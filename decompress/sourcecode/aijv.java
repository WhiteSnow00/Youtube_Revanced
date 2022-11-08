import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijv extends agzi implements ahax
{
    public static final aijv a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public int d;
    public String e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(aijv.class, a = new aijv());
    }
    
    private aijv() {
        this.c = "";
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
                final ahbe g;
                if ((g = aijv.g) == null) {
                    synchronized (aijv.class) {
                        if (aijv.g == null) {
                            aijv.g = (ahbe)new agzb((agzi)aijv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aijv.a;
            }
            case 4: {
                return new agza((agzi)aijv.a);
            }
            case 3: {
                return new aijv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijv.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0006\u1004\u0004", new Object[] { "b", "c", "d", aijn.a, "e", "f" });
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
