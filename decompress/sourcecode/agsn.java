import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsn extends agzi implements ahax
{
    public static final agsn a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(agsn.class, a = new agsn());
    }
    
    private agsn() {
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
                if ((d = agsn.d) == null) {
                    synchronized (agsn.class) {
                        if (agsn.d == null) {
                            agsn.d = (ahbe)new agzb((agzi)agsn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agsn.a;
            }
            case 4: {
                return new agza((agzi)agsn.a);
            }
            case 3: {
                return new agsn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsn.a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0000\u000b\u1008\u0000", new Object[] { "b", "c" });
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
