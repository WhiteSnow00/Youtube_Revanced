import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apit extends agzi implements ahax
{
    public static final apit a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(apit.class, a = new apit());
    }
    
    private apit() {
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
                if ((e = apit.e) == null) {
                    synchronized (apit.class) {
                        if (apit.e == null) {
                            apit.e = (ahbe)new agzb((agzi)apit.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apit.a;
            }
            case 4: {
                return new agza((agzi)apit.a);
            }
            case 3: {
                return new apit();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apit.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
