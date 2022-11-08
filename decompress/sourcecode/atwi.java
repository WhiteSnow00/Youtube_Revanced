import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwi extends agzi implements ahax
{
    public static final atwi a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(atwi.class, a = new atwi());
    }
    
    private atwi() {
        this.d = "";
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
                if ((e = atwi.e) == null) {
                    synchronized (atwi.class) {
                        if (atwi.e == null) {
                            atwi.e = (ahbe)new agzb((agzi)atwi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atwi.a;
            }
            case 4: {
                return new agza((agzi)atwi.a);
            }
            case 3: {
                return new atwi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1005\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
