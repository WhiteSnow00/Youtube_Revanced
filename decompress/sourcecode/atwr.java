import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwr extends agzi implements ahax
{
    public static final atwr a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public atwq d;
    
    static {
        final atwr a2 = new atwr();
        agzi.registerDefaultInstance(atwr.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)atwp.a, a2, (MessageLite)a2, null, 6, ahcm.k, atwr.class);
    }
    
    private atwr() {
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
                if ((e = atwr.e) == null) {
                    synchronized (atwr.class) {
                        if (atwr.e == null) {
                            atwr.e = (ahbe)new agzb((agzi)atwr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atwr.a;
            }
            case 4: {
                return new agza((agzi)atwr.a);
            }
            case 3: {
                return new atwr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
