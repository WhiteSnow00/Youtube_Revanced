import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocp extends agzi implements ahax
{
    public static final aocp a;
    private static volatile ahbe c;
    public agzq b;
    
    static {
        agzi.registerDefaultInstance(aocp.class, a = new aocp());
    }
    
    private aocp() {
        this.b = agzi.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aocp.c) == null) {
                    synchronized (aocp.class) {
                        if (aocp.c == null) {
                            aocp.c = (ahbe)new agzb((agzi)aocp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aocp.a;
            }
            case 4: {
                return new agza((float[][][])null, (boolean[][])null);
            }
            case 3: {
                return new aocp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocp.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "b", aocs.a() });
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
