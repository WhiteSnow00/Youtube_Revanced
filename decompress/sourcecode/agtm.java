import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtm extends agzi implements ahax
{
    public static final agtm a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public int d;
    public int e;
    public agts f;
    public String g;
    
    static {
        agzi.registerDefaultInstance(agtm.class, a = new agtm());
    }
    
    private agtm() {
        this.g = "";
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
                if ((h = agtm.h) == null) {
                    synchronized (agtm.class) {
                        if (agtm.h == null) {
                            agtm.h = (ahbe)new agzb((agzi)agtm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agtm.a;
            }
            case 4: {
                return new agza((agzi)agtm.a);
            }
            case 3: {
                return new agtm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtm.a, "\u0001\u0005\u0000\u0001\u0001%\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u100c\u0003\u0004\u1009\u0004\u0005\u1008\u0005%\u100c\u0001", new Object[] { "b", "c", agte.e, "e", agte.d, "f", "g", "d", afon.s });
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
