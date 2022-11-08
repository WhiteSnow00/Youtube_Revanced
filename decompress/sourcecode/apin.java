import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apin extends agzi implements ahax
{
    public static final apin a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apin.class, a = new apin());
    }
    
    private apin() {
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
                if ((d = apin.d) == null) {
                    synchronized (apin.class) {
                        if (apin.d == null) {
                            apin.d = (ahbe)new agzb((agzi)apin.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apin.a;
            }
            case 4: {
                return new agza((agzi)apin.a);
            }
            case 3: {
                return new apin();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apin.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
