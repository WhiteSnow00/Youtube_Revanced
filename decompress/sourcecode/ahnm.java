import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnm extends agzi implements ahax
{
    public static final ahnm a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(ahnm.class, a = new ahnm());
    }
    
    private ahnm() {
        this.c = "";
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
                if ((d = ahnm.d) == null) {
                    synchronized (ahnm.class) {
                        if (ahnm.d == null) {
                            ahnm.d = (ahbe)new agzb((agzi)ahnm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahnm.a;
            }
            case 4: {
                return new agza((agzi)ahnm.a);
            }
            case 3: {
                return new ahnm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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