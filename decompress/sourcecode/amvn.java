import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvn extends agzi implements ahax
{
    public static final amvn a;
    private static volatile ahbe e;
    public int b;
    public amvk c;
    public amvl d;
    
    static {
        agzi.registerDefaultInstance(amvn.class, a = new amvn());
    }
    
    private amvn() {
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
                if ((e = amvn.e) == null) {
                    synchronized (amvn.class) {
                        if (amvn.e == null) {
                            amvn.e = (ahbe)new agzb((agzi)amvn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amvn.a;
            }
            case 4: {
                return new agza((agzi)amvn.a);
            }
            case 3: {
                return new amvn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvn.a, "\u0001\u0002\u0000\u0001\ufbdf\u2607\ue627\u2614\u0002\u0000\u0000\u0000\ufbdf\u2607\u1009\u0001\ue627\u2614\u1009\u0000", new Object[] { "b", "d", "c" });
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
