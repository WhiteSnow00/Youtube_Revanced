import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoy extends agzi implements ahax
{
    public static final agoy a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public Object d;
    public agor e;
    public String f;
    public agpb g;
    
    static {
        agzi.registerDefaultInstance(agoy.class, a = new agoy());
    }
    
    private agoy() {
        this.c = 0;
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = agoy.h) == null) {
                    synchronized (agoy.class) {
                        if (agoy.h == null) {
                            agoy.h = (ahbe)new agzb((agzi)agoy.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agoy.a;
            }
            case 4: {
                return new agza((agzi)agoy.a);
            }
            case 3: {
                return new agoy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agoy.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u103b\u0000\u0004\u103a\u0000\u0005\u1009\u0004", new Object[] { "d", "c", "b", "e", "f", "g" });
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
